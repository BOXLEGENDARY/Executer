package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() {
        @Override
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.EntrySet entrySet;
    final Node<K, V> header;
    private LinkedTreeMap<K, V>.KeySet keySet;
    int modCount;
    Node<K, V> root;
    int size;

    class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() {
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override
                public Map.Entry<K, V> next() {
                    return nextNode();
                }
            };
        }

        @Override
        public boolean remove(Object obj) {
            Node<K, V> nodeFindByEntry;
            if (!(obj instanceof Map.Entry) || (nodeFindByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(nodeFindByEntry, true);
            return true;
        }

        @Override
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        @Override
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override
        public Iterator<K> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<K>() {
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override
                public K next() {
                    return nextNode().key;
                }
            };
        }

        @Override
        public boolean remove(Object obj) {
            return LinkedTreeMap.this.removeInternalByKey(obj) != null;
        }

        @Override
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    private abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        int expectedModCount;
        Node<K, V> lastReturned = null;
        Node<K, V> next;

        LinkedTreeMapIterator() {
            this.next = LinkedTreeMap.this.header.next;
            this.expectedModCount = LinkedTreeMap.this.modCount;
        }

        @Override
        public final boolean hasNext() {
            return this.next != LinkedTreeMap.this.header;
        }

        final Node<K, V> nextNode() {
            Node<K, V> node = this.next;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node == linkedTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
            this.next = node.next;
            this.lastReturned = node;
            return node;
        }

        @Override
        public final void remove() {
            Node<K, V> node = this.lastReturned;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.removeInternal(node, true);
            this.lastReturned = null;
            this.expectedModCount = LinkedTreeMap.this.modCount;
        }
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER, true);
    }

    private static boolean equal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rebalance(Node<K, V> node, boolean z7) {
        while (node != null) {
            Node<K, V> node2 = node.left;
            Node<K, V> node3 = node.right;
            int i7 = node2 != null ? node2.height : 0;
            int i8 = node3 != null ? node3.height : 0;
            int i9 = i7 - i8;
            if (i9 == -2) {
                Node<K, V> node4 = node3.left;
                Node<K, V> node5 = node3.right;
                int i10 = (node4 != null ? node4.height : 0) - (node5 != null ? node5.height : 0);
                if (i10 == -1 || (i10 == 0 && !z7)) {
                    rotateLeft(node);
                } else {
                    rotateRight(node3);
                    rotateLeft(node);
                }
                if (z7) {
                    return;
                }
            } else if (i9 == 2) {
                Node<K, V> node6 = node2.left;
                Node<K, V> node7 = node2.right;
                int i11 = (node6 != null ? node6.height : 0) - (node7 != null ? node7.height : 0);
                if (i11 == 1 || (i11 == 0 && !z7)) {
                    rotateRight(node);
                } else {
                    rotateLeft(node2);
                    rotateRight(node);
                }
                if (z7) {
                    return;
                }
            } else if (i9 == 0) {
                node.height = i7 + 1;
                if (z7) {
                    return;
                }
            } else {
                node.height = Math.max(i7, i8) + 1;
                if (!z7) {
                    return;
                }
            }
            node = node.parent;
        }
    }

    private void replaceInParent(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.parent;
        node.parent = null;
        if (node2 != null) {
            node2.parent = node3;
        }
        if (node3 == null) {
            this.root = node2;
        } else if (node3.left == node) {
            node3.left = node2;
        } else {
            node3.right = node2;
        }
    }

    private void rotateLeft(Node<K, V> node) {
        Node<K, V> node2 = node.left;
        Node<K, V> node3 = node.right;
        Node<K, V> node4 = node3.left;
        Node<K, V> node5 = node3.right;
        node.right = node4;
        if (node4 != null) {
            node4.parent = node;
        }
        replaceInParent(node, node3);
        node3.left = node;
        node.parent = node3;
        int iMax = Math.max(node2 != null ? node2.height : 0, node4 != null ? node4.height : 0) + 1;
        node.height = iMax;
        node3.height = Math.max(iMax, node5 != null ? node5.height : 0) + 1;
    }

    private void rotateRight(Node<K, V> node) {
        Node<K, V> node2 = node.left;
        Node<K, V> node3 = node.right;
        Node<K, V> node4 = node2.left;
        Node<K, V> node5 = node2.right;
        node.left = node5;
        if (node5 != null) {
            node5.parent = node;
        }
        replaceInParent(node, node2);
        node2.right = node;
        node.parent = node2;
        int iMax = Math.max(node3 != null ? node3.height : 0, node5 != null ? node5.height : 0) + 1;
        node.height = iMax;
        node2.height = Math.max(iMax, node4 != null ? node4.height : 0) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        Node<K, V> node = this.header;
        node.prev = node;
        node.next = node;
    }

    @Override
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.EntrySet entrySet = this.entrySet;
        if (entrySet != null) {
            return entrySet;
        }
        LinkedTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.entrySet = entrySet2;
        return entrySet2;
    }

    Node<K, V> find(K k7, boolean z7) {
        int iCompareTo;
        Node<K, V> node;
        Comparator<? super K> comparator = this.comparator;
        Node<K, V> node2 = this.root;
        if (node2 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k7 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(node2.key) : comparator.compare(k7, node2.key);
                if (iCompareTo == 0) {
                    return node2;
                }
                Node<K, V> node3 = iCompareTo < 0 ? node2.left : node2.right;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z7) {
            return null;
        }
        Node<K, V> node4 = this.header;
        if (node2 != null) {
            node = new Node<>(this.allowNullValues, node2, k7, node4, node4.prev);
            if (iCompareTo < 0) {
                node2.left = node;
            } else {
                node2.right = node;
            }
            rebalance(node2, true);
        } else {
            if (comparator == NATURAL_ORDER && !(k7 instanceof Comparable)) {
                throw new ClassCastException(k7.getClass().getName() + " is not Comparable");
            }
            node = new Node<>(this.allowNullValues, node2, k7, node4, node4.prev);
            this.root = node;
        }
        this.size++;
        this.modCount++;
        return node;
    }

    Node<K, V> findByEntry(Map.Entry<?, ?> entry) {
        Node<K, V> nodeFindByObject = findByObject(entry.getKey());
        if (nodeFindByObject == null || !equal(nodeFindByObject.value, entry.getValue())) {
            return null;
        }
        return nodeFindByObject;
    }

    Node<K, V> findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override
    public V get(Object obj) {
        Node<K, V> nodeFindByObject = findByObject(obj);
        if (nodeFindByObject != null) {
            return nodeFindByObject.value;
        }
        return null;
    }

    @Override
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.KeySet keySet = this.keySet;
        if (keySet != null) {
            return keySet;
        }
        LinkedTreeMap<K, V>.KeySet keySet2 = new KeySet();
        this.keySet = keySet2;
        return keySet2;
    }

    @Override
    public V put(K k7, V v7) {
        if (k7 == null) {
            throw new NullPointerException("key == null");
        }
        if (v7 == null && !this.allowNullValues) {
            throw new NullPointerException("value == null");
        }
        Node<K, V> nodeFind = find(k7, true);
        V v8 = nodeFind.value;
        nodeFind.value = v7;
        return v8;
    }

    @Override
    public V remove(Object obj) {
        Node<K, V> nodeRemoveInternalByKey = removeInternalByKey(obj);
        if (nodeRemoveInternalByKey != null) {
            return nodeRemoveInternalByKey.value;
        }
        return null;
    }

    void removeInternal(Node<K, V> node, boolean z7) {
        int i7;
        if (z7) {
            Node<K, V> node2 = node.prev;
            node2.next = node.next;
            node.next.prev = node2;
        }
        Node<K, V> node3 = node.left;
        Node<K, V> node4 = node.right;
        Node<K, V> node5 = node.parent;
        int i8 = 0;
        if (node3 == null || node4 == null) {
            if (node3 != null) {
                replaceInParent(node, node3);
                node.left = null;
            } else if (node4 != null) {
                replaceInParent(node, node4);
                node.right = null;
            } else {
                replaceInParent(node, null);
            }
            rebalance(node5, false);
            this.size--;
            this.modCount++;
            return;
        }
        Node<K, V> nodeLast = node3.height > node4.height ? node3.last() : node4.first();
        removeInternal(nodeLast, false);
        Node<K, V> node6 = node.left;
        if (node6 != null) {
            i7 = node6.height;
            nodeLast.left = node6;
            node6.parent = nodeLast;
            node.left = null;
        } else {
            i7 = 0;
        }
        Node<K, V> node7 = node.right;
        if (node7 != null) {
            i8 = node7.height;
            nodeLast.right = node7;
            node7.parent = nodeLast;
            node.right = null;
        }
        nodeLast.height = Math.max(i7, i8) + 1;
        replaceInParent(node, nodeLast);
    }

    Node<K, V> removeInternalByKey(Object obj) {
        Node<K, V> nodeFindByObject = findByObject(obj);
        if (nodeFindByObject != null) {
            removeInternal(nodeFindByObject, true);
        }
        return nodeFindByObject;
    }

    @Override
    public int size() {
        return this.size;
    }

    public LinkedTreeMap(boolean z7) {
        this(NATURAL_ORDER, z7);
    }

    public LinkedTreeMap(Comparator<? super K> comparator, boolean z7) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.allowNullValues = z7;
        this.header = new Node<>(z7);
    }

    static final class Node<K, V> implements Map.Entry<K, V> {
        final boolean allowNullValue;
        int height;
        final K key;
        Node<K, V> left;
        Node<K, V> next;
        Node<K, V> parent;
        Node<K, V> prev;
        Node<K, V> right;
        V value;

        Node(boolean z7) {
            this.key = null;
            this.allowNullValue = z7;
            this.prev = this;
            this.next = this;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k7 = this.key;
            if (k7 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k7.equals(entry.getKey())) {
                return false;
            }
            V v7 = this.value;
            if (v7 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v7.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public Node<K, V> first() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.left; node2 != null; node2 = node2.left) {
                node = node2;
            }
            return node;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            K k7 = this.key;
            int iHashCode = k7 == null ? 0 : k7.hashCode();
            V v7 = this.value;
            return iHashCode ^ (v7 != null ? v7.hashCode() : 0);
        }

        public Node<K, V> last() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.right; node2 != null; node2 = node2.right) {
                node = node2;
            }
            return node;
        }

        @Override
        public V setValue(V v7) {
            if (v7 == null && !this.allowNullValue) {
                throw new NullPointerException("value == null");
            }
            V v8 = this.value;
            this.value = v7;
            return v8;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }

        Node(boolean z7, Node<K, V> node, K k7, Node<K, V> node2, Node<K, V> node3) {
            this.parent = node;
            this.key = k7;
            this.allowNullValue = z7;
            this.height = 1;
            this.next = node2;
            this.prev = node3;
            node3.next = this;
            node2.prev = this;
        }
    }
}

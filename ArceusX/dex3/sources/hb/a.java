package hb;

import com.roblox.client.personasdk.R;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001eJ&\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001e\u0010$\u001a\u00020\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lhb/a;", "T", "", "", "items", "<init>", "(Ljava/util/List;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "other", "g", "(Ljava/util/List;)I", "d", "Ljava/util/List;", "j", "()I", "size", "utils"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class a<T> implements List<T>, Comparable<List<? extends T>>, ba.a {

    @NotNull
    private final List<T> items;

    public a(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "items");
        this.items = list;
    }

    @Override
    public void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object element) {
        return this.items.contains(element);
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.items.containsAll(elements);
    }

    @Override
    public int compareTo(@NotNull List<? extends T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return R9.a.a(this.items.toString(), other.toString());
    }

    @Override
    public T get(int index) {
        return this.items.get(index);
    }

    @Override
    public int indexOf(Object element) {
        return this.items.indexOf(element);
    }

    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return this.items.iterator();
    }

    public int j() {
        return this.items.size();
    }

    @Override
    public int lastIndexOf(Object element) {
        return this.items.lastIndexOf(element);
    }

    @Override
    @NotNull
    public ListIterator<T> listIterator() {
        return this.items.listIterator();
    }

    @Override
    public T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return j();
    }

    @Override
    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        return this.items.subList(fromIndex, toIndex);
    }

    @Override
    public Object[] toArray() {
        return g.a(this);
    }

    @Override
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return this.items.listIterator(index);
    }

    @Override
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return (T[]) g.b(this, tArr);
    }
}

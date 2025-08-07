package com.google.gson.internal;

import com.google.gson.h;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.m;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import k0.BAKp.xAQOwX;

public final class ConstructorConstructor {
    private final Map<Type, h<?>> instanceCreators;
    private final List<v> reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(Map<Type, h<?>> map, boolean z7, List<v> list) {
        this.instanceCreators = map;
        this.useJdkUnsafe = z7;
        this.reflectionFilters = list;
    }

    static String checkInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + TroubleshootingGuide.createUrl("r8-abstract-class");
    }

    private static <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls, v.a aVar) throws NoSuchMethodException, SecurityException {
        final String strTryMakeAccessible;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            v.a aVar2 = v.a.ALLOW;
            if (aVar == aVar2 || (ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) && (aVar != v.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (aVar != aVar2 || (strTryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) == null) ? new ObjectConstructor<T>() {
                    @Override
                    public T construct() {
                        try {
                            return (T) declaredConstructor.newInstance(null);
                        } catch (IllegalAccessException e7) {
                            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e7);
                        } catch (InstantiationException e8) {
                            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(declaredConstructor) + "' with no args", e8);
                        } catch (InvocationTargetException e9) {
                            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(declaredConstructor) + "' with no args", e9.getCause());
                        }
                    }
                } : new ObjectConstructor<T>() {
                    @Override
                    public T construct() {
                        throw new m(strTryMakeAccessible);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    throw new m(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) new TreeSet();
                }
            } : Set.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) new LinkedHashSet();
                }
            } : Queue.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) new ArrayDeque();
                }
            } : new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) new ArrayList();
                }
            };
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) new ConcurrentSkipListMap();
                }
            } : ConcurrentMap.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) new ConcurrentHashMap();
                }
            } : SortedMap.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) new TreeMap();
                }
            } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) new LinkedTreeMap();
                }
            } : new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) new LinkedHashMap();
                }
            };
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newSpecialCollectionConstructor(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    Type type2 = type;
                    boolean z7 = type2 instanceof ParameterizedType;
                    String str = xAQOwX.XKdutEfcxOXgU;
                    if (!z7) {
                        throw new m(str + type.toString());
                    }
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return (T) EnumSet.noneOf((Class) type3);
                    }
                    throw new m(str + type.toString());
                }
            };
        }
        if (cls == EnumMap.class) {
            return new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    Type type2 = type;
                    if (!(type2 instanceof ParameterizedType)) {
                        throw new m("Invalid EnumMap type: " + type.toString());
                    }
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return (T) new EnumMap((Class) type3);
                    }
                    throw new m("Invalid EnumMap type: " + type.toString());
                }
            };
        }
        return null;
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(final Class<? super T> cls) {
        if (this.useJdkUnsafe) {
            return new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    try {
                        return (T) UnsafeAllocator.INSTANCE.newInstance(cls);
                    } catch (Exception e7) {
                        throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
                    }
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new ObjectConstructor<T>() {
            @Override
            public T construct() {
                throw new m(str);
            }
        };
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) throws NoSuchMethodException, SecurityException {
        final Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        final h<?> hVar = this.instanceCreators.get(type);
        if (hVar != null) {
            return new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) hVar.a(type);
                }
            };
        }
        final h<?> hVar2 = this.instanceCreators.get(rawType);
        if (hVar2 != null) {
            return new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    return (T) hVar2.a(type);
                }
            };
        }
        ObjectConstructor<T> objectConstructorNewSpecialCollectionConstructor = newSpecialCollectionConstructor(type, rawType);
        if (objectConstructorNewSpecialCollectionConstructor != null) {
            return objectConstructorNewSpecialCollectionConstructor;
        }
        v.a filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        ObjectConstructor<T> objectConstructorNewDefaultConstructor = newDefaultConstructor(rawType, filterResult);
        if (objectConstructorNewDefaultConstructor != null) {
            return objectConstructorNewDefaultConstructor;
        }
        ObjectConstructor<T> objectConstructorNewDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
        if (objectConstructorNewDefaultImplementationConstructor != null) {
            return objectConstructorNewDefaultImplementationConstructor;
        }
        final String strCheckInstantiable = checkInstantiable(rawType);
        if (strCheckInstantiable != null) {
            return new ObjectConstructor<T>() {
                @Override
                public T construct() {
                    throw new m(strCheckInstantiable);
                }
            };
        }
        if (filterResult == v.a.ALLOW) {
            return newUnsafeAllocator(rawType);
        }
        final String str = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new ObjectConstructor<T>() {
            @Override
            public T construct() {
                throw new m(str);
            }
        };
    }

    public String toString() {
        return this.instanceCreators.toString();
    }
}

package i.dont.have.any.domains.Api;

import java.util.*;

public class CollectionsUtilities {

    private CollectionsUtilities() {
    }

    // public static <Value, Key> Map<Value, Key> swapMap(final Map<Key, Value> map) {
    //     final Map<Value, Key> result = new HashMap<>();
    //     for (Key key : map.keySet()) {
    //         result.put(map.get(key), key);
    //     }
    //     return result;
    // }

    public static <Value, Key> Map<Value, Key> swapMap(final Map<Key, Value> map) {
        final Map<Value, Key> result = new HashMap<>();
        map.keySet().stream().forEach(key -> {
            result.put(map.get(key), key);
        });
        return result;
    }

    public static <Key, Value> Properties mapToProperties(final Map<Key, Value> map) {
        final Properties result = new Properties();
        map.forEach((k, v) -> {
            result.setProperty(k.toString(), v.toString());
        });
        return result;
    }

    public static <K, V> K getKeyByValue(final Map<K, V> map, final V value) {
        return swapMap(map).get(value);
    }

    public static <E> ArrayList<E> setToArrayList(final Set<E> set) {
        return new ArrayList<>(set);
    }

    public static <E> LinkedList<E> setToLinkedList(final Set<E> set) {
        return new LinkedList<>(set);
    }
}

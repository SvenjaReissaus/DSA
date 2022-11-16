package me.dsa.shared;

public final class Collector<T extends Class<T>> {
    private final T[] array;
    private final int size;

    public Collector(T[] items) {
        array = items;
        size = array.length;
    }
}

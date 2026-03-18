package ua.nure;

import java.util.Objects;

public record Pair<K, V>(K key, V value) {
    public Pair {
        Objects.requireNonNull(key, "Key cannot be null");
        Objects.requireNonNull(value, "Value cannot be null");
    }
}
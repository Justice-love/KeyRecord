package org.eddy.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Justice-love on 2017/2/28.
 */
public class OracleCache<K, V> {

    private Map<K, V> cache = new HashMap<>();

    public V get(K key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        V v = new Real<V>().create();
        putToCache(key, v);
        return null;
    }

    private void putToCache(K key, V v) {
        if (Math.random() > 0.5) {
            cache.put(key, v);
        }
    }
}

class Real<V> {

    public  V create() {
        return null;
    }
}

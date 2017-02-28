package org.eddy.cache;

import java.lang.ref.SoftReference;
import java.util.HashMap;

/**
 * Created by Justice-love on 2017/2/28.
 */
public class SoftCache<K, V> extends HashMap<K, SoftReference<V>> {

    public V getValue(K key) {
        SoftReference<V> result =  super.get(key);
        return result.get();
    }

    public V putValue(K key, V v) {
        SoftReference<V> va = new SoftReference<V>(v);
        SoftReference<V> re = super.put(key, va);
        return re.get();
    }
}

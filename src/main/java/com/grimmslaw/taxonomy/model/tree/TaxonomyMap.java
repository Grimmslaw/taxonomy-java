package com.grimmslaw.taxonomy.model.tree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaxonomyMap implements Map<Taxonomy.Ranks, String> {

    private Map<Taxonomy.Ranks, String> _map;

    public TaxonomyMap() {
        _map = new HashMap<>();
    }

    public TaxonomyMap(Taxonomy.Ranks rank, String value) {
        _map = new HashMap<>();
        _map.put(rank, value);
    }

    // chain
    public TaxonomyMap addPair(Taxonomy.Ranks rank, String value) {
        _map.put(rank, value);
        return this;
    }

    @Override
    public int size() {
        return _map.size();
    }

    @Override
    public boolean isEmpty() {
        return _map.isEmpty();
    }

    @Override
    public boolean containsKey(Object rank) {
        return _map.containsKey(rank);
    }

    @Override
    public boolean containsValue(Object value) {
        return _map.containsValue(value);
    }

    @Override
    public String get(Object rank) {
        return _map.get(rank);
    }

    @Override
    public String put(Taxonomy.Ranks rank, String value) {
        return _map.put(rank, value);
    }

    @Override
    public String remove(Object rank) {
        return _map.remove(rank);
    }

    @Override
    public void putAll(Map<? extends Taxonomy.Ranks, ? extends String> m) {
        _map.putAll(m);
    }

    @Override
    public void clear() {
        _map.clear();
    }

    @Override
    public Set<Taxonomy.Ranks> keySet() {
        return _map.keySet();
    }

    @Override
    public Collection<String> values() {
        return _map.values();
    }

    @Override
    public Set<Entry<Taxonomy.Ranks, String>> entrySet() {
        return _map.entrySet();
    }

}

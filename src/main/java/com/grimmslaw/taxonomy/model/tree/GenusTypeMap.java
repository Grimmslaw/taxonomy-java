package com.grimmslaw.taxonomy.model.tree;

import com.grimmslaw.taxonomy.model.tree.Taxonomy.GenusTypes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenusTypeMap implements Map<GenusTypes, String> {

    private Map<GenusTypes, String> _map;

    public GenusTypeMap() {
        _map = buildEmptyInnerMap();
    }

    public GenusTypeMap(String bacteriaValue, String plantValue, String algaeValue,
                        String fungiValue, String animalValue) {
        _map = new HashMap<>();
        _map.put(GenusTypes.BACTERIA, bacteriaValue);
        _map.put(GenusTypes.PLANTS, plantValue);
        _map.put(GenusTypes.ALGAE, algaeValue);
        _map.put(GenusTypes.FUNGI, fungiValue);
        _map.put(GenusTypes.ANIMAL, animalValue);
    }

    private Map<GenusTypes, String> buildEmptyInnerMap() {
        Map<GenusTypes, String> mapToReturn = new HashMap<>();
        mapToReturn.put(GenusTypes.BACTERIA, null);
        mapToReturn.put(GenusTypes.PLANTS, null);
        mapToReturn.put(GenusTypes.ALGAE, null);
        mapToReturn.put(GenusTypes.FUNGI, null);
        mapToReturn.put(GenusTypes.ANIMAL, null);
        return mapToReturn;
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
    public boolean containsKey(Object key) {
        return _map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return _map.containsValue(value);
    }

    @Override
    public String get(Object key) {
        return _map.get(key);
    }

    @Override
    public String put(GenusTypes key, String value) {
        return _map.put(key, value);
    }

    @Override
    public String remove(Object key) {
        return _map.remove(key);
    }

    @Override
    public void putAll(Map<? extends GenusTypes, ? extends String> m) {
        _map.putAll(m);
    }

    @Override
    public void clear() {
        _map.clear();
    }

    @Override
    public Set<GenusTypes> keySet() {
        return _map.keySet();
    }

    @Override
    public Collection<String> values() {
        return _map.values();
    }

    @Override
    public Set<Entry<GenusTypes, String>> entrySet() {
        return _map.entrySet();
    }

}

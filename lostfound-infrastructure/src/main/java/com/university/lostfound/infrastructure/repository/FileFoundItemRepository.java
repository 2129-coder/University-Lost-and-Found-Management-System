package com.university.lostfound.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;
import com.university.lostfound.domain.model.FoundItem;

public class FileFoundItemRepository {
    private final List<FoundItem> items = new ArrayList<>();

    public void save(FoundItem item) { items.add(item); }
    public List<FoundItem> findAll() { return new ArrayList<>(items); }
}

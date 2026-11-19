package com.university.lostfound.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;
import com.university.lostfound.domain.model.LostItem;

public class FileLostItemRepository {
    private final List<LostItem> items = new ArrayList<>();

    public void save(LostItem item) { items.add(item); }
    public List<LostItem> findAll() { return new ArrayList<>(items); }
}

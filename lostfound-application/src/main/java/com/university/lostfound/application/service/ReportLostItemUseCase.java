package com.university.lostfound.application.service;

import com.university.lostfound.domain.model.LostItem;

public class ReportLostItemUseCase {
    public LostItem execute(int id, String name, String description, String location) {
        return new LostItem(id, name, description, location);
    }
}

package com.university.lostfound.application.service;

import com.university.lostfound.domain.model.FoundItem;

public class ReportFoundItemUseCase {
    public FoundItem execute(int id, String name, String description, String location) {
        return new FoundItem(id, name, description, location);
    }
}

package com.university.lostfound.domain.service;

import com.university.lostfound.domain.model.ItemStatus;

public class LostFoundService {
    public boolean canClaim(ItemStatus status) {
        return status == ItemStatus.FOUND;
    }
}

package com.university.lostfound.application.service;

public class ClaimItemUseCase {
    public String execute(int itemId, int userId) {
        return "Claim request submitted for item " + itemId;
    }
}

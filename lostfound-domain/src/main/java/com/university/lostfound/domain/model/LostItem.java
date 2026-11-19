package com.university.lostfound.domain.model;

public class LostItem {
    private int itemId;
    private String itemName;
    private String description;
    private String location;
    private ItemStatus status;

    public LostItem(int itemId, String itemName, String description, String location) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.location = location;
        this.status = ItemStatus.LOST;
    }

    public int getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }
    public ItemStatus getStatus() { return status; }
}

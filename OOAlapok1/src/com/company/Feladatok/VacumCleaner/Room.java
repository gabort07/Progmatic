package com.company.Feladatok.VacumCleaner;

public class Room {
    private int roomArea;
    private int[] dirty;

    public void setRoom(int roomArea) {
        this.roomArea = roomArea;
        this.dirty = new int[getRoomArea()];
        for (int i : dirty) {
            dirty[i] = (int) (Math.random() * 5);
        }
    }

    public void setDirty() {

    }

    public int getRoomArea() {
        return roomArea;
    }
}

package org.example.models;

public class Orders {

    private int id;
    private int cid;
    public enum status{pending,completed};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}

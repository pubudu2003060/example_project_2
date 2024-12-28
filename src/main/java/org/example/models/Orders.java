package org.example.models;
import org.example.Status;


public class Orders {

    private int id;
    private int cid;
    private Status.status status;

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

    public Status.status getStatus() {
        return status;
    }

    public void setStatus(Status.status status) {
        this.status = status;
    }
}

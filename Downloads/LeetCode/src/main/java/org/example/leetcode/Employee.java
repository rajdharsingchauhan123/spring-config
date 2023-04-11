package org.example.leetcode;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID=1L;
    private int id ;
    private transient String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

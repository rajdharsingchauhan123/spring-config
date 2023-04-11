package org.example.leetcode;

import java.io.*;

public class Employee implements Externalizable {

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

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(id);

    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        id=objectInput.readInt();

    }
}

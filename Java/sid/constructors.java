package com.sid;

class emp {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {
        emp side = new emp();
        side.setName("Sid"); // Set the name
        System.out.println(side.getName());
    }
}

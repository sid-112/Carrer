package com.sid;

class employ{
    private int id;
    private String name;

    public employ(String namee, int ide){
        id = ide;
        name = namee;
    }

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

public class ConstructorsPart2 {
    public static void main(String[] args) {
        employ emmy = new employ("Sid", 34);
        //emmy.setId(1);
        //emmy.setName("SId");
        System.out.println(emmy.getName());
        System.out.println(emmy.getId());
    }
}

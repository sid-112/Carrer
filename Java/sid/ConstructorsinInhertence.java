package com.sid;

class zammen{
    public int x;

    zammen(){
        System.out.println("Koi mil gaya");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class milgaya extends zammen{
    milgaya(){
        System.out.println("Jaddu");
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class ConstructorsinInhertence {     public static void main(String[] args) {
//        zammen z = new zammen();
        milgaya m = new milgaya();
    }
}

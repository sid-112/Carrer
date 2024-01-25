package com.sid;

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print(){
        System.out.println("Print me");
    }
}

class der extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class iNHERITENCE {
    public static void main(String[] args) {
        base b = new base();
        b.setX(5);
        System.out.println(b.getX());

        der d = new der();
        d.setY(7);
        System.out.println(d.getY());
    }
}

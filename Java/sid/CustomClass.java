package com.sid;


class Sid{
    int id;
    String name;
    public void get(){
        System.out.println("Id ---" + id);
        System.out.println("Name---" + name);
    }
}


public class CustomClass {
    public static void main(String[] args) {
        Sid sid = new Sid();
        Sid rahul = new Sid();
        sid.id = 15;
        sid.name = "Siddharth";
        rahul.id = 17;
        rahul.name = "Rahul KL";
//        System.out.println(sid.id);
//        System.out.println(sid.name);
        sid.get();
        rahul.get();
    }
}

//Their can be only one public class.

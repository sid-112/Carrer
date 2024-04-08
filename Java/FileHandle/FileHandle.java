package com.FileHandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle {
    public static void main(String[] args) {
        /*File f = new File("C:\\Edu\\coding\\Java\\FileHandle\\test.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("Not Created");
            throw new RuntimeException(e);
        }*/

        /*try {
            FileWriter fw = new FileWriter("C:\\Edu\\coding\\Java\\FileHandle\\test.txt");
            fw.write("THis is an TExt");
            fw.close();
        } catch (IOException e) {
            System.out.println("Not created");
            throw new RuntimeException(e);
        }*/

        File f= new File("C:\\Edu\\coding\\Java\\FileHandle\\test.txt");
        /*try {
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        File F = new File("C:\\Edu\\coding\\Java\\FileHandle\\test.txt");

        if (F.delete()){
            System.out.println("Deleted" + F.getName());
        }

        else {
            System.out.println("Some error occured");
        }
    }
}

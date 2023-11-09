package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehand2 {
    public static void main(String[] args) {
//        File file = new File("hi.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create new file");
//            throw new RuntimeException(e);
//        }
//        try {
//            FileWriter fr = new FileWriter("hi.txt");
//            fr.write("Learning java is very interesting");
//            fr.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        File file = new File("hi.txt");
//        try {
//            Scanner in = new Scanner(file);
//            while (in.hasNextLine()){
//                String sc = in.nextLine();
//                System.out.println(sc);
//            }
//            in.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        File file = new File("hi.txt");
        if (file.delete()){
            System.out.println("DELETED!!!! : "+file.getName());
        }else{
            System.out.println("NOT DELETED!");
        }
    }
}

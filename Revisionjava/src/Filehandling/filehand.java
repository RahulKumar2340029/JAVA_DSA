package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehand {
    public static void main(String[] args) {
//        File myFile = new File("this.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create file");
//            throw new RuntimeException(e);
//        }
        //code to write a file
//        try {
//            FileWriter file = new FileWriter("this.txt");
//            file.write("hi i am rahul and i am a student of mca in nitk");
//            file.close();
//        } catch (IOException e) {
//            System.out.println("Unable to open file");
//            throw new RuntimeException(e);
//        }
//        //Reading a file
        File myFile = new File("this.txt");
        try {
            Scanner in = new Scanner(myFile);
            while (in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
            }
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

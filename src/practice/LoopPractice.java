package practice;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoopPractice {

    static double age;
    static String name;
    static Scanner touchscreen = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //LoopPractice userInput = new LoopPractice();
        //userInput.globalAccess();
        //userInput.getMark();



    }

    /*public static void globalAccess() {


        System.out.println("What is your name?");
        name = touchscreen.nextLine();

        System.out.println("What is your age?");
        age = touchscreen.nextDouble();

        System.out.println("Your name is " + name + " your age is " + age);
    }*/

    /*public static void globalAccess2() {
        System.out.println("What is your name?");
        name = touchscreen.nextLine();

        System.out.println("What is your age?");
        age = touchscreen.nextDouble();
    }*/


    /*public String getMark() {

        String score;
        int mark = 0;
        String name = "meron";

        if (name == "Burhan") {
            score = String.valueOf(mark = 50);
        } else if (name == "meron") {
            score = String.valueOf(mark = 60);
        } else if (name == "mazbah") {
            score = String.valueOf(mark = 70);
        } else {
            score = "unknown";
        }
        System.out.println(name + " Your mark is " + score);
        return score;

    }*/

}

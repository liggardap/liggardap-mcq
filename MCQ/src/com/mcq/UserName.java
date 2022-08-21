/*
 * public class Username
 *
 *
 * JDK 11.0.13
 * IntelliJ IDEA 2021.3 Community Edition
 * © 2022 Lithan EduClass, Liggar Dicky Ardy Prayoga
 * */

package com.mcq;

import java.util.Scanner;
import java.util.regex.Pattern;

//Username Method
public class UserName extends Main{
    public static void inputUserName() {
        System.out.print("Enter your Name : ");
        Scanner input = new Scanner(System.in); //declare the scanner variable
        userName = input.nextLine(); // User input the username
        if (Pattern.matches("[a-z A-Z]+",userName)){// validate input name must consist of a-z, A-Z
            Questions.topicQuestions(); // use topicQuestions() from method Questions.java
        } else {
            System.out.println("You cannot use numbers and symbols in the name" + "\n"); // will appear if the user enters an incorrectly validated username
            inputUserName(); // User input the username again
        }
    }
}

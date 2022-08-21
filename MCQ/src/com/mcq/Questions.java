/*
 * public class Questions
 *
 *
 * JDK 11.0.13
 * IntelliJ IDEA 2021.3 Community Edition
 * © 2022 Lithan EduClass, Liggar Dicky Ardy Prayoga
 * */

package com.mcq;

import java.io.BufferedReader; // import the BufferedReader class
import java.io.FileReader; // import the FileReader class
import java.io.IOException; // import the IOException class to handle errors
import java.util.Scanner; // import the Scanner file to read text files

// Questions Method
public class Questions extends Main{
    public static void topicQuestions() {
        String topicsOpt; //declare the Topic Option variable
        System.out.println("Choose your Multiple Choice Question Set. The Options are :\n1. HTML\n2. CSS");
        System.out.print("Enter your set : ");
        Scanner input = new Scanner(System.in); // declare the scanner variable
        topicsOpt = input.nextLine(); // user enters the number of the selected topic
        if (topicsOpt.equals("1")) { // if the input entered is the number 1
            System.out.println();
            setTopics("MCQ1.csv"); // then MCQ topic 1 is selected
        } else if (topicsOpt.equals("2")) { // if the input entered is the number 2
            System.out.println();
            setTopics("MCQ2.csv"); // then MCB topic 2 is selected
        } else {
            System.out.println("Please select 1 or 2\n"); // will appear if the user enters the wrong topic number
            topicQuestions(); // User input the number topic again
        }
    }

    public static void setTopics(String questionName) {
        try {
            int tscore = 0; // declare the int variable
            int wscore = 0; // declare the int variable
            String answer, Answer; // declare the string variable
            String line = ""; // declare the string variable
            String splitBy = ","; // declare the string variable and split the record in the file with this "," character
            BufferedReader br = new BufferedReader(new FileReader(questionName)); // read csv file
            while ((line = br.readLine()) != null) {
                String[] numberQuestions = line.split(splitBy); // split the record in the file with this "," character
                do {
                    for (int i = 0; i < 5; i++) { // looping for split maximum 5
                        System.out.println(numberQuestions[i]); // print the separation results one by one
                    }
                    System.out.print("Enter your answer : ");
                    Scanner input = new Scanner(System.in); //declare the scanner variable
                    answer = input.nextLine(); // user input the answer
                    if (answer.equalsIgnoreCase("a") == true) { //if the user option is the same as the letter a, then the answer is the same as the string number 1
                        Answer = numberQuestions[1];
                    } else if (answer.equalsIgnoreCase("b") == true) { // if the user option is the same as the letter b, then the answer is the same as the string number 2
                        Answer = numberQuestions[2];
                    } else if (answer.equalsIgnoreCase("c") == true) { // if the user option is the same as the letter c, then the answer is the same as the string number 3
                        Answer = numberQuestions[3];
                    } else if (answer.equalsIgnoreCase("d") == true) { // if the user option is the same as the letter d, then the answer is the same as the string number 4
                        Answer = numberQuestions[4];
                    } else {
                        System.out.println("Please type a, b, c or d\n"); // if the option is not a, b, c, or d show this output
                        Answer = null;
                    }

                } while ((answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d")) == false);

                if (Answer.equals(numberQuestions[5])) { // if the string number 1 or 2 or 3 or 4 same as the string number 5, then the user's answer is correct
                    System.out.println("You choose the right answer !!\n");
                    tscore++; // the value of the correct answer increases
                } else if (Answer.equals(numberQuestions[5]) == false) {
                    System.out.println("Wrong answer !! The right answer is " + numberQuestions[5] + "\n"); // if the string number 1 or 2 or 3 or 4 is different from the string number 5, then the user's answer is wrong
                    wscore++; // the value of the wrong answer increases
                } else {
                    System.out.println("Please type a, b, c or d"); // if the option is not a, b, c, or d show this output
                }
            }

            // show the result score from MCQ
            System.out.println("Hi, "+userName + ", you answered " + tscore + " Questions Right and " + wscore + " Questions Wrong for a Total of 10 Questions. You scored " + tscore*10 + "%");
            System.out.println("Thank you. Have a great day");
        }

        catch (IOException e) { // reads a method type by reading whether the method has an error or not.
            e.printStackTrace();
        }
    }
}

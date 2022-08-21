/*
 * public class Welcome
 *
 *
 * JDK 11.0.13
 * IntelliJ IDEA 2021.3 Community Edition
 * © 2022 Lithan EduClass, Liggar Dicky Ardy Prayoga
 * */
package com.mcq;

// welcome method
public class Welcome extends Main{
    public static void welcome() {
        // print Welcome MCQ Text
        System.out.println("\n=====Welcome to MCQ=====");
        System.out.println("by @liggadap\n");
        System.out.println("Instruction: \n1. Read carefully. \n2. Type your name in the field. \n3. Choose one of 2 topics.");
        System.out.println("4. Each Topics consist of 10 questions. Each question consists of 4 answer choices");
        System.out.println("5. The correct answer will get 10 points and the incorrect answer didn't get a point. system will collect and sum them.");
        System.out.println("~~~Good luck!~~~\n");
        UserName.inputUserName();  // use inputUserName() from method userName.java
    }
}
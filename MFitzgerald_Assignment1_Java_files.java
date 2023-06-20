/*
 *  Class: CMSC203
 *  Instructor: Ashique Tanveer
 *  Description: ESP guessing game
 *  Due: 06/19/2023
 *  Platform/compiler: code written in VScode and compiled using JDK v17.
 *                     command line interface: WSL Ubuntu v20.04.4.
 *                     OS: Windows 11
 *  I pledge that I have completed the programming assignment
 *  independently. I have not copied the code from a student or
 *  any source. I have not fiven my code to any student.
 *  Print your Name here: Matthew Fitzgerald
 */

import java.util.Scanner;
import java.util.Random;

class MFitzgerald_Assignment1_Java_files {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner stdin = new Scanner(System.in);
    String user_name, MC_number, user_description, due_date;
    String[] color_list = {"Red", "Green", "Blue", "Orange", "Yellow"};
    int correct_guesses = 0;

    System.out.print("Enter your name: ");
    user_name = stdin.nextLine();
    System.out.print("Enter you MC M#: ");
    MC_number = stdin.nextLine();
    System.out.print("Describe yourself: ");
    user_description = stdin.nextLine();
    System.out.print("Due Date: ");
    due_date = stdin.nextLine();
    System.out.println("CMSC203 Assignment1: Test your ESP skills!");

    for (int i = 1; i <= 10; i++) {
      int selected_color = rand.nextInt(5);
      System.out.println("Round " + i);
      System.out.println("\nI am thinking of a color.");
      System.out.println("Is it Red, Green, Blue, Orange, or Yellow");
      System.out.print("Enter your guess here: ");
      int current_guess = stdin.nextInt() - 1;

      if (current_guess == selected_color) {
        correct_guesses++;
      }

      System.out.println("\nI was thinking of " + color_list[selected_color] + ".");
    }

    System.out.println("Game Over");
    System.out.println("\nYou guessed " + correct_guesses + " out of 10 colors correctly.");
    System.out.println("User Name: " + user_name);
    System.out.println("Student MC M#: " + MC_number);
    System.out.println("User Description: " + user_description);
    System.out.println("Date: " + due_date);
  }
}
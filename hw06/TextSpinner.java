// Brendan Eckardt
// CSE2 hw06
// 3.7.2016

// text spinner program 

import java.util.Scanner; // imports scanner class

public class TextSpinner{
    public static void main(String[] args){ // main method for program 
        
        while( true ){ //repeats infinitely
            System.out.print("\b"); //deletes last character printed
            System.out.print("/"); //prints a line on the spinner
            System.out.print("\b"); //deletes last character printed
            System.out.print("-"); //prints a line on the spinner
            System.out.print("\b"); //deletes last character printed
            System.out.print("\\"); //prints a line on the spinner
            System.out.print("\b"); //deletes last character printed
            System.out.print("-"); //prints a line on the spinner
            System.out.print("\b"); //deletes last character printed
            System.out.print("|"); //prints a line on the spinner
        }
    }
}
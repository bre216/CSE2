// Brendan Eckardt 
// CSE2 hw09-Rectangularize
// 3.27.2016

//program to convert string to block of strings 
//or integer to block of % based on characters

import java.util.Scanner; //import and construct scanner class

public class Rectangularize{ //class for program
    
    public static void Rectangle( int boxSize ){ //method for converting integer input to square of %
        for( int j=0; j<boxSize ; j++ ){ //controls vertical position in square of %'s'
            for( int i=0; i<boxSize; i++ ){ //controls horizontal position in square of %'s'
                System.out.print("%"); //prints out %
            }
            System.out.println(""); //moves to next row 
        }
    } //end of integer-->% method
    
    public static void Rectangle( String word ){ //method for converting string input to list of that string 
        int length=word.length(); //finds number of characters in the string input
        for( int k=0; k<length; k++ ){ //prints out string number of times equal to string length 
            System.out.println(word); //prints out the string 
        }
    } //end of string-->list of strings method
    
    public static void main(String[] args){ //main method for program 
        Scanner sc=new Scanner(System.in); //constructs an instance of the scanner class 
        System.out.println("Please enter an input: "); //asks user for input 
        if( sc.hasNextInt() ){ //if next input is integer
            int boxSize=sc.nextInt(); //sets that integer as boxSize 
            Rectangle( boxSize ); //calls Rectangle method to change integer--> square of %'s'
        }
        else{ //if next input is not an integer
            String word=sc.next(); //sets that input as a string
            Rectangle( word ); //calls Rectangle method to change string-->list of that string 
        }
    } //end of main method
} //end of class

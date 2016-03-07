// Brendan Eckardt
// CSE2 hw06
// 3.5.2016

// custom fibonacci sequence program

import java.util.Scanner; // imports scanner class

public class Fibonacci{
    public static void main(String[] args){ // main method for program 
        Scanner sc=new Scanner(System.in); // construct an instance of the scanner class
        
        int fib1=0; //declare first number in sequence
        int fib2=0; //declare second number in sequence
        int fibN=0; //declare length of sequence
        boolean cond1=true; //declare boolean for navigating input check
        boolean cond2=true; //declare boolean for navigating input check
    
        while( cond1 ){ //begins the second input check 
            System.out.println("Please enter the first number in the sequence: "); //asks for first number
            while( cond2 ){ // loops again if improper input is entered
                if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is negative
                    fib1=sc.nextInt(); //sets inputed integer as first number in fib sequence
                    if( fib1<0 ){ //if first number is negative, asks for valid input 
                        System.out.println("Invalid input. Please enter a positive integer value: ");
                    }
                    else{ //if first inputed integer is positive, breaks out of input check loops
                        cond2=false;
                        cond1=false;
                    }
                }
                else{ //if input is not an integer, asks for new input and loops again
                    System.out.println("Invalid input. Please enter a positive integer value: ");
                    sc.next(); // asks for another input 
                }
            }
        }
        cond1=true; // resets booleans so other inputs can be checked as well
        cond2=true;
        
        while( cond1 ){ //begins the second input check
            System.out.println("Please enter the second number in the sequence: "); //asks for second number
            while( cond2 ){ // loops again if improper input is entered
                if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is negative
                    fib2=sc.nextInt(); //sets inputed integer as second number in fib sequence
                    if( fib2<0 ){ //if inputed number is negative, asks for valid input 
                        System.out.println("Invalid input. Please enter a positive integer value: ");
                    }
                    else{ //if second inputed integer is positive, breaks out of while loops
                        cond2=false;
                        cond1=false;
                    }
                }
                else{ // if input is not a integer, asks for new input and loops again
                    System.out.println("Invalid input. Please enter a positive integer value: ");
                    sc.next(); // asks for another input 
                }
            }
        }
        cond1=true; // resets booleans so other inputs can be checked as well
        cond2=true;
        
        while( cond1 ){ // begins third input check
            System.out.println("How many custom Fibonacci numbers should be printed? "); // asks for sequence length
            while( cond2 ){
                if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is negative
                    fibN=sc.nextInt(); //sets inputed integer as sequence length in fib sequence
                    if( fibN<0 ){ //if length is negative, asks for valid input 
                        System.out.println("Invalid input. Please enter a positive integer value: ");
                    }
                    else{ //if first inputed integer is positive, breaks out of while loops
                        cond2=false;
                        cond1=false;
                    }
                }
                else{ // if input is not a integer, asks for new input and loops again
                    System.out.println("Invalid input. Please enter a positive integer value: ");
                    sc.next(); // asks for another input 
                }
            }
        }
        
        System.out.print("The numbers are: "+fib1+", "+fib2); //prints out first two numbers in sequence
        
        for( int i=0; i<fibN-2; i++ ){ //repeats loop N-2 times, where N is the requested number of integers
            int fib3=fib1+fib2; //declares a third integer fib3
            fib1=fib2; //sets the first number equal to the second
            fib2=fib3; //sets the second number equal to the third 
            System.out.print(", "+fib3); //prints out an additional number in the sequence for each iteration
        }
        System.out.print("."); //prints out the final period to end the output statement
    }
}
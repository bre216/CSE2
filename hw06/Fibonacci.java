// Brendan Eckardt
// CSE2 hw06
// 3.5.2016

// custom fibonacci sequence program

import java.util.Scanner; // imports scanner class

public class Fibonacci{
    public static void main(String[] args){ // main method for program 
        Scanner sc=new Scanner(System.in); // construct an instance of the scanner class
        
        int fib1=0;
        int fib2=0;
        int fibN=0;
        boolean cond1=true;
        boolean cond2=true;
    
        while( cond1 ){
            System.out.println("Please enter the first number in the sequence: ");
            while( cond2 ){
                if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is negative
                    fib1=sc.nextInt(); //sets inputed integer as first number in fib sequence
                    if( fib1<0 ){ //if first number is negative, asks for valid input 
                        System.out.println("Invalid input. Please enter a positive integer value: ");
                    }
                    else{ //if first inputed integer is positive, breaks out of while loops
                        cond2=false;
                        cond1=false;
                    }
                }
                else{
                    System.out.println("Invalid input. Please enter a positive integer value: ");
                    sc.next();
                }
            }
        }
        
        
        //System.out.println(fib2);
        //System.out.println(fibN);
    }
}
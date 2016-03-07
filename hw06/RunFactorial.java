// Brendan Eckardt
// CSE2 hw06
// 3.7.2016

// factorial calculator

import java.util.Scanner; // imports scanner class

public class RunFactorial{
    public static void main(String[] args){ // main method for program 
        Scanner sc=new Scanner(System.in); // construct an instance of the scanner class
        
        boolean cond1=true; //declare boolean for navigating input check
        boolean cond2=true; //declare boolean for navigating input check
        
        int facto=0;
    
        while( cond1 ){ //begins the first input check 
            System.out.println("Please enter an integer between 9 and 16: "); //asks for input integer
            while( cond2 ){ // loops again if improper input is entered
                if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is negative
                    facto=sc.nextInt(); //sets inputed integer as first number in fib sequence
                    if( facto<9 || facto>16){ //if first number is negative, asks for valid input 
                        System.out.println("Invalid input. Enter again! ");
                    }
                    else{ //if first inputed integer is positive, breaks out of input check loops
                        cond2=false;
                        cond1=false;
                        
                    }
                }
                else{ //if input is not an integer, asks for new input and loops again
                    System.out.println("Invalid input. Enter again! ");
                    sc.next(); // asks for another input 
                }
            }
        }
    
        int a=0, b=0; //declares two integers used to calculate factorial
        a=b=facto; //sets the two integers equal to the input value
        
        while( b>1 ){ //repeats loop until b=1
            a=a*--b; //subtracts 1 from b, multiplies that number by a, and then stores the product as the new value of a
        }
        
        System.out.println("Input accepted: "+facto+"!= "+a); //prints the output statement

    }
}
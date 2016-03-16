// Brendan Eckardt 
// CSE2 hw07
//3.16.2016

//triangles program to print triangles of integer numbers using three types of loops 

import java.util.Scanner;

public class Triangles{
    public static void main (String [] args){
        
        Scanner sc=new Scanner(System.in);
        
        int pyra=0; //declare variable for pyramid size  
        
        //ask user for spiral length and check input
        boolean cond1=true; //declare boolean for navigating input check
        boolean cond2=true; //declare boolean for navigating input check
        
        while( cond1 ){ //begins the input check 
            System.out.println("Please enter an integer from 5-30:"); //asks for size pyramid
            while( cond2 ){ // loops again if improper input is entered
                if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is between 5 and 30 inclusive 
                    pyra=sc.nextInt(); //sets inputed integer as pyramid size
                    if( pyra<5 || pyra>30 ){ //if integer is negative or outside range 5-30
                        System.out.println("Invalid input. Please enter a positive integer from 5-30: "); //asks for valid input 
                    }
                    else{ //if first inputed integer is within 5-30, breaks out of checks
                        cond2=false;
                        cond1=false;
                    }
                }
                else{ //if input is not an integer, asks for new input and loops again
                    System.out.println("Invalid input. Please enter a positive integer from 5-30: ");
                    sc.next(); // asks for another input 
                }
            }
        }
    
        int i=1; //declare integer for navigating loops 
        int j=1; //declare integer for navigating loops 
        
        //for loop
        
        for( j=1; j<=pyra; j++){ //prints out lines up to apex of pyramid 
            for( i=1; i<=j; i++ ){ //prints the integer for that line that integer number of times
                System.out.print(j);
            }
            System.out.println(""); //moves to the next line
        }
        for( j=j-2; j>=0; j--){ //prints out lines below apex of pyramid
            for( i=1; i<=j; i++){ //prints the integer for that line that integer number of times
                System.out.print(j); 
            }
            System.out.println(""); //moves to the next line
        }
        
        //while loop 
        
        while( j<=pyra ){ //prints out lines up to apex of pyramid 
            i=1;
            while( i<=j ){ //prints the integer for that line that integer number of times
                System.out.print(j);
                i++;
            }
            System.out.println(""); //moves to the next line
            j++;
        }
        j=j-2;
        while( j>=0 ){ //prints out lines below apex of pyramid
            i=1;
            while( i<=j ){ //prints the integer for that line that integer number of times
                System.out.print(j); 
                i++;
            }
            System.out.println(""); //moves to the next line
            j--;
        }
        
        //do-while loop 
        
        j=1;
        do{ //prints out lines up to apex of pyramid 
            i=1;
            do{ //prints the integer for that line that integer number of times
                System.out.print(j);
                i++;
            }
            while( i<=j );
            j++;
            System.out.println(""); //moves to the next line
        }
        while( j<=pyra);
        j=j-2;
        do{ //prints out lines below apex of pyramid
            i=1;
            do{ //prints the integer for that line that integer number of times
                System.out.print(j); 
                i++;
            }
            while( i<=j );
            j--;
            System.out.println(""); //moves to the next line
        }
        while( j>0);
        
    } //end of main method
} //end of class 
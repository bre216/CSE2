// Brendan Eckardt
// CSE2 Lab06
// 3.4.2016

// Twist program to create a twist of length inputed by the user 

import java.util.Scanner; // imports scanner class

public class TwistGenerator{ //declares class
    public static void main (String[] args){ // main method for program 
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter a positive integer: "); //asks user for input value 
        
        int twistLength=0; //sets twist length=0
        
        while( !sc.hasNextInt() ){ //if next input is not an integer
            System.out.println("Sorry, you must enter an integer value."); //asks user for integer value
            String junk=sc.next(); //takes non-integer input and removes it
        }
        
        twistLength=sc.nextInt(); //sets twistlength=input integer
        
        while( twistLength<0 ){ //checks twistlength to make sure it is positive
            System.out.println("Sorry, you must enter a positive integer value."); //asks for positive value
            twistLength=sc.nextInt(); //if not positive, removes input as junk
        }
        
        int counter1=0;
        int counter2=0;
        int counter3=0;
        
        while( counter1<twistLength ){ //checks length of first line
            System.out.print("\\"); //prints first character
            counter1++;
            if( counter1==twistLength ){ //if line length equals twistlength, breaks
                break;
            }
            System.out.print(" "); //prints 2nd character
            counter1++;
            if( counter1==twistLength ){ //if line length equals twistlength, breaks
                break;
            }
            System.out.print("/"); //prints 3rd character
            counter1++;
            if( counter1==twistLength ){ //if line length equals twistlength, breaks
                break;
            }
        }
        System.out.println("");
        
        while( counter2<twistLength ){
            System.out.print(" "); //prints first character
            counter2++;
            if( counter2==twistLength ){ //if line length equals twistlength, breaks
                break;
            }
            System.out.print("X"); //prints 2nd character
            counter2++;
            if( counter2==twistLength ){ //if line length equals twistlength, breaks
                break;
            }
            System.out.print(" "); //prints 3rd character
            counter2++;
            if( counter2==twistLength ){ //if line length equals twistlength, breaks
                break;
            }
        }
        System.out.println("");
        
        while( counter3<twistLength ){
            System.out.print("/"); //prints first character
            counter3++;
            if( counter3==twistLength ){ //if line length equals twistlength, breaks
                break;
            }
            System.out.print(" "); //prints 2nd character
            counter3++;
            if( counter3==twistLength ){ //if line length equals twistlength, breaks
                break;
            }
            System.out.print("\\"); //prints 3rd character
            counter3++;
            if( counter3==twistLength ){ //if line length equals twistlength, breaks
                break;
            }
        }
    
    }
}

// Brendan Eckardt 
// cse2 hw12
// 4.15.2016

// program to create list of grades and search that list 

import java.util.Scanner; //imports scanner class
import java.util.Random; //imports random class

public class CSE2Linear{ //start of class
    
    //start of main method 
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in); //construct an instance of scanner class
        
        int[] grades=new int[15]; //create new array for grades of size 15
        System.out.println("Please enter the 15 final grades for CSE2 in increasing order: "); //ask user to input 15 final grades
        for( int i=0; i<15; i++ ){ //begins input check for all 15 grades
            boolean bool=true; //creates boolean variable to help navigate input check
            while( bool ){ //start of input check
                if( !sc.hasNextInt() ){ //if user does not enter an integer
                    System.out.println("ERROR: please enter an integer value"); //prints error and asks for integer
                }
                else{ //if user enters an integer
                    int input=sc.nextInt(); //assigns that integer value to variable "input"
                    if( input<0 || input>100 ){ //if input is outside range 0-100
                        System.out.println("ERROR: please enter an integer from 0-100"); //prints error and asks for integer in acceptable range
                    }
                    else{ //if grade is within acceptable range
                        if( i>0 ){ //starts check for increasing value, starting at 2nd number
                            if( input<grades[i-1] ){ //if the grade entered is less than the previous grade
                                System.out.println("ERROR: please enter an integer greater than the previous grade"); //prints error message and asks for higher value
                            }
                            else{ //if grade entered is >= the previous grade
                                grades[i]=input; //sets the next array member as that grade value
                                bool=false; //breaks out of the input check loop and moves to next input 
                            }
                        }
                        else{ //for the first integer entered
                            if( i==0 ){
                                grades[i]=input; //sets the first member of list as the first integer entered
                                bool=false; //breaks out of the input check and moves on to the next input
                            }
                        }
                    } //end of continuous increase check
                } //end of range and increasing value check
            } //end of integer check 
        } //end of input loop for all 15 grades
        
        System.out.println("Sorted:"); //prints sorted message
        for( int i=0; i<15; i++ ){ //prints out the list of grades in increasing order
            System.out.print(grades[i]+" ");
        }
        System.out.println(""); //moves to the next line to make output neater
        binarySearch( grades ); //performs a binary search on the sorted list of grades to find a certain value and gives the number of iterations
        scramble( grades ); //scrambles the sorted list of grades
        
        System.out.println("Scrambled:"); //prints out the scrambled message
        for( int i=0; i<15; i++ ){ //prints out the list of scrambled grades 
            System.out.print(grades[i]+" ");
        }
        System.out.println(""); //moves to the next line to make output neater
        linearSearch( grades ); //performs a linear search to find the grade specified and gives the number of iterations needed
    } 
    
    //method to scramble list of grades
    public static int[] scramble( int[] grades ){ //takes an integer array as input and returns the scrambled integer array
        Random randGen=new Random(); //constructs an instance of the random class
        int holder=0; //creates new integer holder for use in the scrambling
        for( int i=0; i<10; i++ ){ //repeats random scrambling operation 10 times
            int rand=randGen.nextInt(14); //creates new random integer from 0-14
            holder=grades[rand]; //copies value in random position to holder variable
            grades[rand]=grades[0]; //copies first value in list to that random position
            grades[0]=holder; //sets the first value in the list as the value stored in holder variable
        }
        return grades; //returns scrambled list 
    }
    
    //method for binary search of list
    public static void binarySearch( int[] grades ){ //start of binary search method to find specified value
        Scanner sc=new Scanner(System.in); //construct an instance of scanner class
        System.out.println("Please enter a grade to search for: "); //asks user for value they want to search for
        boolean test=true; //create boolean variable to help navigate input check
        while( test ){ //begins input check loop
            if( !sc.hasNextInt() ){ //checks to see if value entered is an integer
                System.out.println("ERROR: Please enter an integer value"); //if not, prints error message
                String junk=sc.next();
            }
            else{ //if input is an integer
                int check=sc.nextInt(); //assigns that integer to variable "check"
                if( check<0 || check>100 ){ //tests check to see if it is within acceptable range 
                    System.out.println("ERROR: Please enter an integer from 0-100"); //if not, prints error message
                }
                else{ //if integer is within acceptable range
                    int arrayMax=14; //create variable int arrayMax to set upper bound of binary search
                    int arrayMin=0; //create variable in arrayMin to set bottom bound of binary search
                    int counter=1; //creates counter to track number of iterations
                    while( true ){ //runs loop continuously
                        if( grades[arrayMax-(arrayMax-arrayMin)/2]==check ){ //if the value stored in array2 halfway between the boundaries equals input
                            System.out.println("The grade was found after "+counter+" iterations"); //print the input match message
                            break; //break out of the loop 
                        }
                        else if( grades[arrayMax-((arrayMax-arrayMin)/2)]>check ){ //if the value stored in array2 halfway between the boundaries is greater than input
                            arrayMax=arrayMax-((arrayMax-arrayMin)/2); //set the upper boundary as that index position
                        }
                        else if( grades[arrayMax-((arrayMax-arrayMin)/2)]<check ){ //if the value stored in array2 halfway between the boundaries is less than input
                            arrayMin=arrayMax-((arrayMax-arrayMin)/2); //set the lower boundary as that index position
                        }
                        
                        if( (arrayMax-arrayMin)/2==0 ){ //if the two boundaries are within 1 index position of each other
                            if( arrayMax!=check && arrayMin!=check ){
                                System.out.println(check+" was not found in the list after "+counter+" iterations"); //print out the unmatched input message
                                break; //breaks out of the loop 
                            }
                            else{
                                System.out.println(check+" was found in the list after "+(counter+1)+" iterations");
                                break;
                            }
                        } //end of boundary check
                        counter++; //increments counter to keep track of interations needed
                    } //end of continuous search loop
                    break; //breaks out of input check loop and ends method 
                }
            }
        } 
    } //end of binary search method
    
    //method for linear search of list 
    public static void linearSearch( int[] grades ){
        Scanner sc=new Scanner(System.in); //construct an instance of scanner class
        System.out.println("Please enter a grade to search for:");
        boolean test=true; //create boolean for navigating input check
        while( test ){
            if( !sc.hasNextInt() ){ //checks to see if value entered is an integer
                System.out.println("ERROR: Please enter an integer value"); //if not, prints error message
                String junk=sc.next(); //removes input as junk as waits for next value
            }
            else{ //if input is an integer
                int check=sc.nextInt(); //assigns that integer to variable "check"
                if( check<0 || check>100 ){ //tests check to see if it is within acceptable range
                    System.out.println("ERROR: Please enter an integer from 0-100"); //if not, prints error message
                } 
                else{ //if integer is within acceptable range
                    for( int i=0; i<15; i++ ){
                        if( grades[i]==check ){ //if value in that index position matches search value
                            System.out.println(check+" was found after "+(i+1)+" iterations"); //prints out message and number of iterations needed
                            test=false; //breaks out of input test loop
                        }
                        else if( i==14 ){
                            System.out.println(check+" was not found in the list after 15 interations");
                            test=false; //breaks out of input test loop 
                        }
                    }
                } //end of acceptable range test
            } //end of integer test
        } //end of input test
    } //end of linear search method 
} //end of class
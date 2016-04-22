// Brendan Eckardt 
// cse2-lab11
// 4.15.2016

//program to create arrays and perform array search

import java.util.Scanner; //import scanner class

public class arraySearch{ //start of class
    public static void main( String[] args){ //start of main method
        Scanner sc=new Scanner(System.in); //construct instance of scanner class
        
        int[] array1=new int[50]; //create first integer array of size 50
        int[] array2=new int[50]; //create second integer array of size 50
        
        //assign random integers to the values of array1
        for( int i=0; i<50; i++ ){ //runs the assignment for all 50 members of array1
            array1[i]=(int)(Math.random()*101); //assigns a random number from 0-100 to each element in array1
        } //end of assignment
        
        //use linear search to find the minimum of array1
        int min1=array[i]; //create int variable to hold minimum value in array1
        for( int i=0; i<50; i++ ){ //runs the test for all 50 members of array1
            if( array1[i]<min1 ){ //if member i of array1 is less than minimum, sets that number as the new minimum 
                min1=array1[i];
            }
        }
        System.out.println("The minimum of array1 is: "+min1); //prints out the minimum value of array1
        
        //use linear search to find maximum of array1
        int max1=array[i]; //create an int variable to hold maximum value in array1
        for( int i=0; i<50; i++ ){ //run test for all 50 members of array1
            if( array1[i]>max1 ){ //if value at the index is greater than max
                max1=array1[i]; //sets that value as the new maximum 
            }
        }
        System.out.println("The maximum of array1 is: "+max1); //prints out the maximum value of array1
        
        //add increasing numbers to array2
        array2[0]=(int)(Math.random()*101); //assigns the first value in array2 a random number from 0-100
        for( int i=1; i<50; i++ ){ //repeats assignment for 49 remaining elements
            array2[i]=(int)(Math.random()*101)+array2[i-1]; //assigns values to each member in array2, with each subsequent value higher than the previous one
        }
        
        //find minimum of array2
        int min2=200; //creates int variable to hold minimum value in array2
        for( int i=0; i<50; i++ ){ //runs test for all 50 elements of array2
            if( array2[i]<min2 ){ //if the value in index i is less than min
                min2=array1[i]; //sets that value as the new minimum for array2
            }
        }
        System.out.println("The minimum of array2 is: "+min2); //prints out the minimum value of array2
        
        //find maximum of array2
        int max2=0; //create an int variable to hold maximum value in array2
        for( int i=0; i<50; i++ ){ //runs test for all 50 elements of array2
            if( array2[i]>max2 ){ //if the value in index i is greater than max
                max2=array2[i]; //sets that value as the new maximum for array2
            }
        }
        System.out.println("The maximum of array2 is: "+max2); //prints out the maximum value of array2
        
        //ask user to enter integer >=0
        System.out.println("Please enter an integer greater than or equal to 0: "); //asks the user for input
        if( !sc.hasNextInt() ){ //if user input is not an integer
            System.out.println("You did not enter an integer"); //print out error message
            System.exit(0); //quit the program
        }
        else{ //if user did enter an integer
            int input=sc.nextInt(); //set that integer as variable input
            if( input<0 ){ //if user input is negative
                System.out.println("You did not enter an int>0"); //print error message
            }
            else{ //if user entered an integer>=0
                int arrayMax=49; //create variable int arrayMax to set upper bound of binary search
                int arrayMin=0; //create variable in arrayMin to set bottom bound of binary search
                while( true ){ //runs loop continuously 
                    
                    if( array2[arrayMax-(arrayMax-arrayMin)/2]==input ){ //if the value stored in array2 halfway between the boundaries equals input
                        System.out.println("Your input matched array2 index "+array2[arrayMax-(arrayMax-arrayMin)/2]); //print the input match message
                        break; //break out of the loop 
                    }
                    else if( array2[arrayMax-((arrayMax-arrayMin)/2)]>input ){ //if the value stored in array2 halfway between the boundaries is greater than input
                        arrayMax=arrayMax-((arrayMax-arrayMin)/2); //set the upper boundary as that index position
                    }
                    else if( array2[arrayMax-((arrayMax-arrayMin)/2)]<input ){ //if the value stored in array2 halfway between the boundaries is less than input
                        arrayMin=arrayMax-((arrayMax-arrayMin)/2); //set the lower boundary as that index position
                    }
                    if( ( (arrayMax-arrayMin)/2)==0 ){ //if the two boundaries are within 1 index position of each other
                        System.out.println(input+" was not found in the list."); //print out the unmatched input message
                        System.out.println("The number above the input was "+array2[arrayMax]); //prints the next highest value in array2
                        System.out.println("The number below the input was "+array2[arrayMin]); //prints the next lowest value in array2
                        break; //breaks out of the loop 
                        
                    } //end of boundary check
                } //end of continuous search loop
            } //end of binary search
        } 
    } //end of main method
} //end of class
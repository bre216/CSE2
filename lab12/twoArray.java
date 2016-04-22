// Brendan Eckardt
// cse2 lab12
// 4.22.2016

//program to create and manipulate a 2D ragged array

import java.util.Scanner; //imports scanner class
import java.util.Random; //imports random class

public class twoArray{ //start of class
    
    //start of main method
    public static void main( String[] args){  
        Scanner sc=new Scanner(System.in); //construct an instance of scanner class
        Random rand=new Random(); //construct an instance of random class
        
        System.out.println("Please enter the size of the main array: "); //ask user for size of array
        int arraySize=0; //create variable to hold size of array 
        while( true ){ //loops input check until acceptable input is entered
            arraySize=sc.nextInt(); //assignes entered integer as size of the array
            if( arraySize<0 ){ //if entered integer is negative
                System.out.println("ERROR: Please enter a positive integer: "); //prints error message and asks for positive integer 
            }
            else{ //if entered integer is positive
                break; //breaks out of input check 
            }
        } //end of input check
        
        int[][] multiArray=new int[arraySize][]; //creates new two-dimensional array of specified size
        for( int i=0; i<arraySize; i++ ){ //loops over all members of the array
            multiArray[i]=new int[rand.nextInt(arraySize-1)+1]; //assigns each member of the array as a new integer array 
        }
        int i=0; //creates variable to help navigate rows of the array
        while( i<arraySize ){ //loops over every row 
            int j=0; //creates variable to help navigate columns of the array
            while( j<multiArray[i].length ){ //loops over every column
                multiArray[i][j]=rand.nextInt(21); //assigns each position in the array a random integer from 0-20
                j++; //moves to the next column
            }
            i++; //moves to the next row 
        } //end of assignment 
        System.out.println("Here is your unsorted array: "); //prints output message
        print( multiArray); //prints unsorted array
        System.out.println(""); //prints blank line to make output neater
        System.out.println("Here is your sorted array: "); //prints output message
        insertionSort( multiArray); //sorts the values in each row of the array from smallest to largest, using an insertion sort 
        print( multiArray ); //prints the sorted array
        System.out.println(""); //prints blank line to make output neater
        System.out.println("Here is your rearranged array: "); //prints output message
        rearrange( multiArray); //sorts the rows of the array according to length, from shortest to longest
        print( multiArray ); //prints the rearranged array 
        System.out.println(""); //prints blank line to make output neater
        System.out.println("What number would you like to search for? "); //asks user for number to search for 
        search( multiArray ); //searches array for specified value and prints location if found 
        
    }
        
    //method to print out the 2D array
    public static void print(int[][] array){
        int i=0; //creates variable to help navigate array
        while( i<array.length ){ //loops over every row 
            int j=0; //creates variable to help navigate array
            while( j<array[i].length ){ //loops over every column 
                System.out.print(array[i][j]+" "); //prints out the value in that position
                j++; //moves to the next value in that row 
            }
            System.out.println(""); //begins a new line 
            i++; //moves to the next row 
        }
    } 
    
    //method to insertion sort member arrays of multiArray
    public static int[][] insertionSort( int[][] array ){
        int i=0; //creates variable to help navigate array
        while( i<array.length ){ //loops over every row
            int j=1; //creates variable to help navigate array
            while( j<array[i].length ){ //loops over every column 
                while( array[i][j]<array[i][j-1] ){ //if the value is less than the previous value
                    int temp=array[i][j-1]; //copies value in the previous position to a temporary variable
                    array[i][j-1]=array[i][j]; //previous value becomes the current value 
                    array[i][j]=temp; //current value becomes the value stored in temp
                    j--; //decrements j to check if value needs to be moved further down 
                    if( j==0 ){ //if j=0, breaks out of loop to prevent index errors 
                        break;
                    }
                }
                j++; //moves to the next value in that row 
            }
            i++; //moves to the next row 
        }
        return array; //returns the sorted array 
    }
    
    //method to rearrange rows according to length
    public static int[][] rearrange( int[][] array ){
        for( int j=1; j<array.length; j++ ){ //loops over every row 
            while( array[j].length<array[j-1].length ){ //if the current row is shorter than the previous row 
                int[] temp=array[j]; //copies the current row to a temporary array
                array[j]=array[j-1]; //previous row is copied into the current row 
                array[j-1]=temp; //temporary array is copied into the previous row 
                j--; //decrements j to check if switched row needs to be moved further down 
                if( j==0 ){ //if j=0, breaks out of loop to prevent index errors 
                    break;
                }
            }
        }
        return array; //returns the array with rows sorted by row length 
    }
    
    //method to search for number in array 
    public static void search( int[][] array ){
        Scanner sc=new Scanner(System.in); //construct an instance of scanner class
        while( true ){
            int query=sc.nextInt(); //asigns user input as variable "query"
            if( query<0 ){ //if input is negative 
                System.out.println("Please enter a positive integer to search for: "); //asks user for positive integer
            }
            else{ //if user input is positive
                int i=0; //creates variable to help navigate array
                while( i<array.length ){ //loops over every row in array 
                    int j=0; //creates variable to help navigate array
                    while( j<array[i].length ){ //loops over every column in array 
                        if( array[i][j]==query ){ //if value in that position matches query 
                            System.out.println("Column "+(j+1)+" Row "+(i+1)); //prints out location of desired value
                            System.exit(0); //quits the program 
                        }
                        j++; //moves to next value in the row 
                    }
                    i++; //moves to next row in array
                }
                System.out.println("Not in the array."); //if the value is not found, informs user 
                System.exit(0); //exits the program 
            }
        }
    }
} //end of proram 


// Brendan Eckardt
// cse2 hw12
// 4.23.2016

// holoporter program using 3D ragged arrays 

import java.util.Scanner; //import scanner class
import java.util.Random; //import random class
import java.util.Arrays; //import array method 

public class Holoporter{ //start of class

    //start of main method 
    public static void main (String [] args ){
        
        Random rand=new Random(); //construct and instance of random method 
        
        String[][][] mArray=new String[rand.nextInt(10)+1][][];
        soRandom( mArray ); //run the soRandom method
        coder( mArray ); //run the coder method 
        
        System.out.println("The original 3D array is: "); //print output message
        print( mArray ); //run print method 
        String[][][] holder=new String[rand.nextInt(10)+1][][];
        soRandom( holder ); //run soRandom method on new array 
        holoport( mArray, holder ); //runs holoport method to transfer values from mArray to holder
        System.out.println("The copied 3D array is: "); //print output message
        print( holder ); //prints out the copied array 
        System.out.println("Please enter a specific code to search for: "); //ask user for input 
        Scanner sc=new Scanner(System.in); //construct an instance of the scanner class 
        boolean test1=true; //create boolean variable to help navigate input tests
        String input="tttt"; //creates string variable
        while( test1 ){ //begins input check 
            input=sc.next(); //sets next input as string variable
            if( input.matches("^[A-Z][A-Z][0-9][0-9][0-9][0-9]$") ){ //checks to see if input matches the required format
                test1=false; //if so, breaks out of input check 
            }
            else{ //if input does not match required format for code
                System.out.println("Please enter a code in the form XXYYYY where X is an uppercase letter and Y is an integer from 0-9: "); //asks for correct format 
            }
        }
        sampling( mArray, input); //runs the sampling method on mArray for the given input 
        percentage( mArray, holder); //runs the percentage method
        frankenstein( holder ); //runs the frankenstein method on the copied array 
        print( holder ); //prints array holder 
    } //end of main method
    
    //method to create random ragged 3D array 
    public static String[][][] soRandom( String[][][] array1 ){
        Random rand=new Random(); //construct instance of random class
        for( int i=0; i<array1.length; i++ ){ //loops over the 1st array dimension
            array1[i]=new String[rand.nextInt(10)+1][]; //asigns each member of the array as a two dimensional array of size 1-10
            for( int j=0; j<array1[i].length; j++ ){ //loops over the 2nd array dimension
                array1[i][j]=new String[rand.nextInt(10)+1]; //assigns each member of member array as an array of size 1-10
            }
        }
        return array1; //returns the empty array 
    } //end of space-creation method 
    
    //method to fill array with codes for each position
    public static String[][][] coder( String[][][] array2 ){
        Random rand=new Random(); //constructs an instance of the random class
        for( int i=0; i<array2.length; i++ ){ //loops over 1st dimension
            for( int j=0; j<array2[i].length; j++ ){ //loops over second dimension
                for( int k=0; k<array2[i][j].length; k++ ){ //loops over every index of 3rd dimension
                    array2[i][j][k]=letter()+letter()+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10); //assigns that index a code value of the format specified
                }
            }
        }
        return array2; //returns the filled array with codes at each position
    } //end of coder method 
    
    //method to print the 3D array 
    public static void print(String[][][] arrayP){
        for( int i=0; i<arrayP.length; i++ ){ //loops over the 1st dimension
            for( int j=0; j<arrayP[i].length; j++ ){ //loops over the 2nd dimension
                System.out.print("["); //prints start of output
                for( int k=0; k<arrayP[i][j].length; k++ ){ //loops over 3rd dimension
                    if( k==arrayP[i][j].length-1){ //if the index is the last member in that array
                        System.out.print(arrayP[i][j][k]); //prints out the code for that index
                    }
                    else{ //if that index is not the last position
                        System.out.print(arrayP[i][j][k]+", "); //prints the code for that index and a comma 
                    }
                }
                System.out.print("]"); //prints the end of the 3rd level array 
                if( j!=arrayP[i].length-1 ){ //if there is more to print 
                    System.out.print("|"); //separates that array from another 2nd dimensional array with a line 
                }
            }
            if( i!=arrayP.length-1 ){ //if there is more to print 
                System.out.print("---"); //separates that 1st dimensional array from another array with a series of dashes
            }
        }
        System.out.println(""); //moves to the next line to make the output clearer 
    } //end of print method
    
    //holoporter method 
    public static String[][][] holoport( String[][][] original, String[][][] copy ){
        for( int i=0; i<copy.length; i++ ){ //for all elements of copy 
            if( i<original.length ){ //if copy is shorter than original 
                for( int j=0; j<copy[i].length; j++ ){ //for every element i of copy before the end of original 
                    if( j<original[i].length ){ //if that 2D array is smaller than original 
                        for( int k=0; k<copy[i][j].length; k++ ){ //for every element k of each 2nd dimensional array
                            if( k<original[i][j].length ){ //if the index is lower than the length of the original array 
                                copy[i][j][k]=original[i][j][k]; //copies the value into the new array 
                            }
                            else{ //if index is higher than the length of the original array
                                copy[i][j][k]="$$$$$$"; //gives that position a value of $$$$$$
                            }
                        }
                    }
                    else{ //if that 2D array is longer than original 
                        for( int k=0; k<copy[i][j].length; k++ ){ //repeats for second dimension
                            copy[i][j][k]="$$$$$$"; //fills that position with $$$$$
                        }
                    }
                }
            }
            else{ //if i is longer than original 
                for( int j=0; j<copy[i].length; j++){ //for every element i past the end of original 
                    for( int k=0; k<copy[i][j].length; k++ ){ //for every element k
                        copy[i][j][k]="$$$$$$"; //fills that position with $$$$$
                    }
                }
            
            }
        }
        return copy; //returns the copied array 
    } //end of holoport method 
    
    public static void sampling(String[][][] library, String input ){
        String output="Code was not found"; //creates output variable 
        for( int i=0; i<library.length; i++ ){ //loops over all elements of the array 
            for( int j=0; j<library[i].length; j++ ){
                for( int k=0; k<library[i][j].length; k++ ){
                    if( library[i][j][k].equals(input) ){ //if the code in that position matches the input 
                        output="Code was found in position ("+i+", "+j+", "+k+")"; //changes the output string to print location of the searched code 
                    }
                }
            }
        }
        System.out.println(output); //prints the output message 
    } //end of sampling method 
    
    public static void percentage( String[][][] original, String[][][] copy){
        int sumOrig=0; //creates int variable to track number of elements in original 
        int sumCopy=0; //creates int variable to track number of elements in copy
        for( int i=0; i<original.length; i++ ){ //loops over all elements in the original array 
            for( int j=0; j<original[i].length; j++ ){
                for( int k=0; k<original[i][j].length; k++ ){
                    sumOrig++; //increments sum for each element 
                }
            }
        }
        for( int i=0; i<copy.length; i++ ){ //loops over all elements in copied array 
            for( int j=0; j<copy[i].length; j++ ){
                for( int k=0; k<copy[i][j].length; k++ ){
                    sumCopy++; //increments sum for each element 
                }
            }
        }
        System.out.println(((sumCopy-sumOrig)*100/sumOrig)+"%"); //prints out the percentage output message 
    } //end of percentage method 
    
    
    public static String[][][] frankenstein( String[][][] holo ){
        int i=0; //creates variable to help navigate array
        while( i<holo.length ){ //loops over every row
            int j=0; //creates variable to help navigate array
            while( j<holo[i].length ){ //loops over every column 
                int k=1; //starts loop at 2nd element in list 
                while( k<holo[i][j].length ){ //loops over all k elements 
                    while( holo[i][j][k].charAt(0)<holo[i][j][k-1].charAt(0) ){ //if the value is less than the previous value (alphabetically)
                        String temp=holo[i][j][k-1]; //copies the previous code to a string 
                        holo[i][j][k-1]=holo[i][j][k]; //copies the current code into the previous position
                        holo[i][j][k]=temp; //copies the previous code into the current position
                        k--; //decrements k to check if the code needs to be switched further down the list
                        if( k==0 ){ //if at the first element, breaks 
                            break;
                        }
                    }
                    k++; //moves to the next element 
                }
                j++; //moves to the next j level array 
            }
            i++; //moves to the next i level array 
        }
        i=1; //resets variable i
        while( i<holo.length ){ //for all member arrays 
            while( holo[i].length<holo[i-1].length ){ //if the length of that i level array is less than the length of the previous array 
                String[][] temp=holo[i]; //copies that array into a temporary string variable
                holo[i]=holo[i-1]; //copies the previous array into the current position
                holo[i-1]=temp; //copies the current array into the previous position
                i--; //decrements to check if array needs to be moved further down the list 
                if( i==0 ){ //if at the first element, breaks
                    break;
                }
            }
            i++; //moves to the next i level array 
        }
        return holo; //returns the sorted array 
    } //end of frankenstein method 
    
    
    //method to return random letter for use in coding elements 
    public static String letter(){
        Random rand=new Random(); //constructs an instance of the random class 
        int alpha=rand.nextInt(26); //creates random integer from 0-25 
        String lett="tt"; //creates string variable 
        switch( alpha ){ //changes string variable to a capital letter based on the random integer generated 
            case 0:
                lett="A";
                break;
            case 1:
                lett="B";
                break;
            case 2:
                lett="C";
                break;
            case 3:
                lett="D";
                break;
            case 4:
                lett="E";
                break;
            case 5:
                lett="F";
                break;
            case 6:
                lett="G";
                break;
            case 7:
                lett="H";
                break;
            case 8:
                lett="I";
                break;
            case 9:
                lett="J";
                break;
            case 10:
                lett="K";
                break;
            case 11:
                lett="L";
                break;
            case 12:
                lett="M";
                break;
            case 13:
                lett="N";
                break;
            case 14:
                lett="O";
                break;
            case 15:
                lett="P";
                break;
            case 16:
                lett="Q";
                break;
            case 17:
                lett="R";
                break;
            case 18:
                lett="S";
                break;
            case 19:
                lett="T";
                break;
            case 20:
                lett="U";
                break;
            case 21:
                lett="V";
                break;
            case 22:
                lett="W";
                break;
            case 23:
                lett="X";
                break;
            case 24:
                lett="Y";
                break;
            case 25:
                lett="Z";
                break;
        }
        return lett; //returns that randomly generated letter
    } //end of letter method 
    
} //end of class 
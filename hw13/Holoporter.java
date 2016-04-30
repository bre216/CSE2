// Brendan Eckardt
// cse2 hw12
// 4.23.2016

// holoporter program using 3D ragged arrays 

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Holoporter{ //start of class

    //start of main method 
    public static void main (String [] args ){
        
        Random rand=new Random();
        
        String[][][] mArray=new String[rand.nextInt(10)+1][][];
        soRandom( mArray );
        coder( mArray );
        /*
        String[][][] mArray=new String[3][3][3];
        for( int i=0; i<mArray.length; i++ ){
            for( int j=0; j<mArray[i].length; j++ ){
                for( int k=0; k<mArray[i][j].length; k++ ){
                    mArray[i][j][k]=letter()+letter()+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
                }
            }
        }
        */
        System.out.println("The original 3D array is: ");
        print( mArray );
        String[][][] holder=new String[rand.nextInt(10)+1][][];
        soRandom( holder );
        holoport( mArray, holder );
        System.out.println("The copied 3D array is: ");
        print( holder );
        System.out.println("Please enter a specific code to search for: ");
        Scanner sc=new Scanner(System.in);
        boolean test1=true;
        String input="tttt";
        while( test1 ){
            input=sc.next();
            if( input.matches("^[A-Z][A-Z][0-9][0-9][0-9][0-9]$") ){
                test1=false;
            }
            else{
                System.out.println("Please enter a code in the form XXYYYY where X is an uppercase letter and Y is an integer from 0-9: ");
            }
        }
        sampling( mArray, input);
        percentage( mArray, holder);
        /*
        String one="Apple";
        String two="Bear";
        if( one.charAt(0)<two.charAt(0) ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        */
        frankenstein( holder );
        print( holder );
    }
    
    //method to create random ragged 3D array 
    public static String[][][] soRandom( String[][][] array1 ){
        Random rand=new Random();
        for( int i=0; i<array1.length; i++ ){
            array1[i]=new String[rand.nextInt(10)+1][];
            for( int j=0; j<array1[i].length; j++ ){
                array1[i][j]=new String[rand.nextInt(10)+1];
            }
        }
        return array1;
    }
    
    //method to fill array with codes for each position
    public static String[][][] coder( String[][][] array2 ){
        Random rand=new Random();
        for( int i=0; i<array2.length; i++ ){
            for( int j=0; j<array2[i].length; j++ ){
                for( int k=0; k<array2[i][j].length; k++ ){
                    array2[i][j][k]=letter()+letter()+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
                    /*
                    int l=0; 
                    while( l<=i ){
                        int h=0; 
                        while( h<=j ){
                            int g=0; 
                            while( g<=k ){
                                if( mArray[i][j][k].equals(mArray[l][h][g]) ){
                                    mArray[i][j][k]=letter()+letter()+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
                                    continue;
                                }
                                g++;
                            }
                            h++;
                        }
                        l++;
                    }
                    */
                }
            }
        }
        return array2;
    }
    
    //method to print the 3D array 
    public static void print(String[][][] arrayP){
        for( int i=0; i<arrayP.length; i++ ){
            for( int j=0; j<arrayP[i].length; j++ ){
                System.out.print("[");
                for( int k=0; k<arrayP[i][j].length; k++ ){
                    if( k==arrayP[i][j].length-1){
                        System.out.print(arrayP[i][j][k]);
                    }
                    else{
                        System.out.print(arrayP[i][j][k]+", ");
                    }
                }
                System.out.print("]");
                if( j!=arrayP[i].length-1 ){
                    System.out.print("|");
                }
            }
            if( i!=arrayP.length-1 ){
                System.out.print("---");
            }
        }
        System.out.println("");
    }
    
    //holoporter method 
    public static String[][][] holoport( String[][][] original, String[][][] copy ){
        for( int i=0; i<copy.length; i++ ){ //for all elements of copy 
            if( i<original.length ){ //if copy is shorter than original 
                for( int j=0; j<copy[i].length; j++ ){ //for every element i of copy before the end of original 
                    if( j<original[i].length ){ //if that 2D array is smaller than original 
                        for( int k=0; k<copy[i][j].length; k++ ){
                            if( k<original[i][j].length ){
                                copy[i][j][k]=original[i][j][k];
                            }
                            else{
                                copy[i][j][k]="$$$$$$";
                            }
                        }
                    }
                    else{ //if that 2D array is longer than original 
                        for( int k=0; k<copy[i][j].length; k++ ){
                            copy[i][j][k]="$$$$$$";
                        }
                    }
                }
            }
            else{ //if i is longer than original 
                for( int j=0; j<copy[i].length; j++){ //for every element i past the end of original 
                    for( int k=0; k<copy[i][j].length; k++ ){
                        copy[i][j][k]="$$$$$$";
                    }
                }
            
            }
        }
        return copy;
    }
    
    public static void sampling(String[][][] library, String input ){
        String output="Code was not found";
        for( int i=0; i<library.length; i++ ){
            for( int j=0; j<library[i].length; j++ ){
                for( int k=0; k<library[i][j].length; k++ ){
                    if( library[i][j][k].equals(input) ){
                        output="Code was found in position ("+i+", "+j+", "+k+")";
                    }
                }
            }
        }
        System.out.println(output);
    }
    
    public static void percentage( String[][][] original, String[][][] copy){
        int sumOrig=0;
        int sumCopy=0;
        for( int i=0; i<original.length; i++ ){
            for( int j=0; j<original[i].length; j++ ){
                for( int k=0; k<original[i][j].length; k++ ){
                    sumOrig++;
                }
            }
        }
        for( int i=0; i<copy.length; i++ ){
            for( int j=0; j<copy[i].length; j++ ){
                for( int k=0; k<copy[i][j].length; k++ ){
                    sumCopy++;
                }
            }
        }
        System.out.println(((sumCopy-sumOrig)*100/sumOrig)+"%");
    }
    
    
    public static String[][][] frankenstein( String[][][] holo ){
        int i=0; //creates variable to help navigate array
        while( i<holo.length ){ //loops over every row
            int j=0; //creates variable to help navigate array
            while( j<holo[i].length ){ //loops over every column 
                int k=1;
                while( k<holo[i][j].length ){
                    while( holo[i][j][k].charAt(0)<holo[i][j][k-1].charAt(0) ){ //if the value is less than the previous value
                        String temp=holo[i][j][k-1];
                        holo[i][j][k-1]=holo[i][j][k];
                        holo[i][j][k]=temp;
                        k--;
                        if( k==0 ){
                            break;
                        }
                    }
                    k++; 
                }
                j++; 
            }
            i++;
        }
        i=1; 
        while( i<holo.length ){
            while( holo[i].length<holo[i-1].length ){
                String[][] temp=holo[i];
                holo[i]=holo[i-1];
                holo[i-1]=temp;
                i--;
                if( i==0 ){
                    break;
                }
            }
            i++;
        }
        return holo; //returns the sorted array 
    }
    
    
    //method to return random letter 
    public static String letter(){
        Random rand=new Random();
        int alpha=rand.nextInt(26);
        String lett="tt";
        switch( alpha ){
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
        return lett;
    }
    
}
// Brendan Eckardt
// lab07-Bowtie
// 3.11.2016

// program prints a bowtie based on input 

import java.util.Scanner;
        
public class Bowtie{
    public static void main(String [] args){
        
        Scanner sc=new Scanner(System.in);
        
        int nStars=0; //declare variable nStars for size of bowtie
        boolean cond1=true; //declare boolean for navigating input check
        boolean cond2=true; //declare boolean for navigating input check
    
    //input check 
    
        while( cond1 ){ //begins the input check 
            System.out.println("Please enter an odd integer from 3-33: ");
            while( cond2 ){ // loops again if improper input is entered
                if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is between 3-33
                    nStars=sc.nextInt(); //sets inputed integer as nStar
                    if( nStars<3 || nStars>33 || nStars%2==0 ){ 
                        System.out.println("Invalid input. Please enter an odd integer from 3-33: ");
                    }
                    else{ //if first inputed integer is within 3-33 inclusive, breaks out of checks
                        cond2=false;
                        cond1=false;
                    }
                }
                else{ //if input is not an integer, asks for new input and loops again
                    System.out.println("Invalid input. Please enter an odd integer from 3-33: ");
                    sc.next(); // asks for another input 
                }
            }
        }
        int halfTie=nStars/2; //assigns an integer to half the star length
        
    // for loop 
    
    for( int k=0; k<=1; k++){
        for( int i=-halfTie; i<=halfTie; i++ ){
            for( int j=-halfTie; j<=halfTie; j++ ){
                if( i*i>=j*j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    // while loop 
    /*
    int k=0;
    while( k<=1 ){
        int i=-halfTie;
        while( i<=halfTie ){
            int j=-halfTie;
            while( j<=halfTie ){
                if( i*i>=j*j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("");
            i++;
        }
        k++;
    }
    */
        
        
    }
}
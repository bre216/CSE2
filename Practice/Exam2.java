//Brendan Eckardt
//Exam 2 practice 

import java.util.Scanner;

public class Exam2{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.println("Input a positive integer (0 to exit):");
            int input=sc.nextInt();
            if( input>0 ){
                if( isPrime( input ) ){
                    System.out.println("Prime!");
                }
                else{
                    System.out.println("Not prime");
                }
            }
            else if( input==0 ){
                System.out.println("Goodbye");
                System.exit(0);
            }
            else{
                System.out.println("Invalid");
            }
        } while( true );
    
    
    }
    
    public static boolean isPrime( int x ){
        for( int k=2; k<x; k++ ){
            if( x%k==0 ){
                break;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
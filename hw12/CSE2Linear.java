// Brendan Eckardt 
// cse2 hw12
// 4.15.2016

// program to create list of grades and search that list 

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear{
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in);
        
        int[] grades=new int[15]; //create new array for grades of size 15
        System.out.println("Please enter the 15 final grades in increasing order.");
        for( int i=0; i<15; i++ ){ 
            boolean bool=true;
            while( bool ){
                if( !sc.hasNextInt() ){
                    System.out.println("ERROR: please enter an integer value");
                }
                else{
                    int input=sc.nextInt();
                    if( input<0 || input>100 ){
                        System.out.println("ERROR: please enter an integer from 0-100");
                    }
                    else{
                        if( i>0 ){
                            if( input<grades[i-1] ){
                                System.out.println("ERROR: please enter an integer greater than the previous grade");
                            }
                            else{
                                grades[i]=input;
                                bool=false;
                            }
                        }
                        else{
                            if( i==0 ){
                                grades[i]=input;
                                bool=false;
                            }
                        }
                    } //end of continuous increase check
                }
            }
        }
        System.out.println("Sorted:");
        for( int i=0; i<15; i++ ){
            System.out.println(grades[i]+" ");
        }
        search( grades );
    
        Random randGen=new Random();
        int holder=0;
        for( int i=0; i<10; i++ ){
            int rand=randGen.nextInt(14);
            holder=grades[rand];
            grades[rand]=grades[0];
            grades[0]=holder;
        }
        
        System.out.println("Scrambled:");
        for( int i=0; i<15; i++ ){
            System.out.print(grades[i]+" ");
        }
        search( grades );
    } 
    
    public static void search( int[] grades ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a grade to search:");
        boolean test=true;
        while( test ){
            if( !sc.hasNextInt() ){
                System.out.println("ERROR: Please enter an integer value");
            }
            else{
                int check=sc.nextInt();
                if( check<0 || check>100 ){
                    System.out.println("ERROR: Please enter an integer from 0-100");
                }
                else{
                    for( int i=0; i<15; i++ ){
                        if( grades[i]==check ){
                            System.out.println("The grade was found after "+(i+1)+" iterations");
                            test=false;
                            break;
                        }
                        else if( i==14 ){
                            System.out.println("No grade matching that value was found after 15 iterations.");
                        }
                    }
                    
                }
            }
        }
    }
        
}
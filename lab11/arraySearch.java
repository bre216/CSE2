// Brendan Eckardt 
// cse2-lab11
// 4.15.2016

//program to create arrays and perform array search

import java.util.Scanner;

public class arraySearch{
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in);
        
        int[] array1=new int[50];
        int[] array2=new int[50];
        
        //assign random integers to the values of array1
        for( int i=0; i<50; i++ ){
            array1[i]=(int)(Math.random()*101);
        } 
        
        //use linear search to find maximum of array1
        int max1=0; 
        for( int i=0; i<50; i++ ){
            if( array1[i]>max1 ){
                max1=array1[i];
            }
        }
        System.out.println("The maximum of array1 is: "+max1);
        
        //use linear search to find the minimum of array1
        int min1=100;
        for( int i=0; i<50; i++ ){
            if( array1[i]<min1 ){
                min1=array1[i];
            }
        }
        System.out.println("The minimum of array1 is: "+min1);
        
        //add increasing numbers to array2
        array2[0]=(int)(Math.random()*101);
        for( int i=1; i<50; i++ ){
            array2[i]=(int)(Math.random()*101)+array2[i-1];
        }
        //System.out.println( (int)(Math.random()*101));
        
        //find minimum of array2
        int min2=200;
        for( int i=0; i<50; i++ ){
            if( array2[i]<min2 ){
                min2=array1[i];
            }
        }
        System.out.println("The minimum of array2 is: "+min2);
        
        //find maximum of array2
        int max2=0; 
        for( int i=0; i<50; i++ ){
            if( array2[i]>max2 ){
                max2=array2[i];
            }
        }
        System.out.println("The maximum of array2 is: "+max2);
        
        //ask user to enter integer >=0
        System.out.println("Please enter an integer greater than or equal to 0: ");
        if( !sc.hasNextInt() || sc.nextInt()<0 ){
            System.out.println("You did not enter an integer >= 0.");
            System.exit(0);
        }
        else{
            int input=sc.nextInt();
            int arrayMax=49;
            int arrayMin=0;
            while( true ){
                
                if( array2[arrayMax-(arrayMax-arrayMin)/2]==input ){
                    System.out.println("Your input matched array2 index "+array2[arrayMax-(arrayMax-arrayMin)/2]);
                    break;
                }
                else if( array2[arrayMax-((arrayMax-arrayMin)/2)]>input ){
                    arrayMax=arrayMax-((arrayMax-arrayMin)/2);
                    //arrayMin=0;
                }
                else if( array2[arrayMax-((arrayMax-arrayMin)/2)]<input ){
                    //arrayMax=49;
                    arrayMin=arrayMax-((arrayMax-arrayMin)/2);
                }
                if( ( (arrayMax-arrayMin)/2)==0 ){
                    System.out.println(input+" was not found in the list.");
                    System.out.println("The number above the input was "+array2[arrayMax]);
                    System.out.println("The number below the input was "+array2[arrayMin]);
                    break;
                    
                }
            }
        }
    } //end of main method
} //end of class
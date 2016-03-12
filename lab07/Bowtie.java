// Brendan Eckardt
// lab07-Bowtie
// 3.11.2016

// program prints a bowtie based on input 

import java.util.Scanner; //imports scanner class
        
public class Bowtie{ //defines class
    public static void main(String [] args){ //main method for progam
        
        Scanner sc=new Scanner(System.in); //construct a scanner to ask for input 
    
        int nStars=0; //declare variable nStars for size of bowtie
        boolean cond1=true; //declare boolean for navigating input check
        boolean cond2=true; //declare boolean for navigating input check
        
        while( true ){
    
            //input check 
        
            while( cond1 ){ //begins the input check 
                System.out.println("Please enter an odd integer from 3-33: "); //asks for size of bowtie 
                while( cond2 ){ // loops again if improper input is entered
                    if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is between 3-33
                        nStars=sc.nextInt(); //sets inputed integer as nStar
                        if( nStars<3 || nStars>33 || nStars%2==0 ){ //if integer is outside 3-33 or is even
                            System.out.println("Invalid input. Please enter an odd integer from 3-33: "); //asks for valid input 
                        }
                        else{ //if first inputed integer is within 3-33 inclusive AND even , breaks out of checks
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
            
            for( int k=0; k<=1; k++){ //loops code twice to make full bowtie
                for( int i=-halfTie; i<=halfTie; i++ ){ //controls vertical position in nStar x nStar grid
                    for( int j=-halfTie; j<=halfTie; j++ ){ //controls horizontal position in nStar x nStar grid
                        if( i*i>=j*j ){ //assigns each position in the nStar x nStar grid a boolean value and prints * or " " based on that boolean
                            System.out.print("*"); 
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(""); //moves to next line once line length has reached nStar
                }
            }
            
    
            // while loop 
            /*
            int k=0; //assign integer k to loop code twice
            while( k<=1 ){ //loops code twice to make full bowtie
                int i=-halfTie; //declare variable i to control vertical size
                while( i<=halfTie ){ //controls vertical position in nStar x nStar grid
                    int j=-halfTie; //declare variable j to control horizontal size
                    while( j<=halfTie ){ //controls horizontal position in nStar x nStar grid
                        if( i*i>=j*j ){ //assigns each position in the nStar x nStar grid a boolean value and prints * or " " based on that boolean
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                        j++; //causes loop to move to the next column
                    }
                    System.out.println(""); //causes loop to move to the next row
                    i++; //increase i value by 1
                }
                k++; //increase k value by 1 
            }
            */
          
            //do-while loop
            /*
            k=0;
            do{
                int i=-halfTie; //declare variable i to control vertical size
                do{
                    int j=-halfTie; //declare variable j to control horizontal size
                    do{
                        if( i*i>=j*j ){ //assigns each position in the nStar x nStar grid a boolean value and prints * or " " based on that boolean
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                        j++; //causes loop to move to the next column
                    }
                    while( j<=halfTie ); //ends row once it has reached length==nStar
                    System.out.println(""); //causes loop to move to the next row
                    i++; //increases i value by 1
                }
                while( i<=halfTie ); //prints new rows until column length has reached nStar
                k++; //increases k value by 1 
            }
            while( k<=1 ); //ends loop once full bowtie is printed
            */
            
            System.out.println("Continue?");
            String cont=sc.next();
            if( cont=="Y" || cont=="y" ){
                cond1=true;
                cond2=true;
            }
            else{
                break;
            }
            
        }
    }
}
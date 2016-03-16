// Brendan Eckardt
// CSE2 hw07
// 3.14.2016

//Twisty program to make a spiral pattern of slashes and hashtags

import java.util.Scanner; //imports scanner class

public class Twisty{ //class for program    
    public static void main(String[] args){ //main method for program
        
        Scanner sc=new Scanner(System.in); //construct instance of scanner class so we can ask for input later 
        
        int tLength=0; //declare variable for twist length
        int tWidth=0; //declare variable for twist width 
        
        //ask user for spiral length and check input
        boolean cond1=true; //declare boolean for navigating input check
        boolean cond2=true; //declare boolean for navigating input check
        
        while( cond1 ){ //begins the input check 
            System.out.println("What is the horizontal length of the spiral? "); //asks for size of bowtie 
            while( cond2 ){ // loops again if improper input is entered
                if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is less than 80
                    tLength=sc.nextInt(); //sets inputed integer as length of spiral
                    if( tLength>80 || tLength<0 ){ //if integer is negative or is greater than 80
                        System.out.println("Invalid input. Please enter a positive integer from 1-80: "); //asks for valid input 
                    }
                    else{ //if first inputed integer is within 1-80 inclusive AND positive , breaks out of checks
                        cond2=false;
                        cond1=false;
                    }
                }
                else{ //if input is not an integer, asks for new input and loops again
                    System.out.println("Invalid input. Please enter a positive integer from 1-80: ");
                    sc.next(); // asks for another input 
                }
            }
        }
        
        cond1=true; //reset boolean conditions for second input check
        cond2=true; //reset boolean conditions for second input check
        
        //ask user for spiral width and check input
        while( cond1 ){ //begins the input check 
            System.out.println("What is the vertical width of the spiral? "); //asks for vertical size of spiral pattern
            while( cond2 ){ // loops again if improper input is entered
                if( sc.hasNextInt() ){ //if next input is an integer checks to see if it is less than 80
                    tWidth=sc.nextInt(); //sets inputed integer as width
                    if( tWidth>tLength || tWidth<0 ){ //if integer is negative or is greater length of spiral 
                        System.out.println("Invalid input. Please enter a positive integer that is smaller than the spiral length: "); //asks for valid input 
                    }
                    else{ //if first inputed integer is within 1-80 inclusive AND positive , breaks out of checks
                        cond2=false;
                        cond1=false;
                    }
                }
                else{ //if input is not an integer, asks for new input and loops again
                    System.out.println("Invalid input. Please enter a positive integer that is smaller than the spiral length: ");
                    sc.next(); // asks for another input 
                }
            }
        }

        for( int j=0; j<=tWidth-1; j++ ){ //loop to control movement to next row 
            for( int i=0; i<=tLength-1; i++ ){ //loop to control movement to next column 
                if( (i/tWidth)%2==0 ){ //controls printing for first "even" type of X pattern 
                    if( i%tWidth==j ){ //prints # on diagonal for even 
                        System.out.print("#");
                    }
                    else if( j+(i%tWidth)==tWidth-1 ){ //prints / on diagonal for even  
                        System.out.print("/");
                    }
                    else{
                        System.out.print(" "); //prints blank space elsewhere
                    }
                }
                else{ //controls printing for second "odd" type of X pattern 
                    if( i%tWidth==j ){
                        System.out.print("\\"); //prints \ on diagonal for odd
                    }
                    else if( j+(i%tWidth)==tWidth-1 ){ //prints # on diagonal for odd 
                        System.out.print("#");
                    }
                    else{
                        System.out.print(" "); //prints blank space elsewhere
                    }
                }
            }
            System.out.println(""); //skips to the next line 
        }
    } //end of main method
} //end of class 

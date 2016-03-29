// Brendan Eckardt 
// CSE2 hw09-Games
// 3.26.2016

// program using methods to create an arcade-type scenario with multiple optional games

import java.util.Scanner;
import java.util.Random;

public class Games{ //class for program
       
    public static void guessTheBox(){ //method for guessTheBox game 
        Scanner sc=new Scanner(System.in); //construct instance of scanner class
        Random randGen=new Random(); //construct instance of Random class
        int randInt=(randGen.nextInt(3)+1); //generate a random integer from 1-3 and set it as variable randInt
        System.out.println("One of these three boxes holds a prize. Which box would you like to open?"); //ask user to guess box 
        while( true ){
            if( sc.hasNextInt() ){ // checks if input is integer
                int input=sc.nextInt(); //if input is an integer, sets value as variable "input"
                if( input==1 || input==2 || input==3 ){ // if input is 1,2, or 3
                    if( input==randInt ){ //checks to see if input is equal to random number generated
                        System.out.println("Congratulations! You've won the gift of self-satisfaction!"); //prints out congratulations message
                        System.exit(0); //exits the program
                    }
                    else{ //if input does not match randomly generated box 
                        System.out.println("Sorry. The prize was in box "+randInt+"."); //prints out failure message and which box prize was in
                        System.exit(0); //exits the program
                    }
                }
                else{ //if input is not an integer, asks for correct input
                    System.out.println("ERROR: please enter 1, 2, or 3: ");
                }
            }
            else{ //if input is not an integer, asks for correct input
                System.out.println("ERROR: please enter 1, 2, or 3: ");
                sc.next();
            }
        }
    } //end of guessTheBox game method
    
    
    public static void spinTheWheel(){ //spinTheWheel method 
        Scanner sc=new Scanner(System.in); //construct instance of scanner class
        Random randGen=new Random(); //construct instance of Random class
        
        int randInt1=(randGen.nextInt(2)+1); //generates random integer 1(red) or 2(black)
        String wheelColor="tt"; //create variable for wheel color
        if( randInt1==1 ){ //if random generated integer is 1
            wheelColor="red"; //wheel color is red
        }
        else{ //if random generated integer is 2
            wheelColor="black"; //wheel color is black
        }
        int randInt2=(randGen.nextInt(5)+1); //generates random integer 1-5
        
        System.out.println("Please choose the color red or black: "); //ask user for color choice
        while( true ){ //beginning of input checks
            String cont=sc.next(); //next input is assigned to string 
            if( cont.equals("red") || cont.equals("Red") ){ //if user chooses red
                int userColor=1; //assigns red an integer value of 1
                System.out.println("Please choose an integer from 1-5"); //asks user for number
                while( true ){   
                    if( sc.hasNextInt() ){ //if next input is integer
                        int input=sc.nextInt(); //assigns that integer as a variable
                        if( input>=1 && input<=5 ){ //if that integer is within range 1-5
                            if( input==randInt2 && userColor==randInt1 ){ //if chosen integer and color match wheel spin
                                System.out.println("You chose red "+input+".The wheel landed on "+wheelColor+" "+randInt2+"."); //prints out result of spin
                                System.out.println("Congratulations! You've won!"); //prints success message
                                System.exit(0); //quits the program
                            }
                            else{ //if chosen integer and color do not match
                                System.out.println("You chose red "+input+".The wheel landed on "+wheelColor+" "+randInt2+"."); //prints out result of spin
                                System.out.println("Sorry. Try again!"); //prints failure message
                                System.exit(0); //quits the program
                            }
                        }
                        else{ //if integer is outside range 1-5
                            System.out.println("Please choose an integer from 1-5"); //asks for correct input
                        }
                    }
                    else{ //if input is not an integer
                        System.out.println("Please choose an integer from 1-5"); //asks for correct input
                        sc.next();
                    }
                }
            }
            else if( cont.equals("black") || cont.equals("Black") ){ //if user chooses black
                int userColor=2; //assigns black an integer value of 2
                System.out.println("Please choose an integer from 1-5"); //asks user for number
                while( true ){
                    if( sc.hasNextInt() ){ //if next input is integer
                        int input=sc.nextInt(); //assigns that integer as a variable
                        if( input>=1 && input<=5 ){ //if that integer is within range 1-5
                            if( input==randInt2 && userColor==randInt1 ){ //if chosen integer and color match wheel spin
                                System.out.println("You chose black "+input+".The wheel landed on "+wheelColor+" "+randInt2+"."); //prints out result of spin
                                System.out.println("Congratulations! You've won!"); //prints success message
                                System.exit(0); //quits the program
                            }
                            else{ //if chosen integer and color do not match
                                System.out.println("You chose black "+input+".The wheel landed on "+wheelColor+" "+randInt2+"."); //prints out result of spin
                                System.out.println("Sorry. Try again!"); //prints failure message
                                System.exit(0); //quits the program
                            }
                        }
                        else{ //if integer is outside range 1-5
                            System.out.println("Please choose an integer from 1-5"); //asks for correct input
                        }
                    }
                    else{ //if input is not an integer
                        System.out.println("Please choose an integer from 1-5"); //asks for correct input
                        sc.next();
                    }
                }
            }
            else{ //if input is not red, Red, black, or Black
                System.out.println("Please choose red or black: "); //asks for correct input
            }
        }
    } //end of spinTheWheel game method
    
    public static void scramble(){ //beginning of scramble game method
        Scanner sc=new Scanner(System.in); //constructs instance of scanner class
        System.out.println("Enter the word that you would like to scramble: "); //asks user for input
        String word=sc.next(); //assigns input to a string 
        int length=word.length(); //finds the length of that string
        
        for( int i=0; i<11; i++ ){ //scrambles several times
            String char0= (String) word.subSequence(0,1); //assigns first character in string to a substring
            String charMid= (String) word.subSequence(1,length-1); //assigns middle characters in string to a substring
            String charFinal= (String) word.subSequence(length-1, length); //assigns final character in string to a substring
            word=charMid+char0+charFinal; //rearranges substrings to create new word
        }
        System.out.println(word); //prints the final word 
        System.exit(0); //exits the program
        
    } //end of scramble game method
    
    public static void main(String [] args){ //main method for program 
        Scanner sc=new Scanner(System.in); //constructs instance of scanner class
        
        System.out.println("Welcome to AJ's game center!"); //prints welcome message
        System.out.println("We have three games here: guessTheBox, spinTheWheel, and scrambler. "); //give user options
        System.out.println("Which game would you like to play? "); //asks user to choose an option
        
        String cont=sc.next(); //assigns the next input to a string
        
        if( cont.equals("guessTheBox") ){ //tests input to see if it matches guessTheBox
            guessTheBox(); //if so, calls guessTheBox game method
        }
        else if( cont.equals("spinTheWheel") ){ //tests input to see if it matches spinTheWheel
            spinTheWheel(); //if so, calls spinTheWheel game method
        }
        else if( cont.equals("scrambler") ){ //tests input to see if it matches scrambler
            scramble(); //if so, calls scrambler game method
        }
        else{ //if input does not match any game options
            System.out.println("ERROR: the arcade does not have that game."); //prints error message
            System.exit(0); //quits the program
        }
        
    } //end of main method
} //end of class 
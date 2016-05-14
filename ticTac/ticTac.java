// Brendan Eckardt
// cse2 Final Exam practice 
// 5.14.2016

// tic tac toe program for user to play with computer 

import java.util.Scanner; //imports scanner class
import java.util.Random; //imports random class

public class ticTac{ //start of class

    //start of main method 
    public static void main( String[] args){ 
        
        Scanner sc=new Scanner(System.in);
            
        //initialize 3X3 board with values all 0
        int[][] board=new int [3][3]; //create space for array
        for( int i=0; i<board.length; i++ ){
            for( int j=0; j<board[i].length; j++ ){
                board[i][j]=0;
            }
        }
            
        while( true ){    
            //print( board);
            
            //player's turn 
            while( true ){
                //ask user to make a move 
                int row=0;
                int column=0;
                System.out.println("Please indicate the column (0-2) you would like to select: ");
                while( true ){
                    if( sc.hasNextInt() ){
                        column=sc.nextInt();
                        if( column<0 || column>2 ){
                            System.out.println("ERROR: Please enter an integer from 0-2: ");
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        System.out.println("ERROR: Please enter an integer from 0-2: ");
                        sc.next();
                    }
                }
                System.out.println("Please indicate the row (0-2) of that column where you would like to place your mark: ");
                while( true ){
                    if( sc.hasNextInt() ){
                        row=sc.nextInt();
                        if( row<0 || row>2 ){
                            System.out.println("ERROR: Please enter an integer from 0-2: ");
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        System.out.println("ERROR: Please enter an integer from 0-2: ");
                        sc.next();
                    }
                }
                if( update( board, column, row, 1) ){
                    break;
                }
            }
            
            //print the updated board state
            print( board );
            
            //test to see if anyone has won 
            test( board );
                
            //computer's turn 
            System.out.println("");
            System.out.println("It is now the computer's turn: ");
            Random rand=new Random();
            while( true ){
                int columnC=rand.nextInt(3);
                int rowC=rand.nextInt(3);
                if( update( board, columnC, rowC, 2) ){
                    break;
                }
            }
            
            //print the updated board state
            print( board );
            
            //test to see if anyone has won 
            test( board );
        }
    }
    
    //print method to display current board state
    public static void print( int[][] array ){
        System.out.println( array[0][0]+" | "+array[1][0]+" | "+array[2][0]);
        System.out.println("----------");
        System.out.println( array[0][1]+" | "+array[1][1]+" | "+array[2][1]);
        System.out.println("----------");
        System.out.println( array[0][2]+" | "+array[1][2]+" | "+array[2][2]);
    }
    
    //test method to check if someone won
    public static void test( int[][] array ){
        if( array[0][0]==array[1][1] && array[1][1]==array[2][2] && array[2][2] !=0 || //diagonal top left to bottom right
            array[0][2]==array[1][1] && array[1][1]==array[2][0] && array[2][0] !=0 || //diagonal bottom left to top right 
            array[0][0]==array[1][0] && array[1][0]==array[2][0] && array[2][0] !=0 || //horizontal top row 
            array[0][1]==array[1][1] && array[1][1]==array[2][1] && array[2][1] !=0 || //horizontal middle row
            array[0][2]==array[1][2] && array[1][2]==array[2][2] && array[2][2] !=0 || //horizontal bottom row
            array[0][0]==array[0][1] && array[0][1]==array[0][2] && array[0][2] !=0 || //vertical left column
            array[1][0]==array[1][1] && array[1][1]==array[1][2] && array[1][2] !=0 || //vertical middle column
            array[2][0]==array[2][1] && array[2][1]==array[2][2] && array[2][2] !=0  //vertical right column 
        ){
            System.out.println("A player has won!");
            System.exit(0);
        }
        else{
            boolean test=false;
            for( int i=0; i<array.length; i++ ){
                for( int j=0; j<array[i].length; j++ ){
                    if( array[i][j]==0 ){
                        test=true;
                    }
                }
            }
            if( !test ){
                System.out.println("The game has ended in a tie!");
                System.exit(0);
            }
        }
    }
    
    //update method to update board 
    public static boolean update( int[][] array, int col, int row, int id){
        if( array[col][row]==0 ){
            array[col][row]=id;
            return true;
        }
        else{
            if( id==1 ){
                System.out.println("Sorry, that space is occupied.");
                return false;
            }
            else{
                return false;
            }
        }
    }
    
    
}
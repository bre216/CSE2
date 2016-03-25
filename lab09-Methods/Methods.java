// Brendan Eckardt
// CSE2 lab09-Methods
//3.25.2016

// program using methods to generate random sentences 

import java.util.Random;
import java.util.Scanner;

public class Methods{
    public static String Adjective(){
        Random randGen=new Random();
        int randInt1=randGen.nextInt(10);
        String adj="tt";
        
        switch( randInt1 ){
            case 0:
                adj="bellicose";
                break;
            case 1: 
                adj="red";
                break;
            case 2: 
                adj="swarmy";
                break;
            case 3:
                adj="petulant";
                break;
            case 4:
                adj="joyful";
                break;
            case 5:
                adj="confident";
                break;
            case 6:
                adj="slimy";
                break;
            case 7:
                adj="cheerful";
                break;
            case 8:
                adj="morose";
                break;
            case 9: 
                adj="ravishing";
                break;
            case 10:
                adj="humble";
                break;
                
        }
        return adj;
    }
    public static String Subject(){
        Random randGen=new Random();
        int randInt2=randGen.nextInt(10);
        String subj="tt";
        
        switch ( randInt2 ){
            case 0:
                subj="dancer";
                break;
            case 1:
                subj="dog";
                break;
            case 2: 
                subj="inn-keeper";
                break;
            case 3:
                subj="sheriff";
                break;
            case 4:
                subj="pelican";
                break;
            case 5:
                subj="hero";
                break;
            case 6:
                subj="single mother";
                break;
            case 7: 
                subj="platypus";
                break;
            case 8:
                subj="hippo";
                break;
            case 9:
                subj="bank teller";
                break;
            case 10:
                subj="desk chair";
                break;
        }
        return subj;
    }
    
    public static String Verb(){
        Random randGen=new Random();
        int randInt3=randGen.nextInt(10);
        String verb="tt";
        
        switch( randInt3 ){
            case 0:
                verb="danced";
                break;
            case 1: 
                verb="ran";
                break;
            case 2: 
                verb="galloped";
                break;
            case 3: 
                verb="jaunted";
                break;
            case 4: 
                verb="pooped";
                break;
            case 5: 
                verb="dove headfirst";
                break;
            case 6: 
                verb="stumbled";
                break;
            case 7: 
                verb="flew";
                break;
            case 8: 
                verb="sauntered";
                break;
            case 9: 
                verb="fell";
                break;
            case 10: 
                verb="barged";
                break;
        }
        return verb;
    }
    
    public static String Objects(){
        Random randGen=new Random();
        int randInt4=randGen.nextInt(10);
        String obj="tt";
        
        switch( randInt4 ){
            case 0:
                obj="crosswalk";
                break;
            case 1: 
                obj="courtroom";
                break;
            case 2: 
                obj="bar";
                break;
            case 3: 
                obj="plane";
                break;
            case 4: 
                obj="bathroom";
                break;
            case 5: 
                obj="passenger seat";
                break;
            case 6: 
                obj="M1 Abrams tank";
                break;
            case 7: 
                obj="confirmation class";
                break;
            case 8: 
                obj="youth voter rally";
                break;
            case 9: 
                obj="playground";
                break;
            case 10: 
                obj="bank teller's home";
                break;
        }
        return obj;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        while( true ){
            System.out.println("The"+" "+Adjective()+" "+Subject()+" "+Verb()+" "+"into the"+" "+Objects()+".");
            System.out.println("Continue?"); //asks user if they want to generate another sentence
            String cont=sc.next(); //assigns the next input to a string
            if( cont.equals("Y") || cont.equals("y") ){ //checks string to see if it is Y or y
            }
            else{ //if not, breaks out of the infinite loop and ends the program 
                break;
            }
        }
    }
}
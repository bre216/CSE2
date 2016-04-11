// Brendan Eckardt 
// CSE2 lab10-Arrays
// 4.11.2016

// use arrays to create a list of midter grades for students

import java.util.Scanner; //imports scanner class

public class Arrays{ //start of class
    public static void main(String[] args){ //start of main method
    
        Scanner sc=new Scanner(System.in); //construct instance of scanner class
        String[] students=new String[(int) (Math.random()*6+5)]; //create new array of strings of random length 5-10
        int length=students.length; //create new integer=length of array
        System.out.println("Please enter the names of the "+length+" students: "); //prompts user to input student names
        for( int i=0; i<length; i++ ){ //repeats until 
            students[i]=sc.next(); //takes user's next input and assigns it as the name of that student in the index
        }
        int[] midterms=new int[students.length]; //creates array of integers for midterm grades
        for( int i=0; i<length; i++ ){ //repeats random assignment until the number of grades==number of students
            midterms[i]=(int) (Math.random()*101); //asigns each integer in array a random integer value from 0-100
        }
        System.out.println("Here are the midterm grades for the "+length+" students above: "); //prints start of output message
        for( int i=0; i<length; i++ ){ //for each student
            System.out.println(students[i]+": "+midterms[i]); //prints out that student's name and midterm grade
        }
        
    } //end of main method
} //end of class
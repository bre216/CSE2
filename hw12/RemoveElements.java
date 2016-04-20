// Brendan Eckardt
// CSE2 hw12
// 4.19.2016

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  //method to create array of 10 random integers from 0-9
  public static int[] randomInput(){
      int[] random=new int[10]; //creates new integer array of size 10
      for(int i=0; i<10; i++ ){
          random[i]=(int)(Math.random()*10); //assigns each member of the array a random integer from 0-9
      }
      return random; //returns the array with assigned values
  } //end of array creation method 
  
  //method for deleting one index from the array
  public static int[] delete( int[] list, int pos ){
      if( pos<0 || pos>list.length ){ //checks to see if index selected is valid
          System.out.println("The index is not valid."); //if not, prints an error message
      }
      int[] deletedArray=new int[list.length-1]; //if valid, creates new array of length 9
      for( int i=0; i<9; i++ ){ //copies values over to a new array
          if( i==pos ){ //if i=index position
            for( i=pos; i<9; i++ ){
              deletedArray[i]=list[i+1]; //skips that value and continues copying the array
            }
            break;
          }
          else{
            deletedArray[i]=list[i]; //if the index is not reached, copies the array
          }
      }
      return deletedArray; //returns the new array
  } //end of delete method 
  
  //method to remove all instances of certain integer from the array
  public static int[] remove( int[] list, int target ){
      int i=0;
      for( int j=0; j<list.length; j++){ //loop to count how many times the chosen integer occurs in the array
        if( list[j]==target){ //checks to see if array value matches chosen integer
            i++; //if so, increments counter "i"
        }
        else{
          
        }
      }
      int[] removeArray=new int[list.length-i]; //creates new array of the proper length
      int k=0; //creates new variable to help navigate array
      i=0; //keeps track of array index position
      while( i<removeArray.length ){ //repeats for every member of the array 
        while( list[i+k]==target ){//checks to see if value at that index=target value
          k++; //if so, moves on to the next value and checks again
        }
        removeArray[i]=list[i+k]; //once an acceptable next value is found, copies that value into the next open slot in the new array
        i++; //moves on to the next index in the new array
      }
      return removeArray; //returns the final array
  } //end of remove method 
}

// Brendan E
// Exam3 practice 

public class Exam3{
    
    public static void main(String[] args){
        int[] x={1,10,3,7};
        int[] y={2,3,4,7,10,6};
        overlap( x, y);
        
    //    for( int i=0; i<overlap(x,y).length-1; i++ ){
    //        System.out.print( overlap(x,y)[i]+" ");
    //    }
    
        for( int i=0; i<output.length-1; i++ ){
            System.out.print( output[i]+" ");
        }
    
    
    }
    
    public static int[] overlap( int[]x, int[] y){
        int counter=0; 
        int index=1; 
        int[] output=new int[y.length+1];
        for( int j=0; j<x.length; j++ ){
            for( int k=0; k<y.length; k++ ){
                if( x[j]==y[k] ){
                    counter++;
                    output[index]=x[j];
                    index++;
                }
            }
        }
        output[0]=counter;
        return output;
    }
}
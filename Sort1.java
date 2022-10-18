import java.util.Arrays;

public class Sort1 {
	
	
	public static void main(String[] args) {
		int[] A =new int[]{11,20,15};
		int[] B =new int[]{15,20,9,11};
		int[] C = new int [] {0, 44, 32, 30, 42, 18, 34, 16, 35};
		sort(A);
		sort(B);
		sort(C);
	}
	
	
	
	public static int[] sort(int[] A){
        if(A.length>1){
            int [] sorted1=sort(Arrays.copyOfRange(A,0,A.length/2));
           
            int [] sorted2=sort(Arrays.copyOfRange(A,A.length/2,A.length));
           
            int index1=0;
            int index2=0;
            int mainIndex=0;
            while(index1<sorted1.length&&index2<sorted2.length){
                if(sorted1[index1]>sorted2[index2]){
                    A[mainIndex]=sorted2[index2];
                    index2++;
                }else{
                    A[mainIndex]=sorted1[index1];
                    index1++;
                }
            mainIndex++;
            
            }
            while(index1<sorted1.length) {
            	A[mainIndex]=sorted1[index1];
            	index1++;
            	mainIndex++;
            }
            while(index2<sorted2.length) {
            	A[mainIndex]=sorted2[index2];
            	index2++;
            	mainIndex++;
            }
        }
 
        return A;
    }

}

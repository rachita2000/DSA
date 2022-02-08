package practice;

public class RotateArray {

	   public static void rotate(int[] arr, int d) {
	    	//Your code goes here
	        if(arr.length==0)
	            return;
	       	d=d%arr.length;
	        reverse(arr,0,d-1);
	        reverse(arr, d, arr.length-1);
	        reverse(arr, 0, arr.length-1);
	    }
		static void reverse(int[] arr, int i, int j)
	    {
	        while(i <j)
	        {
	            int tmp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=tmp;
	            i++;
	            j--;
	        }
	    }
}

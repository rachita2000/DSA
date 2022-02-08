package recursion2;

public class MergeSort {

	public static void mergeSort(int[] input){
		// Write your code here
		mergeSort(input, 0, input.length-1);
	}
    static void mergeSort(int input[], int si, int ei){
       if(si>=ei)
           return;
        int mid=si+(ei-si)/2;
        mergeSort(input, si, mid);
        mergeSort(input, mid+1, ei);
        merge(input, si, mid, ei);
	}
    static void merge (int input[], int si, int mid, int ei)
    {
        int x=mid-si+1;
        int y=ei-mid;
        int[] l=new int[x];
        int[] r=new int[y];
        for(int k=0;k<x;k++)
       		l[k]=input[si+k];
        for(int k=0;k<y;k++)
        	r[k]=input[mid+1+k];
        int i=0, j=0, ind=si;
        while(i<x && j<y)
        {
            if(l[i]<r[j])
                input[ind++]=l[i++];
            else
                input[ind++]=r[j++];
        }
        while(i<x)
            input[ind++]=l[i++];
        while(j<y)
            input[ind++]=r[j++];
    }
}

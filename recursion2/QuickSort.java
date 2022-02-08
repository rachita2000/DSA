package recursion2;

public class QuickSort {

public static void quickSort(int[] input) {
		
        quickSort(input, 0, input.length - 1);
		
	}
	public static void quickSort(int[] input, int si, int ei) {
			if(si>=ei)
                return;
        int pivot=partition(input, si, ei);
        quickSort(input, si, pivot-1);
        quickSort(input, pivot+1, ei);
	}
    
    static int partition(int input[], int si, int ei)
    {
        int pivot=input[si];
        int count=0;
        for(int i=si+1;i<=ei;i++)
        {
            if(input[i]<= pivot)
                count++;
        }
        int pivotpos=si+count;
        int tmp=input[pivotpos];
        input[pivotpos]=input[si];
        input[si]=tmp;
        int i=si, j=ei;
        while(i<pivotpos && j>si)
        {
          if(input[i]<=pivot) i++;
            else if(input[j]> pivot)j--;
            else
            {
                int temp=input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j--;
            }
        }
        return pivotpos;
    }
}

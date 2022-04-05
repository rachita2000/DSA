package priority_queue;

public class InPlaceHeapSort {
	//TC -> O(NlogN)  SC -> O(1)
	
	public static void inplaceHeapSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++)
		{
			insertMin(arr,i);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[arr.length-1-i]=removeMin(arr, arr.length-i);
		}
		
	}
	
	private static void insertMin(int[] ar, int idx)
	{
		int childidx=idx;
		int parentidx=(childidx-1)/2;
		while(childidx>0)
		{
			if(ar[parentidx] > ar[childidx] )
			{
				int tmp=ar[parentidx];
				ar[parentidx]=ar[childidx];
				ar[childidx]=tmp;
				childidx=parentidx;
				parentidx=(childidx-1)/2;
			}
			else
				return;
		}
	}
	
	private static int removeMin(int[] ar, int heapsize)
	{
		int min=ar[0];
		ar[0]=ar[heapsize-1];
		heapsize--;
		int parentidx=0;
		int minidx=parentidx;
		int leftidx=(2*parentidx)+1;
		int rightidx=(2*parentidx)+2;
		
		while(leftidx < heapsize) {
			if(ar[leftidx] < ar[minidx])
				minidx=leftidx;
			if(rightidx <heapsize && ar[rightidx] < ar[minidx])
				minidx=rightidx;
			if(minidx==parentidx)
				break;
			else
			{
				int tmp=ar[parentidx];
				ar[parentidx]=ar[minidx];
				ar[minidx]=tmp;
				
				parentidx=minidx;
				leftidx=(2*parentidx)+1;
				rightidx=(2*parentidx)+2;
			}
		}
		
		return min;
	}
}

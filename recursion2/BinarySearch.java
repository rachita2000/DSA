package recursion2;

public class BinarySearch {

	public static int binarySearch(int input[], int element) {
		// Write your code here
		return  binarySearch(input, element, 0, input.length-1);
	}
    static int binarySearch(int input[], int element , int i, int j)
    {
        if(j>=i){
        int mid=i+(j-i)/2;
        if(input[mid]==element)
            return mid;
        if(input[mid]< element)
            return binarySearch(input, element, mid+1, j);
        else
            return binarySearch(input, element, i, mid-1);
        }
        return -1;
    }
}

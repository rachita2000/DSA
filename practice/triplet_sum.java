package practice;

import java.util.Arrays;

public class triplet_sum {

	public static int tripletSum(int[] arr, int num) {
		int count=0;
	Arrays.sort(arr);
	for(int i=0; i<arr.length-2 ; i++){	
        int tem_num = num - arr[i];
        int start = i + 1;
        int end = arr.length - 1;
        while(start < end){		
            if(arr[start] + arr[end] < tem_num){
                start++;
            }
            else if(arr[start] + arr[end] > tem_num){
                end--;
            }
            else{
                if(arr[start] == arr[end]){
                    int no = (end - start) + 1;
                    count = count + (no * (no-1))/2;
                    break;
                }
                int tem_start = start + 1;
                int tem_end = end - 1;
                while(tem_start <= tem_end && arr[tem_start] == arr[start]){
                    tem_start++;
                }
                while(tem_end >= tem_start && arr[tem_end] == arr[end]){
                    tem_end--;
                }
                int total_start = tem_start - start;
                int total_end = end - tem_end;
                count = count + ( total_start * total_end);
                start = tem_start;
                end = tem_end;
            }
        }
    }
    return count;

}
}

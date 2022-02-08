package recursion1;

public class Count_Zeros {

	public static int countZerosRec(int input){
		// Write your code here
       if(input<=9)
		{
			if(input==0) return 1;
			else return 0;
		}
		int r=input%10;
		int c=0;
		if(r==0)c++;
		return c+countZerosRec(input/10);
	}
}

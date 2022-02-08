package recursion1;

public class Sum_Of_Digits {

	public static int sumOfDigits(int input){
		// Write your code here
		if(input<=9)
            return input;
        int r=input%10;
        int sum=r;
        return sum+sumOfDigits(input/10);
	}
}

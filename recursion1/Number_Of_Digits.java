package recursion1;

public class Number_Of_Digits {

	public static int count(int n){
		if(n <=9){
			return 1;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}

}


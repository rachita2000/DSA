package recursion1;

public class Geometric_Sum {

	public static double findGeometricSum(int k){
		// Write your code here
			if(k==0)
			return 1;
		double ans=1/Math.pow(2, k)+findGeometricSum(k-1);
		return ans;
	}
}

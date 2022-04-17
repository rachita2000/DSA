package dynamic_programming;

import java.util.HashMap;

public class ByteLandian {

	public static long bytelandian(long n, HashMap<Long, Long> memo) {
	       if(n<=11)
	            return n;
	       if(memo.containsKey(n)) return memo.get(n);
	       
	       memo.put(n, Math.max(n, bytelandian(n/2, memo)+bytelandian(n/3, memo)+bytelandian(n/4, memo)));
	        
	        return memo.get(n);
		}

	
//	public static long bytelandian(long n, HashMap<Long, Long> memo) {
//        if(n<=11)
//            return n;
//        for(long i=0;i<12;i++)
//        {
//        	memo.put(i, i);
//        }
//        
//        for(long i=12;i<n;i++)
//        {
//        	long tmp=Math.max(i, memo.get(i/2)+memo.get(i/3)+memo.get(i/4));
//        	memo.put(i, tmp);
//        }
//        
//        return memo.get(n);
//	}
}

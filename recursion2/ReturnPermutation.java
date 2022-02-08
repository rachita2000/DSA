package recursion2;

public class ReturnPermutation {

	public static String[] permutationOfString(String input){
		// Write your code here
		if(input.length()==0)
        {
            String ans[]={""};
            return ans;
        }
        String sans[]=permutationOfString(input.substring(1));
        String ans[]=new String[sans.length*input.length()];
        int k=0;
        for(int i=0;i<sans.length;i++){
            
            for(int j=0;j<=sans[i].length();j++){
                ans[k++] = sans[i].substring(0,j) + input.charAt(0) + sans[i].substring(j);
            }
         
        
	}
        return ans;
}
}

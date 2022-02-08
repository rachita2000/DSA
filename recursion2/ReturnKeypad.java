package recursion2;

public class ReturnKeypad {
	public static String[] keypad(int n){
		// Write your code here
        if(n==0 || n==1)
        {
            String ans[] ={""};
            return ans;
        }
        int k=0;
        int rem=n%10;
        int que=n/10;
        String sans[] = keypad(que);
        String ch=helper(rem);
        String []ans=new String[ch.length()*sans.length];
        for(int i=0;i<ch.length();i++)
        {
            for(int j=0;j<sans.length;j++)
            {
                ans[k++]=sans[j]+ch.charAt(i);
            }
        }
        return ans;

	}
	static String helper(int n)
    {
        String ch="";
        if(n==2)
        {
           ch="abc";
        }
        else if(n==3)
        {
            ch="def";
        }
        else if(n==4)
        {
           ch="ghi";
        }
        else if(n==5)
        {
            ch="jkl";
        }
        else if(n==6)
        {
           ch="mno";
        }
        else if(n==7)
        {
           ch="pqrs";
        }
        else if(n==8)
        {
            ch="tuv";
        }
        else if(n==9)
        {
           ch="wxyz";
        }
       return ch;
    }
}

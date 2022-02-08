package recursion2;

public class PrintKeypadCombination {

	public static void printKeypad(int input){
		printKeypad(input, "");
	}
    static void printKeypad(int input, String output)
    {
        if(input==0)
        {
            System.out.println(output);
            return;
        }
        
        int rem=input%10;
        String s=helper(rem);
        
        printKeypad(input/10,s.charAt(0)+output );
         printKeypad(input/10,s.charAt(1)+output );
         printKeypad(input/10,s.charAt(2)+output );
        
        if(s.length()==4)
         printKeypad(input/10,s.charAt(3)+output );
        
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

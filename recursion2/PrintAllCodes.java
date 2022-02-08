package recursion2;

public class PrintAllCodes {

	public  static void printAllPossibleCodes(String input )
    {
        printAllPossibleCodes(input,"");
    }
        
        static void printAllPossibleCodes(String input , String output) {
		
		if(input.length()==0)
        {
            System.out.println(output);
            return ;
        }
      	
        int ch=input.charAt(0)-'0';
        char a=(char)('a'+ch-1);
        printAllPossibleCodes(input.substring(1), output+a);
        if(input.length()>=2)
        {
            int ch1=input.charAt(0)-'0';
            int ch2=input.charAt(1)-'0';
            int ch3=(ch1*10)+ch2;
            if(ch3>=10 && ch3<=26)
            {
                char c=(char)('a'+ch3-1);
                printAllPossibleCodes(input.substring(2),output+c);
            }
        }
       
	}
}

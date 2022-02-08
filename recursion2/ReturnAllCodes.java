package recursion2;

public class ReturnAllCodes {

	public static  String[] getCode(String input){
		// Write your code here
		if(input.length()==0)
        {
            String[] opt={""};
            return opt;
        }
        String [] sans1=getCode(input.substring(1));
        int ch=input.charAt(0)-'0';
        char a=(char)('a'+ch-1);
        for(int i=0;i<sans1.length;i++)
        {
            sans1[i]=a+sans1[i];
        }
        
        String []sans2=new String[0];
        if(input.length()>=2)
        {
            int ch1=input.charAt(0)-'0';
            int ch2=input.charAt(1)-'0';
            int ch3=(ch1*10)+ch2;
            if(ch3>=10 && ch3<=26)
            {
                char c=(char)('a'+ch3-1);
                sans2=getCode(input.substring(2));
                for(int i=0;i<sans2.length;i++)
                    sans2[i]=c+sans2[i];
            }
        }
        String finalopt[]=new String[sans1.length+sans2.length];
        int j=0;
        for(int i=0;i<sans1.length;i++)
            finalopt[j++]=sans1[i];
        for(int i=0;i<sans2.length;i++)
            finalopt[j++]=sans2[i];
            return finalopt;
	}

}

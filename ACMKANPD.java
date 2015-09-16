import java.util.*;
import java.io.*;
class ACMKANPD
{
	static int toDec(String str)
	{
		int len=str.length();
		int dec=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(len-i-1)=='1')
			{
				dec+=(Math.pow(2, i));
			}
		}
		return dec;
	}
	
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);          
        StringBuffer sb;
        String in="";        
        in=s1.next();
        String curr="";
        String flag="";
        StringBuffer o=new StringBuffer();
        while(!in.equals("~"))
        {
        	sb=new StringBuffer();
        	while(!in.equals("#"))
        	{
        	int index=in.indexOf('>');
        	
        	if(index>=0)
        	{
        		curr=in.substring(index+1, in.length());
        	}
        	else
        	{
        		curr=in;
        	}
        	int len=curr.length();
        	if(len==1)
        		flag="1";
        	else if(len==2)
        		flag="0";
        	else
        	{
        		for(int i=1;i<=(len-2);i++)
        		{
        			sb.append(flag);
        		}
        	}
        	in=s1.next();
        	}
        	
        	o.append(toDec(sb.toString())+"\n");
        	in=s1.next();
        	
        }
        
        System.out.print(o);
        s1.close();
        
        

    }
}
class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
         
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
}
        
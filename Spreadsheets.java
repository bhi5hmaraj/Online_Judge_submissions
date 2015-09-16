import java.util.*;
import java.io.*;
public class Spreadsheets
{
	static char arr[];
	
	
    public static void main(String args[])
    {
        MyScanner s1=new MyScanner();    
        PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out), true);        
        int inputs=s1.nextInt();
        String str;
        arr=new char[26];
        char alpha='A';
        for(int i=0;i<26;i++)
        	arr[i]=alpha++;
        for(int i=1;i<=inputs;i++)
        {
        	str=s1.next();
        	if(str.charAt(0)=='R' && Character.isDigit(str.charAt(1)))
        	{
        		
        	}
        }
        
        
        
        

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
        
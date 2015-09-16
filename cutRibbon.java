import java.util.*;
import java.io.*;
public class cutRibbon
{
	static int small,big,mid;
	public static int dp(int n)
	{
		if(n<small || n==0)
			return 0;
		else
		{
			
		}
	}
    public static void main(String args[])
    {
        MyScanner s1=new MyScanner();
        PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out), true);
        int n=s1.nextInt();
        int a=s1.nextInt();
        int b=s1.nextInt();
        int c=s1.nextInt();
        small=Math.min(Math.min(a,b), c);
        big=Math.max(Math.max(a, b),c);
        mid=(a+b+c)-(small+big);
        
        
        
        
        
        //out.close();     
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
        
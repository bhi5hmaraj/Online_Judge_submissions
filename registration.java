import java.util.*;
import java.io.*;
public class registration
{
    public static void main(String args[])
    {
        MyScanner s1=new MyScanner();
        //PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out), true);
        int n=s1.nextInt();
        String str="";
        Integer temp;
        Map<String,Integer> map=new HashMap<String,Integer>();
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<=n;i++)
        {
         str=s1.next();
         temp=map.get(str);
         if(temp == null)
         {
          map.put(str,0);
          sb.append("OK\n");
         }
         else
         {
          sb.append(str+""+(temp+1)+"\n");
          map.put(str, temp+1);
         }
        }
        System.out.println(sb);

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
        
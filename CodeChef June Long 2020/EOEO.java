import java.util.*;
import java.io.*;
import java.lang.*;
class Codechef 
{
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        PrintWriter pr= new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            long ans=0;
            if(n%2==0)
            {
                ans=n;
                long p=1;
                while(n%2==0 && n!=0)
                {
                    p*=2;
                    n/=2;
                }
                p*=2;
                ans/=p;
            }
            else if(n%2!=0){
                ans=n/2;
            }
            pr.println(ans);
        }
        pr.flush();
    }
  
} 

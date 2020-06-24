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
            int n = sc.nextInt();
            int c1=1;
            for(int i=0;i<n/2;i++)
            {
                for(int j=0;j<n;j++)
                {
                    pr.print(c1+" ");
                    c1++;
                }
                c1=c1+n-1;
                pr.println();
                for(int j=0;j<n;j++)
                {
                    pr.print(c1+" ");
                    c1--;
                }
                c1=c1+n+1;
                pr.println();
            }
            if(n%2!=0)
            {
                for(int j=0;j<n;j++)
                {
                    pr.print(c1+" ");
                    c1++;
                }
            }
            pr.println();
        }
        pr.flush();
    }
  
} 

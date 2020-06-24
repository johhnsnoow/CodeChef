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
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            int fx=0;
            int fy=0;
            int count=0;
            for(int i=0;i<c.length;i++)
            {
                if(c[i]=='x')
                {
                    if(fy==1)
                    {
                        count++;
                        fx=0;
                        fy=0;
                    }
                    else if(fy==0)
                    {
                        fx=1;
                    }
                }
                else if(c[i]=='y')
                {
                    if(fx==1)
                    {
                        count++;
                        fx=0;fy=0;
                    }
                    else
                    {
                        fy=1;
                    }
                }
            }
            pr.println(count);
        }
        pr.flush();
    }
  
} 

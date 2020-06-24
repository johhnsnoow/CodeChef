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
            int []a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int []b = new int[16];
            int f=1;
            if(f==1)
            {for(int i=0;i<n;i++)
            {
                if(a[i]==5)
                {
                    b[5]++;
                }
                else if(a[i]==10)
                {
                    if(b[5]>0)
                    {
                        b[5]--;
                        b[10]++;
                    }
                    else{
                        f=0;
                    }
                }
                else if(a[i]==15)
                {
                    if(b[10]>0)
                    {
                        b[10]--;
                        b[15]++;
                    }
                    else if(b[5]>1)
                    {
                        b[5]-=2;
                        b[15]++;
                    }
                    else{
                        f=0;
                    }
                }
            }}
            if(f==1)
            {
                pr.println("YES");
            }
            else{
                pr.println("NO");
            }
        }
        pr.flush();
    }
  
} 

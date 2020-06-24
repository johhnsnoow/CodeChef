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
            int X = sc.nextInt();
            int p = sc.nextInt();
            int [][]a = new int[X+1][X+1];
            pr.println("1 "+"1"+" "+"1"+" "+X+" "+X);
            pr.flush();
            int pp = sc.nextInt();
            int count=0;
            for(int i=1;i<=X;i++)
            {
                for(int j=1;j<=X;j++)
                {
                    if(count<pp)
                    {pr.println("1 "+i+" "+j+" "+i+" "+j);
                    pr.flush();
                    a[i][j] = sc.nextInt();
                    if(a[i][j]==1)
                    {
                    count++;
                    }
                    if(a[i][j]==-1)
                    {
                        System.exit(0);
                    }}
                }
                /*pr.println("1 1 1 4 4");
                pr.flush();*/
            }
            pr.println("2");
            pr.flush();
            for(int i=1;i<=X;i++)
            {
                for(int j=1;j<=X;j++)
                {
                    pr.print(a[i][j]+" ");
                    pr.flush();
                }
                pr.println();
                pr.flush();
            }
            int temp = sc.nextInt();
            if(temp==-1)
            {
                System.exit(0);
                
            }
        }
        pr.flush();
    }
  
} 

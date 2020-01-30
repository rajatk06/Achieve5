import java.util.*;
public class Main
{
    public static int eql(int a[])     // function to return equilibrium index/element
    {
        if(a.length==1) return a[0];
        int s1[] ,s2[];
        s1 = new int[a.length];
        s2 = new int[a.length];
        for(int i=0,j=a.length-1;j>=0;i++,j--)    
        {
            s1[i] = a[i] + (i==0?0:s1[i-1]) ;    //sum of array elements from begining
            s2[j] = a[j] + (j==a.length-1?0:s2[j+1]) ;  //sum of array elements from end
        }
        for(int i=0;i<a.length;i++) if(s1[i]==s2[i]) return a[i];
        
        return -1;
    }
	public static void main(String[] args) 
	{
	 Scanner s1=new Scanner(System.in);
         int n=s1.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         a[i]=s1.nextInt();
	 System.out.println( eql(a) );
        }
}
// time =O(n)
// space = (n)

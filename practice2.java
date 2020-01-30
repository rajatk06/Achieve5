import java.util.*;
public class Main 
    {
     public static void main(String[] args) 
	   {
         Scanner s1=new Scanner(System.in);
         int a=s1.nextInt();
         while(a>0)
         {
    	 int count1=0,count2=0;
    	 int n=s1.nextInt();
    	 int b[]=new int[n];
    	 for(int i=0;i<n;i++)
    	 {
    		 b[i]=s1.nextInt();   //to scan the elements of array
    	 }
    	 for(int i=0;i<n;i++)
    	    {
    			 if(b[i]==1)
    			 {
    			 count2++;
    			 }
    			 if(b[i]==0)
    			 {
    				 count1++;
    			 }
             }
    	 if(count1==count2)
    	 {
    		 System.out.print(count1+count2);
    	 }
    	 if(count1<count2)
    	 {
    		 System.out.print(count1+1);
    	 }
    	 if(count2<count1)
    	 {
    		 System.out.print(count2+1);
    	 }
    	 a--;
     }
    }
}
package practise;

public class numbersubsets {
     public static void main(String args[])
     {
    	 int n=9;
    	 //find the number of digits
    	 if(n==1)
    		 System.out.println("3");
    	 else {
    	 int ntemp=n,i=0;
    	 for( i=0;ntemp/2>0;i++)
    	 {
    		 ntemp=ntemp/2;
    	 }
    	 
    	 //System.out.println(i);
    	 
    	 //find the postion
    	 //to find the position find the 2 power n nearest to n
    	 int pow=0;
    	 for(int j=0;j<n;j++)
    	 {
    		 if(Math.pow(2,j)>n)
    		 {
    			 pow=(int)Math.pow(2,j-1);
    			 break;
    		 }
    	 }
    	// System.out.println(pow);
    	 
    	 int pos=n-pow+1;
    	 
    	 if(i==0)//for n=1
    	 {
    		 pos=1;
    	 }
    	 if(pos==pow)
    	 {
    		 i=i+1;
    		 pos=0;
    	 }
    	 
    	 //System.out.println(pos);
    	 
    	 //generating the number
    	 
    	 for(int j=i-1;j>=0;j--)
    	 {
    		 if(((pos>>j)&1)==0) //010 to 343 mapping 0 to 3 and 1 to 4
    			 {
    			 System.out.print("3");
    		 }
    		 else
    			 System.out.print("4");    	
    		 }
     }
     }
}

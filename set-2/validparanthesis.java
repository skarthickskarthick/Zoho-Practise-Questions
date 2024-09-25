package practise;

import java.util.Stack;

public class validparanthesis {
	 public static void main(String args[])
	  {
		  String str="((((((a+b)(n+b((a-b)))";
		  int count=0;
		  for(int i=0;i<str.length();i++)
		  {
			  if(str.charAt(i)=='(')
				 count++;
			  else if(str.charAt(i)==')') 
				  count--;
				  
				
		  }
		  if(count==0)
		  System.out.println("true");
		  else
			  System.out.println("false");
		
		  
		 
	  }
}

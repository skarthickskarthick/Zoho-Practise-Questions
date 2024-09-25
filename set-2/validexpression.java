package practise;

import java.util.Stack;

public class validexpression {
  public static void main(String args[])
  {
	  String str="(a+b)(n+b((a-b)))";
	  int flag=0;
	  Stack<Character> s=new Stack<>();
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)=='(')
			  s.push(str.charAt(i));
		  else if(str.charAt(i)==')'&&s.isEmpty()) {
			  System.out.println("false");
			  flag=1;
			  break;
		  }
			  
		  else if(str.charAt(i)==')')
			  s.pop();
	  }
	  if(!s.isEmpty())
		  System.out.println("false");
	  else if(s.isEmpty()&&flag==0)
		  System.out.println("true");
	  
	  int flag1=0;
	  
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/') 
		  {
			  if(i>0&&i<str.length()-2)
			  {
				  if(!(Character.isAlphabetic(str.charAt(i-1))&&Character.isAlphabetic(str.charAt(i+1))))
				  {
					  flag1=1;
					  System.out.println("false");
					  break;
					  
				  }		  
			  }
			  else {
				  flag1=1;
				  System.out.println("false");
				  break;
			  }
		  }
	  }
	  
	  if(flag1==0)
		  System.out.println("true");
	  
	 
  }
}

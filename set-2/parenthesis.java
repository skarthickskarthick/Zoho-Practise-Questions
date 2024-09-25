package practise;

import java.util.ArrayList;

public class parenthesis {
  public static void main(String args[])
  {
	  String str="(((((((ab)";
	ArrayList<Integer> arr=new ArrayList<>();
	  int end=0,in=0,flag=0;
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)=='(')
		  {
			  
			  if(end<i)
			  {
				  for(int j=end+1;j<i;j++)
				  {
					  if(str.charAt(j)==')')
					arr.add(j);
				  }
				  end=i;
			  }
			  
			  
			  
			  flag=0;
			  for(end+=1;end<str.length();end++)
			  {
				  if(str.charAt(end)==')')
				  {
					  flag=1;
					  break;
				  }
				  
			  }
			  if(flag==0)
			  {
				  arr.add(i);
			  }
			  
			  
			  
			  if(end==str.length()&&str.charAt(end-1)!=')')
			  {
				  for(int j=i;j<str.length();j++)
				  {
					  if(str.charAt(j)=='(')
						  arr.add(j);
				  }
				  break;
			  }
		  }
		  
	  }
	  //System.out.println(end);
	  if(end!=str.length())
	  {
		  for(int i=end+1;i<str.length();i++)
		arr.add(i);
	  }
	  
		  System.out.println(arr);
		  
	  
	  String s="";
	  
	  char c[]=str.toCharArray();
			  
	  for(int i=0;i<c.length;i++)
	  {
		  if(!arr.contains(i))
		  {
			  s+=Character.toString(c[i]);
		  }
	  }
	  System.out.println(s);
  
  
  }
}

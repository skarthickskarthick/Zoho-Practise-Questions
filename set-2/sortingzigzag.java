package practise;

public class sortingzigzag {
public static void main(String args[])
{
	int arr[]= {1,4,7,2,5,6,3,8};//rotation for even index only for sorted array
   for(int i=0;i<arr.length;i++)
   {
	   for(int j=i+1;j<arr.length;j++)
	   {
		   if(i%2==0)
		   {
			   while(arr[i]<arr[j]) {
			   int temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			   }
					  
		   }
		   else
		   {
			   while(arr[i]>arr[j]) {
				   int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				   }
		   }
			   
	   }
	   
   }
   for(int a:arr)
System.out.print(a);





}
}

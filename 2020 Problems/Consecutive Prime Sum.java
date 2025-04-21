import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int sum=0;
		int k=0;
		for(int i=2;i<num;i++){
		    int flag=0;
		    for(int j=2;j<i;j++){
		        if(i%j!=0){
		            flag=0;
		        }
		        else
		        {
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0){
		        arr[k]=i;
		        k++;
		    }
		}
        int count=0;
        for(int i=0;i<k;i++){
		    sum+=arr[i];
		    if(sum<num){
		    int flag=0;
	    for(int j=2;j<sum;j++){
	        if(sum%j!=0){
	            flag=0;
	        }
	        else
	        {
	            flag=1;
	            break;
	        }
    }
    if(flag==0){
        count++;
    }
}
}
		System.out.println(count-1);
}
}

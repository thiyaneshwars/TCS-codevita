import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int t=0;
        while(t!=test){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][]=new int[n][m];
            for(int i=0;i<m;i++){
                arr[0][i]=1;
            }
            for(int i=0;i<n;i++){
                arr[i][0]=1;
            }
            for(int i=1;i<n;i++){
                for(int j=1;j<m;j++){
                    arr[i][j]=(arr[i][j-1]+arr[i-1][j])% 1000000007;
                }
            }
            System.out.println(arr[n-1][m-1]);
            t++;
        }

	}
}

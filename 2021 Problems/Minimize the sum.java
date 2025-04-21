import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int test = sc.nextInt();
        int t = 0;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        while(t!=test){
            int temp=arr[0];
            int pos =0;
            for(int i=1;i<size;i++){
                if(temp<arr[i]){
                    temp=arr[i];
                    pos = i;
                }
            }
            temp/=2;
            arr[pos]=temp;
            t++;
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }

}

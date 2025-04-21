import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean prime(int a) {
        int i, flag = 0;
        for (i = 2; i < a; i++) {
            if (a % i != 0) {
                flag = 0;
            }
            else {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return true;
        }
        else{
        return false;
    }
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int parts = sc.nextInt();
        int a = hours / parts;
        int count = 0;
        for (int i = 2; i <= a; i++) {
           boolean n=prime(i);
            if (n == true) {
                count++;
            }
        }
        int arr[][] = new int[count][parts];
        int k = 0;
        for (int i = 2; i <= a; i++) {
            boolean n = prime(i);
            if (n == true) {
                arr[k][0] = i;
                k++;
            }
        }
           int total=0;
           for(int i=0;i<count;i++){
                int pos =0;
                int b = arr[i][0];
               for(int j=1;j<parts;j++){
                   b+=a;
                   boolean n = prime(b);
                   if(n==true){
                       arr[i][j]=b;
                       pos++;
                   }
           }
           if(pos==parts-1){
               total++;
           }
         }
            
            System.out.println(total);
   
        }
    }

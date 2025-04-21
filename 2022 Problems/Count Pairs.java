import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int zero = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    int t = Math.abs(arr[i] - arr[j]);
                    if (t == 0) {
                        zero++;
                    }
                    if (t <= k) {
                        count++;
                        break;
                    }
                }
            }
        }
        if (zero == size) {
            System.out.println('0');
        }
        else {
            System.out.println(count);
        }
    }
}

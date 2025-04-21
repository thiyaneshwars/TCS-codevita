import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char arr[][] = new char[3][a];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        for(int i=0;i<a-2;i++){
            if(arr[0][i]=='*'&&arr[0][i+1]=='.'&&arr[0][i+2]=='*'&&arr[1][i]=='*'&&arr[1][i+1]=='.'&&arr[1][i+2]=='*'){
                System.out.print('U');
                       i+=2;
            }
            else if(arr[0][i]=='#'){
                System.out.print('#');
                continue;
            }
            else if(arr[0][i]=='.'&&arr[1][i]=='.'&&arr[2][i]=='.'){
                continue;
            }
            else if(arr[0][i]=='*'&&arr[0][i+1]=='*'&&arr[0][i+2]=='*'&&arr[1][i]=='*'&&arr[1][i+1]=='.'&&arr[1][i+2]=='*'){
                System.out.print('O');
                       i+=2;
                continue;
            }
            else if(arr[1][i]=='.'&&arr[1][i+1]=='*'&&arr[1][i+2]=='.'){
                System.out.print('I');
            }
            else if(arr[0][i]=='*'&&arr[0][i+1]=='*'&&arr[0][i+2]=='*'&&arr[1][i]=='*'&&arr[1][i+1]=='*'){
                System.out.print('E');
                i+=2;
            }
            else if(arr[0][i]=='.'&&arr[0][i+1]=='*'&&arr[0][i+2]=='.'){
                System.out.print('A');
                       i+=2;
            }
        }
    } 
}

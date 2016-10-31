package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021013 周永振老師
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    System.out.println("輸入m和n:");
    int m = scn.nextInt();
    int n = scn.nextInt();
    int x = fun1(m,n);
	 System.out.print(x);
   }

	public static int fun1(int a,int b){
		int sum = 0;
		int a1 = 1;
		int a2 = 1;
		int a3 = 1;
		int mn = (a-b);
		
		for(int i=a;i>0;i--){
		a1=a1*i;
		}
		for(int j=b;j>0;j--){
		a2=a2*j;
		}
		for(int h=mn;h>0;h--){
	    a3=a3*h;
	}
 sum = a1 / (a2*a3);
 return sum ;
}

}

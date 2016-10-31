package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021013 周永振老師
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
	System.out.println(n+","+"'@'");
    fun1(n);}
    public static void fun1(int n){
	 int sum = 0;
	 for(int i=0;i<n;i++)
	 {
	 for(int j=0;j<n;j++)
	 {
	 System.out.print('@');	
	 }
	 System.out.println( );
	 }
	 }
	}

package hw;
import java.util.*;
public class hw01 {
/*請設計一個函數fun(v1, type)，讓使用者輸入一個溫度值及計算方式(type 為1 時 華氏->攝氏，type為2時攝氏->華氏)，
 * 函數算出結果後要回傳至主程式再印出結果。(F=C*9/5+32), (C = (F-32) * (5/9)，
 * 例如輸入100 1 則輸出 37.77778; 輸入 37.77778 2 時則輸出 100.0
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("請輸入溫度");
       float n =scn.nextFloat();
       System.out.println("輸入1為華氏->攝氏");
       System.out.println("輸入2為攝氏->華氏");
       float a = scn.nextFloat();
       float b = fun1(n,a);
       System.out.println(b);
	}
	public static float fun1(float n1,float a1){
		float sum = 0;
	   if(a1 == 1){
		   sum = (n1-32) * (5/9);
	   }else{
		   sum = (n1*9/5)+32;
	   }
	   return sum;
	}

}

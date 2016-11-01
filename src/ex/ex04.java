package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021013
 */
import java.util.*;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0;i<4;i++){
        	arr[i]=scn.nextInt();
        }    
        fun1(arr);
        for(int i=0;i<4;i++){
        	System.out.print(arr[i]);
        	System.out.print(" ");
}
}
	public static int[] fun1(int[] a){
		for(int i=0;i<4;i++){
			a[i] = a[i]*a[i];
		}
		return a;
	}
}

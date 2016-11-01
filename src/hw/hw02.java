package hw;
import java.util.*;
public class hw02 {
/*讓使用者輸入性別與身高，透過函數呼叫，依據男女不同, 幫她(他)計算並輸出其標準體重
 * ((1)男：(身高-170)*0.6+62 , (2)女：(身高-158)*0.5+52)。
 * 函數算出結果後要回傳至主程式再印出結果。例如:輸入 1 170 則輸出 62.0, 輸入 2 165 則輸出 55.5
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("輸入性別:1.男生 2.女生");
       int a = scn.nextInt();
       System.out.println("輸入身高(cm)");
       int n = scn.nextInt();
       float b = fun1(a,n);
       float sum = 0;
       System.out.println(b);
	}
    public static float fun1(float a1,float n1){
    	float sum = 0;
    	if(a1 == 1){
    		sum = (float) ((n1-170)*0.6+62);
    	}else{
    		sum = (float) ((n1-158)*0.5+52);
    	}
    return sum;
}
}

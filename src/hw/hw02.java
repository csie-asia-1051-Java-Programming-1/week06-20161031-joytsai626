package hw;
import java.util.*;
public class hw02 {
/*���ϥΪ̿�J�ʧO�P�����A�z�L��ƩI�s�A�̾ڨk�k���P, ���o(�L)�p��ÿ�X��з��魫
 * ((1)�k�G(����-170)*0.6+62 , (2)�k�G(����-158)*0.5+52)�C
 * ��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C�Ҧp:��J 1 170 �h��X 62.0, ��J 2 165 �h��X 55.5
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("��J�ʧO:1.�k�� 2.�k��");
       int a = scn.nextInt();
       System.out.println("��J����(cm)");
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

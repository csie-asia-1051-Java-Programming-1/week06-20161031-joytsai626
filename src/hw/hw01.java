package hw;
import java.util.*;
public class hw01 {
/*�г]�p�@�Ө��fun(v1, type)�A���ϥΪ̿�J�@�ӷū׭Ȥέp��覡(type ��1 �� �ؤ�->���Atype��2�����->�ؤ�)�A
 * ��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C(F=C*9/5+32), (C = (F-32) * (5/9)�A
 * �Ҧp��J100 1 �h��X 37.77778; ��J 37.77778 2 �ɫh��X 100.0
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("�п�J�ū�");
       float n =scn.nextFloat();
       System.out.println("��J1���ؤ�->���");
       System.out.println("��J2�����->�ؤ�");
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

package ex0;

public class Sequence1 {
//	1/2 - 2/3 + 3/4 - .... 98/99 + 99/100 = ?

	public static void main(String[] args) {
		double sum = 0.0;
		for(int i =0; i<=99; i++) {
			if(i%2 !=0) { //Ȧ�����
				sum += i/(double)(i+1) ;
			}else {
				sum-= i/(double)(i+1);
			}
		}
		System.out.println("Result :" +sum);
	}

}

package ex0;

public class Sequence {

	public static void main(String[] args) {
		// ���ܼ����˰��� ( 1 - 2 + 3 - 4 + 5 - ..... + 99 - 100 = ? )
		int sum =0;
		
		for(int i =0; i<=100; i++) {
			if(i%2 != 0) {//Ȧ���̸�
				sum += i;
			}else {
				sum -= i;
			}
		}
		System.out.println("Result : "+ sum); 

	}

}

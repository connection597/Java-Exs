package ex0;

public class Sequence2 {
	// *  1+2+4+7+11+16+22+... + ? 20�� �ݺ��Ҷ� ��� ����? 
	public static void main(String[] args) {
		int sum =0;
		int data =1;
		
		for(int i =0; i<20; i++) { //20�� �ݺ�
			if( i!=19) System.out.print(data +"+");
			else System.out.print(data +"/n");
			
			sum += data; //����
			data = data +(i+1);//������ ���ؽ� ����
		}
		System.out.println("Result:"+sum);
	}
	

}

package ex0;

public class Sequence2 {
	// *  1+2+4+7+11+16+22+... + ? 20번 반복할때 결과 값은? 
	public static void main(String[] args) {
		int sum =0;
		int data =1;
		
		for(int i =0; i<20; i++) { //20번 반복
			if( i!=19) System.out.print(data +"+");
			else System.out.print(data +"/n");
			
			sum += data; //누적
			data = data +(i+1);//다음번 인텍스 더함
		}
		System.out.println("Result:"+sum);
	}
	

}

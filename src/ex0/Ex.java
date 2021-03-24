package ex0;
import java.util.*;
public class Ex {
//제일 작은수 제거하기
	public int [] solution(int[]arr) {
		int[] answer = {};
		int min =arr[0];
		if(arr.length ==1) {
			return new int[] {-1};
		}
		for(int i =0; i<arr.length; i++) {
			min = Math.min(arr[i], min);
		}
		answer = new int[arr.length-1];
		
		int j =0;
		for(int i =0; i<answer.length; i++) {
			if(arr[j]== min) {
				j++;
				i--;
				continue;
			}
			answer[i]= arr[j];
					j++;
		}
		return answer;
	}
}

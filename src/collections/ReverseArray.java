package collections;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
		int [] score = {55, 44, 24, 54, 21};
		
		int temp;
		
		for(int i=0; i<score.length/2; i++) {
			
			temp = score[i];
			score[i] = score[score.length-1-i];
			score[score.length-1-i]=temp;
			
		}

		System.out.println(Arrays.toString(score));
		
	}

}

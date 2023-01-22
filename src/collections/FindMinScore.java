package collections;

public class FindMinScore {

	public static void main(String[]args) {
		
		int [] score = {13, 22, 43, 66, 76, 55, 25, 11, 5};
		
		int min = score[0];
		
		for(int i = 0; i<score.length; i++) {
			
			if(min>score[i])
				min = score[i];
			
		}
		
		System.out.println(min);
	}
}

package collections;

public class FindMaxScore {

	public static void main(String[] args) {
	
		
		int [] score = {89, 78, 99, 67, 56, 93, 34, 76, 90};
		
		int max = score[0];
		
		
		for(int i = 0; i<9; i++) {
			
			if(max<score[i])
				
				max = score[i];
			
			
		}

		System.out.println(max);
	}

}

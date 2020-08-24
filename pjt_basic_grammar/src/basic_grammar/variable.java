package basic_grammar;

public class variable {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j;
		j = 100;
		
		System.out.println("i + j=" + (i+j));
		/* 선언은 한 번만 */
		i = 100;
		/* int i를 쓰려면 +라는 부호가 필요한듯! */
		System.out.println("i=" +i);
		
		i = 300;
		
		System.out.println("i=" + i);
		
		i =0;
		System.out.println("i=" + i);
	}
}

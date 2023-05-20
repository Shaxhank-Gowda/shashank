
public class BatProgrammer {
	
	public static void main(String[] args) {
		
		System.out.print(findNumOfStepsRequired(3, 10));
	}

	static int findNumOfStepsRequired(int n, int steps) {
		
		int tot=0;
		
		for(int i=1; i<=n; i++) {
			tot+=steps;
		}
		return tot;
	}
}

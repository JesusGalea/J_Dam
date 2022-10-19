package tres;

public class Main {

	public static void main(String[] args) {
		
		boolean primo = true;
		
		for (int i = 2; i <= 100; i++) {
		primo = true;
			
			for(int z = 2; z <i ;z++) {
				
				if (i % z == 0) {
					primo = false;
				}
				
				
			}
			
			if(primo) {
				System.out.println(i);
			}
		}
		
	}

}

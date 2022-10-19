package cuatro;

public class Main {

	public static void main(String[] args) {
		int min = 0;
		int max= 0;
		 int total = 0;
		for (int i = 0; i <50; i++) {
			int num =(int) (Math.random()*100)+100;
			total = total + num;
			if(i == 0) {
				max = num;
				min = num;
			}
			
			if (num > max) {
				max = num;
			}
			
			if (num < min) {
				min = num;
			}
			
		
			
		}
System.out.println("max: " + max + " min: " + min + " la media: " + (total/50));
	}

}

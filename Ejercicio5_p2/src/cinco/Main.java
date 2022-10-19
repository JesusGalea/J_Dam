package cinco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double num = 0.0;
		Scanner sc = new Scanner(System.in);
		   ArrayList<Double> nums = new ArrayList();
		for (int i = 0; i < 10; i++) {
System.out.println("introduce el"+(i+1) +" numero");
num = sc.nextDouble();
nums.add(num);
		}
		
		for (int z = 9; z>= 0; z-- ) {
			System.out.println(nums.get(z));
		}

	}

}

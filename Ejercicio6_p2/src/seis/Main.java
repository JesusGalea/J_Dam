package seis;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

int num = 0;
int min = 0;
int max = 0; 
Scanner sc = new Scanner (System.in);

for (int i = 0; i < 10; i++) {
	System.out.println("introduce un numero");
	num = sc.nextInt();
	if (i == 0) {
		min = num;
		max = num;
	}
	
	if (num > max) {
		max =num;
	}
	
	if( num < min ){
		min = num;
	}
	
}
System.out.println("max: " + max + " min: " + min);
	}

}

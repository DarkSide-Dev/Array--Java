import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] cars = {"Camaro", "Corvette", "Tesla"};
		String[] names = new String[3];
		
		for(int i = 0; i < cars.length; i++) {
			
			System.out.println(cars[i]);
			
		}
		
		System.out.println("Enter 3 random names: ");
		
		for(int i = 0; i < names.length; i++) {
			
			names[i] = scanner.nextLine();
			
		}
		
		System.out.println();
		System.out.println("Inserted names: ");
		
		for(int i = 0; i < names.length; i++) {
			
			System.out.println(names[i]);
			
		}

	}

}

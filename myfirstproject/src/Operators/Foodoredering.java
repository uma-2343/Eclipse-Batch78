package Operators;
import java.util.Scanner;

public class Foodoredering {

	public static void main(String[] args) {
		int price=0;
		String item;
		Scanner sc= new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("Welcome to Food ordering System");
		System.out.println("======================================");

		System.out.println("1.Pizza-RS .200");
		System.out.println("2.Burger-RS .120");
		System.out.println("3.Birayani-RS .180");
		System.out.println("4.Noodels-RS .100");
		
		System.out.println(" Enter the item : ");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1 ->{
			item="Pizza";
			price=200;
			
		}
		case 2 ->{
			item="Burger";
			price=120;
			
		}
		case 3 ->{
			item="Biryani";
			price=180;
			
		}
		case 4->{
			item="Noodels";
			price=100;
			
		}
		default -> {
            System.out.println("Invalid movie selection!");
            sc.close();
            return;
		}
		
		}
		
    System.out.println("Enter the Number of items : ");
    int quantity=sc.nextInt();
    int total=price*quantity;
    System.out.println(" ======item details=====");
    System.out.println("Item name: "+item);
    System.out.println("price: "+price);
    System.out.println("quantity: "+quantity);
    System.out.println("Total bill: "+total);



    
	}

}

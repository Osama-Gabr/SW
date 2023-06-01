import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    	ArrayList<Product> product_list = new ArrayList<Product>();
    	ArrayList<Customer> customer_list = new ArrayList<Customer>();
    	ArrayList<Cashier> cashier_list = new ArrayList<Cashier>();
    	Manager manager = new Manager("Omar","1324",50,8000);
    	//initial data
    	product_list.add(new Product("oil", 30, 100, 0));
    	product_list.add(new Product("suger", 20, 150, .1));
    	product_list.add(new Product("rice", 15, 200, 0));
    	
    	cashier_list.add(new Cashier("Ali", "456", 25, cashier_list.size(), 4000, "6-1-2022"));
    	cashier_list.add(new Cashier("Ahmed", "4236", 28, cashier_list.size(), 3000, "6-5-2023"));
    	cashier_list.add(new Cashier("Mohammed", "896", 45, cashier_list.size(), 6000, "8-1-2018"));

    	customer_list.add(new Customer("Amr", "567", 15, customer_list.size(), 10));
    	customer_list.add(new Customer("Ayman", "5607", 23, customer_list.size(), 50));
    	customer_list.add(new Customer("Amgad", "56457", 22, customer_list.size(), 30));
    	//end of initial data    	
    	boolean exit = true;
    	String p_name, phone, id, date;
    	double price, quantity, discount, totalSelling=0;
    	Product p_object;
    	Cashier c_object;
    	Customer customer_object;
    	int selection = 2, age, cashier_id, ID, points;
    	do {
    		System.out.println("Enter 1:manager, 2: cashier, 3: exit :-");
    		selection = input.nextInt();
    		switch(selection){
			case 1:
				while(selection != 7){
				System.out.println("Hello Manager !!\n"+ "What service do you want?\n"+ "1- Search for product\n"
						+ "2- Add product\n"+ "3- Delete product\n"+ "4- Add cashier\n"+ "5- Delete cashier\n"
						+ "6- Total shift selling\n"+ "7- exit");
				selection = input.nextInt();
				switch(selection){
				case 1:
					System.out.print("enter the name of the product: ");
					p_name = input.next();
					manager.Search_for_product(p_name, product_list);
					break;
				case 2:
					System.out.println("enter product name, price, quantity, and discount:");
					p_name = input.next();
					price = input.nextDouble();
					quantity = input.nextDouble();
					discount = input.nextDouble();
					p_object = new Product(p_name, price, quantity, discount);
					manager.add_product(p_object, product_list);
					break;
				case 3:
					System.out.print("enter the name of the product: ");
					p_name = input.next();
					manager.delete_product(p_name, product_list);
					break;
				case 4:
					System.out.println("enter name, phone, age, id, salary, and start date :");
					p_name = input.next();
					phone = input.next();
					age = input.nextInt();
					ID = input.nextInt();
					quantity = input.nextDouble();
					date = input.next();
					c_object = new Cashier(p_name,phone,age,ID,quantity,date);
					manager.add_cashier(c_object, cashier_list);
					break;
				case 5:
					System.out.print("enter the id of the cashier: ");
					age = input.nextInt();
					manager.delete_cashier(age, cashier_list);
					break;
				case 6:
					manager.totalSelling(totalSelling);
					break;
				}
				}
				break;
			case 2:
				System.out.println("Hello Cashier !!\n"+ "what is your ID");
				cashier_id = input.nextInt();
				if(cashier_id<=cashier_list.size()){
					while(selection != 3){	
				System.out.println("What service do you want?\n"+ "1- Payment\n"+ "2- Add Customer\n"+ "3- exit\n");
				selection = input.nextInt();
				switch(selection){
				case 1:
					System.out.print("enter the ID of the customer: ");
					age = input.nextInt();
					cashier_list.get(cashier_id).pay(customer_list, age, cashier_list.get(cashier_id).Name, cashier_list.get(cashier_id).cashierID);
					totalSelling += customer_list.get(age).bill.get_price_after_discount();
					break;
				case 2:
					System.out.println("enter name, phone, age, id, and points :");
					p_name = input.next();
					phone = input.next();
					age = input.nextInt();
					ID = input.nextInt();
					points = input.nextInt();
					customer_object = new Customer(p_name, phone, age, ID, points);
					cashier_list.get(cashier_id).addCustomer(customer_list, customer_object);
					break;
				}
				}
				}else
					System.out.println("invalid ID");
				break;
			case 3:
				exit = false;
				break;
			default:
				System.out.println("enter valid number");
    		}
		} while (exit);    	
    }    
}

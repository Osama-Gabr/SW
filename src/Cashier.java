import java.util.ArrayList;

public class Cashier extends Person{
    public int cashierID;
    public double salary, selling;
    public String startDate ;
    

    public Cashier() {
    }

    public Cashier(String name, String phone, int age,int casherID, double salary, String startDate) {
    	super(name, phone, age);
		this.cashierID = casherID;
		this.salary = salary;
		this.startDate = startDate;
	}

    void pay(ArrayList<Customer> list, int id, String name, int number){
    	list.get(id).buy(name, number);
    	System.out.println("Payment done :)");
    }
    
    void addCustomer(ArrayList<Customer> list, Customer customer){
    	list.add(customer);
    	System.out.println("New Customer added :) ");
    }

}
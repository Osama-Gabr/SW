import java.util.Scanner;

public class Customer extends Person{
    public int customerID;
    static int numOfcustomers=0;
    public int points=0;
    public Bill bill;

    public Customer() {
         numOfcustomers+=1;
        customerID=numOfcustomers;
    }

    public Customer(String name, String phone, int age,int customerID, int points) {
    	super(name, phone, age);
    	this.customerID = customerID;
        this.points = points;
        numOfcustomers+=1;
        customerID=numOfcustomers;
    }
    
    public void buy(String CasherName,int CasherNumber)
    {
        bill=new Bill();
        System.out.println("here we go to do shopping");
        char word='y';
        do{
            System.out.print("the name of product is : ");
                                    Scanner input3 = new Scanner(System.in);
                                    String product = input3.nextLine();

                                    System.out.print("the price of product by 'L.E' is : ");
                                    Scanner input4 = new Scanner(System.in);
                                    double price = input4.nextDouble();

                                    System.out.print("the quantity of product is : ");
                                    Scanner input5 = new Scanner(System.in);
                                    double quantity = input5.nextDouble();

                                    System.out.print("the discounts of product by 'L.E' is : ");
                                    Scanner input7 = new Scanner(System.in);
                                    double discounts = input7.nextDouble();

                                   

                                    System.out.println("");

                                    bill.set_product_name(product);
                                    bill.set_product_price(price);
                                    bill.set_quantity(quantity);
                                    bill.set_discounts(discounts);
                                    bill.set_customer_id(customerID);
                                    bill.get_price_before_discount();
                                    bill.get_discount();
                                    bill.store_name();
                                    bill.store_price();
                                    bill.store_quantity();
                                    bill.store_discounts();

                                    System.out.println(">> DO YOU NEED ANYTHING ELSE ? <<");
                                    System.out.println("");
                                    System.out.print("your choise is [Y OR N] : ");
                                    Scanner input6 = new Scanner(System.in);
                                    word = input6.next().charAt(0);
                                    System.out.println(" ");

                                    if (word == 'n') {
                                        System.out.print("enter the money from client by 'L.E' : ");
                                        Scanner input9 = new Scanner(System.in);
                                        double cash = input9.nextDouble();
                                        System.out.println("");
                                        bill.set_client_money(cash);
                                        bill.get_price_after_discount();
                                        points = (int) bill.get_price_after_discount();
                                       // bill.set_bill_number(count);
                                        bill.set_casher_name(CasherName);
                                        bill.set_casher_number(CasherNumber);
                                        //count++;
                                        System.out.println("your points = "+ points);
                                        bill.print_bill();
                                        System.out.println(" ");
                                        
                                    }
                        
        }while(word!='n');         
           
    }
    
    
}

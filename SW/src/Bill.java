import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bill extends Product {

    private String CasherName;
    private int CasherNumber; 
    private int customerID; 
    static int numberOfBills = 0;
    private double productPriceBeforeDiscount = 0;
    private double discount = 0;
    private double priceAfterDiscount = 0;
    private double cash = 0;
    private int billNumber;
    private double clientMoney = 0;
    public ArrayList<String> Name = new ArrayList<String>();
    public ArrayList<Double> Price = new ArrayList<Double>();
    public ArrayList<Double> Quantity = new ArrayList<Double>();
    public ArrayList<Double> Discounts = new ArrayList<Double>();

    public Bill(String ProductName, double ProductPrice, double quantity, double discounts, double cash, int billNumber) {
        super(ProductName, ProductPrice, quantity, discounts);
        numberOfBills += 1;
        billNumber = numberOfBills;
        this.cash = cash;
    }

    public Bill() {
        numberOfBills += 1;
        billNumber = numberOfBills;
    }

    public double get_price_before_discount() {
        productPriceBeforeDiscount = productPriceBeforeDiscount + (super.get_product_price() * super.get_quantity());
        return productPriceBeforeDiscount;
    }

    public double get_discount() {
        discount = discount + (super.get_quantity() * super.get_discounts());
        return discount;
    }

    public double get_price_after_discount() {
        priceAfterDiscount = priceAfterDiscount + (productPriceBeforeDiscount - discount);
        return priceAfterDiscount;
    }

    public void set_client_money(double cash) {
        this.cash = cash;
    }

    public double get_client_money() {
        return cash;
    }

    public double get_money_of_client() {
        clientMoney = clientMoney + (get_client_money() - priceAfterDiscount);
        return clientMoney;
    }

    public int get_bill_number() {
        return billNumber;
    }

    public void set_bill_number(int billNumber) {
        this.billNumber = billNumber;
    }

    public void date() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(">> 'Date:' dd/MM/yy   >> 'Time:' hh:mm:ss a");
        System.out.println(sdf.format(date));
        //  System.out.printf( "\nCurrent Date: %tF", date );
        //System.out.printf( "\nCurrent time: %tr", date );
    }

    public String get_casher_name() {
        return CasherName;
    }

    public void set_casher_name(String CasherName) {
        this.CasherName = CasherName;
    }

    public int get_casher_number() {
        return CasherNumber;
    }

    public void set_casher_number(int CasherNumber) {
        this.CasherNumber = CasherNumber;
    }

    public void store_name() {
        Name.add(super.get_product_name());
    }

    public void store_price() {
        Price.add(super.get_product_price());
    }

    public void store_quantity() {
        Quantity.add(super.get_quantity());
    }

    public void store_discounts() {
        Discounts.add(super.get_discounts());
    }

    public void set_customer_id(int customerID) {
        this.customerID = customerID;
    }

    public int get_customer_id() {
        return customerID;
    }
    
    

    void print_bill() {
        System.out.println("");
        System.out.println("...........................................................");
        System.out.println(">>> NAME OF PLACE : <<<");
        System.out.println(">>> TELEPHONE NUMBER : <<<");
        System.out.println(">>> ADDRESS OF PLACE : <<<");
        System.out.println("");
        System.out.println(">> Number Of Bill : " + get_bill_number());
        date();
        System.out.println(">> name of casher man : " + get_casher_name());
        System.out.println(">> number of casher man : " + get_casher_number());
        System.out.println("");
        System.out.println(">> customer ID : " + get_customer_id());
        System.out.println("");
        System.out.println("|Product  >> " + Name + "|");
        System.out.println("|Price    >> " + Price + "|");
        System.out.println("|Quantity >> " + Quantity + "|");
        System.out.println("|Discount >> " + Discounts + "|");
        System.out.println("");
        System.out.println(">>>> total price before discounts is : " + productPriceBeforeDiscount + " L.E");
        System.out.println(">>>> total discounts is : " + discount + " L.E");
        System.out.println(">>>> total price after discounts is : " + priceAfterDiscount + " L.E");
        System.out.println(">>>> total money has taken from clinet is : " + get_client_money() + " L.E");
        System.out.println(">>>> the rest for client : " + get_money_of_client() + " L.E");
        System.out.println("");
        System.out.println("              'End The Bill'");
        System.out.println("............................................................");
        System.out.println("");
    }

}

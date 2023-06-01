import java.util.ArrayList;

public class Manager extends Person {

 public double salary ;


    public Manager() {
    }


    public Manager(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;

    }


    public void Search_for_product (String productName,ArrayList<Product> list)
    {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get_product_name().equalsIgnoreCase(productName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Product found: ");
        } else {
            System.out.println("Product not found.");
        }

    }


    public void add_product ( Product product,ArrayList<Product> list)
    {
        list.add(product);
        System.out.println("Product added: ");
    }


    public void delete_product (String productName,ArrayList<Product> list)
    {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get_product_name().equalsIgnoreCase(productName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            list.remove(index);
            System.out.println("Product deleted: " );
        } else {
            System.out.println("Product not found.");
        }
    }


    public void add_cashier (Cashier cashier,ArrayList<Cashier> list)
    {
        list.add(cashier);
        System.out.println("Cashier added: " );

    }

    public void delete_cashier (int index,ArrayList<Cashier> list)
    {
         list.remove(index);
         System.out.println("cashier deleted");
    }

    
}

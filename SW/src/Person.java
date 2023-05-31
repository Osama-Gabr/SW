public abstract class Person {

String Name ;
String phone ;
int age ;


    public Person() {
    }

    public Person(String name, String phone, int age) {
        Name = name;
        this.phone = phone;
        this.age = age;
    }
    
    void totalSelling(double totalSelling){
    	System.out.println("the total price of the shift = "+ totalSelling);
    }
}

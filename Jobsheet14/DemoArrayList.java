package Jobsheet14;
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        // ArrayList<Customer> customers = new ArrayList<>(2); // Initializing with capacity of 2
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(2, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4,"Cica"));
        customers.add(2, new Customer(100,"Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println();
        
        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201,"Della"));
        newCustomers.add(new Customer(202,"Victor"));
        newCustomers.add(new Customer(203,"Sarah"));

        customers.addAll(newCustomers);
        customers.forEach(cust->{
            // System.out.println(cust.toString());
            System.out.println(cust);
        });
        
        // Praktikum Sorting
        System.out.println();
        customers.sort((c1,c2)->c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}

package Jobsheet14;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mangga");        
        fruits.add("Apel");        
        fruits.add("Jeruk");        
        fruits.add("Jambu");

        fruits.forEach(temp->System.out.println(temp));
        
        System.out.println("First: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println();
        System.out.println("Setelah remove " + fruits);

        fruits.pollFirst();
        System.out.println("Setelah poll first " + fruits);

        fruits.pollLast();
        System.out.println("Setelah poll Last " + fruits);
    }
}

package application;

import entities.Product;


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("Keyboard", 90.00));
        list.add(new Product("HD Case", 60.00));
        list.add(new Product("PlayStation 5", 700.00));



        list.forEach(System.out::println);
    }
}
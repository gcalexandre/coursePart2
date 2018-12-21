package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product2;


public class ProgramProduct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product2> list = new ArrayList<>();
		
		list.add(new Product2("Tv", 900.00));
		list.add(new Product2 ("Mouse", 50.00));
		list.add(new Product2("Tablet", 350.50));
		list.add( new Product2("HD Case", 80.90));
		
		double min = 100.0;
		
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product2 p: list) {
			System.out.println(p);
		}

	}

}

//Create a class Product to hold products, which have name (string) and price (decimal number). Read from a text file named "Products.txt" a list of product with prices and keep them in a list of products. Each product will be in format name + space + price. You should hold the products in objects of class Product. Read from a text file named "Order.txt" an order of products with quantities. Each order line will be in format product + space + quantity. Calculate and print in a text file "Output.txt" the total price of the order. Ensure you close correctly all used resources. 

import java.io.File;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderofProducts {

	public static void main(String[] args) {
		File theinput = new File("e:\\Products.txt");
		File theinput2quant = new File("e:\\Order.txt");
    	DecimalFormat df = new DecimalFormat("#.00");
		try {
			Scanner input = new Scanner(theinput);
			Scanner inputquant = new Scanner(theinput2quant);
			HashMap<String, Double> thestorage = new HashMap<>();
			HashMap<Double,String> thestoragequant = new HashMap<>();
			do {
				Product nextproduct = new Product();
				try {
					nextproduct.name = input.next();
					nextproduct.price = input.nextDouble();
					thestorage.put(nextproduct.name, nextproduct.price);
				} catch (Exception e) {
					break;
				}

			} while (true);
			
			input.close();
			
			do {
				Order nextproductquant = new Order();
				try {
					nextproductquant.quantity= inputquant.nextDouble();
					nextproductquant.name = inputquant.next();
					thestoragequant.put(nextproductquant.quantity, nextproductquant.name);
				} catch (Exception e) {
					break;
				}

			} while (true);
			
			inputquant.close();
			
			double sum = 0;
			for (Map.Entry<Double, String> orderline : thestoragequant.entrySet()) {
				for (Map.Entry<String, Double> productline : thestorage.entrySet()) {
					if (orderline.getValue().equals(productline.getKey())) {
						sum+= orderline.getKey() *  productline.getValue();
					}
				}
			}

			PrintWriter writer = new PrintWriter("e:\\Output.txt", "UTF-8");
			writer.println(df.format(sum));
			writer.close();
		} catch (Exception e) {
			System.out.println("Error in reading/writing file!");
		}
	}

	static class Product {
		String name;
		Double price;
	}
	
	static class Order {
		Double quantity;
		String name;
	}
}

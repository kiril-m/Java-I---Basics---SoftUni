//Create a class Product to hold products, which have name (string) and price (decimal number). Read from a text file named "Input.txt" a list of products. Each product will be in format name + space + price. You should hold the products in objects of class Product. Sort the products by price and write them in format price + space + name in a file named "Output.txt". Ensure you close correctly all used resources. 

import java.io.File;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListofProducts {

	public static void main(String[] args) {
		File theinput = new File("e:\\Input.txt");
		 DecimalFormat df = new DecimalFormat("#.00");
		try {
			Scanner input = new Scanner(theinput);
			HashMap<String, Double> thestorage = new HashMap<>();

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

			ArrayList<Double> valuessorting = new ArrayList<>();
			for (int i = 0; i < thestorage.values().size(); i++) {
				valuessorting.add((Double)(thestorage.values().toArray()[i]));
			}
			
			Collections.sort(valuessorting);

			PrintWriter writer = new PrintWriter("e:\\Output.txt", "UTF-8");

			for (int i = 0; i < valuessorting.size(); i++) {
				if (thestorage.values().contains(valuessorting.get(i))) {
					for (Map.Entry<String, Double> entry : thestorage
							.entrySet()) {
						if (entry.getValue() == valuessorting.get(i)) {
							writer.println((df.format((Double)valuessorting.get(i))) + " "
									+ entry.getKey());
						}
					}
				}
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Error in reading/writing file!");
		}
	}

	static class Product {
		String name;
		Double price;
	}
}

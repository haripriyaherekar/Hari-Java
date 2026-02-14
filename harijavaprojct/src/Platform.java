
public class Platform {

	public static void main(String[] args) {
		double[] products = { 25.3, 150.0, 55.6, 125.22, 249.0, 69.99 };
		double totalproducts = 0;
		double avg = 0;
		double min = products[0];
		double max = products[0];
		for (int i = 0; i < products.length; i++) {
			totalproducts = products[i] + totalproducts;
			if (products[i] < min) {
				min = products[i];
			} else if (products[i] > max) {
				max = products[i];
			}
		}
		avg = totalproducts / products.length;
		System.out.println("Minimum price of the product:" + min);
		System.out.println("Maximum price of the product:" + max);
		System.out.println("Average marks:" + avg);

	}

}

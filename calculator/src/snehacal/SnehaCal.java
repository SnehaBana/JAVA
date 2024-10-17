package snehacal;
import additionprog.Adition;
import subtractionprog.Subtracttion;
import mulprog.Product;
import divisionprog.Divission;
import extraprog.Cube;
import extraprog.Square;

public class SnehaCal {
		public static void main(String[] args) {
			Adition a = new Adition();
			System.out.println(a.add(12, 12));
			System.out.println(Adition.add(12,12, 12));
			
			Subtracttion b = new Subtracttion();
			System.out.println(b.sub(12, 12));
			
			Product c = new Product();
			System.out.println(Product.pro(12,2));
			System.out.println(c.pro(2,2,2));
			
			Divission d = new Divission();
			System.out.println(d.div(12, 2));
			
			
			System.out.println(Cube.getcube(2));
			
			Square f = new Square();
			System.out.println(f.getsquare(2));
			
		}
}

package java8;

import java.util.ArrayList;
import java.util.List;

public class Proves {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(2);
		num.add(3);
		num.add(8);
		num.add(7);
		num.add(10);
		num.add(10);

		System.out.println(num.stream().mapToInt(n->n.intValue()).filter(n -> n%2==0).sum());
		System.out.println("Número més gran: " + num.stream().mapToInt(n->n).max().getAsInt());
		int tallest = num.stream().mapToInt(n->n).max().getAsInt();
		System.out.println("Quants números iguals: "+num.stream().filter(n -> n==tallest).count());
		
		
		
	}

	
}

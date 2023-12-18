import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4); 
		numeros.add(5);
		
		ArrayList<Integer> numeros2 = (ArrayList<Integer>) numeros;
		Collections.reverse(numeros2);
		System.out.println(numeros2);

	
	}
	
}

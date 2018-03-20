package sortersTesterClasses;

import sorterClasses.BubbleSortSorter;

public class EnteroTester {
	
	public static void main(String[] arg) {
	
	Entero[] arrOfEnteros = new Entero[3];
	
	arrOfEnteros[0] = new Entero(4); 
	arrOfEnteros[1] = new Entero(3); 
	arrOfEnteros[2] = new Entero(2); 
	
	
	BubbleSortSorter<Entero> sorter = new BubbleSortSorter<Entero>();
	
	sorter.sort(arrOfEnteros, null);
	
}
}

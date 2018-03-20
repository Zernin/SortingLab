package sortersTesterClasses;

import sorterClasses.BubbleSortSorter;

public class EnteroTester {
	
	public static void main(String[] arg) {
	
	Entero[] arrOfEnteros = new Entero[3];
	
	BubbleSortSorter<Entero> sorter = new BubbleSortSorter<Entero>();
	
	sorter.sort(arrOfEnteros, null);
	
}
}

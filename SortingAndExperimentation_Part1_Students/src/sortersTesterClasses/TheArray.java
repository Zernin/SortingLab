package sortersTesterClasses;
import java.util.Comparator;
import java.util.Random;

import interfaces.Sorter;
import sorterClasses.*;
public class TheArray {
	
	public static void main(String[] args){
		Integer[] array = {5,9,20,22,20,5,4,13,17,8,22,1,3,7,11,9,10};
		
		BubbleSortSorter<Integer> sorter = new BubbleSortSorter<Integer>();
		
		showArray("OG", array);
		
		sorter.sort(array, null);
		showArray("lol", array);
		
		sorter.sort(array, new IntegerComparator2());
		showArray("lmao", array);
		
	}
	

		
	
	
	
	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	

}
	
}

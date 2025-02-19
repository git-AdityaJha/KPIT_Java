package elements.table;

import java.util.Iterator;
import java.util.TreeSet;

public class ChemicalElementTest {

	public static void main(String[] args) {
		System.out.println("Creating objects of ChemicalElement class...");
		System.out.println("---------------------");
		
		// Objects of ChemicalElement class created here
		ChemicalElement element1 = new ChemicalElement(1, "Sodium", "Na", 12);
		ChemicalElement element2 = new ChemicalElement(2, "Chlorine", "Cl", 18);
		ChemicalElement element3 = new ChemicalElement(3, "Potassium", "K", 20);
		ChemicalElement element4 = new ChemicalElement(4, "Hydrogen", "H", 1);
		ChemicalElement element5 = new ChemicalElement(5, "Helium", "He", 2);
		System.out.println("---------------------");
		System.out.println("Objects created...");
		System.out.println("---------------------");
		
		// Container of TreeSet is created here 
		System.out.println("Creating container...");
		TreeSet<ChemicalElement> treeChemicalSet = new TreeSet<ChemicalElement>();
		System.out.println("Container created...");
		System.out.println("---------------------");
		
		// Elements added to the container.
		treeChemicalSet.add(element1);
		treeChemicalSet.add(element2);
		treeChemicalSet.add(element3);
		treeChemicalSet.add(element4);
		treeChemicalSet.add(element5);
		
		// Iterator created : to iterate over the data set.
		Iterator<ChemicalElement> elementIterator = treeChemicalSet.iterator();
		
		// Iterating through the TreeSet
		int i = 1;
		System.out.println("--------------------");
		while(elementIterator.hasNext()) {
			ChemicalElement element = elementIterator.next();
			System.out.println("Element "+ i + " : " + element);
			i++;
		}
	}
}

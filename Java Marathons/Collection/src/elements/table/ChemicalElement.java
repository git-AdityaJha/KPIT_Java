package elements.table;

public class ChemicalElement implements Comparable<ChemicalElement>{
	// Fields of Chemical Element
	int elementNumber;
	String elementName;
	String elementFormula;
	float atomicWeight;
	
	// Constructor : Initializing the data members of the class 
	public ChemicalElement(int elementNumber, String elementName, String elementFormula, float atomicWeight) {
		super();
		System.out.println("Constructor ChemicalElement() called...");
		this.elementNumber = elementNumber;
		this.elementName = elementName;
		this.elementFormula = elementFormula;
		this.atomicWeight = atomicWeight;
	}
	
	// compareTo function : Comparing the elements of the class
	@Override
	public int compareTo(ChemicalElement o) {
		System.out.println("Comparing "+ elementNumber + " with "+ o.elementNumber);
		return Integer.compare(elementNumber, o.elementNumber);
	}

	// toString function : Printing all the values of element.
	@Override
	public String toString() {
		return "ChemicalElement [elementNumber=" + elementNumber + ", elementName=" + elementName + ", elementFormula="
				+ elementFormula + ", atomicWeight=" + atomicWeight + "]";
	}
}

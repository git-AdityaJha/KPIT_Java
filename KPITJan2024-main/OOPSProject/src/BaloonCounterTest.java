
public class BaloonCounterTest {
	public static void main(String[] args) {
	//The static method countBaloons() 
	//from the type Baloon should be 
	//accessed in a static way
		
		Baloon.countBaloons();	   
		Baloon baloon1 = new Baloon("green");
		Baloon baloon2 = new Baloon("red");
		Baloon.countBaloons();	   

		
		Baloon baloon3 = new Baloon("yellow");
		Baloon baloon4 = new Baloon("blue");
		Baloon.countBaloons();	   


		Baloon baloon5 = new Baloon("purple");
		Baloon.countBaloons();	   

		baloon3.burst();
		baloon5.burst();
		
		Baloon.countBaloons();	   

		
		
	}
}

class Baloon
{
	String color;
	static int counter;
	
	//static can only access static
	static void countBaloons() {
		System.out.println("Total Baloons : "+counter);
	}
	
	public Baloon(String color) {
		super();
		this.color = color;
		++counter;
	}
	
	void burst() { //non-static --> static
		System.out.println(color+ " color  baloon is burst");
		--counter;
	}
	
}

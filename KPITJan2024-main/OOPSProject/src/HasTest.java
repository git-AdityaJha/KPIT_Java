
public class HasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Human theHuman = new Human();
		//theHuman.thinking();
		//theHuman.feeling();
		//theHuman.sweetHeart.pumping();
		
		Poet thePoet = new Poet("Javed Akhtar");
		
		thePoet.thinking();
		thePoet.feeling();
		thePoet.leftLung.exhale();
		
		Pen reynoldsPen = new Pen();
		Paper whitePaper = new Paper();
		
		String text1 = "Every night in my dreams.....";
		String text2 = "Mard Maratha....hum jo bhi disha me jayee.....";

		
		Poetry thePoetry1 = thePoet.imagine(reynoldsPen, whitePaper,text1,"15 Jan 2024");
		thePoetry1.showPoetry();
		
		Poetry thePoetry2 = thePoet.imagine(reynoldsPen, whitePaper,text2,"19 Jan 2024");
		thePoetry2.showPoetry();
		
		
	/*	Poetry thePoetry = new Poetry();
		thePoetry.creationDate="19th Jan 2024";
		thePoetry.numberOfLines=2;
		thePoetry.poetName="Javed Akhtar";
		thePoetry.theActualPoetry="Mard Maratha...";
		thePoetry.theActualPoetry+="Hum Jo bhi disha me jay...";
		
		thePoetry.showPoetry();
	*/	
		
	}

}


// Knowledge + applied = Wisdom

class Heart
{
	void pumping() {
		System.out.println("Pumping the blood..");
	}
}
class Lung {
	void inhale() {
		System.out.println("inhaling...");
	}
	void exhale() {
		System.out.println("exhaling....");
	}
}

class Human2 {
	
	Heart sweetHeart = new Heart(); //hasA
	
//	sweetHeart.pumping(); illegal line / place
	//System.out.println("exhaling....");

	
	Lung rightLung;
	Lung leftLung;
	
	Human2() {
		System.out.println("Human ctor...");
		
		sweetHeart.pumping();
		rightLung = new Lung();
		leftLung = new Lung();
		
		rightLung.inhale();
		leftLung.inhale();
		
		rightLung.exhale();
		leftLung.exhale();
		
	}
	
	void thinking() {
		System.out.println("Human is thinking...");
	}
	void feeling() {
		System.out.println("Human is feeling....");
	}
}

class Pen
{
	void write() {
		System.out.println("Writing...");
	}
}
class FountainPen extends Pen {//isA
	
}
class SketchPen extends Pen { //isA
	
}

class Paper
{
	String lines;
	
	void read() {
		System.out.println("Lines : "+lines);
	}
}

class Poet extends Human2 //isA
{
	
	String poetName;
	
	Poet(String x) {
		poetName = x;
	}
	
	//producesA		   //usesA Pen	usesA Paper   uses String  uses String
		Poetry imagine(Pen thePen, Paper paper, String text, String dt) {
			
			System.out.println("Peot is imagining.....");
			thePen.write();
			paper.lines=text;
			
			paper.read();
			
			Poetry poem = new Poetry();
			poem.creationDate=dt;
			poem.theActualPoetry=paper.lines;
			poem.numberOfLines=poem.theActualPoetry.length()/15;
			poem.poetName=poetName;
			
			return poem;
		}
}





class Poetry
{
	String creationDate;
	int numberOfLines;
	String poetName;
	String theActualPoetry;
	
	void showPoetry() {
		System.out.println("---- Poetry ---- ");
		System.out.println("Poet  : "+poetName);
		System.out.println("Lines : "+numberOfLines);
		System.out.println("Date  : "+creationDate);
		System.out.println("--- Lines As ---");
		System.out.println(theActualPoetry);
		System.out.println("-----------------");
		
	}
	
}




















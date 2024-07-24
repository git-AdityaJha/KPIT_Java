
public class JuiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Mango mangoObj = new Mango();
		
		mangoObj.setFruitName("MANGO");
		mangoObj.setColor("Yellow");
		mangoObj.setType("Alphanso");
		mangoObj.setRipe(true);
		mangoObj.setWeight(1.5f);
		
		Chickoo chicku = new Chickoo();
		
		chicku.setFruitName("CHICKOO");
		chicku.setColor("Brown");
		chicku.setType("Pahadi");
		chicku.setRipe(true);
		chicku.setWeight(1.5f);
		
		System.out.println("chicku object is "+chicku);

		System.out.println("mango object is "+mangoObj);
		
		Water water = new Water();
		water.setType("Mineral");
		water.setTemperature(23.5f);
		water.setQuantity(100); //in ML
		
		System.out.println("water object is "+water);

		
				
		Ice ice = new Ice();
		ice.setShape("Cube"); 
		ice.setQuantity(3.0f);
		ice.setType("Packaged");
		
		System.out.println("ice object is "+ice);

		
		Sugar sugar = new Sugar();
		sugar.setType("Organic");
		sugar.setColor("Brown");
		sugar.setQuantity(1.0f);//one table spoon
		System.out.println("sugar object is "+sugar);
		

		
		Kitchen theKithen = new Kitchen();
		Juice juice = theKithen.prepareSomething(mangoObj,ice,water,sugar);

	/*	Juice juice = new Juice();
		
		juice.setColor("Red");
		juice.setQuantity(300);
		juice.setTemperature(15.0f);
		juice.setFiltered(true);
		juice.setType("Watermelon");*/
	
		System.out.println("juice : "+juice);
	}

}

class Kitchen {
	
	Juice prepareSomething(Fruit fruit, Ice ice, Water water, Sugar sugar) {
		System.out.println("Preparing something1...");
		Juice juice = new Juice();
		juice.setColor(fruit.getColor());
		juice.setFiltered(true);
		juice.setQuantity(fruit.getWeight()+water.getQuantity()+ice.getQuantity()+sugar.getQuantity());
		juice.setTemperature(water.getTemperature()-ice.getQuantity());
		juice.setType(fruit.getType()+" "+fruit.getFruitName()+" Juice");
		return juice;
	}
	
	MilkShake	prepareSomething(Mango mango, Ice ice, Water water, Sugar sugar,Milk milk) {
		System.out.println("Preparing something2...");
		MilkShake milkShake = new MilkShake();
		return milkShake;
	}
	MilkShake	prepareSomething(Chickoo chiku, Ice ice, Water water, Sugar sugar,Milk milk) {
		System.out.println("Preparing something3...");
		MilkShake milkShake = new MilkShake();
		return milkShake;
	}
}

class Chickoo extends Fruit {

	@Override
	public String toString() {
		return "Chickoo [fruitName=" + fruitName + ", type=" + type + ", weight=" + weight + ", color=" + color
				+ ", ripe=" + ripe + "]";
	}

	
}

class Fruit {
	String fruitName;
	String type;
	float weight;
	String color;
	boolean ripe;
	
	
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isRipe() {
		return ripe;
	}
	public void setRipe(boolean ripe) {
		this.ripe = ripe;
	}
}
class Milk {
	
}
class Orange { 
	
}
class MilkShake {
	
}
class Mango extends Fruit {

	@Override
	public String toString() {
		return "Mango [fruitName=" + fruitName + ", type=" + type + ", weight=" + weight + ", color=" + color
				+ ", ripe=" + ripe + "]";
	} 
	
	
	
	
	
}

class Water {
	String type;
	float quantity;
	float temperature;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}
	
	
}
class Sugar {
	String type; 
	float quantity;
	String color;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Sugar [type=" + type + ", quantity=" + quantity + ", color=" + color + "]";
	}
	
}
class Ice {
	
	String type;
	float quantity;
	String shape;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "Ice [type=" + type + ", quantity=" + quantity + ", shape=" + shape + "]";
	}
	
	
	
	
}

class Juice {
	float quantity; //IN ML
	String type;
	float temperature;
	boolean filtered; //true / false
	String color;
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public boolean isFiltered() {
		return filtered;
	}
	public void setFiltered(boolean filtered) {
		this.filtered = filtered;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Juice [quantity=" + quantity + ", type=" + type + ", temperature=" + temperature + ", filtered="
				+ filtered + ", color=" + color + "]";
	}
	
	
	
	
}






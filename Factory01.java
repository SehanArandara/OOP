package DesignPatterns;

// interface for parent class
interface Pizza{
	void serve();
	
}

class VeggiePizza implements Pizza{
	public void serve() {
		System.out.println("This is a Veggie pizza");
	}
}

class ChickenPizza implements Pizza{
	public void serve() {
		System.out.println("This is a Chicken Pizza");
	}
}

class CheesePizza implements Pizza{
	public void serve() {
		System.out.println("This is a cheese pizza");
	}
}

// factory class -  factory class is the class that create objects of subclasses by using a method
class PizzaFactor{
	public Pizza MakePizza(String msg) {
		// there must be a way to identify what object that we are going to create
		if(msg.equalsIgnoreCase("cheese"))
			return new CheesePizza();
		if(msg.equalsIgnoreCase("chicken"))
			return new ChickenPizza();
		if(msg.equalsIgnoreCase("veggie"))
			return new VeggiePizza();
		else
			return null;
	}
}

public class MyMain {
	
	
	public static void main(String[] args) {
		
		PizzaFactor pf = new PizzaFactor();
		Pizza pizza=pf.MakePizza("veggie");
		pizza.serve();
		
	}
		
}

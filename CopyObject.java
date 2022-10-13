
public class Car {
	private String name;
	private String model;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	Car(String name,String model){
		this.name=name;
		this.model=model;
	}
	public void copy(Car x) {
		this.setModel(x.getModel());
		this.setName(x.getName());
	}
	public static void main(String[] args) {
		Car c1 = new Car("Lancer","mitsibushi");
		Car c2 = new Car("grace","Toyota");
		
		//c1 = c2;   // memory address are equal
		
		c2.copy(c1);    // copy car 01 to car 02   memory address are differ
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		System.out.println("Car 01");
		System.out.println("model :"+c1.getModel());
		System.out.println("name :"+c1.getName());
		
		System.out.println("Car 02");
		System.out.println("model :"+c2.getModel());
		System.out.println("name :"+c2.getName());
	}
}

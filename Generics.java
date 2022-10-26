public class Add<T,S>{
	T no1;
	S name;
	
	Add(T no1,S name){
		this.no1=no1;
		this.name=name;
	}
	
	public T getNum() {
		return no1;
	}
	
	public S getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		Add<Integer,String> obj = new Add<Integer, String>(10, "Sehan");
		
		System.out.println("Name :"+obj.getName());
		System.out.println("Number "+obj.getNum());
		
	}
}
 
// genrice methods
class Class01<A extends Number> {
	A n1;
	A n2;
	
	 <A> void  show(A n1,A n2) {
		 System.out.println("Add");
	}
	
	public static void main(String[] args) {
		Class01<Integer> c1 = new Class01<>();
		
		
		
		c1.show(10, 150);
	}
}

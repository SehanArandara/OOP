public class Main{
	static int findMax(hehe h,hehe2 h2) {
		if(h.num1>=h2.num1) {
			return h.num1;
		}
		else {
			return h2.num1;
		}
	}
	public static void main(String[] args) {
		hehe h = new hehe(5);
		hehe2 h2 = new hehe2(10);
		
		System.out.println("max nm in "+findMax(h,h2));
		
		
		
		
		
	}
}
class hehe {
	int num1 ;
	
	
	hehe(int num1){
		this.num1 = num1;
		
		
	}
}
class hehe2{
	int num1;
	
	
	hehe2(int num1){
		this.num1 = num1;
		
	}
}

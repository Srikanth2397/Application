package SD;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first program success");
		Dell d = new Dell();
		d.copy();
		d.cut();
		d.paste();
		d.keyboard();
		
		Car c = new Car() {
			
			public void drive() {
			// TODO Auto-generated method stub
			System.out.println("Highspeed");

		}};
		c.drive();
		
		Car b =  ()-> {
			// TODO Auto-generated method stub
			System.out.println("Highspeed from lambda");

		};
		b.drive();
	}

}

package SD;

@FunctionalInterface
public interface Car {
	public void drive();
	public default void stop() {
		System.out.println("stop the car!!!");
		
	}
	

}

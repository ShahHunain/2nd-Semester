public class Main{

	public static void main(String[] args) {
		
		run();

	}

	public static void run(){
		try {
			new GUI();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
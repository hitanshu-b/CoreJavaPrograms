package src.oop_concepts;

public class Lab117 {
//	public static void main(String[] args) {
//		System.out.println("Run Fine...");
//	}
	
	// this will also run only the public static void main(String[]) structure matters
	// argument value can be anything
	
	public static void main(String[] hitanshu) {
		System.out.println("Run Fine...");
		
		int d = main(19);
		System.out.println(d);
	}
	
	static void main(String a) {
		System.out.println("JVM doesn't recognize this main function");
	}
	
	static int main(int a) {
		return a + 101;
	}

}

package src.basics_05;

public class Lab078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print the value of i, but I want to break when i = 5");

        for (int i = 1; i <= 10; i++) {
            //  A -> int i = 1
            // B -> i 1 to 10
            // C - i by 1


            if( i ==5){
                break;
            }
            System.out.println("Val of "+ i);
        }

        System.out.println("End");
	}

}

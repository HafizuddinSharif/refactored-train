public class Adder {
	
    public static void main(String[] args) {
		
		int myNumber = Integer.parseInt(args[0]);
		int myNumber2 = Integer.parseInt(args[1]);
		int answer = myNumber + myNumber2;
		
		System.out.println(answer);
	}
}
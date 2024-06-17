
public class FizzBuzz {
	
	public static void fizzbuzz(int max, int i) {
		if (i > max) {
			return;
		}
		System.out.print(i);
		if ((i % 3 ==0 )) {
			System.out.print(" Fizz");
		} 
		if ((i %5 ==0)) {
			System.out.print(" Buzz");
		}
		System.out.print("\n");	
		i = i + 1;
		fizzbuzz(max, i);
	}
	
	public static void main(String[] args) {
		fizzbuzz(30,1);

	}

}

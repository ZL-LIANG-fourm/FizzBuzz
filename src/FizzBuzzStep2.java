
public class FizzBuzzStep2 {
	
	public static void fizzbuzz(int max, int i) {
		if (i > max) {
			return;
		}
		if ((i % 3 ==0 )&& (i %5 ==0)) {
//			System.out.println("FizzBuzz");
			System.out.println(i);
		} else if ((i % 3 ==0 )) {
			System.out.println(i+" Fizz");
			
		} else if ((i %5 ==0)) {
//			System.out.println("Buzz");
			System.out.println(i);
		}else {
			System.out.println(i);
		}
		i = i + 1;
		fizzbuzz(max, i);
	}
	
	public static void main(String[] args) {
		fizzbuzz(30,1);

	}

}

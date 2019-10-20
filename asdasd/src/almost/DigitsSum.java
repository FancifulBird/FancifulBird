package almost;

public class DigitsSum {
	public static void main(String[] args) {
		int FirstSum = 1234;
		int secondSum = 234;
		System.out.println("First " + sumDigits(FirstSum));
		System.out.println("Second " +  sumDigits(secondSum));
		System.out.println("Year " + sumDigits (2018) );  
	}
private static int sumDigits (int number) {
	int sum = 0;
	while (number > 0) {
		sum += number % 10;
		number/= 10;
	}
	return sum;
}
}

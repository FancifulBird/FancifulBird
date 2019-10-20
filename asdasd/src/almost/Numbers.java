package almost;

public class Numbers {
	public static void main(String[] args) {
		System.out.println("palindromisch 1234: " + isPalindrome(1234));
		System.out.println("palindromisch 1221:  " + isPalindrome(1221));
		System.out.println("2334 reversed: " +  reverse(2334));
		System.out.println("127 Primzahl: " + isPrime(127));  
	}
	public static boolean isPalindrome(int number) {
		int reversedNumber = reverse(number);
		return number == reversedNumber;
	}
	public static boolean isPrime(int number) {
		int divider = 2;
		while (divider <= Math.sqrt(number)) {
			if (number % divider == 0){
				return false;
			}
			divider++;
		}
		return true;
	}
	public static int reverse(int number){
		int reversedNumber = 0;
		while (number > 0){
			reversedNumber = (reversedNumber*10) + (number%10);
			number/=10;
			}
		return reversedNumber; 
	}

}

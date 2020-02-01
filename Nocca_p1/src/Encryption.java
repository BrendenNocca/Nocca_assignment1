
public class Encryption {
	public static int pow(int base,int exponent) {
		int number=0;
		int power = base;
		if (exponent == 0) {
			return 1;
		}
		if (exponent ==1) {
			return base;
		}
		for (int j = 1; j<exponent;j++) {
			power = power *base;
		}
		number = power;
		return number;
		
	}
	
public static int[] encryptedNumber(int initialNumber) {
	int [] EncryptedNumber = new int[10];
	int [] InitialDigit = new int[10];
	int addition = 7;
	int divider = 10;
	int TEN = 10;
	String numlength = Integer.toString(initialNumber);
	
	for (int i=0;i<4; i++) {
		InitialDigit[i] = ( initialNumber%(pow(TEN,(i+1))) -  initialNumber%(pow(TEN,(i))) ) /pow(TEN,i);
		EncryptedNumber[i] = (InitialDigit[i] + addition)%divider;
	
	
	}
	return EncryptedNumber;
	
}
}

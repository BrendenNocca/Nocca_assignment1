import java.util.Scanner;

public class main {
	public static int GetInitialNumber() {
		Scanner in = new Scanner(System.in);
		int InitialNumber = 0;
		System.out.print("Please enter a four digit number");
		InitialNumber = in.nextInt();
		
		/*
		String numberlength = Integer.toString(InitialNumber);
		while(numberlength.length() > 4) {
			System.out.print("Number too long, Please enter a four digit number");
			InitialNumber = in.nextInt();
		}
		*/
		return InitialNumber;
	}
	public static void PrintNumber(int[] NumberArray) {
			System.out.print("" +NumberArray[1] +"" + NumberArray[0] +"" +NumberArray[3] +"" +NumberArray[2]);
		
		
		
	}
	public static String encryptOrDecrypt() {
		Scanner sc = new Scanner(System.in);
		String answer;
		System.out.println("Would you like to encrypt or decrypt this number?");
		System.out.printf("Type Encrpyt or Decrypt");
		answer = sc.nextLine();
		answer = answer.toUpperCase();
		
	sc.close();	
	return answer;
	}
	
	
	public static void main(String[] agrs)
	{
		int[] FinalNumber = new int [10];
		int initialNumber = GetInitialNumber();
		String Answer = encryptOrDecrypt();
		if ((Answer.contentEquals("ENCRYPT"))){
			System.out.println("Encrypted");
		FinalNumber = Encryption.encryptedNumber(initialNumber);
		}
		else if ((Answer.equals("DECRYPT"))){
		System.out.println("Decrypted");
		FinalNumber = Decryption.decryptedNumber(initialNumber);
		}
		PrintNumber(FinalNumber);
		
		
	}
}

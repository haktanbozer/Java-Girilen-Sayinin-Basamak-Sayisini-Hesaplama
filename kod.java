public class Ders {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int val;
		System.out.print("Pozitif bir sayı giriniz :");
		val = Integer.parseInt(scan.nextLine());
		int digitsCount = 0;
		int temp = val;

		do
		{
		digitsCount++;
		temp = 10;
		}

		while (temp != 0);
		System.out.printf("%d sayisi %d basamaklidir",val,digitsCount);
		System.out.println("Program sonu");
		}
		}

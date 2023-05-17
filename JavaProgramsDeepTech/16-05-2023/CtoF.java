import java.util.Scanner;
//Convert input temperature from Celsius to Fahrenheit(F=T*1.8+32)
class CtoF{
	public static void main(String args[]){
		int F,T;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temp : ");
		T = sc.nextInt();
		System.out.println("CtoF : "+(T * 1.8 + 32));
	}
}
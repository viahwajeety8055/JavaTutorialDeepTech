import java.util.Scanner;
//Create a program that reads the length and width of a farmer’s field from the user in feet. 
class Farmer{
	public static void main(String args[]){
		int length,width;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in feet : ");
		length = sc.nextInt();
		System.out.println("Enter the width in feet : ");
		width = sc.nextInt();
		System.out.println("The length of farmers field is "+length+"ft and width is "+width+"ft");
	}
}
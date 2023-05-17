/*An online retailer sells two products: widgets and gizmos. Each widget     weighs 75 grams. Each gizmo weighs 112 grams. Write a program that reads the number of widgets and the number of gizmos in an order from the user. Then your program should compute and display the total weight of the order*/
import java.util.Scanner;
class OnlineRetail{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int widgetsWeig = 75;
		int gizmosWeig = 112;
		System.out.println("Enter the number of widget : ");
		int num_w  = sc.nextInt();
		System.out.println("Enter the number of gizmos : ");
		int num_g = sc.nextInt();
		System.out.println("Total weight of widget : "+num_w * widgetsWeig);
		System.out.println("Total weight of widget : "+num_g * gizmosWeig);
	}
}
	
	
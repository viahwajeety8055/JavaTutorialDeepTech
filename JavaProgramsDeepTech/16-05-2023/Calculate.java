//Write a program to find area square , rectangle, triangle
import java.util.Scanner;
class Calculate{
	public static void main(String args[]){
		int w,l,h,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Width : ");
		w = sc.nextInt();
		System.out.println("Enter Length : ");
		l = sc.nextInt();
		System.out.println("Enter Height : ");
		h = sc.nextInt();
		System.out.println("Enter Breadth : ");
		b = sc.nextInt();
		System.out.println("Area of Triangle : " + (0.5 * b * h));
		System.out.println("Area of Rectangle : " + (w * h));
		System.out.println("Area of Square : " + (l * b));
	}
}
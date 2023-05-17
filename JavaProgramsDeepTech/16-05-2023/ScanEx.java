import java.util.Scanner;
class ScanEx{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		System.out.println("Name : "+name+"\nAge : "+age+"\nSalary : "+salary);
	}
}
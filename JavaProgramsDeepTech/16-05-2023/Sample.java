class Sample{
	public static void main(String args[]){
		int a = 5;
		int b = 10;
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("Using three variable : a = "+a+" b = "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Using two variable by one method plus and minus : a = "+a+" b = "+b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Using two variable by second method multiplication and division : a = "+a+" b = "+b);
	}
}
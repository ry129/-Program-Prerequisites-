import java.util.Scanner;
class simple{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pricipal:");
		int p=sc.nextInt();
		System.out.println("Enter Rate:");
		int r=sc.nextInt();
		System.out.println("Enter Time:");
		int t=sc.nextInt();
		System.out.println((p*r*t)/100);
	}
}
	
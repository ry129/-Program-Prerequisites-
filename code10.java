import java.util.Scanner;
class convert{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double km=sc.nextDouble();
		double Miles = (km * 0.621371);
		System.out.println(Miles);
	}
}
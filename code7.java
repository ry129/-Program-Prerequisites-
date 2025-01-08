import java.util.Scanner ;
class Power {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		double base=sc.nextDouble();
		System.out.println("Enter Exponent");
		double expo=sc.nextDouble();
		double res = Math.pow(base , expo);
		System.out.println(res);
	}
}
		
		
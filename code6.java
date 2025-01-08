import java.util.Scanner;
class perimeter {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		double len =sc.nextDouble();
		System.out.println("Enter width:");
		double width=sc.nextDouble();
		double per = (2*(len+width));
		System.out.println("perimeter is:"+per);
		
	}
}
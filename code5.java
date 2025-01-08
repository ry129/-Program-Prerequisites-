import java.util.Scanner;
class cyclinder{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		double rad=sc.nextDouble();
		int height=sc.nextInt();
		double pi = 3.14;
		double vol=(pi * rad*rad * height);
		System.out.println(vol);
	}
}
		
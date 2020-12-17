import java.util.*;
abstract class shape
{
	abstract int area();
}
class circle extends shape
{
	int area()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the radius of circle");
		int r= sc.nextInt();
		int a= r*r*3;
		System.out.print("the area of circle is: ");
		return a;
	}
}
class square extends shape
{
	int area()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the side of square");
		int s= sc.nextInt();
		int a1=s*s;
		System.out.print("the area of square is:");
		return a1;
	}
}
class Areaa
{
	public static void main(String[] args) {
		shape object1 = new circle();
		System.out.println(object1.area());
		shape object2 = new square();
		System.out.println(object2.area());
	}
}
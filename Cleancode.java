package cleancode;
import java.util.Scanner;
public class Cleancode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double principal,rate,res1,res2;
		double res3;
		String materialstandard;
		int squarefeet;
		int time,compounded;
		CalculateInterest ci = new CalculateInterest();
		Calculatecost     cc=  new Calculatecost();
		System.out.println("enter principal");
		principal=s.nextDouble();
		System.out.println("enter duration");
		time=s.nextInt();
		System.out.println("enter rate of interest");
		rate=s.nextDouble();
		System.out.println("enter no of years for compounding");
		compounded=s.nextInt();
		System.out.println("enter material standard from the following");
		System.out.println("1.standardmaterial\n2.abovestandardmaterial\n3.highstandardmaterial\n4.highstandardmaterial_and_fullyautomatedhome");
		materialstandard=s.next();
		System.out.println("enter squarefeet");
		squarefeet=s.nextInt();
		res1=ci.simpleinterest(principal, rate, time);
		res2=ci.compoundinterest(principal, rate, time, compounded);
		res3=cc.constructioncost(materialstandard,squarefeet);
		System.out.println("simple interest:"+res1);
		System.out.println("compound interest:"+res2);
		System.out.println("constructioncost:"+res3);

	}
}

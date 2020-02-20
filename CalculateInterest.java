package cleancode;
public class CalculateInterest {
	public double simpleinterest(double principal,double rate,int time) {
 
		 double amount;
		 amount=principal*time*rate/100;
		return amount;
	}
	public double compoundinterest(double principal,double rate,int time,int compounded) {
		 
		 double amount;
		 
	       amount = principal* Math.pow(1 + (rate /compounded), compounded * time);

		return amount;
	}


}

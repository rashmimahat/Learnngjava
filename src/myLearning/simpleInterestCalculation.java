package myLearning;

public class simpleInterestCalculation {

	public static void main(String[] args) {
		//calculateSI();
		simpleInterestCalculation obj = new simpleInterestCalculation();
		obj.calculateSI();

	}
	
	public void calculateSI() {
		
		double principal = 2500.0, time = 3.5, rateOfInterest = 5.0, simpleInterest = 0;
		simpleInterest = (principal*time*rateOfInterest)/100;
		System.out.println(simpleInterest);
		
		
	}

}

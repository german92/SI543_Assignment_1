package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	public void subtract(double d){
	// TODO subtracts d from current number
		currentNumber = currentNumber - d;
	}
	
	public void multiply(double d) {
	// TODO multiplies current number by d
	  currentNumber = currentNumber * d;
	}

	public  void divide(double d){
	// TODO divides current number by a given number
	  currentNumber = currentNumber / d;
	}

	public void clear(){
	// TODO sets current number to 0
	  currentNumber = 0;
	}

	public void power(double d) {
	// TODO raises current number to the power of a given number
	  double tempNum = currentNumber;
	  while (d > 1) {
	    currentNumber = currentNumber * tempNum;
	    d = d - 1;
	  }
	}
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// TODO returns true is current number is even, false otherwise
	
	// isPrime()
	// TODO returns true if current number is a prime number, false otherwise
	
	////////////////////////////////////////////////////
	
}

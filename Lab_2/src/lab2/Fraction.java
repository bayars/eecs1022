package lab2;

/**
 * This class represent fraction of two integer values
 * A fraction consists of two integers, one for numerator 
 *   and one for denominator.  An example fraction is 1/5.
 *   
 *   Note: A valid fraction must not have zero in the denominator.
 *   No need to simplify or reduce the fraction value  * 
 *
 */
public class Fraction {

	private int denominator;
	private int numerator;
	

	/* To be able to complete this Class, you need to read  the API of this class
	 * 
	 * Hint: Use the WatchTest class to help you test you work  
	 * 
	 * */
	
	
	Fraction(){
		 denominator = 1;
		 numerator = 0;
	}
	
	Fraction(int numerator, int denominator){
		this.denominator = denominator;
		this.numerator = numerator;
	}

	public void setDenominator(int i) {
		// TODO Auto-generated method stub
		this.denominator = i;
	}

	public int getDenominator() {
		// TODO Auto-generated method stub
		return this.denominator;
	}

	public int getNumerator() {
		// TODO Auto-generated method stub
		return this.numerator;
	}

	public double getAbsValue() {
		// TODO Auto-generated method stub
		return (double)this.numerator/(double)this.denominator;
	}

	public void setNumerator(int i) {
		// TODO Auto-generated method stub
		this.numerator = i;
	}

	public void setFraction(int i, int j) {
		// TODO Auto-generated method stub
		this.denominator = j;
		this.numerator = i;
		
	}

    public void addFraction(Fraction b) {  
    	this.numerator = this.numerator*b.denominator + b.numerator*this.denominator;
    	this.denominator = denominator * b.denominator;
  
    }
    
    public String toString() {
		return "Fraction ("+numerator+" / "+denominator+")";
    	
    }
    
}

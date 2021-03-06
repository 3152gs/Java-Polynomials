package MyPolyPackage;

public class Term {
	
	private int Coefficient;
	private int Exponent;
	
	public Term(int coefficient, int exponent){
	
		this.Coefficient = coefficient;
		this.Exponent = exponent;
	}
	
	public int getCoefficient(){
		return Coefficient;
	}

	public int  getExponent(){
		return Exponent;
	}
	
	public String toString(){
		
		String polynomial_term;
		polynomial_term = Integer.toString(Coefficient)+"x^"+Integer.toString(Exponent);
		return polynomial_term;
	}

}


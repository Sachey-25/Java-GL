package ExceptionHandlingIntro;

class InvalidProductException extends Exception{
	
	//Method
	public InvalidProductException(String s) {
		/*Constructor of parent Exception */
		super(s);
	}
}

public class AnotherExampleCustomException {
	// method
	void productCheck(int weight) throws InvalidProductException {
		if(weight<100) {
			throw new InvalidProductException("Product invalid");
		}
	}

	public static void main(String[] args) {
		AnotherExampleCustomException object=new AnotherExampleCustomException();
		try {
			object.productCheck(80);
		}catch(InvalidProductException exp) {
			System.out.println("Caught the Exception");
			System.out.println(exp.getMessage());
		}

	}
}
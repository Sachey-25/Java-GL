package Java8programming;

interface Greetings{
	public String say();
}

public class Lambdaexpressionimpl {

	public static void main(String[] args) {
		//Lambda implementation -- Overridden
		Greetings object=()->{
			return "Good Evening Every one My name is Lambda";
		};
		System.out.println(object.say());
	}
}
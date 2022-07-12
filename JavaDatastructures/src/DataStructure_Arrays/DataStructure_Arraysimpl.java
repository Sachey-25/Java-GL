package DataStructure_Arrays;

class TestRunArray{
	//Returning array from the method
	//Creating a method which return an array
	static int[] getArray() {
		return new int[] {10,20,40,60,70};
		}
	
}
public class DataStructure_Arraysimpl {

	public static void main(String[] args) {
		
		//class and object --- object to the array for the best practice
		//Array representation
		//<Return type> {Name of the array}[]=new <Return type> [Size]
		
		int arr[]=new int[5];
		//Initialization -----> array's are also works on index places
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//traverse through the array
		for(int display:arr) {
			System.out.println("Elements of the array:" + display);
		}
		System.out.println("======================================");		
		//We declare, instantiation and initialization of Java Array
		int data[]={5,6,77,89,100,90};
		//print the array
		for(int i=0;i<data.length;i++) {
			System.out.println("Elements of the array : " + data[i]);
		}
		//calling a method which return an array 
		int areturn[]=getArray();
		
		for(int i=0;i<areturn.length;i++) {
			System.out.println(areturn[i]);
		}
		
	}
	private static int[] getArray() {
		return new int[] {10,20,40,60,70};
	}
}

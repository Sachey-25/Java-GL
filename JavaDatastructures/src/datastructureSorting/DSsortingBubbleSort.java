package datastructureSorting;

class Bubblesort{
	//Method to print array elements
	public void printElements(int array[]) {
		
		int totalLength=array.length;
		
		for(int elem=0; elem<totalLength; elem++) {
			System.out.print(array[elem] + " ");
		}
	}
	// Method to implement the bubble sort
	public void bubblesort(int array[]) {
		int totalLength=array.length;
		int temp;
		for(int i=0; i<totalLength; i++) {
			for(int j=i+1; j<totalLength;j++) {
				if(array[j]<array[i]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;					
				}
			}
		}
	}
}

public class DSsortingBubbleSort {

	public static void main(String[] args) {
		int array[]= {10,8,6,4,2,0};
		
		//Create an object to the class to access the methods
		Bubblesort sort=new Bubblesort();
		System.out.println("Before sorting the elements are: ");
		sort.printElements(array);
		
		sort.bubblesort(array);
		System.out.println();
		System.out.println("After sorting the elements are: ");
		sort.printElements(array);

	}
}
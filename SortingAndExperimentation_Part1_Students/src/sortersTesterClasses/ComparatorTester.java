package sortersTesterClasses;
import sorterClasses.BubbleSortSorter;;
public class ComparatorTester {
	
public static void main(String[] args){ 
	Integer[] arr= {5, 9, 20, 22, 20, 5, 4,13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
	BubbleSortSorter<Integer> sorter = new BubbleSortSorter<>();
	System.out.println("Original Array");
     print(arr);
	
     //Sort in increasing order
	IntegerComparator1 cmp= new IntegerComparator1();
	sorter.sort(arr, cmp);
	System.out.println("Increasing Order");
	print(arr);
	//Sort in decreasing order.
	IntegerComparator2 cmp2= new IntegerComparator2();
	sorter.sort(arr, cmp2);
	System.out.println("Decreasing Order");
	print(arr);
}


public static void print(Integer[] arr){
	for (int i=0; i<arr.length; i++) 
		System.out.print("\t" + arr[i]); 
	System.out.println();
	
}
}

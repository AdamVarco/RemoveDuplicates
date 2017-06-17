package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @Adam Varco
 * The method removes all the duplicates from a given int array
 */
public class RemoveDuplicates {
	
	public int[] removeDuplicatices(int [] index){
		// the array is first sorted
		 Arrays.sort(index);
		 Set<Integer> set = new HashSet<Integer>();
		 for(Integer i: index){
			 //then all the elements of the array are added to a set to get rid of duplicate values
			 set.add(i);
		 }
		 // the set is converted to an Integer Array
		 Integer [] newArr = set.toArray(new Integer[set.size()]);
		 //The integer array is converted to an int array
		 int[] intArray = Arrays.stream(newArr).mapToInt(Integer::intValue).toArray();
		 //the int array is returned. 
		return intArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates frank = new RemoveDuplicates();
		int [] test = {1,3,3,4,4,5};
		
		System.out.println(Arrays.toString(frank.removeDuplicatices(test)));

	}

}

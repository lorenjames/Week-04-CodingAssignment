package week04CodingAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Week04_CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Coding Step 1:");
		//New array called "ages" initialized and assigned elements.
		int[] ages = {3,9,23,64,2,8,28,93}; 
		
		//Subtracting the last array element from the first array element and printing the result to console.
		System.out.print("The sum of the last age in the array subtracted from the first is: ");
		System.out.println(ages[0] - ages[ages.length-1]); 
		
		//New array called "ages2" initialized with 9 elements added.
		int[] ages2 = {5,6,12,36,45,3,4,88,73}; 
		
		//Subtracting the last array element from the first array element to show how usage of index values is dynamic.
		System.out.print("The sum of the last age in the second array subtracted from the first is: ");
		System.out.println(ages2[0] - ages2[ages2.length-1]);
		
		//looping through array "ages" and calculating average age.
		int sum = 0; //new int initialized to store sum of age values throughout the loop.
		for (int age : ages) { //for each age value in the array "ages"
			sum += age;	//add age value to the int "sum"
		}
		
		int result = (sum / ages.length); //dividing total sum of ages in the array by the count of ages in the array.
		
		System.out.print("The average age in the first array is: ");
		System.out.println(result); //prints the average value
		
		System.out.println();
		System.out.println("---Coding Step 2:");
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"}; //New array called "names" initialized and values added.
		
		double avgSum = 0; //initialize double object to store sum of letter count.
		for (String name : names) { //for each name in the array "names"
			avgSum += name.length(); //add name character count to the double object "avgSum"
		}
		
		double resultNum = (avgSum / names.length); //calculate the average length of names.
		
		System.out.print("The average number of letters per name is: ");
		System.out.println(resultNum);
		
		String nameConcat = ""; //initialize string to store concatenated names 
		
		for (String name : names) { //for each name in the array "names"
			nameConcat = nameConcat + " " + name; //concatenate name + space to the string value "nameConcat"
		}
		
		System.out.print("All names in the array concatenated together looks like: ");
		System.out.println(nameConcat);
		
		System.out.println();
		System.out.println("---Coding Step 3:");
		System.out.println("You can access the last element in any array by using the index value and taking the length of the array and subtract 1.");
		System.out.println("The Last element in the array called names is: " + names[names.length-1]); //printing last element of the array "names" by using the total length minus 1 to return index value.
		
		System.out.println();
		System.out.println("---Coding Step 4:");
		System.out.println("You can access the first element in any array by using the index value of 0.");
		System.out.println("The first element in the array called names is: " + names[0]); //printing the first element of the array "names" by using an index value of 0.
		
		System.out.println();
		System.out.println("---Coding Step 5:");
		
		int[] nameLengths = new int[names.length]; //initialize new array "nameLengths" with the same length as length of the "names" array.
		
		for (int i = 0; i < names.length; i++) { //iterate over the "names" array
			nameLengths[i] = names[i].length(); //set the element value in "nameLengths" as the size of the corresponding name in "names"
			
		}
		
		System.out.print("The new array with lengths of the names in the array called names is: ");
		System.out.println(Arrays.toString(nameLengths));
		
		System.out.println();
		System.out.println("---Coding Step 6:");
		
		int sumResult = 0; //initialize int object to store sum value. 
		for (int length : nameLengths) { //for int values in the array "nameLengths"
			sumResult += length; //Add value of each element in "nameLengths" array to "sumResult"
		}
		
		System.out.print("The sum of all the elements in the array called nameLengths is: ");
		System.out.println(sumResult);
		
		System.out.println();
		System.out.println("---Coding Step 7:");
		
		System.out.print("The result of the method is: ");
		System.out.println(concatValues("Hello",3)); //call method "concatValues" and pass a string and an integer as parameters and print result
		
		System.out.println();
		System.out.println("---Coding Step 8:");
		System.out.print("The Full Name resulting in calling the method called fullName is: ");
		System.out.println(fullName("Loren","Craig-Mohebali"));//call method "fullName" and print result
		
		System.out.println();
		System.out.println("---Coding Step 9:");
		
		int[] numberArray = {1,5,9,10,3,12,100}; //initialize new int array with elements
		
		System.out.print("Is the sum of all elements in the array more than 100? ");
		System.out.println(greaterThanOneHundred(numberArray)); //call method greaterThanOneHundred and print result
		
		System.out.println();
		System.out.println("---Coding step 10");
		
		double[] doubleArray = {0.3,5.8,1.23,8.6,9,3.26,4.8}; //initialize new double array with elements
		
		System.out.print("The average of doubles in the array called doubleArray is: ");
		System.out.println(averageOfValues(doubleArray)); //call method averageOfValues and print result
		
		System.out.println();
		System.out.println("---Coding step 11:");
		
		double[] array1 = {1.2,2.5,0.6,10,50.568}; //initialize new double array and assign values to elements
		double[] array2 = {0.125,1,5.6,9}; //initialize second double array and assign values to elements
		
		System.out.print("The sum of the first array is greater than the sum of the second array: ");
		System.out.println(compareTwoArrays(array1,array2)); //call method compareTwoArrays and print result
		
		System.out.println();
		System.out.println("---Coding step 12:");
		
		boolean isHotOutside = true; //initialize boolean object for isHotOutside
		double moneyInPocket = 19.46; //initialize double object for moneyInPocket
		
		System.out.print("You will be buying a drink: ");
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket)); //call method willBuyDrink and pass isHotOutside and moneyInPocket as variables
		
		System.out.println();
		System.out.println("---Coding step 13:");
		
		Scanner s = new Scanner(System.in); //initialize scanner input
		System.out.println("--- Kitchen Conversion Calculator ---");
		System.out.print("Enter how many tablespoons you would like to convert: ");
		
		double tbsp = s.nextDouble(); //allow for user input after request is printed
		kitchenConversion(tbsp); //call method to produce kitchen conversion calculator
		

	}
	
	//Method for coding step 13
	public static void kitchenConversion(double tbsp) { //create method that returns nothing and accepts a double parameter
		
		System.out.println();
		
		List<String> result = new ArrayList<String>(); //initialize new string list to store result values
			
		result.add("There are " + tbsp * 3 + " teaspoons in " + tbsp + " tablespoons."  ); //add list element with a value of the calculation of teaspoons in given tablespoons
		result.add("There are " + (tbsp / 16) + " cups in " + tbsp + " tablespoons."); //add list element with a value of the calculation of cups in given tablespoons
		result.add("There are " + Math.ceil(tbsp * 14.786765)  + " millileters in " + tbsp + " tablespoons."); //add list element with a value of the calculation of milliliters in given tablespoons
		
		if (tbsp > 50.0) { //check to see if input is over 50
			System.out.println("Now that is just ridiculous!!! What are you making??!!"); //print statement rather than chart
		} else {
			
			for (String item : result) { //iterate through list elements
				System.out.println(item); //print each list item
			}
			
		}
		
		
	}
	
	//Method for coding step 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { //create method that returns a boolean and accepts a boolean and double as parameters
		
		boolean result = (isHotOutside = true && moneyInPocket > 10.50); //initialize boolean object to store value. Value is true if isHotOutside = true and moneyInPocket > 10.50
		
		return result; //return boolean result
		
	}
	
	//Method for coding step 11
	public static boolean compareTwoArrays(double[] array1, double[] array2) { //create method that returns a boolean and accepts two double arrays as parameters
		
		double sumArray1 = 0; //initialize double object to store sum of elements in the first array
		double sumArray2 = 0; //initialize double object to store sum of elements in the second array
		
		for (double value : array1) { //iterate over the first array
			sumArray1 += value; //add values of elements together
		}
		
		sumArray1 = (sumArray1 / array1.length); //assign the average value to sumArray1 for the first array

		
		for (double value : array2) { //iterate over the second array
			sumArray2 += value; //add values of elements together
		}
		
		sumArray2 = (sumArray2 / array2.length); //assign the average value to sumArray2 for the second array

		
		return (sumArray1 > sumArray2); //return a boolean value that checks if the average of the first array is greater than the average of the second array
		
	}
	
	//Method for coding step 10
	public static double averageOfValues(double[] array) { //create method that returns double value and accepts a double array as a parameter
		
		double avgValue = 0; //initialize double object to store sum value of array parameters
		
		for (double value : array) { //iterate over all elements in array passed as parameter
			avgValue += value; //add array element to the double object avgValue
		}
		
		return (avgValue / array.length); //return sum of array elements divided by number of array elements for average value
	}
	
	//Method for coding step 9
	public static boolean greaterThanOneHundred(int[] array) { //create method that returns boolean value and accepts an int array as a parameter
		
		int numSum = 0; //initialize int object to store sum value
		
		for (int nums : array) { //iterate over all elements in array
			numSum += nums; //add element values to the int object "numSum"
		}
		
		return (numSum > 100); //returns true or false if the total sum in "numSum" is over 100
	}
	
	
	
	//Method for coding step 8
	public static String fullName(String first, String last) { //create method to take two strings
		
		String fullName = first + " " + last; //concatenate both string parameters with a space between
		
		return fullName; //return string with Full Name value
	}
	
	//Method for coding step 7
	public static String concatValues(String word, int n) { //create method to take a string and an integer
		
		String result = ""; //initialize a String object to hold the concatenated value
		
		for (int i = 0; i < n; i++) { //iterate as many times as the integer parameter "n"
			result += word; //add the String "word" to itself
		}
		
		return result; //return concatenated value
	}

}

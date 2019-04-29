import java.util.Arrays;
import java.util.Scanner;

public class Sort {


public static void main(String[] args){

    int[] values = readArray(5);
    displayArray(values);
    System.out.println("----------------sort------------------");
    values = sortArray(values);
    displayArray(values);





}
public static int[] sortArray(int[] array){
//    int max = Integer.MIN_VALUE;
//   int sort[] = new int[array.length];
//
//   for (int i=0; i<array.length; i++){
//
//       sort[i] = array[i];
//   }
int sort[] = Arrays.copyOf(array, array.length);


   boolean flag = true;
   int temp;
   while(flag){

       flag = false;
       for (int i=0; i<sort.length-1; i++){

           if (sort[i]<sort[i+1]){
               temp = sort[i+1]; // swap it
               sort [i+1] = sort [i];
               sort [i] = temp;
               flag = true;
           }
       }




   }

    return sort;
}


public static int[] readArray(int numbers){
    int [] read = new int[numbers];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter 5 integers");
    for (int i =0; i<numbers; i++){
        read[i]=scanner.nextInt();
    }
    scanner.close();
    return read;
}

public static void displayArray(int [] array){
   for (int i=0; i<array.length; i++){
       System.out.println("Print out index " + i + " the value is " + array[i]);
   }


}






}



// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
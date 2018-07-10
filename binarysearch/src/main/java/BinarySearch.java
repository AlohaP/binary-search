import java.util.ArrayList;

class BinarySearch {

    boolean binarySearch(int[] array, int valueToFind){
        int arrayLength = array.length;
        int lowerBound = 1;
        int upperBound = arrayLength;
        boolean isFound = false;
        while(!isFound){
            if(upperBound < lowerBound){ 
                System.out.println("Searched number doesnt exist in array");
                break;
            }

            int midPoint = lowerBound + (upperBound - lowerBound) / 2;  //We determine half of the array

            if(array[midPoint] < valueToFind){
                lowerBound = midPoint + 1;  // we set lowerBound to new lowest number in the array ie  right to previous mid point
            }

            if(array[midPoint] > valueToFind){
                upperBound = midPoint - 1; // we set upperBound to new highest number ie the one to the left of previous mid point
            }

            if(array[midPoint] == valueToFind){
                System.out.println("Value found at index number " + midPoint);
                isFound = true;
            }
        }
        return isFound;
    }
}

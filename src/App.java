// Create an ArrayList of Integers
// Fill each of the 10 slots with a random value from 1-50.
// Display those values on the screen, and then prompt the user for an integer.
// Search through the ArrayList, and if the item is present, print a message that the number is in the list.
// If the value is not in the ArrayList, print a message that the number is not in the list

//Question 1:

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);        
        Random random = new Random();

        ArrayList <Integer> listOfNumbers = new ArrayList<>(10);
            
        for(int i = 0; i<=10;i++){
            listOfNumbers.add(random.nextInt(50));
        } 
        System.out.println("Array List: " + listOfNumbers);

        System.out.println("Input number to Search: ");
        int numberSearch = scan.nextInt();

        if(listOfNumbers.contains(numberSearch)) {
            System.out.println("The number is in the list!");
        } else {
            System.out.println("The number is not in the list!");
        }
        scan.close();
    }
}

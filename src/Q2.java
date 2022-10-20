
    // Create an ArrayList of Integers
    // Fill the ArrayList with ten random numbers (1-50)
    // Copy each value from the ArrayList into another ArrayList of the same capacity
    // Change the last value in the first (original) ArrayList to a -5
    // Display the contents of both ArrayLists

        // Question 2

        import java.util.ArrayList;
        import java.util.Random;
        import java.util.Scanner;
        
        class Q2 {

            public static void main(String[] args) {
                ArrayList <Integer> listOfNumbers = new ArrayList<>();
            
                Scanner scan = new Scanner(System.in);
                Random random = new Random();
        
                for(int i = 0; i <=10; i++){
                    listOfNumbers.add(random.nextInt(50));
                }
                System.out.println("List 1: " + listOfNumbers + " (before)");

                ArrayList <Integer> listOfNumbers2 = new ArrayList<>();
                listOfNumbers2.addAll(listOfNumbers);
                System.out.println("List 2: " +listOfNumbers2);

                System.out.println("<===========================================>");

                listOfNumbers.set(0, -5);
                System.out.println("List 1: " + listOfNumbers + " Change Index 0 to -5 (after)");
                System.out.println("List 2: " +listOfNumbers2);

                scan.close();
            }
            
        }
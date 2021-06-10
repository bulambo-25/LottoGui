
package za.ac.cput;

/**
 *
 * @author HP
 */
public class GenerateNumbers
{
     public static int numbers[] = new int[6];

    // Homework: this method below stores six unique lotto numbers in the array 'numbers'
    public static void populateValues() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 15 + 1);
        }
    }
}

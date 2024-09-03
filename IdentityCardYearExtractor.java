/**
 * IdentityCardYearExtractor is a class that provides functionality to extract
 * the year from an 11-digit identity card number.
 */
public class IdentityCardYearExtractor {

    /**
     * Extracts the year from the given 11-digit identity card number.
     * 
     * @param identityCardNumber A positive integer with exactly 11 digits where
     *                           the most significant digit is not 0.
     * @return The extracted year as a two-digit integer.
     * @throws IllegalArgumentException if the input number does not meet the
     *                                  requirements (not exactly 11 digits).
     */
    public static int extractYear(long identityCardNumber) {
        // Convert the input number to a string
        String cardNumberStr = Long.toString(identityCardNumber);

        // Check if the number has exactly 11 digits
        if (cardNumberStr.length() != 11) {
            throw new IllegalArgumentException("The identity card number must be exactly 11 digits.");
        }

        // Extract the first two digits which represent the year
        String yearStr = cardNumberStr.substring(0, 2);

        // Convert the extracted substring to an integer
        return Integer.parseInt(yearStr);
    }

    /**
     * Main method to test the functionality of the extractYear method.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Test example
        long testCardNumber = 86021912345L;
        try {
            int year = extractYear(testCardNumber);
            System.out.println("The extracted year is: " + year);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
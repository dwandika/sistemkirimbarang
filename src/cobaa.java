

public class cobaa {
    public static int countSheep(Boolean[] arrayOfSheep) {
        int count = 0;
        for (Boolean isPresent : arrayOfSheep) {
            if (isPresent != null && isPresent) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        Boolean[] arrayOfSheep = {true, true, false, true, false, true, true};
        int sheepCount = countSheep(arrayOfSheep);
        System.out.println("Number of sheep present: " + sheepCount); // Output: Number of sheep present: 5
    }
}

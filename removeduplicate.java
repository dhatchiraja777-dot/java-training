public class removeduplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    System.out.println("Duplicate found: " + arr[i]);
                    break;
                }
            }
        }

        if (!duplicate) {
            System.out.println("No duplicates found");
        }
    }
}
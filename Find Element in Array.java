public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 3;
        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }
        System.out.println("Element found: " + found);
    }
}

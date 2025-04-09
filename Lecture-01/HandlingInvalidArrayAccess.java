public class HandlingInvalidArrayAccess {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        try {
            System.out.println(nums[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error : Invalid  Access");
        } finally {
            System.out.println("This will always excute!");
        }

    }
}

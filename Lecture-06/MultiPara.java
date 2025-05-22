interface Sumable {
    void sum(int num1, int num2);
}

public class MultiPara {
    public static void main(String[] args) {
        String str = "The sum of the number is equal to";
        Sumable sumable = (num1, num2) -> {
            int sumTask = num1 + num2;
            System.out.println(str + " : " + sumTask);

        };
        sumable.sum(23, 32);
    }
}

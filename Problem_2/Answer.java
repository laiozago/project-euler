public class Answer {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int sum;
        int evenSum = 2;

        while (num1 + num2 < 4000000) {
            sum = num1 + num2;
            if (sum % 2 == 0) {
                evenSum += sum;
            }
            num1 = num2;
            num2 = sum;
        }

        System.out.println(evenSum);
    }
}

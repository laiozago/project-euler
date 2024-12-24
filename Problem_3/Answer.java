public class Answer {
    long BiggestFactor(long n) {
        long i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                n /= i;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Answer answer = new Answer();
        System.out.println(answer.BiggestFactor(600851475143L));
    }
}

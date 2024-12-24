public class Answer {
    static boolean isPalindrome(int product) {
        String productString = Integer.toString(product);
        int length = productString.length();
        for (int i = 0; i < length / 2; i++) {
            if (productString.charAt(i) != productString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int maxPalindrome = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int product = i * j;
                if (isPalindrome(product) && product > maxPalindrome) {
                    maxPalindrome = product;
                }
            }
        }

        System.out.println(maxPalindrome);
    }
}

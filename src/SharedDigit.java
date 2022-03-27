public class SharedDigit {
    public static boolean hasSharedDigit(int arg1, int arg2) {
        if(arg1 < 10 || arg1 > 99 || arg2 < 10 || arg2 > 99) {
            return false;
        }

        int digit1, digit2;
        int tempArg2;

        while (arg1 != 0) {
            digit1 = arg1 % 10;
            tempArg2 = arg2;

            while (tempArg2 != 0) {
                digit2 = tempArg2 % 10;
                if(digit1 == digit2) {
                    return true;
                }
                tempArg2 /= 10;
            }

            arg1 /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(1, 22));
        System.out.println(hasSharedDigit(10, 22));
        System.out.println(hasSharedDigit(10, 21));
        System.out.println(hasSharedDigit(54, 45));
        System.out.println(hasSharedDigit(20, 100));
        System.out.println(hasSharedDigit(20, 90));

    }
}

public class TeenNumberChecker {

    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
        boolean hasTeenValue = false;

        if ((firstValue >= 13 && firstValue <= 19) ||
                (secondValue >= 13 && secondValue <= 19) ||
                (thirdValue >= 13 && thirdValue <= 19)) {
            hasTeenValue = true;
        }

        return hasTeenValue;
    }

    public static boolean isTeen(int firstValue) {
        boolean isTeenValue = false;

        if ((firstValue >= 13 && firstValue <= 19) ) {
            isTeenValue = true;
        }

        return isTeenValue;
    }

}

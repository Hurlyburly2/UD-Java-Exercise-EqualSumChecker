public class EqualSumChecker {
    public static boolean hasEqualSum(int numberOne, int numberTwo, int checkSum) {
        if (numberOne + numberTwo == checkSum) {
            return true;
        } else {
            return false;
        }
    }
}

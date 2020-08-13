public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);
    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        if (number < 0) {
            System.out.println("negative");
        }
        if (number == 0) {
            System.out.println("zero");
        }
    }
}


The prompt was if checkNumber was >0 print positive, if it was <0 print negative, if it was =0 print zero

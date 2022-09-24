public class Main {

    public static void main(String[] args) {
        int number = 6;
        int result = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;


            }
        }
        if (result == number) {
            System.out.println(result + "Mükemmel bir sayıdır");
        } else {
            System.out.println(number + " Mükemmel sayı değildir. ");
        }
    }
}

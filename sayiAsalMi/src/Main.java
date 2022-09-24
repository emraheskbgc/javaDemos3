import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int number = input.nextInt();
        boolean isAsalMi= true;
        if (number==1){
            System.out.println("sayı asal değildir.");
            return;
        }
        if (number<1){
            System.out.println("Geçersiz bir Sayı");
        }
        for (int i=2; i<number; i++){
            if (number % i == 0){
                isAsalMi = false;
            }

        }
        if (isAsalMi){
            System.out.println(number + " Sayısı Asal bir Sayıdır");
        }else{
            System.out.println(number + " Sayısı Asal Bir Sayı değildir.");
        }


    }
}

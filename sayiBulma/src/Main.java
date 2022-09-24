public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 3;
        boolean isAranacak = false;
        for (int sayi : sayilar){
            if (aranacak == sayi){
                isAranacak = true;
                break;
            }
        }
        if (isAranacak){
            System.out.println("aradığınız sayı vardır ");
        }else {
            System.out.println("aradığınız sayı yoktur");
        }

    }
}

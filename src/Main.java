import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner sc= new Scanner(System.in);
        System.out.println("Yil Giriniz: ");
        yil=sc.nextInt();

        if((yil%4==0&&yil%100!=0)||(yil%400==0)){
            System.out.println("Bu yil artik yildir");
        }else{
            System.out.println("Bu artik Yil degil");
        }
    }
}
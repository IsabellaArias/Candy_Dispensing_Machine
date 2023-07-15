package Dispensing_machine;

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Candy_Dispensing_Machine Dispensing= new Candy_Dispensing_Machine();
        Dispensing.Amount=2000;
        Dispensing.Coca_cola=2500;
        Dispensing.Cookie=1000;
        Dispensing.Cheetos=2700;
        Dispensing.Bombom=600;
        Dispensing.Chocolate=3000;
        Dispensing.Candies=1;
        Dispensing.Candies=2;
        Dispensing.Candies=3;
        Dispensing.Candies=4;
        Dispensing.Candies=5;
        Dispensing.Candies=6;
        Scanner Candies = new Scanner(System.in);
        System.out.println("please enter an option");
        Dispensing.Candies= Candies.nextInt();
        System.out.println(Dispensing.Show_Option());
    }
}

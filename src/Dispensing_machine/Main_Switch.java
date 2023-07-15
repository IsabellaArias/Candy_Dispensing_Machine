package Dispensing_machine;

import java.util.Scanner;

public class Main_Switch {
    public static void main(String[] args) {
        Candy_Dispensing_Machine p1= new Candy_Dispensing_Machine();

        Candy_Dispensing_Machine p2= new Candy_Dispensing_Machine();
        Scanner lector= new Scanner(System.in);

        System.out.println("enter an option");
        p1.option= lector.nextInt();
        p2.option= lector.nextInt();
        System.out.println(p1.Show_Option());
    }
}

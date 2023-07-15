package Dispensing_machine;

public class Candy_Dispensing_Machine {
    public int Candies;
    public int option;
    public int Amount;
    public int Coca_cola;
    public int Cookie;
    public int Cheetos;
    public int Bombom;
    public int Chocolate;
    public String Show_Option(){
        switch (Candies){
            case 1:{
                if (Amount>Coca_cola){
                    return "Buy your sweet";
                }else {
                    return "Not enough balance";
                }
            } case 2:{
                if (Amount>Cookie){
                    return "Buy your sweet";
                }else {
                    return "Not enough balance";
                }
            }case 3:{
                if (Amount>Cheetos){
                    return "Buy your sweet";
                }else {
                    return "Not enough balance";
                }
            }case 4:{
                if (Amount>Bombom){
                    return "Buy your sweet";
                }else {
                    return "Not enough balance";
                }
            }case 5:{
                if (Amount>Chocolate){
                    return "Buy your sweet";
                }else {
                    return "Not enough balance";
                }
            } default:{
                return "incorrect option";
            }
        }
    }
}


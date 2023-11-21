package ESTRUCTURASDECONTROL;

public class BREAKCONTINUE {
    public static void main(String[] args) {
        for(int i = 1; i<5; i++){

            if (i==3) {
                System.out.println("Has llegado al 3!");
                break;
            }
            System.out.println(i);


        }
        for(int i = 1; i<5; i++){
            System.out.println(i);

            if (i==3) {
                System.out.println("Has llegado al 3!");
                continue;
            }


        }
    }
}

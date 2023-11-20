package EstructuraDeControl;

public class BreakContinue {
    public static void main(String[] args) {

        for(int i = 1; i < 5; i++){
            System.out.println("El valor de i es : " + i);

            if(i==3){
                System.out.println("Has llegado a 3");
                break;
            }
        }
        for(int i = 1; i < 5; i++){
            System.out.println("El valor de i es : " + i);

            if(i==3){
                System.out.println("Has llegado a 3");
                continue;
            }
            System.out.println(i);
        }

    }
}

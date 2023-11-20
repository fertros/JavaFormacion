package EstructuraDeControl;

public class While {
    public static void main(String[] args) {
        int i = 0;
        int suma = 0;

        while (i < 10){
            suma += i;
            System.out.println("el valor de suma es " + suma);
            System.out.println("el valor de i es " + i);
            i++;
        }
        System.out.println(suma);
    }
}

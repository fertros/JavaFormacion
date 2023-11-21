package ESTRUCTURASDECONTROL;

public class WHILE {
    public static void main(String[] args) {
        int i= 0;
        int suma = 0;

        while(i<10){
            suma += i;
            System.out.println(suma);
            System.out.println(i);
            i++;
        }
        System.out.println(suma);
    }
}

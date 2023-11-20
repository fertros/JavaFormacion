package Ejercicio12;

import java.util.Scanner;


    public  class rectangulo{

        //variables
        private int base;

        private int altura;

        //Constructor
        public int getBase() {
            return base;
        }

        public void setBase(int base) {
            this.base = base;
        }

        public int getAltura() {
            return altura;
        }
        public void setAltura(int altura) {
            this.altura = altura;
        }
        //Metodos

        public void esCuandrado(){
            if(Math.abs(base) == Math.abs(altura)){
                System.out.println("Esto es un cuadrado");
            }
        }
        public void Area(){
            int area = base * altura;
        }
        public void perimetro(){
            int perimetro = 2*(base + altura);
        }
        public void gira(){
            int temporal = base;
            base = altura;
            altura = temporal;

        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        rectangulo rectangulo1 = new rectangulo();

        System.out.println("Escribe la base");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Escribe la altura");
        int y = Integer.parseInt(scanner.nextLine());

        rectangulo1.setBase(x);
        rectangulo1.setAltura(y);


        rectangulo1.gira();
        System.out.println("La altura es " + rectangulo1.getAltura());
        System.out.println("La base es " + rectangulo1.getBase());
    }
}

package controller;

public class Main {
    public static void main(String[] args) {
        // Esta clase solo fue un Text, no tiene relevancia en el funcionamiento

        Logica lg = new Logica();
        //String z = "1x^2+1x+1";
        //String z = "1x^2-4x+4";
        String z = "6x^2-5x+1";

        if(lg.extraerCoeficientes(z)==0){
            System.out.println(lg.getA());
            System.out.println(lg.getB());
            System.out.println(lg.getC());
            System.out.println(lg.resolucion());

        }else{
            System.out.println("No tiene solucion");
        }

    }
}

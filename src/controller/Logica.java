package controller;

public class Logica {
    private int a;
    private int b;
    private int c;
    private int raiz;

    public Logica() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int extraerCoeficientes(String ecuacion) {
        // Dividimos con la funcion split la ecuacion ingresada, cortando el string al ver un operador
        String[] partes = ecuacion.split("(?=\\+)|(?=\\-)");

            this.a = Integer.parseInt(partes[0].replace("x^2", "").trim());
            this.b = Integer.parseInt(partes[1].replace("x", "").trim());
            this.c = Integer.parseInt(partes[2].trim()); // trim elimina espacios en blanco al inicio o al final
        return tieneSolucion(a,b,c);
    }

    private int tieneSolucion(int a, int b, int c) {
        this.raiz = (b*b) - (4*a*c);
        if(this.raiz>=0){
            return 0; // Si la ecuacion tiene solución
        }else {
            return 1; // Si la ecuación no tiene solución
        }
    }

    public String resolucion(){
        if(this.raiz==0){
            int op = (-b)/(2*a);
            String solucionUnica = "x = " + op;
            return solucionUnica;
        }else {
            double op = (double) ((-b) + (this.raiz)) /(2*a);
            double op1 = (double) ((-b) - (this.raiz)) /(2*a);
            String solucionVariable = "x1 = " + op + "   x2 = " + op1;
            return solucionVariable;
        }
    }
}

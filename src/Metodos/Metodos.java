package Metodos;

public class Metodos {
    //Atributos de la clase
    int a;
    int b;

    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);   
    }

    public int sumarConRetorno() {
        // int resultado = a + b;
        // return resultado;
        return a + b;
    }
}

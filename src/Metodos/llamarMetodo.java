package Metodos;

public class llamarMetodo {
    public static void main(String[] args) {
        Metodos aritmetica1 = new Metodos();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
         int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
        
    }
}
    




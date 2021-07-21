import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
    System.out.println("\nOperador de números \n----------------------\n");

    Scanner scNumero1 = new Scanner (System.in);
    Scanner scNumero2 = new Scanner (System.in);
    System.out.println("Escribe el primer número: ");
    int numeroUno = scNumero1.nextInt();
    System.out.println("Escribe el segundo número: ");
    int numeroDos = scNumero2.nextInt();
    scNumero1.close();
    scNumero2.close();

    Operaciones Resultado = new Operaciones();
    Resultado.Resultado(numeroUno, numeroDos);{
        int suma = numeroUno + numeroDos;
        int resta = numeroUno - numeroDos;
        int division = numeroUno / numeroDos;
        int multiplicacion = numeroUno * numeroDos;
        System.out.println("\nLa suma entre " + numeroUno + " y "  + numeroDos  + " es igual a " + suma
        + "\nLa resta entre " + numeroUno + " y "  + numeroDos  + " es igual a " + resta 
        + "\nLa división entre " + numeroUno + " y "  + numeroDos  + " es igual a " + division
        + "\nLa multiplicación entre " + numeroUno + " y "  + numeroDos  + " es igual a " + multiplicacion);
};
}

}

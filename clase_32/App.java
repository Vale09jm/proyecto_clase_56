import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // sc es el objeto q permite acceder a los metodos de la clase scanner
        Scanner sc = new Scanner (System.in);

        //mensaje orientador
        System.out.print("Digite nombre: ");
        String nombre = sc.nextLine();
        System.out.println(saludar(nombre));

        System.out.print("Digite numero: ");
        int num = sc.nextInt();
        System.out.println(numero(num));

        System.out.print("Digite grados centigrados: ");
        int c = sc.nextInt();
        System.out.println(grados(c));

        System.out.print("Digite un num para saber si es par o impar : ");
        int nmero = sc.nextInt();
        System.out.println(operador(nmero));
    }
    public static String saludar(String msg){
        msg = msg.toUpperCase();
        return "hola " + msg + "!";
        /*
        public static String saludar (String nom) {
        String letra = nom.substring(0, 1);
        String rnom = nom.substring(1);
        letra = letra.toUpperCase();
        nom = letra + rnom;
        return "Hola " + nom + "!";
        */
    }
    public static String numero (int num ) {
        return "Número x 2 = " + (2 * num) + "\nNumero x 3 = " + (3 * num);
    }
    public static String grados (double c){
        return "Grados c: " + c + "ºC" + "\nGrados F: " + (9 *(c / 5)) + "ºF";  
    } 
    public static String operador (int n ){
        return  n % 2 == 0 ? n + "es par" : n + "es impar";
    }

        /* Otra opción de par e impar
    String resultado = ""
    if (n % 2 == 0){
        resultado = "El número " + n + " es par"
    } else{
        resultado = "El número " + n + " es impar"
    }
    return resultado;
    */
}
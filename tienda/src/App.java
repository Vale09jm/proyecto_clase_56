public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tienda de ropa");

        Producto productoUno = new Producto();

        productoUno.setNombre("Blusa");
        productoUno.setPrecio(65000.0);

        productoUno.mostrar();
    
    }
}

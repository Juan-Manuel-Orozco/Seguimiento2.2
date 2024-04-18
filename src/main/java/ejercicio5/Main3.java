package ejercicio5;

public class Main3 {
    public static void main(String[] args) {
        Producto producto = Producto.Borrador;
        Producto producto1 = Producto.Lapiz;
        Producto producto2 = Producto.Cartuchera;
        Producto producto3 = Producto.Cuaderno;
        Producto producto4 = Producto.Sacapuntas;
        System.out.println(producto.getDescripcion()+ " " + producto.getNombre() );
        System.out.println(producto1.getDescripcion()+ " " + producto1.getNombre() );
        System.out.println(producto2.getDescripcion()+ " " + producto2.getNombre() );
        System.out.println(producto3.getDescripcion()+ " " + producto3.getNombre() );
        System.out.println(producto4.getDescripcion()+ " " + producto4.getNombre() );

    }
}
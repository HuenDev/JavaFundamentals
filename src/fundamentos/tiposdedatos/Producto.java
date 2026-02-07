package fundamentos.tiposdedatos;

public class Producto {
    public String nombre;
    public int cantidad;
    public double precio;

    public Producto(String nombre, int cantidad, double precio){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println(
                "\n\n---CONTROL DE INVENTARIO---" +
                        "\nNombre del producto: " + nombre +
                        "\nCantidad: " + cantidad +
                        "\nPrecio: " + precio
        );
    }
}

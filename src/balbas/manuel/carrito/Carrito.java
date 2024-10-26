package balbas.manuel.carrito;

import java.util.ArrayList;

public class Carrito {
    // Lista para almacenar los productos añadidos al carrito
    private ArrayList<Producto> productos;

    // Constructor que inicializa la lista de productos
    public Carrito() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto a la lista
    public void añadirProducto(Producto producto) {
        if (producto == null) {
            throw new NullPointerException("El producto no puede ser nulo");
        }
        productos.add(producto);
    }
    // Método para eliminar un producto de la lista
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para mostrar los productos del carrito
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio unitario: " + producto.getPrecio());
            System.out.println("Cantidad: " + producto.getCantidad());
            System.out.println("Subtotal: " + producto.calcularTotal());
            System.out.println();
        }

        }
    // Método para obtener la lista de productos
    public ArrayList<Producto> getListaDeProductos() {
        return productos;
    }



}
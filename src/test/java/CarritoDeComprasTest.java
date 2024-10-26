package test.java;

import balbas.manuel.carrito.Carrito;
import balbas.manuel.carrito.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Clase de prueba para CarritoDeCompras
class CarritoDeComprasTest {

    // Verifica que agregar un producto aumenta el tamaño de la lista de productos
    @Test
    void agregarArticuloIncreasesSize() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Laptop", 1000.0, 1);
        carrito.añadirProducto(producto);
        assertEquals(1, carrito.getListaDeProductos().size());
    }

    // Verifica que eliminar un producto disminuye el tamaño de la lista de productos
    @Test
    void eliminarArticuloDecreasesSize() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Laptop", 1000.0, 1);
        carrito.añadirProducto(producto);
        carrito.eliminarProducto(producto);
        assertEquals(0, carrito.getListaDeProductos().size());
    }

    // Verifica que se muestra la información correcta al mostrar los productos
    // Nota: Esta prueba necesitaría capturar la salida de la consola para verificar la corrección
    @Test
    void mostrarArticulosDisplaysCorrectInfo() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Laptop", 1000.0, 1);
        carrito.añadirProducto(producto);
        carrito.mostrarProductos();
    }

    // Verifica que el precio total se calcula correctamente para un producto
    @Test
    void calcularTotalReturnsCorrectAmount() {
        Producto producto = new Producto("Laptop", 1000.0, 2);
        assertEquals(2000.0, producto.calcularTotal());
    }

    // Verifica que agregar un producto nulo lanza una NullPointerException
    @Test
    void agregarArticuloNullThrowsException() {
        Carrito carrito = new Carrito();
        assertThrows(NullPointerException.class, () -> carrito.añadirProducto(null));
    }

    // Verifica que eliminar un producto que no está en la lista no hace nada
    @Test
    void eliminarArticuloNotInListDoesNothing() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Laptop", 1000.0, 1);
        carrito.eliminarProducto(producto);
        assertEquals(0, carrito.getListaDeProductos().size());
    }
}
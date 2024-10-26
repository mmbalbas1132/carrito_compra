package balbas.manuel.carrito;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        Carrito carrito = new Carrito(); // Crear un nuevo carrito de compras

        while (true) { // Bucle infinito para pedir productos al usuario
            System.out.println("Ingrese el nombre del producto (o 'salir' para terminar): ");
            String nombre = scanner.nextLine(); // Leer el nombre del producto
            if (nombre.equalsIgnoreCase("salir")) { // Si el usuario escribe 'salir', romper el bucle
                break;
            }

            System.out.println("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble(); // Leer el precio del producto

            System.out.println("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt(); // Leer la cantidad del producto
            scanner.nextLine(); // Consumir el carácter de nueva línea

            Producto producto = new Producto(nombre, precio, cantidad); // Crear un nuevo objeto Producto
            carrito.añadirProducto(producto); // Añadir el producto al carrito
        }

        System.out.println("Productos en el carrito:");
        carrito.mostrarProductos(); // Mostrar todos los productos en el carrito
    }
}
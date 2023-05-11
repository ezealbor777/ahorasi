/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class TiendaService {

  
    private HashMap<String, Double> productos = new HashMap<>();

    public HashMap<String, Double> Menu() {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("----- MENÚ DE LA TIENDA -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(sc);
                    break;
                case 2:
                    modificarPrecioProducto(sc);
                    break;
                case 3:
                    eliminarProducto(sc);
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        return productos;
    }

    private void agregarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        productos.put(nombre, precio);

        System.out.println("Producto agregado con éxito.");
    }

    private void modificarPrecioProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.next();
        
        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();

            productos.put(nombre, nuevoPrecio);

            System.out.println("Precio del producto modificado con éxito.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    private void eliminarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.next();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado con éxito.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    private void mostrarProductos() {
        System.out.println("----- PRODUCTOS EN LA TIENDA -----");

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String nombre = entry.getKey();
            double precio = entry.getValue();
            System.out.println("Producto: " + nombre + ", Precio: " + precio);
        }
    }
}
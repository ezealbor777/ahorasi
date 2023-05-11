
package LibrosAPP;

import ejercicios.libros.Libros;
import ejercicios.libros.Usuario;
import java.util.Scanner;


public class LibrosApp {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // Pedir al usuario que ingrese los datos del libro
    System.out.print("Ingrese el ISBN del libro: ");
    String isbn = leer.next();
    System.out.print("Ingrese el título del libro: ");
    String titulo = leer.next();
    System.out.print("Ingrese el autor del libro: ");
    String autor = leer.next();
    System.out.print("Ingrese la cantidad de páginas del libro: ");
    int paginas = leer.nextInt();

    // Crear un objeto Libros con los datos ingresados y mostrar sus propiedades en la consola
    Libros libro1 = new Libros(isbn, titulo, autor, paginas);
    System.out.println("ISBN: " + libro1.getIsbn());
    System.out.println("Título: " + libro1.getTitulo());
    System.out.println("Autor: " + libro1.getAutor());
    System.out.println("Páginas: " + libro1.getPaginas());

    // Pedir al usuario que ingrese los datos del usuario
    System.out.print("Ingrese el nombre del usuario: ");
    String nombre = leer.next();
    System.out.print("Ingrese el apellido del usuario: ");
    String apellido = leer.next();
    System.out.print("Ingrese el país del usuario: ");
    String pais = leer.next();

    // Crear un objeto Usuario con los datos ingresados y mostrar sus propiedades en la consola
    Usuario usuario1 = new Usuario(nombre, apellido, pais);
    System.out.println("Nombre: " + usuario1.getNombre());
    System.out.println("Apellido: " + usuario1.getApellido());
    System.out.println("País: " + usuario1.getPais());
}

       
    }
    


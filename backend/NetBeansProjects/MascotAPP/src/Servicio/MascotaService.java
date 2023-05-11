/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;







/**
 *
 * @author NET
 */
public class MascotaService {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private List<Mascota> mascota;

    public MascotaService() {
        this.mascota = new ArrayList();
    }
    
   public Mascota crearMascota(){
       System.out.println("Introducir nombre: ");
       String nombre = sc.next();
       System.out.println("Introducir apodo: ");
       String apodo = sc.next();
       System.out.println("Introducir tipo: ");
       String tipo = sc.next();
       
       Mascota m = new Mascota(nombre, apodo, tipo, 0);
       mascota.add(m);
       
       return m;
    }
   
   public void agregarMascota(Mascota m){
       mascota.add(m);
   }
   
   public void mostrarMascota(){
           System.out.println("Las mascotas actuales de la lista son: ");
           for (Mascota aux : mascota){
               System.out.println(aux.toString());
           }
           System.out.println("Cantidad = " + mascota.size());
    }
   
  /**
   * @param cantidad
   * */
   public void fabricaChiquitos(int cantidad){
       
       for (int i = 0; i < cantidad; i++) {
           mascota.add(new Mascota("fer", "chiquito", "dogo", 0));
       }
   }
  
   /**
    * crea mascota pidiendo datos por teclado
    * 
    * */ 
   public void fabricaMascota(int cantidad){
       for (int i = 0; i < cantidad; i++) {
          Mascota mascotaCreada = crearMascota();
          
          agregarMascota(mascotaCreada);  
          
           System.out.println(mascotaCreada.toString());
       }
        
   }    
   
   //TODO Añadir Try and Catch
   public void actualizarMascota(int index){
       
       Mascota m = mascota.get(index);
       m.setApodo("Roberto");
   }
    
}

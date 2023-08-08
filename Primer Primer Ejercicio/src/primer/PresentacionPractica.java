/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer;
import java.util.Scanner;
/**
 *
 * @author juan_
 */
public class PresentacionPractica {
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PresentacionPractica(String nombre) {
        this.nombre = nombre;
    }
    
    public void nombre(){
    Scanner leer = new Scanner(System.in);
    
    nombre = leer.nextLine();
        System.out.println("Hola!" + nombre);
    
    }
}

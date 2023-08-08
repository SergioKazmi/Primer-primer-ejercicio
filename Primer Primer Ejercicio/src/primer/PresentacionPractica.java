/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author juan_
 */
public class PresentacionPractica {
    private ArrayList<Nombre> listaDeNombres = new ArrayList<>(); 
    
    public boolean buscarNombre(Nombre nombre){
        for (int i = 0; i<listaDeNombres.size(); i++) {
            if (listaDeNombres.get(i) == nombre) {
                System.out.println("El nombre existe en la lista!");
                return true;
            }
        }return false;
    }
    
    public boolean agregarNombre(Nombre nombre){
        if (!buscarNombre(nombre)) {
            listaDeNombres.add(nombre);
            System.out.println("Nombre agregado.");
            return true;
        }
        System.out.println("Nombre existente.");
        return false;
    }
    public void listarNombres(){
        for (Nombre lista : listaDeNombres) {
            System.out.println(lista);
            
        }
    }
}

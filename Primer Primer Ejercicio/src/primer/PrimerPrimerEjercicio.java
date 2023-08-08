package primer;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.ListAdapter;

public class PrimerPrimerEjercicio {

    
    public static void main(String[] args) {
    Nombre nombre = new Nombre("Juan");
    Nombre nombre1 = new Nombre("Sergio");
    Nombre nombre2 = new Nombre("Lucia");
    Nombre nombre3 = new Nombre ("Lucas");
    
    PresentacionPractica lista = new PresentacionPractica();
    lista.agregarNombre(nombre);
    lista.agregarNombre(nombre1);
    lista.agregarNombre(nombre2);
    lista.agregarNombre(nombre3);
    
    lista.listarNombres();

//        int num1,num2;
//        Scanner scan=new Scanner(System.in);
//        Alumno Elias= new Alumno("Elias","Steinkamp",24,"415846843215","10/26","350");
//        try{
//        System.out.println("Inserte el primer numero");
//        num1=scan.nextInt();
//        System.out.println("Inserte el segundo numero");
//        num2=scan.nextInt();
//        System.out.println("El resultado es: "+(num1+num2));
//        }
//        catch(java.util.InputMismatchException ex){
//            System.out.println("ERROR el valor ingresado debe ser de tipo entero");
//        }

//        int num1,num2;
//        Scanner scan=new Scanner(System.in);
//        try{
//        System.out.println("Inserte el primer numero");
//        num1=scan.nextInt();
//        System.out.println("Inserte el segundo numero");
//        num2=scan.nextInt();
//        System.out.println("El resultado es: "+(num1+num2));
//        }
//        catch(java.util.InputMismatchException ex){
//            System.out.println("ERROR el valor ingresado debe ser de tipo entero");
//        }

//        Hola que tal, soy Juan
//        Hola soy Mauro.
//        Holis Soy Lucia
//        Mi nombre es sergio

//        Hola  Soy Lucas!
//        la ultima

//        Holis Soy Lucia

// Mi nombre es sergio


//Hola  Soy Lucas!

        // la ultima
    


    

}
}

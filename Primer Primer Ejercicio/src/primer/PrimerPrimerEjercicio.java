package primer;
import java.util.Scanner;
public class PrimerPrimerEjercicio {

    
    public static void main(String[] args) {
        int num1,num2;
        Scanner scan=new Scanner(System.in);
        try{
        System.out.println("Inserte el primer numero");
        num1=scan.nextInt();
        System.out.println("Inserte el segundo numero");
        num2=scan.nextInt();
        System.out.println("El resultado es: "+(num1+num2));
        }
        catch(java.util.InputMismatchException ex){
            System.out.println("ERROR el valor ingresado debe ser de tipo entero");
        }
//        Hola que tal, soy Juan
//        Hola soy Mauro.

//        Holis Soy Lucia

// Mi nombre es sergio

//Hola  Soy Lucas!

        // la ultima
    }

}

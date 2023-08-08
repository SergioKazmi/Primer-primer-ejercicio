package primer;

public class Alumno {
    
    private String nombre,apellido, numero_tarjeta_credito, fecha_vencimiento, tres_numeros_de_atras;
    private int edad;
    
    
    public Alumno(String nombre, String apellido, int edad,
                  String numero_tarjeta_credito, String fecha_vencimiento, String tres_numeros_de_atras){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.numero_tarjeta_credito=numero_tarjeta_credito;
        this.fecha_vencimiento=fecha_vencimiento;
        this.tres_numeros_de_atras=tres_numeros_de_atras;
    }
}

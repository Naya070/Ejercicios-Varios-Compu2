
/**
 * Write a description of class TrabajadorEnParo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrabajadorEnParo extends Trabajador
{
    // instance variables - replace the example below with your own
    private int DíasParo;

    /**
     * Constructor for objects of class TrabajadorEnParo
     */
    public TrabajadorEnParo(String Nombre,String Dirección, String Sexo, int Edad, float Salario, int DíasParo)
    {
        // initialise instance variables
        super(Nombre, Dirección, Sexo, Edad, Salario);
        
        this.DíasParo = DíasParo;
        
    }

     /**
     * toString
     * 
     */
     @Override
    public String toString()
    {
        // put your code here
        return "Nombre: " + Nombre 
               +"\nDirección:"+ Dirección
               +"\nSexo:" + Sexo
               +"\nEdad:" + Edad
               +"\nSalario:" + Salario
               +"\nDías de Paro:" + DíasParo;
        
        
    }
    
    /**
     * equals Persona
     * 
     */
    public String Equals(TrabajadorEnParo tp1, TrabajadorEnParo tp2)
    {
        // put your code here
        if (tp1.equals(tp2)) {
            return "Los trabajadores en paro son iguales";
        }  else {
            return "Los trabajadores en paro no son iguales";
        }      
       
    }
    
    /**
     * Imprimir
     * 
     */
    public String Imprimir()
    {
        // put your code here
        toString();
        
               
                
        return "Hola Trabajador en paro";
    }
}

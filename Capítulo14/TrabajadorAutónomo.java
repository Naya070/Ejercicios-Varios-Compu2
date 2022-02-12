
/**
 * Write a description of class TrabajadorAutónomo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrabajadorAutónomo extends Trabajador
{
    // instance variables - replace the example below with your own
    private String Ocupación;

    /**
     * Constructor for objects of class TrabajadorAutónomo
     */
    
    public TrabajadorAutónomo(String Nombre,String Dirección, String Sexo, int Edad, float Salario, String Ocupación)
    {
        // initialise instance variables
        super(Nombre, Dirección, Sexo, Edad, Salario);
        
        this.Ocupación=Ocupación;
        
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
               +"\nOcupación:" + Ocupación;
        
        
    }
    
    /**
     * equals Persona
     * 
     */
    public String Equals(TrabajadorAutónomo ta1, TrabajadorAutónomo ta2)
    {
        // put your code here
        if (ta1.equals(ta2)) {
            return "Los trabajadores autónomos son iguales";
        }  else {
            return "Los trabajadores autónomos no son iguales";
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
        
               
                
        return "Hola Trabajador Autónomo";
    }
}

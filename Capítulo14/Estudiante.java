
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    // instance variables - replace the example below with your own
    private int Expediente, Semestre;

    /**
     * Constructor for objects of class Estudiante
     */
    public Estudiante(String Nombre,String Dirección, String Sexo, int Edad, int Expediente, int Semestre)
    {
        // initialise instance variables
        super (Nombre, Dirección, Sexo, Edad); 
        
        this.Expediente = Expediente;
        this.Semestre = Semestre;
        
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
               +"\nExpediente:" + Expediente
               +"\nSemestre:" + Semestre;
        
        
    }
    
    /**
     * equals
     * 
     */
   
    public String Equals(Estudiante e1, Estudiante e2)
    {
        // put your code here
        if (e1.equals(e2)) {
            return "Los estudiantes son iguales";
        }  else {
            return "Los estudiantes no son iguales";
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
        
               
                
        return "Hola Estudiante";
    }
}

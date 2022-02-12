
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    protected String Nombre,Dirección;
    protected String Sexo;
    protected int Edad;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String Nombre,String Dirección, String Sexo, int Edad )
    {
        // initialise instance variables
        this.Nombre = Nombre ;
        this.Dirección = Dirección;
        this.Sexo = Sexo;
        this.Edad = Edad;
        
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
               +"\nEdad:" + Edad;
        
        
    }
    
    /**
     * equals Persona
     * 
     */
    public String Equals(Persona p1, Persona p2)
    {
        // put your code here
        if (p1.equals(p2)) {
            return "Las personas son iguales";
        }  else {
            return "Las personas no son iguales";
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
        
               
                
        return "Hola persona";
    }
    
    
}

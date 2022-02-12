
/**
 * Write a description of class Trabajador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trabajador extends Persona
{
    // instance variables - replace the example below with your own
    protected float Salario;

    /**
     * Constructor for objects of class Trabajdor
     */
    public Trabajador(String Nombre,String Dirección, String Sexo, int Edad, float Salario)
    {
        // initialise instance variables
        super(Nombre, Dirección, Sexo, Edad);
        this.Nombre = Nombre ;
        this.Dirección = Dirección;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Salario = Salario; 
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
               +"\nSalario:" + Salario;
        
        
    }
    
    /**
     * equals Persona
     * 
     */
    public String Equals(Trabajador t1, Trabajador t2)
    {
        // put your code here
        if (t1.equals(t2)) {
            return "Los trabajadores son iguales";
        }  else {
            return "Los trabajadores no son iguales";
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
        
               
                
        return "Hola Trabajador";
    }
}

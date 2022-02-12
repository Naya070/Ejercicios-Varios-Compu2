
import java.util.Arrays;
import java.util.List;

public class Principal {
  public static void main(String[] args) {
    Persona p1= new Persona("José García","Su casa","M", 24);
    Persona p2= new Persona("Luis López","Caracas","M", 17);
    
    Persona e1= new Estudiante("Gabriela García","Casarapa","F", 14, 123, 2);
    Persona e2= new Estudiante("Rafael Núñez","Guatire","M", 30, 321, 9);
    
    Persona t1= new Trabajador("María García","Su casa","F", 24, 50);
    Persona t2= new Trabajador("Luciana Gonzalez","Guarenas","F", 30, 30);
    
    Persona tp1= new TrabajadorEnParo("Cruz Perez","Bajo el puente","F", 18, 300, 10);
    Persona tp2= new TrabajadorEnParo("Cruz Perez","Bajo el puente","F", 18, 300, 10);
    
    Persona ta1= new TrabajadorAutónomo("Mauricio Sierra","La playa","M", 18, 500, "pintor");
    Persona ta2= new TrabajadorAutónomo("Juana Blanco","Bajo el puente","F", 18, 400, "carpintera");
   
    
    List<Persona> lista=Arrays.asList(p1,p2,e1,e2,t1,t2,tp1,tp2,ta1,ta2);
    lista.forEach(System.out::println);
    
  }
}
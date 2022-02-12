import java.util.ArrayList; // importar libreria para trabajar con los array list
import java.util.List; // importar libreria para trabajar con las list
  
class CualquierBase extends Hexa { //se llama clase hija de Hexa
    

    private double x, d_resto, c; 
    private int resto;

    /*
    * Constructor para objetos de la clase CualquierBase
     * Ingrese un número hexadecimal
     * el número debe ir entre comillas
     * Las letras deben ir en mayúsculas
     * Ejemplos: "1A2" , "FFF"
    */
    public CualquierBase(String numEntrada) 
    {
        // initialise instance variables
        super(numEntrada); // invocando el constructor de superclase
        
    }
    
        
    /*
    * Este método transforma de hexadecimal a cualquier base.
    * ingrese la base a la que desea convertir
    * su hexadecimal
    * La base debe se un entero no mayor a 36
    *Ejempo: 2, 15, 20.
    */
    
    public String ConvCualquierBase(double BaseRequerida)
    {
        // se crea la variable
        double base =  BaseRequerida;
        ConvDecimal();
         
        decimal = this.decimal; //se llama el decimal del padre
               
        int Entero= (int) decimal; // se almacena el decimal en la variable entero
        int i =0;
        String result=""; //se crea la variable resultado que sera retornada en el final del codigo
        
        List<String> arr = new ArrayList<>(); //se crea el arraylist donde se almacenara cada numero que conforma la base deseada
       
        while (Entero >= base){ //en este ciclo se genera todo los restos para enteros mayo a la base
            int B= (int) base;
            d_resto = Entero % base; //d_resto es una variable double que se pasa a entero alamcenandola en resto
            resto = (int) d_resto;       
            Entero = Entero/B;
                if (resto > 9){ //si resto es mayo a nueve toma valor de un char y se guarda en arr
                    arr.add(  String.valueOf((char)(resto + 55)));
                } else{
                    arr.add(  String.valueOf(resto)); // si no se guarda siendo un entero
                }        
            }
           
        if (Entero < base){ // condicion para entero menor a la base
            d_resto = Entero % base;
            resto = (int) d_resto;    
            if (resto > 9){ //se repite el codigo para resultados mayores a nueve
                arr.add(  String.valueOf((char)(resto + 55)));
            } else{
                arr.add(  String.valueOf(resto));
            }
            
        }
        for( int j = arr.size()-1; j>=0; j-- ){ // ciclo for para almacenar y concatenar cada resultado en resultado
                result = result + arr.get(j);
            }            
            return result ;
        }
    }
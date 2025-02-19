
package proyectoaplicacion;


public class Libro {

    String libro;
    String autor;
   int numeroPaginas;
    
    public Libro(String libro, String autor, int numeroPaginas){
        
       this.libro= libro;
       this.autor= autor;
       this.numeroPaginas= numeroPaginas;
       
          
    
        
    }
    
    
    @Override
    public String toString() {
        return "\nTítulo: " + this.libro;
    }
    
}

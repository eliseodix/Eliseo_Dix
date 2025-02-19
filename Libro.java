
package tallere;


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
        return "Título: " + this.libro+ "\nAutor: " + this.autor + "\nNúmero de Páginas: " + this.numeroPaginas;
    }
    
}

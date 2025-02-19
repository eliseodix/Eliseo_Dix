
package proyectoaplicacion;

public class Estudiante {
    
    String nombre;
    int edad;
    String curso;    
    
    public Estudiante(){
        this.nombre="Desconocido";
        this.edad= 0;
        this.curso="Sin asignar";
        
    }
    public Estudiante(String nombre, int edad){
        this.nombre= nombre;
        this.edad=edad;
        this.curso="Sin asignar";
   
    }
    public Estudiante(String nombre, int edad, String curso){
        this.nombre=nombre;
        this.edad=edad;
        this.curso=curso;
        
     
    }

   
    @Override
    public String toString(){
      return "\nnombre:"+nombre + "\ncurso:"+curso;  
    }
}

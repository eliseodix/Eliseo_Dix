
package proyectoaplicacion;

import javax.swing.JOptionPane;

public class ProyectoAplicacion {
   
    
      
    
    public static void main(String[] args) {
         String libro=JOptionPane.showInputDialog("Ingresa el nombre del libro");
           String auto="";
           String nombre=JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
           String curso=JOptionPane.showInputDialog("Ingresa el curso del estudiante");
           String tipoCuenta=JOptionPane.showInputDialog("Ingresa el tipo de cuenta");
        Libro n =new Libro(libro, auto, 0);
        Estudiante m=new Estudiante(nombre, 0, curso);
        cuentaBancaria b=new cuentaBancaria(0, tipoCuenta);
        JOptionPane.showMessageDialog(null,""+ n.toString()+""+m.toString()+""+b.toString());
       
        
        
        
    }
    
}


package tallere;

import javax.swing.JOptionPane;

public class Tallere {
    
   
    public static void main(String[] args) {
       
        String titulo ="Lupan";
        String autor ="Don";
        int numeroPaginas= 100;
      Libro n = new Libro(titulo, autor,   numeroPaginas);
       JOptionPane.showMessageDialog(null,""+n.toString());
      
       
    }
    
}

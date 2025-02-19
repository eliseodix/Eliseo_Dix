
package proyectoaplicacion;


public class cuentaBancaria {
    
    int numeroCuenta;
    int saldo;
    String tipoCuenta;
    public cuentaBancaria(){
        
    }
    public cuentaBancaria(int numeroCuenta, String tipoCuenta){
         this.numeroCuenta= numeroCuenta;
         this.tipoCuenta=tipoCuenta;
        
    }
    public cuentaBancaria(int numeroCuenta, int saldo, String tipoCuenta){
        
    }  
    @Override
    public String toString(){ //  return "Título: " + this.libro+ "\nAutor: " + this.autor + "\nNúmero de Páginas: " + this.numeroPaginas;
        return "\ntipo de cuenta:"+ this.tipoCuenta; 
    }
}

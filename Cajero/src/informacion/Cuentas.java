 
package informacion;
// Deprecated
 
   
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Cuentas {

    //atributos
    private String nrocuenta;
    private String nombre;
    private String cedulacliente;
    private String direccion;
    private float saldo;
    private float valortransaccion;
    private String tipocuenta;
    private String tipotransaccion;
    private String fechatransaccion;
    //metodos    
   
    public Cuentas(){
        this.saldo = 20000;
        this.nombre = "Cuper S.";
        this.cedulacliente = "75.999.999";
        this.direccion = "CL.99 Cra.9 Nro.23-4";
        this.tipocuenta = "Ahorro";
        this.nrocuenta = "12345";
       
        
        }
    
    public void setnrocuenta(String n) {
        nrocuenta = n;
    }

    String Getnrocuenta() {
        return nrocuenta;
    }

    public void setnombre(String n) {
        nombre = n;
    }

    String Getnombre() {
        return nombre;
    }

    public void setcedulacliente(String n) {
        cedulacliente = n;
    }

    String Getcedulacliente() {
        return cedulacliente;
    }

    public void setdireccion(String n) {
        direccion = n;
    }

    String Getdireccion() {
        return direccion;
    }

    public void setfecha(String f) {
        fechatransaccion = f;
    }

    String Getfecha() {
        return fechatransaccion;
    }

    public void settipo(String tipot) {
        tipotransaccion = tipot;
    }

    String Gettipo() {
        return tipotransaccion;
    }

    private void settipoCuenta(String n) {
        tipocuenta = n;
    }

    public String GettipoCuenta() {
        return tipocuenta;
    }

    public float consultasaldo() {
        return saldo;
    }

    public float getvalortransaccion() {
        return valortransaccion;
    }
    // metodo que hace las operaciones ya sea consignar o retirar

    public void transaccion( String tipooperacion, float valoroperacion ) {
        float operacion;         
        if ((tipooperacion.equalsIgnoreCase("Retirar")  ) && (valoroperacion > consultasaldo())) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente"); // verifica si el hay fondos para retirar
            tipotransaccion = "Rechazada";
             } else {           
            tipotransaccion = tipooperacion; 
            valortransaccion  = valoroperacion;            
            if (tipooperacion.equalsIgnoreCase("Consignar") ) {
                operacion = valoroperacion + consultasaldo(); //Consignar
            } else {
                operacion = consultasaldo() - valoroperacion; //Retiro
            }
            saldo = operacion;
        }

    }
    
    public String lf(){
        Date fecha=new Date();
        SimpleDateFormat ft = 
         new SimpleDateFormat (" yyyy-MM-dd ' ' hh:mm a ");
        fechatransaccion =ft.format(fecha);
        return fechatransaccion;
        
    }
     public boolean validarUsuario (String nroCuent, String clave){
           
        
        if(nroCuent.equals(nrocuenta) && clave.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
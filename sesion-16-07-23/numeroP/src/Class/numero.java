/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.Scanner;
/**
 *
 * @author JuanDa
 */
public class numero {
    private Double num;
    private String mensaje;
    
    private void setNumero(Double num){
        //el set es el que envia
        this.num=num;
    }
    
    private Double getNumero() {
        //el get es el que recibe.
        return this.num;
    }
    
    public String getMensaje(){
        return mensaje;
    }
    
    public void  setMensaje (String mensaje){
        this.mensaje = mensaje;
    }
    
    public Double capturar (){
        Scanner scanner = new Scanner(System.in);
        
        do{
            try {
                System.out.println(this.getMensaje());
                 //Moficicar el valor del atributo
                 //esto sirve para tomar valores dobles, es decir, con decimales.
                this.setNumero(Double.parseDouble(scanner.next()));
                
                if(this.getNumero()<=0){//el try es el que lanza una excepcion
                     System.out.println("Dato no válido, solo números positivos.");
                }
            } catch (Exception e){//el catch es el que lanza una respuesta adecuada 
                 System.out.println("Dato no válido, no se admite caracteres alfanumericos.");
                 this.setNumero(Double.parseDouble("0"));
            }
        }while(this.getNumero()<=0);
        return this.getNumero();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba10;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class Prueba10 {

   public static void main(String[] args) {
      //  Scanner entrada1=new Scanner(System.in);
        int opc,i=0;
        String x,z,u,y;
        boolean encontrado=false;
        ArrayList<String>registro = new ArrayList();
        do{
         opc=Integer.parseInt(JOptionPane.showInputDialog("\t..:MENÚ:.."+
                      "\n1. Ingreso de nombres"+
                      "\n2. Modificar nombre"+
                      "\n3. Eliminar nombre"+
                      "\n4. Mostrar nombres"+
                      "\n5. Finalizar"+
                      "\n\nDigite una opcion: "));
         switch(opc){
            case 1: 
                do{
                   registro.add(i,JOptionPane.showInputDialog("PRESIONE (x) SI YA NO DESEA ESCRIBIR OTRO NOMBRE\n"+
                           (i+1)+". Digite un nombre: ")); 
                   i++;
                }while(!"x".equals(registro.get(i-1)));
                registro.remove(i-1);break;//como se crea un registro adicional pero se escribe x para salir por lo cual se debe eliminar.
           case 2: 
                z=JOptionPane.showInputDialog("\n\nDigite el nombre a modificar: ");
                y=JOptionPane.showInputDialog("\n\nDigite el nuevo nombre: ");
                for(i=0;i<registro.size();i++){
                    if(registro.get(i).equals(z)){
                        encontrado=true;
                        registro.set(i,y);// se establece el cambio en la posicion de coincidencia
                    }
                }
                if(encontrado==false){
                    JOptionPane.showMessageDialog(null,"El nombre no existe en el registro");
                }break;
            case 3: 
                u=JOptionPane.showInputDialog("\n\nDigite el nombre a eliminar: ");
                encontrado=false;
                for(i=0;i<registro.size();i++){
                    if(registro.get(i).equals(u)){
                        encontrado=true;
                        registro.remove(i);
                    }
                }
                if(encontrado==false){
                    JOptionPane.showMessageDialog(null,"El nombre no existe en el registro");
                }break;
            case 4:
                String cadena="";
                for(i=0;i<registro.size();i++){
                    cadena+=(i+1)+". "+registro.get(i)+"\n";
                }
                JOptionPane.showMessageDialog(null,cadena);
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"\tGRACIAS POR USAR EL MENÚ");break; 
         }      
        }while(opc!=5);
        
        
        
    }
    
}
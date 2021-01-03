
package prueba10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prueba10 {

   public static void main(String[] args) {
        int x,opc,i=0,q,cont=0;
        boolean band=true;
        int vec[]=new int[30];
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("\t..:MENU:.."+
                    "\n1. Ingreso de código"+
                    "\n2. Búsqueda de código"+
                    "\n3. Mostrar códigos"+
                    "\n4. Finalizar"+
                    "\n\nDigite una opcion: "));
            switch(opc){
                case 1: 
                    do{
                       vec[i]=Integer.parseInt(JOptionPane.showInputDialog("PRESIONE (0) SI YA NO DESEA ESCRIBIR OTRO CODIGO\n"+
                           (i+1)+". Digite un codigo: ")); 
                       i++;
                       cont++;
                    }while(vec[i-1]!=0);
                    break;
                case 2:
                    i=0;
                    q=Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo: "));
                    for(i=0;i<vec.length;i++){
                        if(vec[i]==q){
                            band=false;
                        }
                    }
                    if(band==true){
                        JOptionPane.showMessageDialog(null,"No existe el codigo en el registro");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El codigo si esta registrado");
                    }break;
                case 3:
                    int vec2[]=new int[cont-1];
                    System.arraycopy(vec, 0, vec2, 0, vec2.length);
                    JOptionPane.showMessageDialog(null,Arrays.toString(vec2));
                    
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"\tGRACIAS POR USAR EL MENÚ");break;
                default: 
                    JOptionPane.showMessageDialog(null,"La opcion indicada no existe");
            }
        }while(opc!=4);
    }   
}
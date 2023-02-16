
package listastipopila;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerson
 */
public class ListasTipoPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0; int nodo = 0;
        Pila pila = new Pila();
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "menu de opciones\n\n"
                +"1. Insertar un nodo\n"
                +"2. Eliminar un nodo\n"
                +"3. La pila esta vacia?\n"
                +"4. Cual es el ultimo valor ingresado de la pila\n"
                +"5. Cuantos nodos tiene la pila?\n"
                +"6. Vaciar pila\n"
                +"7. Mostrar contenido de la pila\n"
                +"8. Salir"));
                switch(opcion){
                    case 1:
                        nodo =Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el valor para guardar el nodo"));
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "se ha eliminado un nodo con el valor: "
                            +pila.EliminarNodo());
                        }
                        break;
                    case 3:
                        if(pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "la pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "pila no vacia");
                        }
                        break;
                    case 4:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "el ultimo valor ingresado en la pila es: "
                            + pila._MostrarUltimoValorIngresado());
                        }else {
                            JOptionPane.showMessageDialog(null, "la pila esta vacia");
                        }
                        
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "la pila contiene: "+ pila.TamanoPila()+ " nodos");
                        break;
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                        JOptionPane.showMessageDialog(null, "se ha vaciado la pila correctamente");   
                        }else{
                            JOptionPane.showMessageDialog(null, "la pila esta vacia");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;  
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta, Vuelve a insertar nuevamente-");
                            break;
                        
                    
                }
                        
            }catch (NumberFormatException e){
                
            }
            
        }while(opcion !=8);
    }
    
}

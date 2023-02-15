
package listastipopila;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerson
 */
public class Pila {
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    
    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;   
}
    //MEtodo para conocer si la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
 
    }
    //Metodo para insertar un nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano++;
    }
    // Metedo para elimimar un nodo de la pila
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    //Metodo para conocer el ultimo valor ingresado
    public int _MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    //Metodo para conocer el tamaño de la pila
    public int TamanoPila(){
        return tamano;
    }
    //Metodo pata vaciar pila
    public void VaciarPila(){
        //este signo significa diferente: "!"
        while(!PilaVacia())
            EliminarNodo();
    
}
    //Metodo para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        while(recorrido != null){
            Lista += recorrido.informacion +"\n";
            recorrido = recorrido.siguiente;   
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
        
    }
}

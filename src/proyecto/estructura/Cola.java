package proyecto.estructura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cola 
{
    public void llenarCola(LinkedList<Object> clientes, int TAM_MAX)
    {
        for(int i=1;i<TAM_MAX;i++)
        {
            String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre");
            clientes.add(nombre);
        }
    }
    
    public void mostarCola(LinkedList<Object> cliente)
    {
        System.out.println( "La lista es la siguiente" );
        List cliente2;
        cliente2 = new ArrayList(cliente);
        Iterator it = cliente2.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next()+"");
        }
    }
}

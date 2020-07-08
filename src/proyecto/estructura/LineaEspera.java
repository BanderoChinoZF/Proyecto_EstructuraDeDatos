package proyecto.estructura;

import java.util.LinkedList;

/**
 *
 * @author luisa
 */
public class LineaEspera {
    
    public static void main(String[] args)
    {
        Cola c = new Cola();
        LinkedList<Object> unifila = new LinkedList<>();
        
        int TAM_MAX = (int)(Math.random()*10)+1;
        c.llenarCola(unifila, TAM_MAX);
        c.mostarCola(unifila);
        
        int TAM_ARRE = unifila.size();
        int[] Cliente = new int[TAM_ARRE];
        double[] TLL = new double[TAM_ARRE];
        double[] TE = new double[TAM_ARRE];
        double[] TSER = new double[TAM_ARRE];
        double[] TSAL = new double[TAM_ARRE];
        
        TLL[0] = 0;
        TE[0] = 0;
        TSER[0] = (Math.random())*25;
        TSAL[0] = TLL[0] + TE[0] + TSER[0];
        
        System.out.println(" SE ATENDIOA A EL CLIENTE " + unifila.peek());
        System.out.print("CON LOS SIGUIENTES TIEMPOS ------> ");
        System.out.println("TLL = "+ TLL[0] + "||" + "TE = " + TE[0] + "||" + "TSER = " + TSER[0] + "||" + "TSAL = "+ TSAL[0]);
        
        unifila.removeFirst();
        
        for(int i=1;i<TAM_ARRE+1;i++)
        {
            TLL[i] = TLL[i-1] + (Math.random())*15;
            TE[i] = Math.max(TSAL[i-1],TLL[i])-TLL[i];
            //TO[i] = Math.max(TSAL[i],TLL[i])-TSAL[i-1];
            TSER[i] = (Math.random())*25;
            TSAL[i] = TLL[i] + TE[i] + TSER[i];
            System.out.println(" SE ATENDIOA A EL CLIENTE " + unifila.peek());
            System.out.print("CON LOS SIGUIENTES TIEMPOS ------> ");
            System.out.println("TLL = "+ TLL[i] + "||" + "TE = " + TE[i] + "||" + "TSER = " + TSER[i] + "||" + "TSAL = "+ TSAL[i]);
            
            unifila.removeFirst();
            
            if(unifila.isEmpty() == true)
            {
                break;
            }
        }
    }
    
}

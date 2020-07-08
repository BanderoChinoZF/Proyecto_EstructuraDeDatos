package proyecto.estructura;

import java.util.LinkedList;

public class Cajero {

	public String nombre;
        
        public Cajero(String nombre)
        {
            this.nombre = nombre;
        }

	public void atenderCliente(LinkedList clientes) 
        {
            
        int TAM_ARRE = clientes.size();
        int[] Cliente = new int[TAM_ARRE];
	double[] TLL = new double[TAM_ARRE];
        double[] TE = new double[TAM_ARRE];
        double[] TSER = new double[TAM_ARRE];
        double[] TSAL = new double[TAM_ARRE];
        
        TLL[0] = 0;
        TE[0] = 0;
        TSER[0] = (Math.random())*25;
        TSAL[0] = TLL[0] + TE[0] + TSER[0];
        
        System.out.println(" SE ATENDIOA A EL CLIENTE " + clientes.peek());
        System.out.print("CON LOS SIGUIENTES TIEMPOS ------> ");
        System.out.println("TLL = "+ TLL[0] + "||" + "TE = " + TE[0] + "||" + "TSER = " + TSER[0] + "||" + "TSAL = "+ TSAL[0]);
        
        clientes.removeFirst();
        
        for(int i=1;i<TAM_ARRE+1;i++)
        {
            System.out.println("La cajera " + this.nombre + " COMIENZA ATENDER AL CLIENTE DE LA UNIFILA " + clientes.peekFirst());
            
            TLL[i] = TLL[i-1] + (Math.random())*15;
            TE[i] = Math.max(TSAL[i-1],TLL[i])-TLL[i];
            TSER[i] = (Math.random())*25;
            TSAL[i] = TLL[i] + TE[i] + TSER[i];
            System.out.println(" SE ATENDIOA A EL CLIENTE " + clientes.peek());
            System.out.print("CON LOS SIGUIENTES TIEMPOS ------> ");
            System.out.println("TLL = "+ TLL[i] + "||" + "TE = " + TE[i] + "||" + "TSER = " + TSER[i] + "||" + "TSAL = "+ TSAL[i]);
            
            System.out.println("La cajera " + this.nombre + " HA TERMINADO DE ATENDER " + clientes.peekFirst() + " EN EL TIEMPO " + TSER[i] +" MIN");
            
            clientes.removeFirst();
            
            if(clientes.isEmpty() == true)
            {
                break;
            }
        }
	}
}

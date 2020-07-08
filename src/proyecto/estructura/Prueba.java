package proyecto.estructura;

import java.util.LinkedList;

public class Prueba 
{
    public static void main(String [] args)
    {
        Cola c = new Cola();
        LinkedList<Object> unifila = new LinkedList<>();
        
        int TAM_MAX = (int)(Math.random()*25)+1;
        c.llenarCola(unifila, TAM_MAX);
        c.mostarCola(unifila);     
        
	//Cajero cajera = new Cajero("PATRICIA");
        //Cajero cajerito = new Cajero("LUIS ALBERTO");
        
        CajeritoThread cajero1 = new CajeritoThread("CANDY");
        CajeritoThread cajero2 = new CajeritoThread("MARCOS");
        CajeritoThread cajero3 = new CajeritoThread("LUIS");
        CajeritoThread cajero4 = new CajeritoThread("DIANA");
        
        synchronized(unifila)
        {
            cajero1.run(unifila);
            cajero2.run(unifila);
            cajero3.run(unifila);
            
            try {
                cajero1.join();

                cajero2.join();
                
                cajero3.join();
                
                if(unifila.size()== 20)
                {
                    cajero4.run(unifila);
                }else
                {
                    cajero4.stop();
                }
                
            } catch (InterruptedException ie) 
            {

            }
            /*if(unifila.size()== 20)
            {
                cajero4.run(unifila);
            }else
            {
                cajero4.stop();
            }*/
        }
    }
}

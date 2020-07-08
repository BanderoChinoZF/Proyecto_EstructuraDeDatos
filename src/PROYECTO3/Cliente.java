package PROYECTO3;

public class Cliente 
{
    public String nombre;
    public int[] carroCompra;
    
    public Cliente(String nombre, int []carroCompra)
    {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }
    
    public void setNombre(String dato)
    {
        this.nombre = dato;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setArre(int[] arre )
    {
        this.carroCompra = arre;
    }
    
    public int[] getArre()
    {
        return carroCompra;
    }
    
}

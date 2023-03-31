package proyectoVehiculo;
public class Vehiculo
{
    protected String matricula;
    protected String modelo;
    protected int potenciaCV;

    public Vehiculo(String matricula, String modelo,int potenciaCV)
    {
        this.matricula=matricula;
        this.modelo=modelo;
        this.potenciaCV=potenciaCV;  
    }

    public String getMatricula()
    {
        return matricula;
        
    }

    public String getModelo()
    {
        return modelo;
    }

    public int getPotencia()
    {
        return potenciaCV;
    }

    public void mostrarDatos()
    {
        
    }
}
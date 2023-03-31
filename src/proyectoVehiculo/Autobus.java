package proyectoVehiculo;
import javax.swing.*;

public class Autobus extends Vehiculo
{
    private int numeroPlazas;

    public Autobus(String matricula, String modelo, int potenciaCV)//, int numeroPlazas) 
    {
        super(matricula, modelo, potenciaCV);
        //this.numeroPlazas=numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas)
    {
        this.numeroPlazas=numeroPlazas;
    }
   
    public int getNumeroPlazas() 
    {
        return numeroPlazas;
    }

    public void mostrarDatos()
    {
        JOptionPane.showMessageDialog(null, "Matricula: "+getMatricula()+ "\n Modelo: "+getModelo()+"\n Potencia (CV): "+getPotencia()+"\n Numero de Plazas:"+getNumeroPlazas());
    }
}

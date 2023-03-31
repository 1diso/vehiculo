package proyectoVehiculo;
import javax.swing.*;
public class Taxi extends Vehiculo
{
    private int numeroLicencia;
    
    public Taxi(String matricula, String modelo, int potenciaCV)//, int numeroLicencia)
    {
        super(matricula, modelo, potenciaCV);
        //this.numeroLicencia=numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia)
    {
        this.numeroLicencia=numeroLicencia;
    }

    public int getNumeroLicencia()
    {
        return this.numeroLicencia;
    }

    public void mostrarDatos()
    {
        JOptionPane.showMessageDialog(null, "Matricula: "+getMatricula()+ "\n Modelo: "+getModelo()+"\n Potencia (CV): "+getPotencia()+"\n Numero de Licencia:"+getNumeroLicencia() );
    }


}

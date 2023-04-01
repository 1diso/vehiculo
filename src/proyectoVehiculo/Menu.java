package proyectoVehiculo;
import javax.swing.*;

public class Menu 
{
    public static void main(String[] args) 
    {
        int respuesta = 0, numeroLicencia = 0, potenciaCV = 0, numeroPlazas = 0;
        String matricula = "", modelo = "";

        Vehiculo vehiculos[]= new Vehiculo[10];
        int i=0;
         do
            {
                respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Ingresar un vehiculo \n 2.-Mostrar los vehiculos \n 3.-Buscar un Vehiculo \n 4.-Eliminar un Vehiculo \n 5.-Ordenar los vehiculos\n 6.-Salir \n elegir opcion"));
                
                switch(respuesta)
                {
                   case 1:
                    //Que tipo de Vehiculo
                    //Taxi, Autobus
                    int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Que tipo de vehiculo es: \n 1.-Taxi \n 2.-Autobus")) ;
                    //SIEMPRE - matricula, modelo y potencia
                    boolean matriculaUnica = false; // variable para verificar si la matrícula es única
                    do {
                    matricula = JOptionPane.showInputDialog(null, "Ingrese la matricula");
                    // Verificar si la matrícula es única
                    matriculaUnica = true; // suponemos que la matrícula es única
                    for (int j = 0; j < i; j++) 
                    {
                    if (vehiculos[j].getMatricula().equalsIgnoreCase(matricula)) 
                    {
                        matriculaUnica = false; // la matrícula no es única
                        JOptionPane.showMessageDialog(null, "La matrícula ya existe. Intente con otra.");
                        break;
                    }
                    }
                    } while (!matriculaUnica);
                    modelo=JOptionPane.showInputDialog(null, "Ingrese el modelo");
                    potenciaCV=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la potencia del vehiculo:"));
                    Vehiculo vehiculoCreado = crearVehiculo(tipo,matricula,modelo,potenciaCV);
                    if(tipo==1){
                        numeroLicencia=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de licencia del taxi"));
                        ((Taxi)vehiculoCreado).setNumeroLicencia(numeroLicencia);
                    }
                    if(tipo==2){
                        numeroPlazas=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de plazas del autobus"));
                        ((Autobus)vehiculoCreado).setNumeroPlazas(numeroPlazas);
                    }
                    vehiculos[i]= vehiculoCreado;
                    i++;
                 
                 break;

                 case 2:
                 for(int j=0; j<i;j++)
                 {

                    vehiculos[j].mostrarDatos();
                    //((Taxi)vehiculoCreado).mostrarDatos();
                }
                 break;

                 case 3:
                 String matriculaBuscar = JOptionPane.showInputDialog(null, "Introduce la matricula a buscar");
                 boolean encontrado = false;
                 for (int j = 0; j < i; j++) 
                    {
                        if (vehiculos[j].getMatricula().equalsIgnoreCase(matriculaBuscar)) 
                        {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado)
                        {
                            JOptionPane.showMessageDialog(null, "Matricula encontrada.");
                        } 
                    else 
                        {
                        JOptionPane.showMessageDialog(null, "Matricula no encontrado.");
                        }
                 break;

                 case 4:

                 String matriculaEliminar = JOptionPane.showInputDialog(null, "Introduce la matricula de el vehiculo a eliminar");
                    boolean eliminado = false;
                    for (int j = 0; j < i; j++) 
                    {
                        if (vehiculos[j].getMatricula().equalsIgnoreCase(matriculaEliminar)) 
                            {   
                                for (int k = j; k < i - 1; k++) 
                                {
                                vehiculos[k] = vehiculos[k + 1];
                                }
                                i--;
                                eliminado = true;
                                break;
                            }
                    }
                    if (eliminado) 
                    {
                    JOptionPane.showMessageDialog(null, "Vehiculo eliminado.");
                    } 
                    else 
                    {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún vehiculo con la matricula " + matriculaEliminar);
                    }
                break;  

                
                case 5:
                   // Ordenar los vehículos por matrícula usando bubble sort
                for (int j = 0; j < i - 1; j++) 
                {
                    for (int k = 0; k < i - j - 1; k++) 
                    {
                    if (vehiculos[k].getMatricula().compareToIgnoreCase(vehiculos[k+1].getMatricula()) > 0) 
                    {
                     Vehiculo vehiculoOrdenado = vehiculos[k];
                     vehiculos[k] = vehiculos[k+1];
                     vehiculos[k+1] = vehiculoOrdenado;
                    }
                    }
                }
                JOptionPane.showMessageDialog(null, "Los vehículos han sido ordenados por matrícula.");
                break;                      
            }
    }while(respuesta !=6);

                  
    }
        //Metodo que crea vehiculos
    public static Vehiculo crearVehiculo(int tipo, String matricula, String modelo, int potencia){
        if(tipo == 1){
                    return new Taxi(matricula, modelo, potencia);
        }
        if(tipo == 2){
            return new Autobus(matricula, modelo, potencia);
        }
        return null;
    }
}

    // public static Vehiculo[] eliminarVehiculo(Vehiculo[] array, int identificador) {
    //     Vehiculo[] arrayNuevo = new Vehiculo[array.length-1];
    //     int contador = 0;
    //     for(int i = 0; i < array.length; i++) {
    //         if(i != identificador) {
    //             arrayNuevo[contador] = array[i];
    //             contador++;
    //         }
    //     }
    //     return arrayNuevo;
    // }
    
    
//}

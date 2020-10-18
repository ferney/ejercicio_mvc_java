
package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mundo.ConsumoEnergetico;
import gui.PanelDatosEntrada;
import gui.PanelOperaciones;
import gui.PanelResultados;

public class InterfazConsumoEnergetico extends JFrame
{ 
    //Elementos de la ventana(Atributos)
    private PanelDatosEntrada miPanelDatosEntrada;
    private PanelOperaciones miPanelOperaciones;
    private PanelResultados miPanelResultados;
    private ConsumoEnergetico miConsumoEnergetico;
   
    //Metodo constructor de la ventana
    public InterfazConsumoEnergetico()
    {
    //Definir el contenedor de la ventana
    setLayout(null);   
    
    
    
    
    //Creacion y Adicion del`PanleDatosEntrada
    miPanelDatosEntrada = new PanelDatosEntrada();
    miPanelDatosEntrada.setBounds(10, 10, 480, 150);
    add(miPanelDatosEntrada);
    
    //Creacion y adicion del PanelOperaciones
    miPanelOperaciones= new PanelOperaciones(this);
    miPanelOperaciones.setBounds(10, 200, 480, 100);
    add(miPanelOperaciones);

    //Creación y adicion del PanelResultados
    miPanelResultados = new PanelResultados();
    miPanelResultados.setBounds(10,310,480,130);
    add(miPanelResultados);

    //Caracteristicas de la ventana
    this.setTitle("Consumo_Energetico");
    this.setSize(500,500);
    setLocation(100,100);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
   miConsumoEnergetico = new ConsumoEnergetico();
     }
    public void Calcular()
    {    

 //Almacenamos en una variable el valor del radio
 double f = Double.parseDouble(miPanelDatosEntrada.getFuerza());
 double d = Double.parseDouble(miPanelDatosEntrada.getDistancia());
 
 
 miConsumoEnergetico.setF(f,d);

 //Calculo el valor del perimetro y area del circulo
 miConsumoEnergetico.HallarTrabajo();
 //Almacenamos en variables el valor del area y el perimetro
 double Trabajo = miConsumoEnergetico.getT();
 
 
 //Mostramos el resultado (area/perimetro) segun opcion seleccionado 
     try {
         
     
     miPanelDatosEntrada.getDistancia(); 
 //Enviamos resultados al PanelResultados
 miPanelResultados.setTrabajo("Trabajo: "+Trabajo+"\n");
 
 
 }
 catch(NumberFormatException ex)
 {
 JOptionPane.showMessageDialog(this,"Error en datos de entrada","Energia",JOptionPane.ERROR_MESSAGE);
 }
 }
 
 public void borrar()
 {  
 
 miPanelDatosEntrada.borrarFuerza();
 miPanelDatosEntrada.borrarDistancia();
 miPanelResultados.borrar();
 }

 public void salir()
 {
 JOptionPane.showMessageDialog(this,"Gracias","Energia",JOptionPane.INFORMATION_MESSAGE);
 System.exit(0);
 }
    //Metodo principal
 public static void main(String[] args)
    {
 InterfazConsumoEnergetico miInterfazConsumoEnergetico = new InterfazConsumoEnergetico();
 miInterfazConsumoEnergetico.setVisible(true);
    }

    
}

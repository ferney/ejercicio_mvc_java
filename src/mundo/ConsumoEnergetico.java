/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author USUARIO
 */
public class ConsumoEnergetico
{
    //Atributos
    private double Trabajo,Fuerza,Distancia;
    
    //Metodos
    
    public void setF(double f, double d)
    {
        this.Fuerza = f;
        this.Distancia = d;
    }
    
    public void HallarTrabajo()
    {
        Trabajo = Fuerza*Distancia;
    }
    
    public double getT()
            
  {
      return Trabajo;
  }

}

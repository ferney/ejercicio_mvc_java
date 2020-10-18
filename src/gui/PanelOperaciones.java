/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author USUARIO
 */
public class PanelOperaciones extends JPanel implements ActionListener
{        
        //Elementos del panel(Atributos)
        private final JButton bCalcular;
        private final JButton bBorrar;
        private final InterfazConsumoEnergetico miInterfazConsumoEnergetico;
        
        //Metodo constructor del panel
        public PanelOperaciones(InterfazConsumoEnergetico ico)
        {
            //Definicion contenedor del panel
        setLayout(null);
        setBackground(Color.WHITE);
         TitledBorder borde = BorderFactory.createTitledBorder("Datos Operacion");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
        
        //creacion de un objeto de tipo InterfazAreaPerimetroCirculo
        miInterfazConsumoEnergetico = ico;
        
         //crear y agregar JButton bCalcular
        bCalcular = new JButton("Calcular");
        bCalcular.setBounds(60, 30, 100, 40);
        add(bCalcular);
        bCalcular.setActionCommand("calcular");
        bCalcular.addActionListener(this);
        
        //crear y agregar JButton bBorrar
        bBorrar = new JButton("Borrar");
        bBorrar.setBounds(220, 30, 100, 40);
        add(bBorrar);
        bBorrar.setActionCommand("borrar");
        bBorrar.addActionListener(this);
        }        

    //PanelOperaciones() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}


    //Metodo de atencion de eventos
    public void actionPerformed(ActionEvent e) 
    {
        //identificar el evento o comando generado 
        String comando = e.getActionCommand();
        if(comando.equals("calcular"))
        {
            //Se hizo click en el boton calcular
        JOptionPane.showMessageDialog(this, "Realizar Operacion","Trabajo",JOptionPane.INFORMATION_MESSAGE);
         
         miInterfazConsumoEnergetico.Calcular();
        }
        if(comando.equals("borrar"))
                
        {
        //Se hizo click en el boton borrar
        JOptionPane.showMessageDialog(this, "Se Borrara la OPeracion","Energia",JOptionPane.INFORMATION_MESSAGE);
         
        miInterfazConsumoEnergetico.borrar();
        }
    }
     
}

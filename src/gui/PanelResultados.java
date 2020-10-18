/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author USUARIO
 */
public class PanelResultados extends JPanel
{
    //Elementos del panel(Atributos)
    private JLabel lTrabajo;
    private JTextField tfTrabajo;
    
     //Metodo constructor del panel
    public PanelResultados()
    {
        //Definicion contenedor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados de Fuerza");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
        
        //Crear y agregar el label lRArea
        lTrabajo = new JLabel("Trabajo:", JLabel.CENTER);
        lTrabajo.setFont(new Font("Arial", Font.BOLD, 30));
        lTrabajo.setForeground(Color.BLUE);
        lTrabajo.setBounds(10, 40, 260, 40);
        add(lTrabajo);
                
        //Crear y agregar el campo de texto tfArea
        tfTrabajo = new JTextField();
        tfTrabajo.setFont(new Font("Arial", Font.BOLD,20));
        tfTrabajo.setForeground(Color.BLUE);
        tfTrabajo.setBounds(270, 40, 200, 40);
        tfTrabajo.setEnabled(false);
        add(tfTrabajo);
        
        }
    public void borrar()
    {
        tfTrabajo.setText("");
        
    }
    
    public void setTrabajo(String pA)
    {
        tfTrabajo.setText(""+pA);
    }
    
        
   
}

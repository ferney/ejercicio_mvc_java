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
public class PanelDatosEntrada extends JPanel 
{
    //Elementos del panel(Atributos)
    private JLabel lFuerza;
    private JTextField tfFuerza;
    private JLabel lDistancia;
    private JTextField tfDistancia;
    
    //Metodo constructor del panel
    public PanelDatosEntrada()
    {
        //Definicion contenedor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
        
        //Crear y agregar el label lRadio
        lFuerza = new JLabel("Fuerza:", JLabel.CENTER);
        lFuerza.setFont(new Font("Arial", Font.BOLD, 40));
        lFuerza.setForeground(Color.BLUE);
        lFuerza.setBounds(10, 30, 180, 30);
        add(lFuerza);
        
        lDistancia = new JLabel("Distancia:", JLabel.CENTER);
        lDistancia.setFont(new Font("Arial", Font.BOLD, 40));
        lDistancia.setForeground(Color.BLUE);
        lDistancia.setBounds(10, 80, 180, 30);
        add(lDistancia);
        
        //Crear y agregar el campo de texto tfRadio
        tfFuerza = new JTextField();
        tfFuerza.setFont(new Font("Arial", Font.BOLD,40));
        tfFuerza.setForeground(Color.BLUE);
        tfFuerza.setBounds(190, 30, 100, 40);
        add(tfFuerza);
        
        tfDistancia = new JTextField();
        tfDistancia.setFont(new Font("Arial", Font.BOLD,40));
        tfDistancia.setForeground(Color.BLUE);
        tfDistancia.setBounds(190, 80, 100, 40);
        add(tfDistancia);
    }        
    //Metodos auxiliares
    public String getFuerza()
    {
        return tfFuerza.getText();
    }
    
    public void borrarFuerza()
    {
        tfFuerza.setText("");
        
    }
    public String getDistancia()
    {
        return tfDistancia.getText();
    }
    
    public void borrarDistancia()
    {
        tfDistancia.setText("");
        
    }

    
}

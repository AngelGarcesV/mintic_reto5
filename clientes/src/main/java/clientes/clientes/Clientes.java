package clientes.clientes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clientes{
    
    
    public Clientes(String dat) {
        //creacion de la ventana principal con nombre mainWINDOW
        JFrame mainWindow = new JFrame(dat);
        
        //creacion de los botones
        JButton aniadir=new JButton("añadir");
        JButton buscar=new JButton("buscar");
        JButton modificar=new JButton("modificar");
        JButton listar=new JButton("listar");
        
        //posicionamiento y color de los botones
        aniadir.setBounds(25, 100, 100, 30);
        aniadir.setBackground(Color.CYAN);
        
        buscar.setBounds(160, 100, 100, 30);
        buscar.setBackground(Color.CYAN);
        
        modificar.setBounds(25, 150, 100, 30);
        modificar.setBackground(Color.CYAN);
        
        listar.setBounds(160, 150, 100, 30);
        listar.setBackground(Color.CYAN);
        
        
        //codigo del comportamiento de los botones
        ActionListener openAniadir=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                aniadir ani=new aniadir("añadir");
            }
        };
        
        ActionListener openBuscar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buscar busc=new buscar("buscar");
            }
        };
        
        ActionListener openActualisar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                BSactualisar busc=new BSactualisar("buscar cod");
            }
        };
        
        //comportamiento de los botones
        aniadir.addActionListener(openAniadir);
        buscar.addActionListener(openBuscar);
        modificar.addActionListener(openActualisar);
        
        //agrega los botones a la ventana
        mainWindow.add(aniadir);
        mainWindow.add(buscar);
        mainWindow.add(modificar);
        mainWindow.add(listar);
        
        //ajustes de posicion tamaño y visibilidad de la ventana principal
        mainWindow.setLayout(null);  
        mainWindow.setSize(300,250);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        Clientes ventana=new Clientes("ejemplo");
        //modificador mod=new modificador();
    }
    
}

package clientes.clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class BSactualisar {
    public BSactualisar(String nombre){
        //ventana
        JFrame buscar=new JFrame(nombre);
        
        //etiqueta, posicion de etiqueta y se añade la etiqueta
        JLabel LCodigo = new JLabel("codigo");
        LCodigo.setBounds(50, 18, 60, 30);
        buscar.add(LCodigo);
        
        //area de texto, posicion del area de texto y se añade el area de texto
        JTextField codigo=new JTextField(10);
        codigo.setBounds(110, 18, 60, 30);
        buscar.add(codigo);
        
        //boton, posicion del boton y se añade el boton
        JButton bus = new JButton("buscar");
        bus.setBounds(180, 18, 90, 30);
        buscar.add(bus);
        
        //codigo del boton
        ActionListener openMod=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                modificador mod=new modificador();
            }
        };
        //llama el codigo del boton
        bus.addActionListener(openMod);
        
        //ajustes de posicion tamaño y visibilidad de la ventana
        buscar.setLayout(null);
        buscar.setSize(350, 100);
        buscar.setVisible(true);
    }
}
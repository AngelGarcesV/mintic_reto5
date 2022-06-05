
package clientes.clientes;
import javax.swing.*;
public class aniadir {
    public aniadir(String dat){
        //crea la ventana
        JFrame aniadir = new JFrame(dat);
        
        //crea las etiquetas y los campos de texto, primero crea el label y despues el area de texto
        
        //etiqueta
        JLabel LNombre=new JLabel("Nombre");
        LNombre.setBounds(50, 10, 50, 20);
        aniadir.add(LNombre);
        //area de texto
        JTextField nombre=new JTextField(30);
        nombre.setBounds(50, 30, 100, 20);
        aniadir.add(nombre);
        
        //-------------------------------------------------------------------------------------------------
        JLabel LValorCompra = new JLabel("Valor de compra");
        LValorCompra.setBounds(50, 70, 120, 20);
        aniadir.add(LValorCompra);
        
        JTextField valorCompra=new JTextField(30);
        valorCompra.setBounds(50, 90, 100, 20);
        aniadir.add(valorCompra);
        
        //-------------------------------------------------------------------------------------------------
        JLabel LValorVenta = new JLabel("Valor de venta");
        LValorVenta.setBounds(50, 130, 120, 20);
        aniadir.add(LValorVenta);
        
        JTextField valorVenta=new JTextField(30);
        valorVenta.setBounds(50, 150, 100, 20);
        aniadir.add(valorVenta);
        
        //-------------------------------------------------------------------------------------------------
        JLabel LCantidad = new JLabel("Cantidad producto");
        LCantidad.setBounds(50, 190, 120, 20);
        aniadir.add(LCantidad);
        
        JTextField cantidad=new JTextField(30);
        cantidad.setBounds(50, 210, 100, 20);
        aniadir.add(cantidad);
        
        //-------------------------------------------------------------------------------------------------
        JLabel LCategoria = new JLabel("Categoria");
        LCategoria.setBounds(50, 250, 120, 20);
        aniadir.add(LCategoria);
        
        JTextField categoria=new JTextField(30);
        categoria.setBounds(50, 270, 100, 20);
        aniadir.add(categoria);
        
        
        
        //boton de enviar
        JButton enviar=new JButton("Crear");
        enviar.setBounds(50, 300, 100, 20);
        aniadir.add(enviar);
        
        //ajustes de posicion tamaño y visibilidad de la ventana principal
        aniadir.setLayout(null);
        aniadir.setSize(220, 400);
        aniadir.setVisible(true);
    }
}

package clientes.clientes;
import javax.swing.*;

public class DatPro {
    public DatPro(){
        //creacion de la ventana
        JFrame Datos=new JFrame("datos");
        
        //creacion de las etiquetas 
        JLabel LCodigo=new JLabel("codigo:");
        JLabel LNombre=new JLabel("Nombre:");
        JLabel LValorCompra=new JLabel ("Valor de compra:");
        JLabel LValorVenta=new JLabel("Valor de venta:");
        JLabel LCantidad=new JLabel("cantidad:");
        JLabel LCategoria=new JLabel("Categoria:");
        
        //creacion de las etiquetas donde se veran los datos
        JLabel Codigo=new JLabel("?");
        JLabel Nombre=new JLabel("?");
        JLabel ValorCompra=new JLabel ("?");
        JLabel ValorVenta=new JLabel("?");
        JLabel Cantidad=new JLabel("?");
        JLabel Categoria=new JLabel("?");
        
        //configuracion de la posicion
        LCodigo.setBounds(10, 10, 100, 30);
        LNombre.setBounds(10, 30, 100, 30);
        LValorCompra.setBounds(10, 50, 100, 30);
        LValorVenta.setBounds(10, 70, 100, 30);
        LCantidad.setBounds(10, 90, 100, 30);
        LCategoria.setBounds(10, 110, 100, 30);
        
        Codigo.setBounds(130, 10, 100, 30);
        Nombre.setBounds(130, 30, 100, 30);
        ValorCompra.setBounds(130, 50, 100, 30);
        ValorVenta.setBounds(130, 70, 100, 30);
        Cantidad.setBounds(130, 90, 100, 30);
        Categoria.setBounds(130, 110, 100, 30);
        
        
        //añade las etiquetas a la ventana
        Datos.add(LCodigo);
        Datos.add(LNombre);
        Datos.add(LValorCompra);
        Datos.add(LValorVenta);    
        Datos.add(LCantidad);          
        Datos.add(LCategoria);         
        Datos.add(Codigo);
        Datos.add(Nombre);
        Datos.add(ValorCompra);
        Datos.add(ValorVenta);    
        Datos.add(Cantidad);          
        Datos.add(Categoria); 
        
        
        //ajustes de posicion tamaño y visibilidad de la ventana
        Datos.setLayout(null);
        Datos.setSize(300, 200);
        Datos.setVisible(true);
    }
}

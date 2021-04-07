package prototipo;

import javax.swing.JOptionPane;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

public class Prototipo {

    public static void main(String[] args) {
        byte option1 = 0, option2 = 0, option3 = 0, option4 = 0, option5;
        File data;
        
       
        FileWriter escribir;
        PrintWriter line = null;
        FileReader lectura;
        BufferedReader Almacenaje;
        String nombre, descripcion;
        int id;
        double precioventa, preciocompra;
        boolean estado = (true);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Date fecha = new Date();
        data = new File("Sistema");

        do {
            option1 = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menu principal\n"
                    + "1.Productos\n"
                    + "2.Bodega\n"
                    + "3.Ventas\n"
                    + "4.Reportes\n"
                    + "5.Salir\n"
                    + "Eliga su opcion :"));
            switch (option1) {
                case 1:
                    do {
                        option2 = Byte.parseByte(JOptionPane.showInputDialog(
                                "Productos\n"
                                + "1.Crear\n"
                                + "2.Modificar\n"
                                + "3.Eliminar\n"
                                + "4.atras\n"
                                + "Elija su opcion :"));
                        switch (option2) {
                            case 1:
                        File archivo = new File("usuario.txt");
                                if (archivo.exists()) {
                                    try {
                                        archivo.createNewFile();
                                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el ID del producto:"));
                                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto :");
                                        descripcion = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion :");
                                        preciocompra= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de comopra en Quetzales :"));
                                        precioventa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de venta en Quetzales :"));
                                        estado = (true);
                                        escribir = new FileWriter(archivo, true);
                                        line = new PrintWriter(escribir);
                                        line.println(id);
                                        line.println(nombre);
                                        line.println(descripcion);
                                        line.println(preciocompra);
                                        line.println(precioventa);
                                        line.println(fecha);
                                        line.println(estado); 
                                        line.close();
                                        escribir.close();
                                    } catch (IOException ex) {
                                        Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                } else {
                                    try {
                                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el ID del producto:"));
                                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto :");
                                        descripcion = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion :");
                                        preciocompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de compra en Quetzales :"));
                                        precioventa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de venta en Quetzales :"));
                                        estado = (true);
                                        escribir = new FileWriter(archivo, true);
                                        line = new PrintWriter(escribir);
                                        line.println(id);
                                        line.println(nombre);
                                        line.println(descripcion);
                                        line.println(preciocompra);
                                        line.println(precioventa);
                                        line.println(fecha);
                                        line.println(estado);
                                        line.close();
                                        escribir.close();
                                    } catch (IOException ex) {
                                        Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                              
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Modificar");
                                
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Eliminar");
                                
                               
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Atras");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida...");
                                break;

                        }
                    } while (option2 != 4);
                    break;
                case 2:
                    do {
                        option2 = Byte.parseByte(JOptionPane.showInputDialog(
                                "Bodega\n"
                                + "1.Crear\n"
                                + "2.Modificar\n"
                                + "3.Eliminar\n"
                                + "4.Ingresar Producto\n"
                                + "5.Traslado de bodega\n"
                                + "6.atras\n"
                                + "Elija su opcion :"));
                        switch (option2) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Crear");
                        File archivo = new File("bodega1.txt");
                                if (archivo.exists()) {
                                    try {
                                        archivo.createNewFile();
                                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el ID del producto que desea crear:"));
                                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto que desea crear :");
                                        descripcion = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion del producto que desea crea :");
                                        preciocompra= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de compra en Quetzales :"));
                                        precioventa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de venta en Quetzales :"));
                                        estado = (true);
                                        escribir = new FileWriter(archivo, true);
                                        line = new PrintWriter(escribir);
                                        line.println(id);
                                        line.println(nombre);
                                        line.println(descripcion);
                                        line.println(preciocompra);
                                        line.println(precioventa);
                                        line.println(fecha);
                                        line.println(estado); 
                                        line.close();
                                        escribir.close();
                                    } catch (IOException ex) {
                                        Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                } else {
                                    try {
                                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el ID del producto:"));
                                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:");
                                        descripcion = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion del producto :");
                                        preciocompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de compra en Quetzales :"));
                                        precioventa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de venta en Quetzales :"));
                                        estado = (true);
                                        escribir = new FileWriter(archivo, true);
                                        line = new PrintWriter(escribir);
                                        line.println(id);
                                        line.println(nombre);
                                        line.println(descripcion);
                                        line.println(preciocompra);
                                        line.println(precioventa);
                                        line.println(fecha);
                                        line.println(estado);
                                        line.close();
                                        escribir.close();
                                    } catch (IOException ex) {
                                        Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Modificar");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Eliminar");
                               
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Ingreso de producto");
                                archivo = new File("bodega1.txt");
                                if (archivo.exists()) {
                                    try {
                                        archivo.createNewFile();
                                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el ID del producto:"));
                                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto :");
                                        descripcion = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion :");
                                        preciocompra= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de comopra en Quetzales :"));
                                        precioventa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de venta en Quetzales :"));
                                        estado = (true);
                                        escribir = new FileWriter(archivo, true);
                                        line = new PrintWriter(escribir);
                                        line.println(id);
                                        line.println(nombre);
                                        line.println(descripcion);
                                        line.println(preciocompra);
                                        line.println(precioventa);
                                        line.println(fecha);
                                        line.println(estado); 
                                        line.close();
                                        escribir.close();
                                    } catch (IOException ex) {
                                        Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                } else {
                                    try {
                                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el ID del producto:"));
                                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto :");
                                        descripcion = JOptionPane.showInputDialog(null, "Ingrese una breve descripcion :");
                                        preciocompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de compra en Quetzales :"));
                                        precioventa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de venta en Quetzales :"));
                                        estado = (true);
                                        escribir = new FileWriter(archivo, true);
                                        line = new PrintWriter(escribir);
                                        line.println(id);
                                        line.println(nombre);
                                        line.println(descripcion);
                                        line.println(preciocompra);
                                        line.println(precioventa);
                                        line.println(fecha);
                                        line.println(estado);
                                        line.close();
                                        escribir.close();
                                    } catch (IOException ex) {
                                        Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Traslado de bodega");
                                break;
                            case 6:
                                JOptionPane.showMessageDialog(null, "Atras");
                                break;
                        }
                    } while (option2 != 6);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ventas");
                   option3 = Byte.parseByte(JOptionPane.showInputDialog(
                                "ventas\n"
                                + "1.ventas diarias\n"
                                + "2.ventas semanales\n"
                                + "3.ventas mensuales\n"
                                + "4.atras\n"
                                + "Elija su opcion :"));
                   switch (option3){
                   case 1:
                                JOptionPane.showMessageDialog(null, "ventas diarias");
                        break;        
                   case 2:
                                JOptionPane.showMessageDialog(null, "ventas semanales"); 
                        break;        
                   case 3:
                                JOptionPane.showMessageDialog(null, "ventas mensuales"); 
                        break;
                    case 4: 
                                JOptionPane.showMessageDialog(null, "atras");
                     } while (option3 != 4);        
                   
                   break;
                case 4:
                    do {
                        option3 = Byte.parseByte(JOptionPane.showInputDialog(
                                "Productos\n"
                                + "1.Rotacion de inventario\n"
                                + "2.Reporte diario de ventas\n"
                                + "3.Atras\n"
                                + "Elija su opcion :"));
                        switch (option3) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Rotacion de inventario");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Reporte diario de ventas");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Atras");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida...");
                                break;

                        }
                    } while (option3 != 3);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Hasta la proxima...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida...");
                    break;
            }
        } while (option1
                != 5);
        System.exit(0);
    }

}

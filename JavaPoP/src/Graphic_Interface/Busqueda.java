/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_Interface;

import static Graphic_Interface.Inicio.Productos;
import static Graphic_Interface.Inicio.RutaProductos;
import static Graphic_Interface.Inicio.RutaVentas;
import static Graphic_Interface.Inicio.Ventas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javapop.Cliente;
import javapop.JavaPoP;

import javapop.Producto;
import javapop.Venta;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel González González - GISI
 */
public class Busqueda extends javax.swing.JFrame {

    public static ArrayList<Producto> ProductosLocal = new ArrayList();
    public static Cliente cliente;

    private static ArrayList<Producto> recalcularProximidad(ArrayList<Producto> categoria_ord) {
        int aux = 0;
        while (aux < categoria_ord.size()){
            categoria_ord.get(aux).setProximidad(proximidad(cliente.cod_postal,categoria_ord.get(aux).propietario.cod_postal));
            aux++;
        }
        return categoria_ord;
    }
    /**
     * Este método comprueba la próximidad de las ubicaciones mediante el código postal
     * @param cod_post1
     * @param cod_post2
     * @return 
     */
    private static int proximidad(String cod_post1, String cod_post2) {
        int prox = 0;
        int i = 0;
        int coincidencia = 5;

        while (i < cod_post1.length()) {
            if (cod_post1.charAt(i) != cod_post2.charAt(i)) {
                coincidencia--;
            }
            i++;
        }
        switch (coincidencia) {
            case 0:
                prox = 5; //Muy Lejano
                break;
            case 1:
                prox = 4; //Lejano
                break;
            case 2:
                prox = 3; //Proximo
                break;
            case 3:
                prox = 2; //Muy Proximo
                break;
            case 4:
                prox = 1; //Muy Proximo
                break;
        }

        return prox;
    }

    /**
     * Creates new form Busqueda
     */
    public Busqueda(Cliente cliente) {
        Busqueda.cliente = cliente;
        initComponents();
        tf_PC.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Descripcion = new javax.swing.JLabel();
        tf_Ubicacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Descripcion = new javax.swing.JTextArea();
        btn_Volver = new javax.swing.JButton();
        btn_Comprar = new javax.swing.JButton();
        lbl_Logo = new javax.swing.JLabel();
        tf_Categoria = new javax.swing.JTextField();
        tf_Estado = new javax.swing.JTextField();
        tf_Fecha = new javax.swing.JTextField();
        lbl_Categoria = new javax.swing.JLabel();
        lbl_Estado = new javax.swing.JLabel();
        tf_Precio = new javax.swing.JTextField();
        lbl_Euro = new javax.swing.JLabel();
        lbl_Precio = new javax.swing.JLabel();
        cb_Producto = new javax.swing.JComboBox<>();
        lbl_Imagen = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_Fecha = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        lbl_Ubicacion = new javax.swing.JLabel();
        cb_Categoria = new javax.swing.JComboBox<>();
        lbl_PC = new javax.swing.JLabel();
        tf_PC = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        lbl_Imagen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaPOP - Búsqueda de productos");

        lbl_Descripcion.setText("Descripción:");

        tf_Ubicacion.setEditable(false);

        ta_Descripcion.setEditable(false);
        ta_Descripcion.setColumns(20);
        ta_Descripcion.setRows(5);
        jScrollPane1.setViewportView(ta_Descripcion);

        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        btn_Comprar.setText("Comprar");
        btn_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComprarActionPerformed(evt);
            }
        });

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JavaPOP_Logo.png"))); // NOI18N

        tf_Categoria.setEditable(false);

        tf_Estado.setEditable(false);

        tf_Fecha.setEditable(false);

        lbl_Categoria.setText("Categoría:");

        lbl_Estado.setText("Estado:");

        tf_Precio.setEditable(false);
        tf_Precio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_Precio.setText("0.00");

        lbl_Euro.setText("€");

        lbl_Precio.setText("Precio:");

        cb_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto..." }));
        cb_Producto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ProductoItemStateChanged(evt);
            }
        });

        lbl_Imagen.setText("Fotografía:");

        lbl_Nombre.setText("Nombre:");

        lbl_Fecha.setText("Fecha:");

        tf_Nombre.setEditable(false);

        lbl_Ubicacion.setText("Ubicación:");

        cb_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una categoría....", "Moda y accesorios", "TV, audio y foto", "Móviles y telefonía", "Informática y electrónica", "Consolas y videojuegos", "Deporte y ocio" }));

        lbl_PC.setText("Palabras clave:");

        btn_Search.setText("Buscar");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        lbl_Imagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/noDisponible_opt.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_Producto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb_Categoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbl_PC)
                        .addGap(18, 18, 18)
                        .addComponent(tf_PC))
                    .addComponent(btn_Search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Descripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_Estado)
                                .addComponent(lbl_Precio)
                                .addComponent(lbl_Imagen)
                                .addComponent(lbl_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Ubicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                            .addComponent(lbl_Categoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tf_Precio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Euro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_Estado)
                            .addComponent(tf_Ubicacion)
                            .addComponent(tf_Categoria)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_Imagen1))
                            .addComponent(tf_Fecha))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_Comprar, btn_Volver});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_PC)
                            .addComponent(tf_PC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Search)
                        .addGap(18, 18, 18)
                        .addComponent(cb_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Volver)
                            .addComponent(btn_Comprar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Descripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Categoria)
                            .addComponent(tf_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Estado)
                            .addComponent(tf_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Euro)
                            .addComponent(lbl_Precio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Imagen)
                            .addComponent(lbl_Imagen1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Fecha)
                            .addComponent(tf_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Ubicacion)
                            .addComponent(tf_Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este método (botón) vuelve a la ventana anterior
     * @param evt 
     */
    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_VolverActionPerformed

    /**
     * Este método (botón) realiza la compra del producto seleccionado
     * @param evt 
     */
    private void btn_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComprarActionPerformed
        // TODO add your handling code here:
        if (cb_Producto.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto", "Error en la compra", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (JOptionPane.showConfirmDialog(null, "¿Desea comprar este producto?", "Compra de producto", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (JOptionPane.showOptionDialog(null, "Su '" + ProductosLocal.get(cb_Producto.getSelectedIndex() - 1).nombre + "' quiere ser comprado por " + cliente.nombre, "Mensaje para vendedor", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Vender", "No vender"}, "Vender") == JOptionPane.YES_OPTION) {
                crearVenta(ProductosLocal.get(cb_Producto.getSelectedIndex() - 1));
                crearFichero(ProductosLocal.get(cb_Producto.getSelectedIndex() - 1));
                JOptionPane.showMessageDialog(null, "El vendedor ha aceptado su compra", "Estado de Venta", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El vendedor ha rechazado su compra", "Estado de Venta", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {

        }
    }//GEN-LAST:event_btn_ComprarActionPerformed

    /**
     * Este método (combo box) llama al método limpiar (que vacía el texto), seleccionamos un producto de la lista y llama al método cambiarTexto (que nos muestra el producto)
     * @param evt 
     */
    private void cb_ProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ProductoItemStateChanged
        // TODO add your handling code here:
        limpiar();
        if (cb_Producto.getSelectedIndex() == 0) {
            return;
        }
        cambiarTexto();
    }//GEN-LAST:event_cb_ProductoItemStateChanged

    /**
     * Este método (botón) realiza la búsqueda con los parámetros introducidos por el usuario
     * @param evt 
     */
    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
        while (cb_Producto.getItemCount() > 1) {
            cb_Producto.removeItemAt(1); //Borra la lista del combo box
        }
        if (cb_Categoria.getSelectedIndex() == 0) { //Comprueba que el usuario no haya seleccionado ninguna categoría
            JOptionPane.showMessageDialog(rootPane, "Selecciona una categoria", "Categoria no seleccionada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ProductosLocal = busqueda(cb_Categoria.getItemAt(cb_Categoria.getSelectedIndex()), tf_PC.getText()); //Realiza una búsqueda de productos según los criterios del usuario
        cargaProductos(); //Cargamos los productos seleccionados a la combo box
        JOptionPane.showMessageDialog(rootPane, "Busqueda realizada", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_SearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda(cliente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Comprar;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cb_Categoria;
    private javax.swing.JComboBox<String> cb_Producto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Categoria;
    private javax.swing.JLabel lbl_Descripcion;
    private javax.swing.JLabel lbl_Estado;
    private javax.swing.JLabel lbl_Euro;
    private javax.swing.JLabel lbl_Fecha;
    private javax.swing.JLabel lbl_Imagen;
    private javax.swing.JLabel lbl_Imagen1;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_PC;
    private javax.swing.JLabel lbl_Precio;
    private javax.swing.JLabel lbl_Ubicacion;
    private javax.swing.JTextArea ta_Descripcion;
    private javax.swing.JTextField tf_Categoria;
    private javax.swing.JTextField tf_Estado;
    private javax.swing.JTextField tf_Fecha;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_PC;
    private javax.swing.JTextField tf_Precio;
    private javax.swing.JTextField tf_Ubicacion;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método vacía el texto de las cajas de texto
     */
    private void limpiar() {
        ta_Descripcion.setText("");
        tf_Categoria.setText("");
        tf_Estado.setText("");
        tf_Fecha.setText("");
        tf_Nombre.setText("");
        tf_Precio.setText("");
        tf_Ubicacion.setText("");
    }

    /**
     * Este método muestra la información del producto seleccionado cambiando el texto de las cajas de texto
     */
    private void cambiarTexto() {
        ta_Descripcion.setText(ProductosLocal.get(cb_Producto.getSelectedIndex() - 1).descripcion);
        tf_Categoria.setText(ProductosLocal.get(cb_Producto.getSelectedIndex() - 1).categoria);
        tf_Estado.setText(ProductosLocal.get(cb_Producto.getSelectedIndex() - 1).condicion);
        tf_Fecha.setText(ProductosLocal.get(cb_Producto.getSelectedIndex() - 1).fecha);
        tf_Nombre.setText(ProductosLocal.get(cb_Producto.getSelectedIndex() - 1).nombre);
        tf_Precio.setText(Double.toString(ProductosLocal.get(cb_Producto.getSelectedIndex() - 1).precio));
        tf_Ubicacion.setText(ProductosLocal.get(cb_Producto.getSelectedIndex() - 1).ubicacion);
    }

    /**
     * Este método sirve para buscar productos
     *
     * @param categoria
     * @param palabra_clave
     * @param cod_postal
     * @return Devuelve una array list de los productos ordenados que ha buscado el usuario
     */
    private static ArrayList busqueda(String categoria, String palabra_clave) {

        //Declaración de variables
        ArrayList<Producto> ordenados = new ArrayList();
        ArrayList<Producto> categoria_ord = new ArrayList();

        //Cuerpo de funcion
        for (int i = 0; i < Productos.size(); i++) { //Bucle for para recorrer el array de productos
            if (Productos.get(i).categoria.equalsIgnoreCase(categoria)) { //Comprobamos si la categoría del producto del array coincide con la que busca el usuario
                if (palabra_clave != "" && Productos.get(i).nombre.toLowerCase().contains(palabra_clave.toLowerCase())) { //Comprobamos también si la palabra clave del producto coincide con la que busca el usuario
                    categoria_ord.add(Productos.get(i)); //Añadimos los productos que coinciden con la categoría/clave
                } else if (palabra_clave == "") {
                    categoria_ord.add(Productos.get(i)); //Añadimos los productos que coinciden con la categoría (clave no introducida)
                }
            }
        }
        categoria_ord = recalcularProximidad(categoria_ord);
        ordenados = ordenar(categoria_ord);
        return ordenados;
    }

    /**
     * Este método sirve para ordenar los productos buscados por proximidad y urgencia
     *
     * @param categoria_ord
     * @return Devuelve un array list de los productos ordenados por proximidad y urgencia
     */
    private static ArrayList ordenar(ArrayList<Producto> categoria_ord) {
        ArrayList<Producto> ordenados = new ArrayList();
        ArrayList<Producto> ordenados0 = new ArrayList();
        ArrayList<Producto> ordenados1 = new ArrayList();
        ArrayList<Producto> ordenados2 = new ArrayList();
        ArrayList<Producto> ordenados3 = new ArrayList();
        ArrayList<Producto> ordenados4 = new ArrayList();
        ArrayList<Producto> ordenados5 = new ArrayList();

        //int contadorInterno = 1;
        while (!categoria_ord.isEmpty()) { //Recorreremos el array list hasta que categoria_ord esté vacío
            Producto producto = categoria_ord.get(0);
            //System.out.println("While Proximidad: " + producto.getProximidad());

            switch (producto.proximidad) { //Comprobamos la proximidad de cada producto, la añadimos a su correspondiente array list y la borramos de categoria_ord
                case 0:
                    //System.out.println("Entro en proximidad 0");
                    ordenados0.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 1:
                    //System.out.println("Entro en proximidad 1");
                    ordenados1.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 2:
                    //System.out.println("Entro en proximidad 2");
                    ordenados2.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 3:
                    //System.out.println("Entro en proximidad 3");
                    ordenados3.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 4:
                    //System.out.println("Entro en proximidad 4");
                    ordenados4.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 5:
                    //System.out.println("Entro en proximidad 5");
                    ordenados5.add(producto);
                    categoria_ord.remove(0);
                    break;
                default:
                    categoria_ord.remove(0);
                    break;
            }
        }
        //Ordenamos por urgencia cada array list ordenado por proximidad
        
        int aux0 = 0;
        while (ordenados0.size() > aux0) {
            Producto productoAOrdenar = ordenados0.get(aux0);
            if (productoAOrdenar.isUrgente()) {
                ordenados0.remove(aux0);
                ordenados0.add(0, productoAOrdenar);
            }
            aux0++;
        }
        int aux1 = 0;
        while (ordenados1.size() > aux1) {
            Producto productoAOrdenar = ordenados1.get(aux1);
            if (productoAOrdenar.isUrgente()) {
                ordenados1.remove(aux1);
                ordenados1.add(0, productoAOrdenar);
            }
            aux1++;
        }
        int aux2 = 0;
        while (ordenados2.size() > aux2) {
            Producto productoAOrdenar = ordenados2.get(aux2);
            if (productoAOrdenar.isUrgente()) {
                ordenados2.remove(aux2);
                ordenados2.add(0, productoAOrdenar);
            }
            aux2++;
        }
        int aux3 = 0;
        while (ordenados3.size() > aux3) {
            Producto productoAOrdenar = ordenados3.get(aux3);
            if (productoAOrdenar.isUrgente()) {
                ordenados3.remove(aux3);
                ordenados3.add(0, productoAOrdenar);
            }
            aux3++;
        }
        int aux4 = 0;
        while (ordenados4.size() > aux4) {
            Producto productoAOrdenar = ordenados4.get(aux4);
            if (productoAOrdenar.isUrgente()) {
                ordenados4.remove(aux4);
                ordenados4.add(0, productoAOrdenar);
            }
            aux4++;
        }
        int aux5 = 0;
        while (ordenados5.size() > aux5) {
            Producto productoAOrdenar = ordenados5.get(aux5);
            if (productoAOrdenar.isUrgente()) {
                ordenados5.remove(aux5);
                ordenados5.add(0, productoAOrdenar);
            }
            aux5++;
        }

        //Añadimos todos los array list ordenados por proximidad y urgencia al array list ordenados
        
        ordenados.addAll(ordenados0);
        ordenados.addAll(ordenados1);
        ordenados.addAll(ordenados2);
        ordenados.addAll(ordenados3);
        ordenados.addAll(ordenados4);
        ordenados.addAll(ordenados5);

        return ordenados;
    }

    /**
     * Este método carga los productos a la combo box para poder seleccionarlos
     */
    private void cargaProductos() {
        int aux = 0;
        while (aux < ProductosLocal.size()) {
            cb_Producto.addItem(ProductosLocal.get(aux).nombre);
            aux++;
        }
    }

    /**
     * Este método crea la venta para poder registrarla en el sistema
     * @param productoComprado 
     */
    private void crearVenta(Producto productoComprado) {
        LocalDate date = LocalDate.now(); //Cojemos la fecha actual
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // "d/MM/uuuu"
        String text = date.format(formatters); //Formateamos la fecha
        
        Ventas.add(new Venta(productoComprado, text , cliente.DNI, productoComprado.propietario.DNI, cliente.nombre, productoComprado.propietario.nombre)); //Añadimos una nueva venta
        guardarVentas(); //Guardamos la venta
        eliminarProducto(productoComprado); //Eliminamos el producto comprado
        guardarProductos(); //Actualizamos y guardamos los productos restantes
        Productos = readProducts();
        this.setVisible(false);
    }

    /**
     * Este método nos crea el "ticket" de la venta con los DNI's de los usuarios implicados
     * @param productoComprado 
     */
    private void crearFichero(Producto productoComprado) {
        try {
            String ruta = "./Ficheros/Productos Vendidos/" + Busqueda.cliente.DNI + "-" + productoComprado.propietario.DNI + ".txt"; //Indicamos la ruta donde vamos a guardar el "ticket"
            File file = new File(ruta);
            //Si el archivo no existe, se crea
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            //Imprimimos la información correspondiente
            bw.write("Nombre producto: " + productoComprado.nombre + "\n");
            bw.write("Descripción: " + productoComprado.descripcion + "\n");
            bw.write("Categoria: " + productoComprado.categoria + "\n");
            bw.write("Estado: " + productoComprado.condicion + "\n");
            bw.write("Precio: " + productoComprado.precio + "\n");
            bw.write("Fecha Publicación: " + productoComprado.fecha + "\n");
            bw.write("Ubicación: " + productoComprado.propietario.ciudad + "\n");
            bw.write("Fecha: " + LocalDate.now() + "\n");
            bw.write("Nombre Vendedor: " + productoComprado.propietario.nombre + "\n");
            bw.write("DNI Vendedor: " + productoComprado.propietario.DNI + "\n");
            bw.write("Nombre Comprador: " + cliente.nombre + "\n");
            bw.write("DNI Comprador: " + cliente.DNI + "\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Este método registra las ventas en el sistema para que puedan ser consultadas por el administrador
     */
    private void guardarVentas() {
        try {
            int i = 0;
            //Menú de la app JavaPoP
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RutaVentas));
            while (i < Ventas.size()) {
                oos.writeObject(Ventas.get(i));
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(JavaPoP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Este método elimina el producto comprado por el usuario
     * @param productoComprado 
     */
    private void eliminarProducto(Producto productoComprado) {
        int aux = 0;
        while (aux < Productos.size()) {
            if (Productos.get(aux).propietario.equals(productoComprado.propietario)&&Productos.get(aux).descripcion.equals(productoComprado.descripcion)){
            Productos.remove(aux); //Si el propietario y la descripción del producto coinciden con el propietario y la descripción del producto comprado, borramos el producto
            return;
            }
            aux++;
        }
    }

    /**
     * Este método lee los productos que hay en la ruta determinada para poder actualizarlos
     * @return Devuelve un array list de los productos
     */
    public static ArrayList<Producto> readProducts() {
        ArrayList<Producto> al = new ArrayList();
        boolean cont = true;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RutaProductos));
            while (cont != false) {
                Producto obj = null;
                try {
                    obj = (Producto) ois.readObject();
                } catch (IOException | ClassNotFoundException e) {

                }
                if (obj != null) {
                    al.add(obj);
                } else {
                    cont = false;
                }
            }
        } catch (IOException e) {
        }
        return al;
    }

    /**
     * Este método guarda los productos restantes una vez se ha vendido alguno de ellos
     */
    private void guardarProductos() {
        try {
            int i = 0;
            //Menú de la app JavaPoP
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RutaProductos));
            while (i < Productos.size()) {
                oos.writeObject(Productos.get(i));
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(JavaPoP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

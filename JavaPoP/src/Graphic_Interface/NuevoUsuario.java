/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_Interface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static Graphic_Interface.Inicio.RutaUsuarios;
import java.util.ArrayList;
import javapop.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel González González - GISI
 */
public class NuevoUsuario extends javax.swing.JFrame {

    public static ArrayList<Cliente> Usuarios;

    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario(ArrayList<Cliente> Usuarios) {
        NuevoUsuario.Usuarios = Usuarios;
        initComponents();
        tf_NIE.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG_ID = new javax.swing.ButtonGroup();
        lbl_Logo = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        tf_DNI = new javax.swing.JTextField();
        tf_Correo = new javax.swing.JTextField();
        lbl_Correo = new javax.swing.JLabel();
        tf_Contrasena = new javax.swing.JTextField();
        lbl_Contrasena = new javax.swing.JLabel();
        lbl_Contrasena1 = new javax.swing.JLabel();
        tf_Contrasena1 = new javax.swing.JTextField();
        lbl_Ciudad = new javax.swing.JLabel();
        tf_Ciudad = new javax.swing.JTextField();
        tf_CP = new javax.swing.JTextField();
        lbl_CP = new javax.swing.JLabel();
        lbl_Tarjeta = new javax.swing.JLabel();
        tf_Tarjeta = new javax.swing.JTextField();
        lbl_CCV = new javax.swing.JLabel();
        tf_CCV = new javax.swing.JTextField();
        btn_Create = new javax.swing.JButton();
        btn_Cancell = new javax.swing.JButton();
        tf_NIE = new javax.swing.JTextField();
        rb_DNI = new javax.swing.JRadioButton();
        rb_NIE = new javax.swing.JRadioButton();
        tf_Nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JavaPOP - Registro");

        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JavaPOP_Logo.png"))); // NOI18N

        lbl_Nombre.setText("Nombre:");

        lbl_Correo.setText("Correo Electrónico:");

        lbl_Contrasena.setText("Contraseña:");

        lbl_Contrasena1.setText("Repita contraseña:");

        lbl_Ciudad.setText("Ciudad:");

        lbl_CP.setText("Código Postal:");

        lbl_Tarjeta.setText("Número Tarjeta:");

        lbl_CCV.setText("CCV");

        btn_Create.setText("Crear Usuario");
        btn_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateActionPerformed(evt);
            }
        });

        btn_Cancell.setText("Cancelar");
        btn_Cancell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancellActionPerformed(evt);
            }
        });

        btnG_ID.add(rb_DNI);
        rb_DNI.setSelected(true);
        rb_DNI.setText("DNI");
        rb_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_DNIActionPerformed(evt);
            }
        });

        btnG_ID.add(rb_NIE);
        rb_NIE.setText("NIE");
        rb_NIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_NIEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cancell, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_DNI)
                            .addComponent(rb_NIE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Correo))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_NIE, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(tf_DNI, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(tf_Nombre))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Tarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_CP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Ciudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Contrasena1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Contrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_CCV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Nombre)
                            .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_DNI))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_NIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_NIE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Correo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Contrasena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Contrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Contrasena1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Ciudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_CP)
                            .addComponent(tf_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Tarjeta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_CCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_CCV)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Create)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cancell)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este método (botón) coje la información de cada caja de texto, guarda el usuario y vuelve al menú principal
     * @param evt 
     */
    private void btn_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateActionPerformed
        // TODO add your handling code here:
        if (comprobacion()) {
            Usuarios.add(new Cliente(tf_DNI.getText(), tf_Nombre.getText(), tf_Correo.getText(), tf_Contrasena.getText(), tf_CP.getText(), tf_Ciudad.getText(), tf_Tarjeta.getText(), tf_CCV.getText()));
            guardarUsuario(); //Actualiza y guarda los usuarios
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_CreateActionPerformed

    /**
     * Este método (radio button) impide escribir en la casilla del NIE y la vacía de texto si se selecciona la casilla del DNI
     * @param evt 
     */
    private void rb_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_DNIActionPerformed
        // TODO add your handling code here:
        if (btnG_ID.isSelected(rb_DNI.getModel())) { //Si seleccionamos DNI
            tf_DNI.setEditable(true); //Podemos editar su casilla
            tf_NIE.setText(""); //La casilla de NIE se vacía
            tf_NIE.setEditable(false); //Y no podemos editarla
        }
    }//GEN-LAST:event_rb_DNIActionPerformed

    /**
     * Este método (radio button) impide escribir en la casilla del DNI si se selecciona la casilla del NIE
     * @param evt 
     */
    private void rb_NIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_NIEActionPerformed
        // TODO add your handling code here:
        if (btnG_ID.isSelected(rb_NIE.getModel())) { //Si seleccionamos NIE
            tf_NIE.setEditable(true); //Podemos editar su casilla
            tf_DNI.setText(""); //La casilla DNI se vacía
            tf_DNI.setEditable(false); //Y no podemos editarla
        }
    }//GEN-LAST:event_rb_NIEActionPerformed

    /**
     * Este método (botón) cancela el registro y vuelve al menú principal
     * @param evt 
     */
    private void btn_CancellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancellActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_CancellActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario(Usuarios).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnG_ID;
    private javax.swing.JButton btn_Cancell;
    private javax.swing.JButton btn_Create;
    private javax.swing.JLabel lbl_CCV;
    private javax.swing.JLabel lbl_CP;
    private javax.swing.JLabel lbl_Ciudad;
    private javax.swing.JLabel lbl_Contrasena;
    private javax.swing.JLabel lbl_Contrasena1;
    private javax.swing.JLabel lbl_Correo;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Tarjeta;
    private javax.swing.JRadioButton rb_DNI;
    private javax.swing.JRadioButton rb_NIE;
    private javax.swing.JTextField tf_CCV;
    private javax.swing.JTextField tf_CP;
    private javax.swing.JTextField tf_Ciudad;
    private javax.swing.JTextField tf_Contrasena;
    private javax.swing.JTextField tf_Contrasena1;
    private javax.swing.JTextField tf_Correo;
    private javax.swing.JTextField tf_DNI;
    private javax.swing.JTextField tf_NIE;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Tarjeta;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método comprueba si las dos contraseñas coinciden 
     * @return Devuelve true si coinciden o false si no
     */
    private boolean comprobarContrasena() {
        if (tf_Contrasena.getText().equals(tf_Contrasena1.getText())) {
            return true;
        }
        JOptionPane.showMessageDialog(rootPane, "Las contraseñas han de coincidir", "Error en Contraseña", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    /**
     * Este método comprueba que se ha introducido el DNI correctamente
     * @return Devuelve true si se ha realizado la comprobación correctamente o false si ha habido algún fallo de formato
     */
    private boolean comprobarDNI() {
        String DNI = tf_DNI.getText();
        System.out.println(DNI.length());
        if (DNI.length() == 9) { //Comprobamos si el dato introducido tiene 9 caracteres
            for (int i = 0; i < 26; i++) { //Comprobamos todas las letras del abecedario que pueden ir en un DNI
                if (DNI.charAt(8) == (char) ('A' + i)) { //Comprobamos si el caracter de la posición 9 es una letra
                    return true;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "El DNI ha de tener una letra y ocho números", "Error en DNI", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            JOptionPane.showMessageDialog(rootPane, "El DNI ha de tener 9 carácteres", "Error en DNI", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Este método comprueba si se ha introducido el número de la tarjeta de crédito correctamente
     * @return Devuelve true si se ha realizado la comprobación correctamente o false si ha habido algún fallo de formato
     */
    private boolean comprobarTarjeta() {
        if (tf_Tarjeta.getText().length() == 16) { //Comprobamos si el dato introducido tiene 16 caracteres y es un long
            if (compruebaNumeroLong(tf_Tarjeta.getText(), "El numero de tarjeta ha de ser numérico", "Error en Tarjeta", JOptionPane.ERROR_MESSAGE)) {
                if (tf_CCV.getText().length() == 3) { //Comprobamos si el dato introducido tiene 3 caracteres y es un integer
                    if (compruebaNumero(tf_CCV.getText(), "El CCV introducido ha de ser numérico", "Error en CCV", JOptionPane.ERROR_MESSAGE)) {
                        return true;
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El CCV ha de tener 3 dígitos", "Error en CCV", JOptionPane.ERROR_MESSAGE);
                }

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "El Número de Tarjeta ha de tener 16 dígitos", "Error en Número de Tarjeta", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Este método comprueba que se ha introducido correctamente el código postal
     * @return Devuelve true si se ha realizado la comprobación correctamente o false si ha habido algún fallo de formato
     */
    private boolean comporbarCP() {
        if (tf_CP.getText().length() == 5) { //Comprobamos si el dato introducido tiene 5 caracteres y es un integer
            if (compruebaNumero(tf_CP.getText(), "El Código Postal ha de ser numérico", "Error en Código Postal", JOptionPane.ERROR_MESSAGE)) {
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "El Código Postal ha de tener 5 dígitos", "Error en Código Postal", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Este método comprueba que el texto introducido es un número (integer)
     * @param text texto a comprobar
     * @param msg mensaje de error
     * @param error título del mensaje de error
     * @param ERROR_MESSAGE icono del mensaje de error
     * @return Devuelve true si el texto puede convertirse a integer o false si no
     */
    private boolean compruebaNumero(String text, String msg, String error, int ERROR_MESSAGE) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, msg, error, ERROR_MESSAGE);
            return false;
        }
    }
    
    /**
     * Este método comprueba que el texto introducido es un número (long)
     * @param text texto a comprobar
     * @param msg mensaje de error
     * @param error título del mensaje de error
     * @param ERROR_MESSAGE icono del mensaje de error
     * @return Devuelve true si el texto puede convertirse a long o false si no
     */
    private boolean compruebaNumeroLong(String text, String msg, String error, int ERROR_MESSAGE) {
        try {
            Long.parseLong(text);
            
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, msg, error, ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Este método comprueba que se ha introducido el NIE correctamente
     * @return Devuelve true si se ha realizado la comprobación correctamente o false si ha habido algún fallo de formato
     */
    private boolean comprobarNIE() {
        String NIE = tf_NIE.getText();
        boolean letra1 = false;
        boolean letra2 = false;
        System.out.println(NIE.length());
        if (NIE.length() == 9) { //Comprobamos si el dato introducido tiene 9 caracteres
            for (int i = 0; i < 26; i++) { //Comprobamos todas las letras del abecedario que pueden ir en un NIE
                System.out.println((char) ('A' + i));
                if (NIE.charAt(0) == (char) ('A' + i)) { //Comprobamos si el caracter de la posición 1 es una letra
                    letra1 = true;
                }
                if (NIE.charAt(8) == (char) ('A' + i)) { //Comprobamos si el caracter de la posición 9 es una letra
                    letra2 = true;
                }
                if (letra1 && letra2) { //Comprobamos que ambas son letras
                    return true;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "El NIE ha de tener dos letras y siete números", "Error en NIE", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            JOptionPane.showMessageDialog(rootPane, "El NIE ha de tener 9 carácteres", "Error en NIE", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Este método guarda el usuario en la ruta proporcionada si se ha registrado correctamente
     */
    private void guardarUsuario() {
        try {
            int i = 0;
            //Menú de la app JavaPoP
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RutaUsuarios));
            while (i < Usuarios.size()) {
                oos.writeObject(Usuarios.get(i));
                i++;
            }
        } catch (IOException ex) {
        }
    }

    /**
     * Este método comprueba si el correo se ha introducido correctamente
     * @return Devuelve true si se ha realizado la comprobación correctamente o false si ha habido algún fallo de formato
     */
    private boolean comprobarCorreo() {
        String correo = tf_Correo.getText();
        if (correo.contains("@") && correo.contains(".")) {
            return true;
        }
        JOptionPane.showMessageDialog(rootPane, "El correo ha de ser en el siguiente formato:\n"
                + "ejemplo@ejemplo.ejemplo", "Error en correo", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    /**
     * Este método realiza varias comprobaciones de los datos introducidos por el usuario
     * @return Devuelve true si se han realizado las comprobaciones correctamente o false si ha habido algún fallo al introducir algún dato
     */
    private boolean comprobacion() {
        boolean variable = true;
        if (btnG_ID.isSelected(rb_DNI.getModel())) { //Si seleccionamos DNI
            if (!comprobarDNI()) { //Comprobamos que se haya introducido corectamente
                variable = false;
            }
        } else if (btnG_ID.isSelected(rb_NIE.getModel())) { //Si seleccionamos NIE
            if (!comprobarNIE()) { //Comprobamos que se haya introducido corectamente
                variable = false;
            }
        }
        if (!comprobarCorreo()) { //Comprobamos que el correo se haya introducido corectamente
            variable = false;
        }
        if (!comprobarContrasena()) { //Comprobamos que la contraseña se haya introducido corectamente
            variable = false;
        }
        if (!comporbarCP()) { //Comprobamos que el código postal se haya introducido corectamente
            variable = false;
        }
        if (!comprobarTarjeta()) { //Comprobamos que la tarjeta de crédito se haya introducido corectamente
            variable = false;
        }
        return variable;
    }
}
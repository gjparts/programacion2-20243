/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany._gui08;

/**
 *
 * @author Gerardo
 */
import javax.swing.DefaultListModel; //clase para crear modelo de JList
import javax.swing.JOptionPane;
public class Ventana1 extends javax.swing.JFrame {

    //aqui podemos declarar variables globales
    //estas estan disponible desde cualquier evento o funcion
    //de esta clase
    DefaultListModel modelo;
    
    //funcion o metodo para contar los perros y los gatos
    public void contar(){
        int gatos = 0, perros = 0;
        //recorrer el modelo, item por item
        for( int i = 0; i < modelo.size(); i++ ){
            //recuperar el item actual dentro de un String
            String animal = modelo.getElementAt(i).toString();
            //vemos si el animal es perro o gato, ignorando mayusculas/minusculas
            if( animal.toLowerCase().equals("gato") == true ) gatos++;
            if( animal.toLowerCase().equals("perro") == true ) perros++;
        }
        //al terminar el recorrido poner los resultados en las cajas respectivas
        cantidadGatos.setText( String.valueOf(gatos) );
        cantidadPerros.setText( String.valueOf(perros) );
    }
    
    /**
     * Creates new form Ventana1
     */
    public Ventana1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        caja = new javax.swing.JTextField();
        botonAgregar1 = new javax.swing.JButton();
        botonAgregar2 = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cantidadGatos = new javax.swing.JTextField();
        cantidadPerros = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("20012002049 Gerardo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Honduras", "Guatemala", "El Salvador" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        caja.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        botonAgregar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonAgregar1.setText("Agregar (metodo 1)");
        botonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar1ActionPerformed(evt);
            }
        });

        botonAgregar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonAgregar2.setText("Agregar (metodo 2)");
        botonAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar2ActionPerformed(evt);
            }
        });

        botonEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Contador de gatos:");

        cantidadGatos.setEditable(false);
        cantidadGatos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cantidadGatos.setText("0");

        cantidadPerros.setEditable(false);
        cantidadPerros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cantidadPerros.setText("0");

        jLabel2.setText("Contador de perros:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadGatos))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadPerros))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAgregar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditar)
                        .addGap(35, 35, 35)
                        .addComponent(botonEliminar)
                        .addGap(35, 35, 35)
                        .addComponent(botonLimpiar)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadGatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadPerros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //vamos a llenar al JList llamado lista con nombres animales
        //primero vamos a instanciar un nuevo objeto para el modelo de datos
        modelo = new DefaultListModel();
        //colocar datos de prueba en el modelo
        modelo.addElement("Perro");
        modelo.addElement("Gato");
        modelo.addElement("Loro");
        modelo.addElement("Gallina");
        //apuntar el modelo hacia el JList
        lista.setModel(modelo);
        
        contar(); //ejecutar funcion para contar perros y gatos
    }//GEN-LAST:event_formWindowOpened

    private void botonAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar1ActionPerformed
        //metodo 1: agregar al JList lo que escribamos en la caja de texto
        //validacion: solo si la caja de texto tiene contenido
        if( caja.getText().trim().length() > 0 ){
            modelo.addElement(caja.getText());
            //dejar en blanco la caja de texto
            caja.setText("");
            contar(); //ejecutar funcion para contar perros y gatos
        }
    }//GEN-LAST:event_botonAgregar1ActionPerformed

    private void botonAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar2ActionPerformed
        //metodo 2: agregar al JList lo leido desde un JOptionPane
        //depositar en una variable lo capturado:
        String x = JOptionPane.showInputDialog(this,"Digite un nombre de animal: ");
        //validar que x no venga null
        //cuando x vienen null quiere decir que se cancelaron el InputDialog
        if( x != null ){
            //validar que x no venga en blanco
            if( x.trim().length() > 0 ){
                modelo.addElement(x);
                contar(); //ejecutar funcion para contar perros y gatos
            }
        }
    }//GEN-LAST:event_botonAgregar2ActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        //verificar que se ha seleccionado un animal en la lista
        if( lista.getSelectedIndex() == -1 ){
            JOptionPane.showMessageDialog(this, "Seleccione un animal");
            return; //no sigue
        }
        //mostrar un InputDialog con el valor del animal seleccionado
        String actual = lista.getSelectedValue();
        String nuevo = JOptionPane.showInputDialog(this,"Nuevo nombre: ",actual);
        if( nuevo != null ){
            if( nuevo.trim().length() > 0 ){
                //reemplazar el valor en el modelo para la posicion en la lista
                modelo.setElementAt(nuevo, lista.getSelectedIndex());
                contar(); //ejecutar funcion para contar perros y gatos
            }
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        //verificar que se ha seleccionado un animal en la lista
        if( lista.getSelectedIndex() == -1 ){
            JOptionPane.showMessageDialog(this, "Seleccione un animal");
            return; //no sigue
        }
        
        //preguntar al usuario si desea borrar el item
        int respuesta = JOptionPane.showConfirmDialog(this, "Desea eliminar el animal seleccionado?");
        //System.out.println(respuesta);
        //repuesta es el numero del boton en que se hizo click: 0 es Yes, 1 es No, 2 es Cancel
        
        if( respuesta == 0 ){
            //eliminar item seleccionado
            modelo.removeElementAt( lista.getSelectedIndex() );
            contar(); //ejecutar funcion para contar perros y gatos
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Desea limpiar toda la lista?");
        if( respuesta == 0 ){
            modelo.removeAllElements();
            contar(); //ejecutar funcion para contar perros y gatos
        }
    }//GEN-LAST:event_botonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar1;
    private javax.swing.JButton botonAgregar2;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JTextField caja;
    private javax.swing.JTextField cantidadGatos;
    private javax.swing.JTextField cantidadPerros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}

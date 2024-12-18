/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany._gui05;

/**
 *
 * @author Gerardo
 */
import java.text.DecimalFormat;
public class Ejemplo extends javax.swing.JFrame {
    //se recomienda colocar aqui sus funciones
    //funcion para sumar las 4 cajas y poner el resultado en total
    public void calcular(){
        try{
            //sumar los valores de las 4 cajas y mostrarlos en total
            double a,b,c,d,suma;
            a = Double.parseDouble(caja1.getText());
            b = Double.parseDouble(caja2.getText());
            c = Double.parseDouble(caja3.getText());
            d = Double.parseDouble(caja4.getText());
            suma = a+b+c+d;
            
            //formato a 2 decimales
            DecimalFormat f = new DecimalFormat();
            f.setMaximumFractionDigits(2);
            f.setMinimumFractionDigits(2);
            
            total.setText( f.format(suma) );
        }catch(Exception ex){
            total.setText("ERROR");
        }
    }

    /**
     * Creates new form Ejemplo
     */
    public Ejemplo() {
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

        jLabel1 = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        caja2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caja3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caja4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("20012002049 Gerardo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("a:");

        caja1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        caja1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caja1.setText("0.00");
        caja1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja1KeyReleased(evt);
            }
        });

        caja2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        caja2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caja2.setText("0.00");
        caja2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja2KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("b:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("c:");

        caja3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        caja3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caja3.setText("0.00");
        caja3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja3KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("d:");

        caja4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        caja4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caja4.setText("0.00");
        caja4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja4KeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("suma:");

        total.setEditable(false);
        total.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(caja4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void caja1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja1KeyReleased
        calcular(); //ejecutar la funcion para calcular la suma
    }//GEN-LAST:event_caja1KeyReleased

    private void caja2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja2KeyReleased
        calcular();
    }//GEN-LAST:event_caja2KeyReleased

    private void caja3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja3KeyReleased
        calcular();
    }//GEN-LAST:event_caja3KeyReleased

    private void caja4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja4KeyReleased
        calcular();
    }//GEN-LAST:event_caja4KeyReleased

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
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JTextField caja4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}

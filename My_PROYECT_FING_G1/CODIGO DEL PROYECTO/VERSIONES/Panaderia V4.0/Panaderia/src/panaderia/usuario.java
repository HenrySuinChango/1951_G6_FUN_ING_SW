/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package panaderia;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static panaderia.login.contraseña;
import static panaderia.login.usuario;

/**
 *
 * @author Administrator
 */
public class usuario extends javax.swing.JFrame {

    /**
     * Creates new form usuario
     */
    Panaderia con=new Panaderia();
    Connection cn=con.conectar();
    public login logged_usuario = new login();
    public String cedula;
    public String nombre_user;
    public usuario() { 
        
        Panaderia con=new Panaderia();
        Connection cn=con.conectar();
        initComponents();
        setLocationRelativeTo(null);
        try {
        String sql = "SELECT nombre, cedula, contraseña, nivel FROM usuarios WHERE cedula = "+usuario+"";
        PreparedStatement ps = cn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            nombre_user=rs.getString("nombre");
            nombre.setText(rs.getString("nombre"));
        }} catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        R_asistencias = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        H_asistencias = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista_asistencias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        R_asistencias.setBackground(new java.awt.Color(51, 51, 51));
        R_asistencias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButton3.setText("Registrar Salida");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        R_asistencias.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 150, 20));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE ASISTENCIA");
        R_asistencias.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jButton4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButton4.setText("Registrar Entrada");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        R_asistencias.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 150, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        R_asistencias.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        nombre.setEditable(false);
        R_asistencias.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, -1));

        getContentPane().add(R_asistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 490, 310));

        H_asistencias.setBackground(new java.awt.Color(51, 51, 51));
        H_asistencias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HISTORIAL DE ASISTENCIAS");
        H_asistencias.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        Lista_asistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User", "Fecha", "Hora entrada", "HOLA SALIDA"
            }
        ));
        Lista_asistencias.setToolTipText("");
        Lista_asistencias.setEnabled(false);
        jScrollPane2.setViewportView(Lista_asistencias);

        H_asistencias.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 200));

        getContentPane().add(H_asistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 490, 310));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Registrar asistencia");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hisotiral asistencias");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton5.setToolTipText("");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        H_asistencias.setVisible(false);    
        R_asistencias.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           nombre.setText(usuario);
     
        try {
        // Primero se valida si el usuario tiene un registro de ingreso para hoy
        PreparedStatement psCheck = cn.prepareStatement("SELECT * FROM asistencias WHERE usuario = ? AND fecha = ?");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fecha = now.format(formatter);  // Solo la fecha, sin la hora

        psCheck.setString(1, usuario); 
        psCheck.setString(2, fecha);

        ResultSet rsCheck = psCheck.executeQuery();

        // Si ya existe un registro, no se inserta nuevo registro de asistencia
        if (rsCheck.next()) {
            JOptionPane.showMessageDialog(null, "Ya has registrado tu ingreso hoy.");
        } else {
            // Si no existe, se registra el nuevo ingreso
            String sqlSelectNivel = "SELECT nivel FROM usuarios WHERE cedula=? AND contraseña=?";
            PreparedStatement ps = cn.prepareStatement(sqlSelectNivel);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Registramos la asistencia
                String sqlAsistencia = "INSERT INTO asistencias (usuario, fecha, hora, hora_salida,salida,nombre) VALUES (?, ?, ?, ?,?,?)";
                PreparedStatement psAsistencia = cn.prepareStatement(sqlAsistencia);
                String horaEntrada = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                
                psAsistencia.setString(1, usuario);
                psAsistencia.setString(2, fecha);
                psAsistencia.setString(3, horaEntrada);  // Hora de entrada
                psAsistencia.setString(4, horaEntrada); 
                psAsistencia.setInt(5, 0);
                psAsistencia.setString(6, nombre_user);
                int rowsInserted = psAsistencia.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso. Asistencia registrada.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar la asistencia.");
                }
            }
        }
                }catch(Exception e){}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    H_asistencias.setVisible(true);    
    R_asistencias.setVisible(false);
    String usuario_registro = usuario;
    try {
    // Definir la consulta SQL
    String sql = "SELECT fecha, hora, hora_salida FROM asistencias WHERE usuario = ?";
    PreparedStatement ps = cn.prepareStatement(sql);
    ps.setString(1, usuario_registro);

    ResultSet rs = ps.executeQuery();

    // Definir las columnas de la tabla
    String[] columnNames = {"User", "Fecha", "Hora entrada", "Hora Salida"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    // Agregar los registros al modelo de la tabla
    while (rs.next()) {
        String fecha = rs.getString("fecha");
        String hora = rs.getString("hora");
        String hora_salida = rs.getString("hora_salida");
        model.addRow(new Object[]{nombre_user, fecha, hora, hora_salida});
    }

    // Si no hay registros, agregar un mensaje en la tabla
    if (model.getRowCount() == 0) {
        model.addRow(new Object[]{"No hay asistencias registradas.", "", "", ""});
    }

    // Establecer el modelo en el JTable
    Lista_asistencias.setModel(model);

} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error al obtener el historial de asistencias: " + e);
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
    // Verifica si ya se registró la salida para hoy
    PreparedStatement psCheck = cn.prepareStatement("SELECT * FROM asistencias WHERE usuario = ? AND fecha = ?");
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fecha = now.format(formatter);  // Solo la fecha, sin la hora

    psCheck.setString(1, usuario);  // Establecer usuario
    psCheck.setString(2, fecha);    // Establecer fecha actual

    ResultSet rsCheck = psCheck.executeQuery();

    // Verifica si ya existe un registro de salida para el usuario
    if (rsCheck.next()) {
        int salida = rsCheck.getInt("salida");
        if (salida == 1) {
            JOptionPane.showMessageDialog(null, "Ya has registrado tu salida hoy.");
        } else {
            // Usuario autenticado, actualiza la hora de salida
            PreparedStatement ps = cn.prepareStatement("SELECT nivel FROM usuarios WHERE cedula = ? AND contraseña = ?");
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                String horaSalida = now.format(timeFormatter); // Hora de salida actual

                // Actualizar la hora de salida en la base de datos
                String sqlAsistencia = "UPDATE asistencias SET hora_salida = ?, salida = ? WHERE usuario = ? AND fecha = ?";
                PreparedStatement psAsistencia = cn.prepareStatement(sqlAsistencia);

                psAsistencia.setString(1, horaSalida); // Hora de salida
                psAsistencia.setInt(2, 1); // Marca la salida como registrada (1)
                psAsistencia.setString(3, usuario); // Establece el usuario
                psAsistencia.setString(4, fecha); // Establece la fecha actual

                int rowsUpdated = psAsistencia.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Hora de salida registrada exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un registro de entrada pendiente para este usuario en la fecha actual.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un registro de asistencia para este usuario en la fecha actual.");
    }

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        login lg = new login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel H_asistencias;
    private javax.swing.JTable Lista_asistencias;
    private javax.swing.JPanel R_asistencias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}

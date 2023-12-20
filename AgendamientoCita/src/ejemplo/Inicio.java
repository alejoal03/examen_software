/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ejemplo;

import java.awt.Component;

/**
 *
 * @author Xelan
 */
public class Inicio extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capaBase = new javax.swing.JPanel();
        menuInicio = new javax.swing.JPanel();
        nuevoInicio = new javax.swing.JLabel();
        ingresoInicioL = new javax.swing.JLabel();
        tipoUsuarioInicio = new javax.swing.JComboBox<>();
        tipoUsuarioInicioL = new javax.swing.JLabel();
        codigoEspacioInicio = new javax.swing.JTextField();
        codUsuarioInicioL = new javax.swing.JLabel();
        passEspacioInicio = new javax.swing.JTextField();
        passInicioL = new javax.swing.JLabel();
        botonInicio = new javax.swing.JButton();
        imagenInicioL = new javax.swing.JLabel();
        panelSuperiorInicio = new javax.swing.JPanel();
        empresaInicioL = new javax.swing.JLabel();
        salirP = new javax.swing.JPanel();
        salirL = new javax.swing.JLabel();

        capaBase.setBackground(new java.awt.Color(255, 255, 255));
        capaBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuInicio.setBackground(new java.awt.Color(255, 255, 255));

        nuevoInicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        nuevoInicio.setForeground(new java.awt.Color(102, 153, 255));
        nuevoInicio.setText("Soy nuevo usuario");

        ingresoInicioL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ingresoInicioL.setForeground(new java.awt.Color(102, 153, 255));
        ingresoInicioL.setText("Ingreso");

        tipoUsuarioInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Paciente", "Administrador", "Doctor" }));

        tipoUsuarioInicioL.setForeground(new java.awt.Color(153, 153, 153));
        tipoUsuarioInicioL.setText("Tipo de usuario");

        codigoEspacioInicio.setToolTipText("");

        codUsuarioInicioL.setForeground(new java.awt.Color(153, 153, 153));
        codUsuarioInicioL.setText("Código usuario");

        passInicioL.setForeground(new java.awt.Color(153, 153, 153));
        passInicioL.setText("Contraseña");

        botonInicio.setBackground(new java.awt.Color(102, 153, 255));
        botonInicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        botonInicio.setForeground(new java.awt.Color(255, 255, 255));
        botonInicio.setText("Ingresar");

        javax.swing.GroupLayout menuInicioLayout = new javax.swing.GroupLayout(menuInicio);
        menuInicio.setLayout(menuInicioLayout);
        menuInicioLayout.setHorizontalGroup(
            menuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInicioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(menuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoUsuarioInicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuInicioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nuevoInicio))
                    .addComponent(codigoEspacioInicio)
                    .addComponent(passEspacioInicio)
                    .addGroup(menuInicioLayout.createSequentialGroup()
                        .addGroup(menuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passInicioL)
                            .addComponent(codUsuarioInicioL)
                            .addComponent(tipoUsuarioInicioL)
                            .addComponent(ingresoInicioL))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(menuInicioLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(botonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        menuInicioLayout.setVerticalGroup(
            menuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuInicioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ingresoInicioL)
                .addGap(9, 9, 9)
                .addComponent(tipoUsuarioInicioL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoUsuarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(codUsuarioInicioL)
                .addGap(3, 3, 3)
                .addComponent(codigoEspacioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(passInicioL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passEspacioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nuevoInicio)
                .addGap(16, 16, 16))
        );

        capaBase.add(menuInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 420, 320));

        imagenInicioL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baseInicioAgendamiento.jpg"))); // NOI18N
        imagenInicioL.setText("jLabel1");
        capaBase.add(imagenInicioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 840, 490));

        panelSuperiorInicio.setBackground(new java.awt.Color(102, 153, 255));
        panelSuperiorInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        empresaInicioL.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        empresaInicioL.setForeground(new java.awt.Color(227, 241, 253));
        empresaInicioL.setText("Juntos Salud");

        salirP.setBackground(new java.awt.Color(102, 153, 255));
        salirP.setForeground(new java.awt.Color(255, 255, 255));
        salirP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirPMouseClicked(evt);
            }
        });

        salirL.setBackground(new java.awt.Color(255, 153, 153));
        salirL.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        salirL.setForeground(new java.awt.Color(255, 255, 255));
        salirL.setText("X");

        javax.swing.GroupLayout salirPLayout = new javax.swing.GroupLayout(salirP);
        salirP.setLayout(salirPLayout);
        salirPLayout.setHorizontalGroup(
            salirPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salirPLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(salirL)
                .addGap(22, 22, 22))
        );
        salirPLayout.setVerticalGroup(
            salirPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirPLayout.createSequentialGroup()
                .addComponent(salirL)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSuperiorInicioLayout = new javax.swing.GroupLayout(panelSuperiorInicio);
        panelSuperiorInicio.setLayout(panelSuperiorInicioLayout);
        panelSuperiorInicioLayout.setHorizontalGroup(
            panelSuperiorInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorInicioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(empresaInicioL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 484, Short.MAX_VALUE)
                .addComponent(salirP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        panelSuperiorInicioLayout.setVerticalGroup(
            panelSuperiorInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorInicioLayout.createSequentialGroup()
                .addGroup(panelSuperiorInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperiorInicioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(empresaInicioL))
                    .addGroup(panelSuperiorInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salirP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        capaBase.add(panelSuperiorInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(capaBase, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(capaBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salirPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirPMouseClicked
        System.exit(1);
    }//GEN-LAST:event_salirPMouseClicked

public Component getBase(){return this.capaBase;}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicio;
    private javax.swing.JPanel capaBase;
    private javax.swing.JLabel codUsuarioInicioL;
    private javax.swing.JTextField codigoEspacioInicio;
    private javax.swing.JLabel empresaInicioL;
    private javax.swing.JLabel imagenInicioL;
    private javax.swing.JLabel ingresoInicioL;
    private javax.swing.JPanel menuInicio;
    private javax.swing.JLabel nuevoInicio;
    private javax.swing.JPanel panelSuperiorInicio;
    private javax.swing.JTextField passEspacioInicio;
    private javax.swing.JLabel passInicioL;
    private javax.swing.JLabel salirL;
    private javax.swing.JPanel salirP;
    private javax.swing.JComboBox<String> tipoUsuarioInicio;
    private javax.swing.JLabel tipoUsuarioInicioL;
    // End of variables declaration//GEN-END:variables
}

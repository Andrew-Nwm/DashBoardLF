package com.mycompany.lifemates_dashboard.igu;

import com.mycompany.lifemates_dashboard.logica.Controladora;
import com.mycompany.lifemates_dashboard.persistencia.exceptions.PreexistingEntityException;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class UploadDataPage extends javax.swing.JFrame {

    private Controladora controladora;

    public UploadDataPage() {
        initComponents();
        controladora = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        NavBarPanel = new javax.swing.JPanel();
        btnDashBoard = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnNotificaciones = new javax.swing.JButton();
        btnContactarASoporte = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnIngresarDatos = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnVerDatos = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        ttlPanel = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tituloDelPanel = new javax.swing.JLabel();
        FormPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtFechaCreacion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIdPersona = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtFechaCreacionUsuario = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        txtIdContrasenia = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtHistorialContrasenias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LifeMates | Ingresar Datos");
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);

        MainPanel.setMaximumSize(new java.awt.Dimension(1080, 720));
        MainPanel.setMinimumSize(new java.awt.Dimension(1080, 720));

        NavBarPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnDashBoard.setBackground(new java.awt.Color(255, 255, 255));
        btnDashBoard.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnDashBoard.setForeground(new java.awt.Color(12, 202, 74));
        btnDashBoard.setText("DashBoard");
        btnDashBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashBoardActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/casa - copia.png"))); // NOI18N

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(12, 202, 74));
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/caja.png"))); // NOI18N

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(12, 202, 74));
        btnClientes.setText("Clientes");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/cliente.png"))); // NOI18N

        btnEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(12, 202, 74));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/empleado.png"))); // NOI18N

        btnNotificaciones.setBackground(new java.awt.Color(255, 255, 255));
        btnNotificaciones.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnNotificaciones.setForeground(new java.awt.Color(12, 202, 74));
        btnNotificaciones.setText("Notificaciones");
        btnNotificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnContactarASoporte.setBackground(new java.awt.Color(255, 255, 255));
        btnContactarASoporte.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnContactarASoporte.setForeground(new java.awt.Color(12, 202, 74));
        btnContactarASoporte.setText("Contactar a soporte");
        btnContactarASoporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContactarASoporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/notificacion.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/solucion-de-problemas.png"))); // NOI18N

        btnConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(12, 202, 74));
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfiguracion.setVerifyInputWhenFocusTarget(false);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/configuracion.png"))); // NOI18N

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(12, 202, 74));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/cerrar-sesion.png"))); // NOI18N

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel2.setFont(new java.awt.Font("Chonburi", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(12, 202, 74));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/croptedicon.png"))); // NOI18N
        jLabel2.setText("LifeMates");

        btnIngresarDatos.setBackground(new java.awt.Color(224, 224, 224));
        btnIngresarDatos.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnIngresarDatos.setForeground(new java.awt.Color(12, 202, 74));
        btnIngresarDatos.setText("Ingresar Datos");
        btnIngresarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDatosActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/entry-data.png"))); // NOI18N

        btnVerDatos.setBackground(new java.awt.Color(255, 255, 255));
        btnVerDatos.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnVerDatos.setForeground(new java.awt.Color(12, 202, 74));
        btnVerDatos.setText("Ver Datos");
        btnVerDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/data-scientist.png"))); // NOI18N

        javax.swing.GroupLayout NavBarPanelLayout = new javax.swing.GroupLayout(NavBarPanel);
        NavBarPanel.setLayout(NavBarPanelLayout);
        NavBarPanelLayout.setHorizontalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavBarPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnContactarASoporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNotificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIngresarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator4)
                    .addGroup(NavBarPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(NavBarPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NavBarPanelLayout.setVerticalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavBarPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContactarASoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ttlPanel.setBackground(new java.awt.Color(255, 255, 255));
        ttlPanel.setForeground(new java.awt.Color(224, 224, 224));
        ttlPanel.setPreferredSize(new java.awt.Dimension(1456, 703));

        txtBuscar.setBackground(new java.awt.Color(224, 224, 224));
        txtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtBuscar.setMaximumSize(new java.awt.Dimension(160, 40));
        txtBuscar.setMinimumSize(new java.awt.Dimension(160, 40));
        txtBuscar.setPreferredSize(new java.awt.Dimension(160, 40));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/laboratory (1).png"))); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tituloDelPanel.setFont(new java.awt.Font("Chonburi", 0, 22)); // NOI18N
        tituloDelPanel.setForeground(new java.awt.Color(12, 202, 74));
        tituloDelPanel.setText("Ingreso de Datos");

        FormPanel.setBackground(new java.awt.Color(255, 255, 255));
        FormPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        FormPanel.setMaximumSize(new java.awt.Dimension(745, 593));
        FormPanel.setMinimumSize(new java.awt.Dimension(745, 593));

        jLabel18.setFont(new java.awt.Font("Chonburi", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("¡Bienvenido! A continuación");

        jLabel8.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Id de usuario");

        txtIdUsuario.setBackground(new java.awt.Color(224, 224, 224));
        txtIdUsuario.setFont(new java.awt.Font("Chonburi", 0, 18)); // NOI18N
        txtIdUsuario.setForeground(new java.awt.Color(6, 100, 37));
        txtIdUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 202, 74), 1, true));

        jLabel11.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha de creación de contraseña");

        jLabel12.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre de usuario");

        txtNombreUsuario.setBackground(new java.awt.Color(224, 224, 224));
        txtNombreUsuario.setFont(new java.awt.Font("Chonburi", 0, 18)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(6, 100, 37));
        txtNombreUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 202, 74), 1, true));

        txtFechaCreacion.setBackground(new java.awt.Color(224, 224, 224));
        txtFechaCreacion.setFont(new java.awt.Font("Chonburi", 0, 18)); // NOI18N
        txtFechaCreacion.setForeground(new java.awt.Color(6, 100, 37));
        txtFechaCreacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 202, 74), 1, true));

        jLabel13.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Historial contraseña");

        jLabel19.setFont(new java.awt.Font("Chonburi", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("podrás ingresar los datos");

        jLabel20.setFont(new java.awt.Font("Chonburi", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("de un nuevo empleado");

        jLabel14.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ID persona");

        txtIdPersona.setBackground(new java.awt.Color(224, 224, 224));
        txtIdPersona.setFont(new java.awt.Font("Chonburi", 0, 18)); // NOI18N
        txtIdPersona.setForeground(new java.awt.Color(6, 100, 37));
        txtIdPersona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 202, 74), 1, true));

        jLabel16.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Fecha de creación de usuario");

        txtFechaCreacionUsuario.setBackground(new java.awt.Color(224, 224, 224));
        txtFechaCreacionUsuario.setFont(new java.awt.Font("Chonburi", 0, 18)); // NOI18N
        txtFechaCreacionUsuario.setForeground(new java.awt.Color(6, 100, 37));
        txtFechaCreacionUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 202, 74), 1, true));

        btnGuardar.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(12, 202, 74));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/diskette.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(12, 202, 74));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otherImages/eraser.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Documento de usuario");

        jLabel22.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("ID contraseña");

        jLabel23.setFont(new java.awt.Font("Chonburi", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Contraseña");

        txtContrasenia.setBackground(new java.awt.Color(224, 224, 224));
        txtContrasenia.setFont(new java.awt.Font("Chonburi", 0, 18)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(6, 100, 37));
        txtContrasenia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 202, 74), 1, true));

        txtIdContrasenia.setBackground(new java.awt.Color(224, 224, 224));
        txtIdContrasenia.setFont(new java.awt.Font("Chonburi", 0, 18)); // NOI18N
        txtIdContrasenia.setForeground(new java.awt.Color(6, 100, 37));
        txtIdContrasenia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 202, 74), 1, true));

        txtDocumento.setBackground(new java.awt.Color(224, 224, 224));
        txtDocumento.setFont(new java.awt.Font("Chonburi", 0, 18)); // NOI18N
        txtDocumento.setForeground(new java.awt.Color(6, 100, 37));
        txtDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 202, 74), 1, true));

        txtHistorialContrasenias.setBackground(new java.awt.Color(224, 224, 224));
        txtHistorialContrasenias.setFont(new java.awt.Font("Chonburi", 0, 18)); // NOI18N
        txtHistorialContrasenias.setForeground(new java.awt.Color(6, 100, 37));
        txtHistorialContrasenias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 202, 74), 1, true));

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(29, 29, 29)
                        .addComponent(btnGuardar)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(txtIdUsuario)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21)
                            .addComponent(txtDocumento)
                            .addComponent(txtFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14)
                                .addComponent(txtIdPersona)
                                .addComponent(jLabel22)
                                .addComponent(txtIdContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFechaCreacionUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(40, 40, 40)
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHistorialContrasenias)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(55, 55, 55)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64))
                        .addGroup(FormPanelLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addGroup(FormPanelLayout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(txtHistorialContrasenias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(FormPanelLayout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFechaCreacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FormPanelLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ttlPanelLayout = new javax.swing.GroupLayout(ttlPanel);
        ttlPanel.setLayout(ttlPanelLayout);
        ttlPanelLayout.setHorizontalGroup(
            ttlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ttlPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(ttlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ttlPanelLayout.createSequentialGroup()
                        .addComponent(tituloDelPanel)
                        .addGap(1681, 1681, 1681))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ttlPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ttlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ttlPanelLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3)
                            .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 741, Short.MAX_VALUE))
                        .addGap(1146, 1146, 1146))))
        );
        ttlPanelLayout.setVerticalGroup(
            ttlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ttlPanelLayout.createSequentialGroup()
                .addGroup(ttlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ttlPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(ttlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ttlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloDelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(NavBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 841, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NavBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(ttlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        WelcomePage welcome = new WelcomePage();
        welcome.setVisible(true);
        welcome.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDatosActionPerformed
        UploadDataPage upload = new UploadDataPage();
        upload.setVisible(true);
        upload.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnIngresarDatosActionPerformed

    private void btnDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashBoardActionPerformed
        HomePage home = new HomePage();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDashBoardActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIdUsuario.setText("");
        txtNombreUsuario.setText("");
        txtFechaCreacionUsuario.setText("");
        txtIdPersona.setText("");
        txtFechaCreacion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String us_id_usuario = txtIdUsuario.getText();
        String pr_id_persona = txtIdPersona.getText();
        String us_nombre_usuario = txtNombreUsuario.getText();
        String us_documento = txtDocumento.getText();
        String co_id_contrasenia = txtIdContrasenia.getText();
        String co_contrasenia = txtContrasenia.getText();
        String co_fecha_creacion = txtFechaCreacion.getText();
        String co_historial_contrasenias = txtHistorialContrasenias.getText();
        String us_fecha_creacion = txtFechaCreacionUsuario.getText();

        try {
            controladora.guardar(us_id_usuario, pr_id_persona, us_nombre_usuario, us_documento, co_id_contrasenia, co_contrasenia, co_fecha_creacion, co_historial_contrasenias, us_fecha_creacion);
            mostrarMensaje("Se guardó correctamente", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (PreexistingEntityException ex) {
            System.err.println("Ya existe una entidad con la misma clave primaria.");
            mostrarMensaje("Ya existe una entidad con la misma clave primaria.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Error al guardar datos: " + ex.getMessage());
            mostrarMensaje("Error al guardar datos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void mostrarMensaje(String mensaje, String titulo, int tipoMensaje) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        optionPane.setMessageType(tipoMensaje);
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FormPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel NavBarPanel;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnContactarASoporte;
    private javax.swing.JButton btnDashBoard;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIngresarDatos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNotificaciones;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnVerDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel tituloDelPanel;
    private javax.swing.JPanel ttlPanel;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFechaCreacion;
    private javax.swing.JTextField txtFechaCreacionUsuario;
    private javax.swing.JTextField txtHistorialContrasenias;
    private javax.swing.JTextField txtIdContrasenia;
    private javax.swing.JTextField txtIdPersona;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}

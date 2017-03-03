package WalterOseguera_Lab7;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class FPrincipal extends javax.swing.JFrame {

    public FPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PPMenu = new javax.swing.JPopupMenu();
        MIAgregar = new javax.swing.JMenuItem();
        MIModificar = new javax.swing.JMenuItem();
        MIEliminar = new javax.swing.JMenuItem();
        Groupo1 = new javax.swing.ButtonGroup();
        TPInicio = new javax.swing.JTabbedPane();
        PInicio = new javax.swing.JPanel();
        SPInicio = new javax.swing.JScrollPane();
        TPrincipal = new javax.swing.JTree();
        BAbrir = new javax.swing.JButton();
        PPersonas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TFamiliares = new javax.swing.JTree();
        BAgregarPersona = new javax.swing.JButton();
        TFNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFID = new javax.swing.JTextField();
        SEdad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        BColorPiel = new javax.swing.JButton();
        TFNacionalidad = new javax.swing.JTextField();
        TFLugarNacimiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        PListar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MArchivos = new javax.swing.JMenu();
        MIGuardar = new javax.swing.JMenuItem();
        MIGuardarcomo = new javax.swing.JMenuItem();
        MISalir = new javax.swing.JMenuItem();
        MIAbout = new javax.swing.JMenuItem();

        MIAgregar.setText("Agregar");
        MIAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIAgregarActionPerformed(evt);
            }
        });
        PPMenu.add(MIAgregar);

        MIModificar.setText("Modificar");
        MIModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIModificarActionPerformed(evt);
            }
        });
        PPMenu.add(MIModificar);

        MIEliminar.setText("Eliminar");
        MIEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIEliminarActionPerformed(evt);
            }
        });
        PPMenu.add(MIEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gatos y Baleadas Trump");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Programas");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Carpeta1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Carpeta2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Carpeta3");
        treeNode1.add(treeNode2);
        TPrincipal.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        SPInicio.setViewportView(TPrincipal);

        BAbrir.setText("Abrir");
        BAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BAbrirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PInicioLayout = new javax.swing.GroupLayout(PInicio);
        PInicio.setLayout(PInicioLayout);
        PInicioLayout.setHorizontalGroup(
            PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInicioLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SPInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(BAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        PInicioLayout.setVerticalGroup(
            PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInicioLayout.createSequentialGroup()
                .addGroup(PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PInicioLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(BAbrir))
                    .addGroup(PInicioLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(SPInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        TPInicio.addTab("Inicio", PInicio);

        jLabel1.setText("Nombre: ");

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        TFamiliares.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        TFamiliares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFamiliaresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TFamiliares);

        BAgregarPersona.setText("Agregar Persona");
        BAgregarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BAgregarPersonaMouseClicked(evt);
            }
        });

        jLabel2.setText("Edad: ");

        jLabel3.setText("Nacionalidad: ");

        jLabel4.setText("Lugar de Nacimiento: ");

        jLabel5.setText("N° de Identidad: ");

        SEdad.setValue(20);

        jLabel6.setText("Color de piel: ");

        BColorPiel.setBackground(new java.awt.Color(255, 255, 255));
        BColorPiel.setForeground(new java.awt.Color(255, 255, 255));
        BColorPiel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BColorPielMouseClicked(evt);
            }
        });

        jLabel7.setText("Árbol de familiares");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jRadioButton1.setText("Empleado");

        jRadioButton2.setText("Cliente");

        jLabel8.setText("Tipo de Persona: ");

        jLabel9.setText("Sección: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocina", "Venta Gatos", "Venta Baleadas " }));

        jLabel10.setText("Sueldo: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PPersonasLayout = new javax.swing.GroupLayout(PPersonas);
        PPersonas.setLayout(PPersonasLayout);
        PPersonasLayout.setHorizontalGroup(
            PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPersonasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPersonasLayout.createSequentialGroup()
                        .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PPersonasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PPersonasLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TFID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PPersonasLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(56, 56, 56)
                        .addComponent(BColorPiel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PPersonasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TFLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PPersonasLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(BAgregarPersona)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPersonasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(98, 98, 98))
            .addGroup(PPersonasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PPersonasLayout.setVerticalGroup(
            PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPersonasLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PPersonasLayout.createSequentialGroup()
                        .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(SEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TFNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TFLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(PPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPersonasLayout.createSequentialGroup()
                                .addComponent(BColorPiel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BAgregarPersona))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPersonasLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(53, 53, 53)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TPInicio.addTab("Personas", PPersonas);

        javax.swing.GroupLayout PListarLayout = new javax.swing.GroupLayout(PListar);
        PListar.setLayout(PListarLayout);
        PListarLayout.setHorizontalGroup(
            PListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        PListarLayout.setVerticalGroup(
            PListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        TPInicio.addTab("Listar", PListar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        TPInicio.addTab("tab2", jPanel2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        TPInicio.addTab("tab5", jPanel5);

        MArchivos.setText("Archivos");

        MIGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MIGuardar.setText("Guardar");
        MIGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIGuardarActionPerformed(evt);
            }
        });
        MArchivos.add(MIGuardar);

        MIGuardarcomo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        MIGuardarcomo.setText("Guardar como");
        MIGuardarcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIGuardarcomoActionPerformed(evt);
            }
        });
        MArchivos.add(MIGuardarcomo);

        MISalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        MISalir.setText("Salir");
        MISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MISalirActionPerformed(evt);
            }
        });
        MArchivos.add(MISalir);

        MIAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MIAbout.setText("About");
        MIAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIAboutActionPerformed(evt);
            }
        });
        MArchivos.add(MIAbout);

        jMenuBar1.add(MArchivos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPInicio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPInicio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAbrirMouseClicked
        File Fichero = null;
        FileReader FR = null;
        BufferedReader BR = null;
        //TATexto.setText("");
        try {
            JFileChooser Archivos = new JFileChooser();
            FileNameExtensionFilter Filtro = new FileNameExtensionFilter("Archivos con formato", ".txt");
            Archivos.setFileFilter(Filtro);
            int Seleccion = Archivos.showOpenDialog(this);
            if (Seleccion == JFileChooser.APPROVE_OPTION) {
                Fichero = Archivos.getSelectedFile();
                FR = new FileReader(Fichero);
                BR = new BufferedReader(FR);
                //path = Fichero.getPath();
                String Linea;
                while ((Linea = BR.readLine()) != null){
                    //TATexto.append(Linea + "\n");
                } // Fin while
            } // Fin if Seleccion
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                FR.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_BAbrirMouseClicked

    private void TFamiliaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFamiliaresMouseClicked
        if (evt.isMetaDown()) {
            int row = TFamiliares.getClosestRowForLocation(evt.getX(), evt.getY());
            TFamiliares.setSelectionRow(row);
            Object V1 = TFamiliares.getSelectionPath().getLastPathComponent();
            NodoSeleccionado = (DefaultMutableTreeNode) V1;
            
            if (NodoSeleccionado.getUserObject() instanceof Personas) {
                PersonaSeleccionada = (Personas)NodoSeleccionado.getUserObject();
                PPMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            } // Fin if
        } // Fin if
    }//GEN-LAST:event_TFamiliaresMouseClicked

    private void MIAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIAgregarActionPerformed
        
    }//GEN-LAST:event_MIAgregarActionPerformed

    private void MIModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIModificarActionPerformed
        String Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
        PersonaSeleccionada.setNombre(Nombre);
    }//GEN-LAST:event_MIModificarActionPerformed

    private void MIEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIEliminarActionPerformed
        int Resp = JOptionPane.showConfirmDialog(this, "¿Seguro que desea Eliminar?", "Confirmar", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (Resp == JOptionPane.OK_OPTION) {
            DefaultTreeModel Modelo = (DefaultTreeModel) TFamiliares.getModel();
            Modelo.removeNodeFromParent(NodoSeleccionado);
            Modelo.reload();
        } // Fin if
    }//GEN-LAST:event_MIEliminarActionPerformed

    private void MISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MISalirActionPerformed
        dispose();
    }//GEN-LAST:event_MISalirActionPerformed

    private void MIAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIAboutActionPerformed
        
    }//GEN-LAST:event_MIAboutActionPerformed

    private void MIGuardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIGuardarcomoActionPerformed
        
    }//GEN-LAST:event_MIGuardarcomoActionPerformed

    private void MIGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIGuardarActionPerformed
        JFileChooser Archivo = new JFileChooser();
        int Seleccion = Archivo.showSaveDialog(this);
        FileWriter FW = null;
        BufferedWriter BW = null;
        if (Seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File Fichero = Archivo.getSelectedFile();
                FW = new FileWriter(Fichero);
                BW = new BufferedWriter(FW);
                BW.write(TFNombre.getText());
                BW.write(TFID.getText());
                BW.write(SEdad.getValue().toString());
                BW.write(TFNacionalidad.getText());
                BW.write(TFLugarNacimiento.getText());
                BW.write(BColorPiel.getColorModel().toString());
                TFNombre.setText("");
                TFID.setText("");
                SEdad.setValue(20);
                TFNacionalidad.setText("");
                TFLugarNacimiento.setText("");
                BColorPiel.setBackground(Color.white);
                BW.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    FW.close();
                    BW.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_MIGuardarActionPerformed

    private void BColorPielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BColorPielMouseClicked
        BColorPiel.setBackground(JColorChooser.showDialog(this, "Seleccione un color: ", Color.yellow));
    }//GEN-LAST:event_BColorPielMouseClicked

    private void BAgregarPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAgregarPersonaMouseClicked
        DefaultTreeModel Modelo = (DefaultTreeModel) TFamiliares.getModel();
        DefaultMutableTreeNode Nodo = (DefaultMutableTreeNode) Modelo.getRoot();
        String Nombre = TFNombre.getText();
        DefaultMutableTreeNode NodoPersona;
        NodoPersona = new DefaultMutableTreeNode(new Personas(TFNombre.getText(), Long.parseLong(TFID.getText()), 
                (Integer)SEdad.getValue(), TFNacionalidad.getText(), TFLugarNacimiento.getText(), 
                BColorPiel.getBackground()));
        DefaultMutableTreeNode NPersona;
        NPersona = new DefaultMutableTreeNode(TFNombre.getText());
        
        Nodo.add(NodoPersona);
        NodoPersona.add(NPersona);
        Modelo.reload();
        TFNombre.setText("");
        TFID.setText("");
        SEdad.setValue(20);
        TFNacionalidad.setText("");
        TFLugarNacimiento.setText("");
        BColorPiel.setBackground(Color.white);
        
        boolean Centinela = true;
            for (int j = 0; j < Nodo.getChildCount(); j++) {
                if (Nodo.getChildAt(j).toString().equals(Nombre)) {
                    ((DefaultMutableTreeNode) Nodo.getChildAt(j)).add(NodoPersona);
                    Centinela = false;
                } // Fin if
            } // Fin for j
            
            if (Centinela) {
                DefaultMutableTreeNode Nom = new DefaultMutableTreeNode(Nombre);
                Nom.add(NodoPersona);
                Nodo.add(Nom);
            }
    }//GEN-LAST:event_BAgregarPersonaMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAbrir;
    private javax.swing.JButton BAgregarPersona;
    private javax.swing.JButton BColorPiel;
    private javax.swing.ButtonGroup Groupo1;
    private javax.swing.JMenu MArchivos;
    private javax.swing.JMenuItem MIAbout;
    private javax.swing.JMenuItem MIAgregar;
    private javax.swing.JMenuItem MIEliminar;
    private javax.swing.JMenuItem MIGuardar;
    private javax.swing.JMenuItem MIGuardarcomo;
    private javax.swing.JMenuItem MIModificar;
    private javax.swing.JMenuItem MISalir;
    private javax.swing.JPanel PInicio;
    private javax.swing.JPanel PListar;
    private javax.swing.JPopupMenu PPMenu;
    private javax.swing.JPanel PPersonas;
    private javax.swing.JSpinner SEdad;
    private javax.swing.JScrollPane SPInicio;
    private javax.swing.JTextField TFID;
    private javax.swing.JTextField TFLugarNacimiento;
    private javax.swing.JTextField TFNacionalidad;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTree TFamiliares;
    private javax.swing.JTabbedPane TPInicio;
    private javax.swing.JTree TPrincipal;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    DefaultMutableTreeNode NodoSeleccionado;
    Personas PersonaSeleccionada;
}
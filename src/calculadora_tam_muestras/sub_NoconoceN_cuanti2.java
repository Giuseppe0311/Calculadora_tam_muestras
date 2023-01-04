/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora_tam_muestras;

import AppPackage.AnimationClass;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author barre
 */
public class sub_NoconoceN_cuanti2 extends javax.swing.JFrame {
    int x,y;
    double Z12 ;
     double var12;
     double d12 ;

    /**
     * Creates new form sub_NoconoceN_cuanti2
     */
    DefaultTableModel modelo2 = new DefaultTableModel() ;
   

    public sub_NoconoceN_cuanti2() {
        this.setResizable(false);
        initComponents();
        modelo2.addColumn("Z(alfa)^2");
        modelo2.addColumn(" σ^2");
        modelo2.addColumn("d^2");
        modelo2.addColumn("n(final)");
        tbldato1_cuantiNO3.setModel(modelo2);
    }
    public void cargarDatos2(){
   
      txt_1_cuantiN03.setText(Double.toString(Z12));
       txt_3_cuantiNO3.setText(Double.toString(var12));
       txt_4_cuantiNO3.setText(Double.toString(d12));
      
       
   
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated y the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl1_cuanti_conoceN3 = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        jLabel15_logo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10_cacucc = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbldato1_cuantiNO3 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txt_1_cuantiN03 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txt_3_cuantiNO3 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txt_4_cuantiNO3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel7_precalculo1 = new javax.swing.JLabel();
        jLabel51_Z_NO = new javax.swing.JLabel();
        txt_resultadosNO16 = new javax.swing.JTextField();
        jLabel53_Var_no = new javax.swing.JLabel();
        txt_resultadosNO18 = new javax.swing.JTextField();
        jLabel54_d_NO = new javax.swing.JLabel();
        txt_resultadosNO19 = new javax.swing.JTextField();
        jLabel56_n_no = new javax.swing.JLabel();
        txt_resultadosNO20 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuantitativo - Se desconoce N");
        setMinimumSize(new java.awt.Dimension(1020, 620));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1020, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(320, 590));
        jPanel2.setPreferredSize(new java.awt.Dimension(320, 590));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl1_cuanti_conoceN3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"99.7%", "3"},
                {"99%", "2.58"},
                {"98%", "2.33"},
                {"96%", "2.05"},
                {"95%", "1.96"},
                {"90%", "1.645"},
                {"80%", "1.28"},
                {"50%", "0.674"}
            },
            new String [] {
                "Nivel de Confianza", "Z(alfa)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tbl1_cuanti_conoceN3);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 226, 147));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cuantitativo_desconoce_N.jpg"))); // NOI18N
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 150, -1));

        jLabel15_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo.png"))); // NOI18N
        jPanel2.add(jLabel15_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-help-64.png"))); // NOI18N
        jLabel16.setText("GUÍA : ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-hoja-de-datos-24.png"))); // NOI18N
        jLabel17.setText("Cuadro de Confianza :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-formula-fx-24.png"))); // NOI18N
        jLabel18.setText("Fórmula : ");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-menu-32.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel10_cacucc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-calculator-32 (1).png"))); // NOI18N
        jLabel10_cacucc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10_cacuccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10_cacuccMouseEntered(evt);
            }
        });
        jPanel2.add(jLabel10_cacucc, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 80, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 340, 650));

        jPanel4.setBackground(new java.awt.Color(0, 153, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cuantitativo");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-expand-arrow-32.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-close-32 (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel10MouseDragged(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 570, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 690, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbldato1_cuantiNO3 = new javax.swing.JTable(){
            public boolean  isCellEditable(int rowIndex, int colIndex){
                return false;

            }
        };
        tbldato1_cuantiNO3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldato1_cuantiNO3.setGridColor(new java.awt.Color(51, 204, 0));
        jScrollPane8.setViewportView(tbldato1_cuantiNO3);

        jPanel5.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 490, 130));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-historial-de-pedidos-24.png"))); // NOI18N
        jLabel13.setText("HISTORIAL DE RESULTADOS : ");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 25));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-flecha-responder-32.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-eliminar-propiedad-26 (1).png"))); // NOI18N
        jLabel11.setText("Eliminar Todo");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 110, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-eliminar-propiedad-26.png"))); // NOI18N
        jLabel12.setText("Eliminar Fila ");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 690, 210));

        jLabel46.setText("Nivel  de confianza Z(alfa) :");
        jPanel6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 160, -1));

        txt_1_cuantiN03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        txt_1_cuantiN03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_1_cuantiN03ActionPerformed(evt);
            }
        });
        txt_1_cuantiN03.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_1_cuantiN03KeyTyped(evt);
            }
        });
        jPanel6.add(txt_1_cuantiN03, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 71, -1));

        jLabel48.setText("Varianza( σ^2) :");
        jPanel6.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 90, -1));

        txt_3_cuantiNO3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        txt_3_cuantiNO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_3_cuantiNO3ActionPerformed(evt);
            }
        });
        txt_3_cuantiNO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_3_cuantiNO3KeyTyped(evt);
            }
        });
        jPanel6.add(txt_3_cuantiNO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 71, -1));

        jLabel49.setText("Máximo error de estimación (d) :");
        jPanel6.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 19));

        txt_4_cuantiNO3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        txt_4_cuantiNO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_4_cuantiNO3ActionPerformed(evt);
            }
        });
        txt_4_cuantiNO3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_4_cuantiNO3KeyTyped(evt);
            }
        });
        jPanel6.add(txt_4_cuantiNO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 71, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("TAMAÑO DE MUESTRA( SE DESCONOCE N)");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 380, 30));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-acercar-32.png"))); // NOI18N
        jLabel3.setText("INGRESAR DATOS");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-mayor-o-igual-2-64.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Mostrar Cálculos");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel7_precalculo1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel7_precalculo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-matemáticas-32.png"))); // NOI18N
        jLabel7_precalculo1.setText("Pre Cálculos :");
        jPanel1.add(jLabel7_precalculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 120, -1));

        jLabel51_Z_NO.setText("Z(alfa)^2 :");
        jPanel1.add(jLabel51_Z_NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 60, -1));

        txt_resultadosNO16.setEditable(false);
        txt_resultadosNO16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        jPanel1.add(txt_resultadosNO16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 71, -1));

        jLabel53_Var_no.setText(" σ^2 :");
        jPanel1.add(jLabel53_Var_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 40, -1));

        txt_resultadosNO18.setEditable(false);
        txt_resultadosNO18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        jPanel1.add(txt_resultadosNO18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 71, -1));

        jLabel54_d_NO.setText("   d^2 :");
        jPanel1.add(jLabel54_d_NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 38, 19));

        txt_resultadosNO19.setEditable(false);
        txt_resultadosNO19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        jPanel1.add(txt_resultadosNO19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 71, -1));

        jLabel56_n_no.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel56_n_no.setText("Tamaño de Muestra(n) :");
        jPanel1.add(jLabel56_n_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 140, -1));

        txt_resultadosNO20.setEditable(false);
        txt_resultadosNO20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        jPanel1.add(txt_resultadosNO20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 71, -1));

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 330, 280));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-calculate-64.png"))); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, 80));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 690, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void refrescartabla(){
    double Z122 =Math.pow(Double.parseDouble(txt_1_cuantiN03.getText()),2) ;
            double var122 = Math.pow(Double.parseDouble(txt_3_cuantiNO3.getText()),2);
            double d122 = Math.pow(Double.parseDouble(txt_4_cuantiNO3.getText()),2);
            double n_final1 =  Math.ceil(((Z122*var122)/d122));
            int n_sinpunto4 = (int)n_final1;
                Object xx[]=new Object[4];
                xx[0]=(double)Math.round(Z122 * 1000000d) / 1000000d;
                xx[1]=(double)Math.round(var122 * 1000000d) / 1000000d;
                xx[2]=(double)Math.round(d122 * 1000000d) / 1000000d;
                xx[3]=n_sinpunto4;
                
                  
    modelo2.addRow(xx);
    
    }
      public void vAlidadIngresoEnTabla1(){
     double Z222 =(double)Math.round(Math.pow(Double.parseDouble(txt_1_cuantiN03.getText()),2)* 1000000d) / 1000000d; 
     double var222 = (double)Math.round(Math.pow(Double.parseDouble(txt_3_cuantiNO3.getText()),2)* 1000000d) / 1000000d; 
     double d222 = (double)Math.round(Math.pow(Double.parseDouble(txt_4_cuantiNO3.getText()),2)* 1000000d) / 1000000d; 
    for(int i=0 ; i<tbldato1_cuantiNO3.getRowCount();i++)
        
    {
        if(tbldato1_cuantiNO3.getValueAt(i,0).equals(Z222)&&
                tbldato1_cuantiNO3.getValueAt(i,1).equals(var222)&&
                tbldato1_cuantiNO3.getValueAt(i,2).equals(d222)
                )
        {
        JOptionPane.showMessageDialog(null, "Ya se realizó este cálculo");
        modelo2.removeRow(i);
        }
   
        
    }
    refrescartabla();
    
   }
    private void txt_3_cuantiNO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_3_cuantiNO3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_3_cuantiNO3ActionPerformed

    private void txt_3_cuantiNO3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_3_cuantiNO3KeyTyped
        // TODO add your handling code here:
        char validar3=evt.getKeyChar();
        if(Character.isLetter(validar3)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"INGRESAR SOLO NUMEROS");
        }
    }//GEN-LAST:event_txt_3_cuantiNO3KeyTyped

    private void txt_4_cuantiNO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_4_cuantiNO3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_4_cuantiNO3ActionPerformed

    private void txt_4_cuantiNO3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_4_cuantiNO3KeyTyped
        // TODO add your handling code here:
        char validar4=evt.getKeyChar();
        if(Character.isLetter(validar4)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"INGRESAR SOLO NUMEROS");
        }
    }//GEN-LAST:event_txt_4_cuantiNO3KeyTyped

    private void txt_1_cuantiN03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_1_cuantiN03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_1_cuantiN03ActionPerformed

    private void txt_1_cuantiN03KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_1_cuantiN03KeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"INGRESAR SOLO NUMEROS");
        }

    }//GEN-LAST:event_txt_1_cuantiN03KeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        
        if(txt_1_cuantiN03.getText().trim().isEmpty()||txt_3_cuantiNO3.getText().trim().isEmpty() || txt_4_cuantiNO3.getText().trim().isEmpty()){

            JOptionPane.showMessageDialog(null,"POR FAVOR, LLENAR TODOS LOS CAMPOS","Error",JOptionPane.WARNING_MESSAGE);

        }

        double Z2 = Math.pow(Double.parseDouble(txt_1_cuantiN03.getText()),2);
        
        double Var2=Math.pow(Double.parseDouble(txt_3_cuantiNO3.getText()),2);
        
        double D2 = Math.pow(Double.parseDouble(txt_4_cuantiNO3.getText()),2);
        
        double n1 = ((Z2*Var2)/D2);
       
        txt_resultadosNO16.setText(Double.toString((double)Math.round(Z2 * 1000000d) / 1000000d));
        txt_resultadosNO18.setText(Double.toString((double)Math.round(Var2 * 1000000d) / 1000000d));
        txt_resultadosNO19.setText(Double.toString((double)Math.round(D2 * 1000000d) / 1000000d));
        txt_resultadosNO20.setText(Double.toString((double)Math.round(n1 * 1000000d) / 1000000d));
        vAlidadIngresoEnTabla1();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        // TODO add your handling code here:
    jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
    jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    MENU menn3 = new MENU();
    menn3.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
  int dialog123 = JOptionPane.YES_NO_OPTION;
        int result123 = JOptionPane.showConfirmDialog(null,"¿Desea salir?","Exit",dialog123);
        if(result123==0){
        System.exit(0);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    this.setState(MENU.ICONIFIED);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    AnimationClass calculadoraaa1  = new AnimationClass();
    calculadoraaa1.jLabelXRight(-20, 20, 10, 5, jLabel10_cacucc);


 AnimationClass calculadoraa11  = new AnimationClass();
    calculadoraa11.jLabelXLeft(20, -20, 10, 5, jLabel10_cacucc);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel10_cacuccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10_cacuccMouseClicked
        // TODO add your handling code here:
     try {
            Runtime rt1111 = Runtime.getRuntime();
            Process p111 = rt1111.exec("calc");
            p111.waitFor();
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_jLabel10_cacuccMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    AnimationClass precalculo_txt11  = new AnimationClass();
    precalculo_txt11.jLabelXLeft(280, 130, 10, 5, jLabel7_precalculo1);
    //
    
    //
   
    //
   
    //
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////
    AnimationClass z1  = new AnimationClass();
    z1.jTextFieldXLeft(280, 180, 10, 5, txt_resultadosNO16);
    //
    AnimationClass varianza1  = new AnimationClass();
    varianza1.jTextFieldXLeft(280, 180, 10, 5, txt_resultadosNO18);
    //
    AnimationClass d1  = new AnimationClass();
    d1.jTextFieldXLeft(280, 180, 10, 5, txt_resultadosNO19);
    //
    AnimationClass n1  = new AnimationClass();
    n1.jTextFieldXLeft(280, 180, 10, 5, txt_resultadosNO20);
    ////////////////////////////////////////////////////////////////////////////////////////////////aqui va la parte de texto
    AnimationClass z_txt1  = new AnimationClass();
    z_txt1.jLabelXLeft(280, 110, 10, 5, jLabel51_Z_NO);
    //
    AnimationClass var_txt1  = new AnimationClass();
    var_txt1.jLabelXLeft(280, 130, 10, 5, jLabel53_Var_no);
    //
    AnimationClass D_txt1  = new AnimationClass();
    D_txt1.jLabelXLeft(280,130, 10, 5, jLabel54_d_NO);
    //
    AnimationClass n_txt1  = new AnimationClass();
    n_txt1.jLabelXLeft(280, 30, 10, 5, jLabel56_n_no);
    
    /////////////////////////////////////////////////////////////////////////////////////////////aqui va la parte contraria de las varibles donde se ingresa datoS
    AnimationClass z11  = new AnimationClass();
    z11.jTextFieldXRight(180, 280, 10, 5, txt_resultadosNO16);
    //
    AnimationClass varianza11  = new AnimationClass();
    varianza11.jTextFieldXRight(180, 280, 10, 5, txt_resultadosNO18);
    //
    AnimationClass d11  = new AnimationClass();
    d11.jTextFieldXRight(180, 280, 10, 5, txt_resultadosNO19);
    AnimationClass n11  = new AnimationClass();
    n11.jTextFieldXRight(180, 280, 10, 5, txt_resultadosNO20);
    ///////////////////////////////////////////////////////////////////////////////////////////// lo mismo pero parte texto
     AnimationClass z_txt11  = new AnimationClass();
    z_txt11.jLabelXRight(110, 280, 10, 5, jLabel51_Z_NO);
    //
    AnimationClass var_txt11  = new AnimationClass();
    var_txt11.jLabelXRight(130, 280, 10, 5, jLabel53_Var_no);
    //
    AnimationClass D_txt11  = new AnimationClass();
    D_txt11.jLabelXRight(130, 280, 10, 5, jLabel54_d_NO);
    //
    AnimationClass n_txt11  = new AnimationClass();
    n_txt11.jLabelXRight(30, 280, 10, 5, jLabel56_n_no);
    //
    AnimationClass precalculo_txt1  = new AnimationClass();
    precalculo_txt1.jLabelXRight(130, 280, 10, 5, jLabel7_precalculo1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        int fila = tbldato1_cuantiNO3.getRowCount();
        for(int i=fila-1;i>=0;i-- ){
            modelo2.removeRow(i);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:

        int fila = tbldato1_cuantiNO3.getSelectedRow();
        if(fila>=0){

            modelo2.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccionar Fila");
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10_cacuccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10_cacuccMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10_cacuccMouseEntered

    private void jLabel10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseDragged
        // TODO add your handling code here:
   this.setLocation(this.getLocation().x+evt.getX() - x,this.getLocation().y+evt.getY()-y);
   
    }//GEN-LAST:event_jLabel10MouseDragged

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
    x = evt.getX();
    y=evt.getY();
    }//GEN-LAST:event_jLabel10MousePressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sub_NoconoceN_cuanti2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sub_NoconoceN_cuanti2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sub_NoconoceN_cuanti2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sub_NoconoceN_cuanti2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sub_NoconoceN_cuanti2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel10_cacucc;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15_logo;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51_Z_NO;
    private javax.swing.JLabel jLabel53_Var_no;
    private javax.swing.JLabel jLabel54_d_NO;
    private javax.swing.JLabel jLabel56_n_no;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7_precalculo1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tbl1_cuanti_conoceN3;
    private javax.swing.JTable tbldato1_cuantiNO3;
    private javax.swing.JTextField txt_1_cuantiN03;
    private javax.swing.JTextField txt_3_cuantiNO3;
    private javax.swing.JTextField txt_4_cuantiNO3;
    private javax.swing.JTextField txt_resultadosNO16;
    private javax.swing.JTextField txt_resultadosNO18;
    private javax.swing.JTextField txt_resultadosNO19;
    private javax.swing.JTextField txt_resultadosNO20;
    // End of variables declaration//GEN-END:variables

}

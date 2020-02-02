
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cScientist
 */
public class MainJFrame extends javax.swing.JFrame {
   
    private final MasaDetayFrame jfMasa;
    private final LoginJFrame jfLogin;
    public static ArrayList<JPanel> masalarPanels = new ArrayList<JPanel>();
    public MainJFrame() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        SystemClass.readAtıstırmalık();
        SystemClass.readAnaYemek();
        SystemClass.readSerbetliTatlı();
        SystemClass.readSogukIcecek();
        SystemClass.readSutluTatlı();
        SystemClass.readSıcaktIcecek();
        
        
        jfMasa = new MasaDetayFrame(null);
        jfLogin=new LoginJFrame();
        
        masalarPanels.add(m0);
        masalarPanels.add(m1);
        masalarPanels.add(m2);
        masalarPanels.add(m3);
        masalarPanels.add(m4);
        masalarPanels.add(m5);
        masalarPanels.add(m6);
        masalarPanels.add(m7);
        masalarPanels.add(m8);
        masalarPanels.add(m9);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                ImageIcon ım=new ImageIcon("bb.png");
                Image i=ım.getImage();

                g.drawImage(i, 5, 0, this.getSize().width,this.getSize().height, this);

            }

        };
        jButton1 = new javax.swing.JButton();
        m1 = new javax.swing.JPanel();
        m5 = new javax.swing.JPanel();
        m6 = new javax.swing.JPanel();
        m0 = new javax.swing.JPanel();
        m8 = new javax.swing.JPanel();
        m2 = new javax.swing.JPanel();
        m4 = new javax.swing.JPanel();
        m3 = new javax.swing.JPanel();
        m9 = new javax.swing.JPanel();
        m7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrator-icon.png"))); // NOI18N
        jButton1.setText("YÖNETİCİ GİRİŞİ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(73, 25, 25, 0);
        mainPanel.add(jButton1, gridBagConstraints);

        m1.setBackground(new java.awt.Color(255, 0, 51));
        m1.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 2"));
        m1.setName("1"); // NOI18N
        m1.setPreferredSize(new java.awt.Dimension(110, 150));
        m1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 30, 0, 0);
        mainPanel.add(m1, gridBagConstraints);

        m5.setBackground(new java.awt.Color(255, 0, 51));
        m5.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 6"));
        m5.setName("5"); // NOI18N
        m5.setPreferredSize(new java.awt.Dimension(110, 150));
        m5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(75, 181, 0, 0);
        mainPanel.add(m5, gridBagConstraints);

        m6.setBackground(new java.awt.Color(255, 0, 51));
        m6.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 7"));
        m6.setName("6"); // NOI18N
        m6.setPreferredSize(new java.awt.Dimension(110, 150));
        m6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(75, 30, 0, 0);
        mainPanel.add(m6, gridBagConstraints);

        m0.setBackground(new java.awt.Color(255, 0, 51));
        m0.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 1"));
        m0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        m0.setName("0"); // NOI18N
        m0.setPreferredSize(new java.awt.Dimension(110, 150));
        m0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 181, 0, 0);
        mainPanel.add(m0, gridBagConstraints);

        m8.setBackground(new java.awt.Color(255, 0, 51));
        m8.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 9"));
        m8.setName("8"); // NOI18N
        m8.setPreferredSize(new java.awt.Dimension(110, 150));
        m8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(75, 12, 0, 0);
        mainPanel.add(m8, gridBagConstraints);

        m2.setBackground(new java.awt.Color(255, 0, 51));
        m2.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 3"));
        m2.setName("2"); // NOI18N
        m2.setPreferredSize(new java.awt.Dimension(110, 150));
        m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 30, 0, 0);
        mainPanel.add(m2, gridBagConstraints);

        m4.setBackground(new java.awt.Color(255, 0, 51));
        m4.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 5"));
        m4.setName("4"); // NOI18N
        m4.setPreferredSize(new java.awt.Dimension(110, 150));
        m4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 30, 0, 0);
        mainPanel.add(m4, gridBagConstraints);

        m3.setBackground(new java.awt.Color(255, 0, 51));
        m3.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 4"));
        m3.setName("3"); // NOI18N
        m3.setPreferredSize(new java.awt.Dimension(110, 150));
        m3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 12, 0, 0);
        mainPanel.add(m3, gridBagConstraints);

        m9.setBackground(new java.awt.Color(255, 0, 51));
        m9.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 10"));
        m9.setName("9"); // NOI18N
        m9.setPreferredSize(new java.awt.Dimension(110, 150));
        m9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(75, 30, 0, 0);
        mainPanel.add(m9, gridBagConstraints);

        m7.setBackground(new java.awt.Color(255, 0, 51));
        m7.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa 8"));
        m7.setName("7"); // NOI18N
        m7.setPreferredSize(new java.awt.Dimension(110, 150));
        m7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainJFrame.this.mouseClicked(evt);
            }
        });
        m7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(75, 30, 0, 0);
        mainPanel.add(m7, gridBagConstraints);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked

        siparisAlMasa(Integer.parseInt(evt.getComponent().getName()));
    }//GEN-LAST:event_mouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jfLogin.setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void siparisAlMasa(int masaNo) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SystemClass.masalar.get(masaNo).setIsOpen(true);
                jfMasa.setMasa(SystemClass.masalar.get(masaNo));
                jfMasa.setUrunler();
                jfMasa.setCBoxIndexs();
                jfMasa.setVisible(true);
                masalarPanels.get(masaNo).setBackground(Color.GREEN);
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
    for (int i = 0; i < 11; i++) {
                    SystemClass.masalar.add(new Masa(i));            
                }
              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel m0;
    private javax.swing.JPanel m1;
    private javax.swing.JPanel m2;
    private javax.swing.JPanel m3;
    private javax.swing.JPanel m4;
    private javax.swing.JPanel m5;
    private javax.swing.JPanel m6;
    private javax.swing.JPanel m7;
    private javax.swing.JPanel m8;
    private javax.swing.JPanel m9;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}

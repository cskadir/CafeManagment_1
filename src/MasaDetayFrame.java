
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MasaDetayFrame extends javax.swing.JFrame{
    
    private Masa masa;

    public MasaDetayFrame(Masa masa) {
 //       this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        initComponents();
        this.masa = masa;
        setUrunler();
        setCBoxIndexs();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);   
    }

    public  void setUrunler() {
        
        jcbIcecekler.removeAllItems();
        jcbTatlılar.removeAllItems();
        jcbYemekler.removeAllItems();
        
        for (Urun urun : SystemClass.urunler) {
            if (urun instanceof Icecekler) {
                jcbIcecekler.addItem(urun);
            } else if (urun instanceof Yemekler) {
                jcbYemekler.addItem(urun);
            } else if (urun instanceof Tatlılar) {
                jcbTatlılar.addItem(urun);
            }
        }
    }
    
    public void setCBoxIndexs(){
        
        jcbIcecekler.setSelectedIndex(-1);
        jcbTatlılar.setSelectedIndex(-1);
        jcbYemekler.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        mainpanel = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                ImageIcon ım=new ImageIcon("55.jpg");
                Image i=ım.getImage();

                g.drawImage(i, 5, 0, this.getSize().width,this.getSize().height, this);

            }

        };
        jbAddUrun = new javax.swing.JButton();
        jbDelUrun = new javax.swing.JButton();
        jbGetBill = new javax.swing.JButton();
        panelUrunEKle = new javax.swing.JPanel();
        jlYemekler = new javax.swing.JLabel();
        jlIcecekler = new javax.swing.JLabel();
        jlTatlılar = new javax.swing.JLabel();
        jcbYemekler = new javax.swing.JComboBox<>();
        jcbIcecekler = new javax.swing.JComboBox<>();
        jcbTatlılar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        panelUrunEKle1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        siparisVerilenUrunler = new javax.swing.JList<>();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbAddUrun.setBackground(new java.awt.Color(201, 188, 156));
        jbAddUrun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button_Add.png"))); // NOI18N
        jbAddUrun.setText("URUN EKLE");
        jbAddUrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddUrunActionPerformed(evt);
            }
        });

        jbDelUrun.setBackground(new java.awt.Color(201, 188, 156));
        jbDelUrun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete-icon.png"))); // NOI18N
        jbDelUrun.setText("URUN SIL");
        jbDelUrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDelUrunActionPerformed(evt);
            }
        });

        jbGetBill.setBackground(new java.awt.Color(201, 188, 156));
        jbGetBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/get-money-icon.png"))); // NOI18N
        jbGetBill.setText("HESAP AL");
        jbGetBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGetBillActionPerformed(evt);
            }
        });

        panelUrunEKle.setOpaque(false);

        jlYemekler.setBackground(new java.awt.Color(0, 51, 51));
        jlYemekler.setText("YEMEKLER");

        jlIcecekler.setText("ICECEKLER");

        jlTatlılar.setText("TATLILAR");

        jcbYemekler.setBackground(new java.awt.Color(201, 188, 156));
        jcbYemekler.setMaximumRowCount(150);
        jcbYemekler.setAutoscrolls(true);
        jcbYemekler.setOpaque(false);

        jcbIcecekler.setBackground(new java.awt.Color(201, 188, 156));

        jcbTatlılar.setBackground(new java.awt.Color(201, 188, 156));

        javax.swing.GroupLayout panelUrunEKleLayout = new javax.swing.GroupLayout(panelUrunEKle);
        panelUrunEKle.setLayout(panelUrunEKleLayout);
        panelUrunEKleLayout.setHorizontalGroup(
            panelUrunEKleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUrunEKleLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelUrunEKleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlYemekler, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTatlılar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIcecekler, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(panelUrunEKleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbYemekler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbIcecekler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbTatlılar, 0, 317, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUrunEKleLayout.setVerticalGroup(
            panelUrunEKleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUrunEKleLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelUrunEKleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbYemekler, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlYemekler, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelUrunEKleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIcecekler, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbIcecekler, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelUrunEKleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTatlılar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTatlılar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel1.setText("jLabel1");
        jLabel1.setAlignmentX(0.4F);

        panelUrunEKle1.setOpaque(false);

        siparisVerilenUrunler.setBackground(new java.awt.Color(201, 188, 156));
        siparisVerilenUrunler.setSelectionBackground(new java.awt.Color(201, 188, 156));
        siparisVerilenUrunler.setSelectionForeground(new java.awt.Color(201, 131, 97));
        jScrollPane1.setViewportView(siparisVerilenUrunler);

        javax.swing.GroupLayout panelUrunEKle1Layout = new javax.swing.GroupLayout(panelUrunEKle1);
        panelUrunEKle1.setLayout(panelUrunEKle1Layout);
        panelUrunEKle1Layout.setHorizontalGroup(
            panelUrunEKle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUrunEKle1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelUrunEKle1Layout.setVerticalGroup(
            panelUrunEKle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUrunEKle1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAddUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDelUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGetBill, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUrunEKle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(panelUrunEKle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 217, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jbAddUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jbDelUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jbGetBill, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(panelUrunEKle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(panelUrunEKle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private int jOptionPane(){
  //          masa.setBill(0);
     String[] options = {"Hesap Al, Masayı Kapat"};
        int x = JOptionPane.showOptionDialog(null, "toplam hesap "+masa.takeCharge()+" TL",
                "Masa ("+masa.getMasaNo()+1+") Hesap ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        return x ; 
    
    }
    private void jbGetBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGetBillActionPerformed
       
        if(jOptionPane()==0){
          masa.setInitValue();
          
          setJListData();
            setVisible(false);
            
             MainJFrame.masalarPanels.get(masa.getMasaNo()).setBackground(Color.RED);
        }
          
    }//GEN-LAST:event_jbGetBillActionPerformed

    private void jbAddUrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddUrunActionPerformed

        if (jcbIcecekler.getSelectedIndex() != -1) {
            masa.getMasaUruns().add((Urun) jcbIcecekler.getSelectedItem());
        }
        if (jcbYemekler.getSelectedIndex() != -1) {
            masa.getMasaUruns().add((Urun) jcbYemekler.getSelectedItem());
        }

        if (jcbTatlılar.getSelectedIndex() != -1) {
            masa.getMasaUruns().add((Urun) jcbTatlılar.getSelectedItem());
        }
        setJListData();
        setCBoxIndexs();

    }//GEN-LAST:event_jbAddUrunActionPerformed

    private void setJListData() {
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < masa.getMasaUruns().size(); i++) {
            listModel.addElement(masa.getMasaUruns().get(i));
        }
        siparisVerilenUrunler.setModel(listModel);;
    }

    private void jbDelUrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDelUrunActionPerformed
        if (siparisVerilenUrunler.getSelectedIndex() != -1) {
            masa.delUrunFromMasa(siparisVerilenUrunler.getSelectedIndex());
            setJListData();
        }

    }//GEN-LAST:event_jbDelUrunActionPerformed

    public void setMasa(Masa masa) {
        this.masa = masa;
        setJListData() ;
    }

    public ArrayList<Urun> masadakiUrunler() {
        return masa.getMasaUruns();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAddUrun;
    private javax.swing.JButton jbDelUrun;
    private javax.swing.JButton jbGetBill;
    private javax.swing.JComboBox<Urun> jcbIcecekler;
    private javax.swing.JComboBox<Urun> jcbTatlılar;
    private javax.swing.JComboBox<Urun> jcbYemekler;
    private javax.swing.JLabel jlIcecekler;
    private javax.swing.JLabel jlTatlılar;
    private javax.swing.JLabel jlYemekler;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel panelUrunEKle;
    private javax.swing.JPanel panelUrunEKle1;
    private javax.swing.JList<Urun> siparisVerilenUrunler;
    // End of variables declaration//GEN-END:variables

}

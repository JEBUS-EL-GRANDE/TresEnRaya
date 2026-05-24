package presentacion;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import negocio.Tablero;
import negocio.TresEnRaya;

public class VistaTresEnRaya extends javax.swing.JFrame {

    /** Creates new form VistaTresEnRaya */
    public VistaTresEnRaya() {
        initComponents();
        iniciarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(80, 80));

        jButton1.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jToggleButton1.setText("Inicia Maquina");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton10.setText("Establecer");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresar Nivel");

        jToggleButton2.setText("(NO)Inicia Maquina");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad jugadas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton2)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         // ESTABLECER
        if(String.valueOf(jTextField1.getText())  !=""){
            nivel =Integer.parseInt(jTextField1.getText());
            activarBotones();
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(tablero.getElemento(0,0)==0){
        jButton1.setText("0");
        jButton1.setEnabled(false);
        tablero.setElemento(0, 0, HUMANO);
        gato.miniMax(tablero, MAQUINA, nivel, true);
        tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
 verificarJugada(tablero);
 cantidadJugadas(tablero);
 H++;
 M++;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(0,1)==0){
           jButton2.setText("0");
           jButton2.setEnabled(false);
           tablero.setElemento(0, 1, HUMANO);
           gato.miniMax(tablero, MAQUINA, nivel, true);
           tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
 verificarJugada(tablero);
  cantidadJugadas(tablero);
 H++;M++;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(0,2)==0){
        jButton3.setText("0");
         jButton3.setEnabled(false);
         tablero.setElemento(0, 2, HUMANO);
           gato.miniMax(tablero, MAQUINA, nivel, true);
           tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
 verificarJugada(tablero);
  cantidadJugadas(tablero);
 H++;
 M++;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(1,0)==0){
        jButton4.setText("0");
        jButton4.setEnabled(false);
        tablero.setElemento(1,0, HUMANO);
        gato.miniMax(tablero, MAQUINA, nivel, true);
        tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
           verificarJugada(tablero);
            cantidadJugadas(tablero);
           H++;
           M++;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(1,1)==0){
        jButton5.setText("0");
        jButton5.setEnabled(false);
        tablero.setElemento(1, 1, HUMANO);
        gato.miniMax(tablero, MAQUINA, nivel, true);
        tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
          verificarJugada(tablero);
           cantidadJugadas(tablero);
          H++;
          M++;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(1,2)==0){
            jButton6.setText("0");
            jButton6.setEnabled(false);
            tablero.setElemento(1, 2, HUMANO);
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
            verificarJugada(tablero);
             cantidadJugadas(tablero);
            H++;
            M++;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(2,0)==0){
           jButton7.setText("0");
           jButton7.setEnabled(false);
           tablero.setElemento(2, 0, HUMANO);
           gato.miniMax(tablero, MAQUINA, nivel, true);
           tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
           verificarJugada(tablero);
            cantidadJugadas(tablero);
           H++;
           M++;
         }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(2,1)==0){
           jButton8.setText("0");
           jButton8.setEnabled(false);
           tablero.setElemento(2, 1, HUMANO);
           gato.miniMax(tablero, MAQUINA, nivel, true);
           tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
           verificarJugada(tablero);
            cantidadJugadas(tablero);
           H++;
           M++;
         }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(2,2)==0){
        jButton9.setText("0");
        jButton9.setEnabled(false);
        tablero.setElemento(2, 2, HUMANO);
        gato.miniMax(tablero, MAQUINA, nivel, true);
         tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
           arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        verificarJugada(tablero);
         cantidadJugadas(tablero);
        H++;
        M++;
         }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // INICIAR MAQUINA 
        gato.miniMax(tablero, MAQUINA, nivel, true);
        tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        jToggleButton1.setEnabled(false);
        M++;
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // INICIA MAQUINA NO
        jToggleButton1.setEnabled(true);
        nivel =Integer.parseInt(jTextField1.getText());
        activarBotones();
        /*if(String.valueOf(jTextField1.getText())  !=""){
            nivel =Integer.parseInt(jTextField1.getText());
            activarBotones();
        }*/
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    private void desactivarBotones() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            arrayButton[i][j].setEnabled(false);
        }
    }
}

    /****************************************
    * @param args the command line arguments*
    *****************************************/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTresEnRaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
    TresEnRaya gato = new TresEnRaya();
    Tablero tablero = new Tablero(3,3);
    JButton arrayButton [][] = new JButton[3][3];
    int MAQUINA = 1;
    int HUMANO=2;
    int nivel = 0;
    int H = 1;
    int M = 1;


    private void iniciarComponentes() {
       jButton1.setEnabled(false);
       jButton2.setEnabled(false);
       jButton3.setEnabled(false);
       jButton4.setEnabled(false);
       jButton5.setEnabled(false);
       jButton6.setEnabled(false);
       jButton7.setEnabled(false);
       jButton8.setEnabled(false);
       jButton9.setEnabled(false);
       arrayButton[0][0]=jButton1;
       arrayButton[0][1]=jButton2;
       arrayButton[0][2]=jButton3;
       arrayButton[1][0]=jButton4;
       arrayButton[1][1]=jButton5;
       arrayButton[1][2]=jButton6;
       arrayButton[2][0]=jButton7;
       arrayButton[2][1]=jButton8;
       arrayButton[2][2]=jButton9;

    }

    private void activarBotones() {
       jButton1.setEnabled(true);
       jButton2.setEnabled(true);
       jButton3.setEnabled(true);
       jButton4.setEnabled(true);
       jButton5.setEnabled(true);
       jButton6.setEnabled(true);
       jButton7.setEnabled(true);
       jButton8.setEnabled(true);
       jButton9.setEnabled(true);
    }
    private void verificarJugada(Tablero t){
             if(gato.finDelJuego(t)){
                int ganador = gato.existeGanador(t);
                if(ganador ==MAQUINA)
                    JOptionPane.showMessageDialog(null, "Gano la Maquina");
                 else if(ganador == HUMANO)
                     JOptionPane.showMessageDialog(null, "Ganaste");
                else
                      JOptionPane.showMessageDialog(null, "Empataron");
             }
    }
    private void cantidadJugadas(Tablero t) {
        if(gato.finDelJuego(t)) {
            int ganador = gato.existeGanador(t);
            if (ganador == MAQUINA) {
                JOptionPane.showMessageDialog(null, "Gano la msquina " + M);
            } else if (ganador == HUMANO) {
                JOptionPane.showMessageDialog(null, "Ganaste " + H);
            } else {
                JOptionPane.showMessageDialog(null, "Empataron");
            }
            desactivarBotones();
        }
    }
}
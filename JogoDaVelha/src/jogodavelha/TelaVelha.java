/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author aluno
 */
public class TelaVelha extends javax.swing.JFrame {

    /**
     * Creates new form TelaVelha
     */
    public TelaVelha() {
        this.tabuleiro = new char[3][3];
        for(int i = 0; i <3 ; i++)
        {
            for(int j = 0; j < 3 ; j++)
            {
               tabuleiro[i][j] = ' '; 
            }
           
        }
        jogador = 'x';
        initComponents();
        this.setVisible(true);
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
        lblPlayer = new javax.swing.JLabel();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("vez de ");

        lblPlayer.setText("x");

        btn11.setText(" ");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setText(" ");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setText(" ");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn21.setText(" ");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setText(" ");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setText(" ");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn31.setText(" ");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setText(" ");
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.setText(" ");
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn31)
                    .addComponent(btn21)
                    .addComponent(btn11)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPlayer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn13)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPlayer))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn11)
                    .addComponent(btn12)
                    .addComponent(btn13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn21)
                    .addComponent(btn22)
                    .addComponent(btn23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn31)
                    .addComponent(btn32)
                    .addComponent(btn33))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if(btn11.getText().equals(" "))
        {
            btn11.setText(Character.toString(jogador));
            tabuleiro[0][0] = jogador;
            jogadas++;
            if(alguémVenceu())
            {
                new vencedor(jogador);
                this.dispose();
            }
            else
            {
                mudarJogador();
                 lblPlayer.setText(Character.toString(jogador));
            }
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
       if(btn12.getText().equals(" "))
        {
            btn12.setText(Character.toString(jogador));
            tabuleiro[0][1] = jogador;
            jogadas++;
            if(alguémVenceu())
            {
                 new vencedor(jogador);
                this.dispose();
            }
            else
            {
                mudarJogador();
                 lblPlayer.setText(Character.toString(jogador));
            }
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        if(btn13.getText().equals(" "))
        {
            btn13.setText(Character.toString(jogador));
            tabuleiro[0][2] = jogador;
            jogadas++;
            if(alguémVenceu())
            {
                new vencedor(jogador);
                this.dispose();
            }
            else
            {
                mudarJogador();
                 lblPlayer.setText(Character.toString(jogador));
            }
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        if(btn21.getText().equals(" "))
        {
            btn21.setText(Character.toString(jogador));
            tabuleiro[1][0] = jogador;
            jogadas++;
            if(alguémVenceu())
            {
                 new vencedor(jogador);
                this.dispose();
            }
            else
            {
                mudarJogador();
                 lblPlayer.setText(Character.toString(jogador));
            }
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        if(btn22.getText().equals(" "))
        {
            btn22.setText(Character.toString(jogador));
            tabuleiro[1][1] = jogador;
            jogadas++;
            if(alguémVenceu())
            {
                 new vencedor(jogador);
                this.dispose();
            }
            else
            {
                mudarJogador();
                 lblPlayer.setText(Character.toString(jogador));
            }
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        if(btn23.getText().equals(" "))
        {
            btn23.setText(Character.toString(jogador));
            tabuleiro[1][2] = jogador;
            jogadas++;
            if(alguémVenceu())
            {
                new vencedor(jogador);
                this.dispose();
            }
            else
            {
                mudarJogador();
                 lblPlayer.setText(Character.toString(jogador));
            }
        }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
      if(btn31.getText().equals(" "))
        {
            btn31.setText(Character.toString(jogador));
            tabuleiro[2][0] = jogador;
            jogadas++;
            if(alguémVenceu())
            {
                 new vencedor(jogador);
                this.dispose();
            }
            else
            {
                mudarJogador();
                 lblPlayer.setText(Character.toString(jogador));
            }
        }
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        if(btn32.getText().equals(" "))
        {
            btn32.setText(Character.toString(jogador));
            tabuleiro[2][1] = jogador;
            jogadas++;
            if(alguémVenceu())
            {
                new vencedor(jogador);
                this.dispose();
            }
            else
            {
                mudarJogador();
                 lblPlayer.setText(Character.toString(jogador));
            }
        }
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        if(btn33.getText().equals(" "))
        {
            btn33.setText(Character.toString(jogador));
            tabuleiro[2][2] = jogador;
            jogadas++;
            if(alguémVenceu())
            {
               new vencedor(jogador);
                this.dispose();
            }
            else
            {
                mudarJogador();
                 lblPlayer.setText(Character.toString(jogador));
            }
        }
    }//GEN-LAST:event_btn33ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(TelaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPlayer;
    // End of variables declaration//GEN-END:variables

    char jogador;
    char tabuleiro[][];
    int jogadas = 0;
    
    
    void mudarJogador()
    {
        if(jogador == 'o')
        {
            jogador = 'x';
        }
        else
        {
            jogador = 'o';
        }
    }
    
    boolean alguémVenceu()
    {
        //lblPlayer.setText(Character.toString(jogador));
        
        for(int i = 0; i <3 ; i++)
        {
            for(int j = 0; j < 3 ; j++)
            {
                System.out.print(" " + tabuleiro[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        if (jogadas > 4)
        {
            if(tabuleiro[1][1] != ' ')
            {
                if(tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[2][2] == tabuleiro[1][1])
                {
                    System.out.println("diagonal principal");
                    return true;
                }
                if(tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[2][1] == tabuleiro[1][1])
                {
                    System.out.println("coluna do meio");
                    return true;
                }
               if(tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][2] == tabuleiro[1][1])
                {
                    System.out.println("fileira do meio");
                    return true;
                }
               if(tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[2][0] == tabuleiro[1][1])
                {
                   
                    System.out.println("diagonal secundaria");
                    return true;
                }
                
            }
            if(tabuleiro[0][0] != ' ')
            {
                if(tabuleiro[0][1] == tabuleiro[0][0] && tabuleiro[0][2] == tabuleiro[0][0])
                {
                    System.out.println("fileira de cima");
                    return true;
                }
                 if(tabuleiro[1][0] == tabuleiro[0][0] && tabuleiro[2][0] == tabuleiro[0][0])
                {
                    System.out.println("coluna da esquerda");
                    return true;
                }
            }
              if(tabuleiro[2][2] != ' ')
            {
                if(tabuleiro[2][0] == tabuleiro[2][2] && tabuleiro[2][1] == tabuleiro[2][2])
                {
                    System.out.println("fileira de baixo");
                    return true;
                }
                 if(tabuleiro[0][2] == tabuleiro[2][2] && tabuleiro[1][2] == tabuleiro[2][2])
                {
                    System.out.println("coluna da direita");
                    return true;
                }
            }
            
        }
        
            return false;
    }
    
    
    
    
    
    
}


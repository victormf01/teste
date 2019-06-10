/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();
        limparTela();
        this.zerado = true;
        this.setTitle("calculadora");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnMais = new javax.swing.JButton();
        BtnMenos = new javax.swing.JButton();
        BtnVezes = new javax.swing.JButton();
        BtnDividir = new javax.swing.JButton();
        BtnLimparVisor = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        txtVisor = new javax.swing.JTextField();
        lblNum1 = new javax.swing.JLabel();
        lblOperador = new javax.swing.JLabel();
        lblIgual = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnNegativo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        BtnMais.setText("+");
        BtnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMaisActionPerformed(evt);
            }
        });

        BtnMenos.setText("-");
        BtnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenosActionPerformed(evt);
            }
        });

        BtnVezes.setText("*");
        BtnVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVezesActionPerformed(evt);
            }
        });

        BtnDividir.setText("/");
        BtnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDividirActionPerformed(evt);
            }
        });

        BtnLimparVisor.setText("CE");
        BtnLimparVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparVisorActionPerformed(evt);
            }
        });

        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        txtVisor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVisorFocusLost(evt);
            }
        });
        txtVisor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVisorKeyTyped(evt);
            }
        });

        lblNum1.setText("jLabel1");

        lblOperador.setText("jLabel2");

        lblIgual.setText("=");

        lblResultado.setText("jLabel4");

        lblNum2.setText("jLabel1");

        btnSete.setText("7");
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });

        btnOito.setText("8");
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });

        btnNove.setText("9");
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });

        btnQuatro.setText("4");
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnUm.setText("1");
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnDois.setText("2");
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnPonto.setText(".");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnNegativo.setText("+/-");
        btnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNum1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblOperador)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNum2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblIgual)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblResultado)
                            .addGap(55, 55, 55))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnQuatro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCinco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSeis)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnUm)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnDois)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnTres))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnZero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnPonto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnNegativo)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(10, 10, 10)
                            .addComponent(BtnIgual)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLimparVisor))
                    .addComponent(txtVisor))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum1)
                    .addComponent(lblOperador)
                    .addComponent(lblNum2)
                    .addComponent(lblIgual)
                    .addComponent(lblResultado))
                .addGap(23, 23, 23)
                .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSete)
                            .addComponent(btnOito)
                            .addComponent(btnNove)
                            .addComponent(BtnMais)))
                    .addComponent(BtnLimparVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuatro)
                            .addComponent(btnCinco)
                            .addComponent(btnSeis)
                            .addComponent(BtnMenos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUm)
                            .addComponent(btnDois)
                            .addComponent(btnTres)
                            .addComponent(BtnVezes))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnZero)
                                    .addComponent(btnPonto))
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnDividir)
                                    .addComponent(btnNegativo))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimparVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparVisorActionPerformed
            zerar();
            limparTela();
    }//GEN-LAST:event_BtnLimparVisorActionPerformed

    private void BtnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMaisActionPerformed
    
     calcular();
     operador = '+';
    
     
    }//GEN-LAST:event_BtnMaisActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed

        calcular();
        imprimir();
        zerado = true;
// TODO add your handling code here:
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenosActionPerformed
        // TODO add your handling code here:
        calcular();
        operador = '-';
    }//GEN-LAST:event_BtnMenosActionPerformed

    private void BtnVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVezesActionPerformed
        // TODO add your handling code here:
        calcular();
        operador = '*';
    }//GEN-LAST:event_BtnVezesActionPerformed

    private void BtnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDividirActionPerformed
        // TODO add your handling code here:
        calcular();
        operador = '/';
    }//GEN-LAST:event_BtnDividirActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        // TODO add your handling code here:
        txtVisor.setText(txtVisor.getText() + "1");
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        // TODO add your handling code here:
         txtVisor.setText(txtVisor.getText() + "2");
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        txtVisor.setText(txtVisor.getText() + "3");        // TODO add your handling code here:
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
         txtVisor.setText(txtVisor.getText() + "4");        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        // TODO add your handling code here:
         txtVisor.setText(txtVisor.getText() + "5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        // TODO add your handling code here:
         txtVisor.setText(txtVisor.getText() + "6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        // TODO add your handling code here:
         txtVisor.setText(txtVisor.getText() + "7");
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        // TODO add your handling code here:
         txtVisor.setText(txtVisor.getText() + "8");
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
        // TODO add your handling code here:
         txtVisor.setText(txtVisor.getText() + "9");
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        // TODO add your handling code here:
         txtVisor.setText(txtVisor.getText() + "0");
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        // TODO add your handling code here:
         txtVisor.setText(txtVisor.getText() + ".");
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed
        // TODO add your handling code here:
         txtVisor.setText("-" + txtVisor.getText());
    }//GEN-LAST:event_btnNegativoActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
     
    }//GEN-LAST:event_formKeyTyped

    private void txtVisorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVisorKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar() == '+')
        {
            calcular();
            operador = '+';
            System.out.println("aconteceu errado");

        }
    }//GEN-LAST:event_txtVisorKeyTyped

    private void txtVisorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVisorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVisorFocusLost

    
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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDividir;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnLimparVisor;
    private javax.swing.JButton BtnMais;
    private javax.swing.JButton BtnMenos;
    private javax.swing.JButton BtnVezes;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnNegativo;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel lblIgual;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblOperador;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables

    private double num1;
    private double num2;
    private char operador;
    private double resultado;
    private boolean zerado;
    
  
    
    public void calcular()
    {
        jogarValor();
        
        if(zerado == false)
       {
            try
            {
                switch(operador)
                {
                    case '+' : resultado = num1 + num2;
                             break;
                    case '-' : resultado = num1 - num2;
                            break;
                    case '*' : resultado = num1 * num2;
                            break;
                    case '/' : if(num2 != 0)
                                {
                                    resultado = num1 / num2;
                                }
                                else
                                    throw new ImbecilException(0);
                }
                atualizarTela();
                num1 = resultado;
           
            }                    
            catch (ImbecilException ex) 
            {
                new JanelaDeErro(ex.getMessage()).setVisible(true);
            }
                            
            catch (NumberFormatException ex)
            {
                new JanelaDeErro("sinto muito, não consigo calcular nada desse tamanho").setVisible(true);
            }
           
        }
       else
       {
           zerado = false;
           limparTela();
           lblNum1.setText(Double.toString(num1));
       }
       }
    
    public void jogarValor()
    {
        
        try
        {
            if(zerado)
            {
                num1 = Double.parseDouble(txtVisor.getText());
            }
            else
            {
                num2 = Double.parseDouble(txtVisor.getText());
            }
        }
        catch(NumberFormatException ex)
        {
            zerar();
            new JanelaDeErro("você inseriu um valor inválido").setVisible(true);
        }
        finally
        {
            txtVisor.setText("");
            txtVisor.requestFocus();
        }
            
            
    
    }
    
    public void zerar()
    {
        zerado = true;
        txtVisor.setText("");
        
    }
    
    public void imprimir()
    {
        txtVisor.setText(Double.toString(resultado));
    }
    
    public void atualizarTela()
    {
        lblNum1.setText(Double.toString(num1));
        lblNum2.setText(Double.toString(num2));
        lblOperador.setText(Character.toString(operador));
        lblResultado.setText(Double.toString(resultado));
    }
    
    public void limparTela()
    {
        lblNum1.setText("");
        lblNum2.setText("");
        lblOperador.setText("");
        lblResultado.setText("");
    }
    
    
            
}
    
   
    



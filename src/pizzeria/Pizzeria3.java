package pizzeria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;

public class Pizzeria3 extends javax.swing.JFrame {

    Pizza p;

    public Pizzeria3() {
        initComponents();
        this.botonNormal.setActionCommand("Normal");
        this.botonIntegral.setActionCommand("Integral");
//      String masa, String tipo, String tamaño, List ingredientes
        String masa = this.buttonGroup1.getSelection().getActionCommand();
        String tipo = this.tipoPizza.getSelectedItem().toString();
        String tamaño = this.spinnerTamaño.getValue().toString();
        this.lista = this.listaIngredientes.getSelectedValuesList();
        p = new Pizza(masa, tipo, tamaño, this.lista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelDatos = new javax.swing.JPanel();
        panelMasa = new javax.swing.JPanel();
        botonNormal = new javax.swing.JRadioButton();
        botonIntegral = new javax.swing.JRadioButton();
        panelTipoPizza = new javax.swing.JPanel();
        tipoPizza = new javax.swing.JComboBox();
        panelIngredientesExtra = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaIngredientes = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        spinnerTamaño = new javax.swing.JSpinner();
        panelResultado = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaPedido = new javax.swing.JTextArea();
        botonTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Masa"));

        buttonGroup1.add(botonNormal);
        botonNormal.setSelected(true);
        botonNormal.setText("Normal");
        botonNormal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonNormalItemStateChanged(evt);
            }
        });
        botonNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNormalActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonIntegral);
        botonIntegral.setText("Integral");
        botonIntegral.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonIntegralItemStateChanged(evt);
            }
        });
        botonIntegral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIntegralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMasaLayout = new javax.swing.GroupLayout(panelMasa);
        panelMasa.setLayout(panelMasaLayout);
        panelMasaLayout.setHorizontalGroup(
            panelMasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMasaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonNormal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMasaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonIntegral)
                .addContainerGap())
        );
        panelMasaLayout.setVerticalGroup(
            panelMasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMasaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(botonNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIntegral)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTipoPizza.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Pizza"));

        tipoPizza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Básica", "4 Quesos", "Barbacoa", "Mexicana" }));
        tipoPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTipoPizzaLayout = new javax.swing.GroupLayout(panelTipoPizza);
        panelTipoPizza.setLayout(panelTipoPizzaLayout);
        panelTipoPizzaLayout.setHorizontalGroup(
            panelTipoPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoPizzaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(tipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panelTipoPizzaLayout.setVerticalGroup(
            panelTipoPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoPizzaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(tipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelIngredientesExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingredientes Extra"));

        listaIngredientes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Sin Ingredientes", "Jamón", "Queso", "Tomate", "Cebolla", "Olivas" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaIngredientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaIngredientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaIngredientes);

        javax.swing.GroupLayout panelIngredientesExtraLayout = new javax.swing.GroupLayout(panelIngredientesExtra);
        panelIngredientesExtra.setLayout(panelIngredientesExtraLayout);
        panelIngredientesExtraLayout.setHorizontalGroup(
            panelIngredientesExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngredientesExtraLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panelIngredientesExtraLayout.setVerticalGroup(
            panelIngredientesExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngredientesExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setText("Tamaño");

        spinnerTamaño.setModel(new javax.swing.SpinnerListModel(new String[] {"Pequeña", "Mediana", "Familiar"}));
        spinnerTamaño.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerTamañoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelTipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelIngredientesExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(spinnerTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelTipoPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelIngredientesExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelMasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(spinnerTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        panelResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        areaPedido.setColumns(20);
        areaPedido.setRows(5);
        jScrollPane2.setViewportView(areaPedido);

        botonTicket.setText("Generar Ticket");
        botonTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonTicket)))
                .addContainerGap())
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(botonTicket)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNormalActionPerformed
//        precioMasa = 9.00;
//        this.labelMasa.setText(precioMasa.toString());
//        precioTotal = precioMasa + precioTipo + precioIngrediente;
//
//        this.campoTotal.setText(precioTotal.toString());

    }//GEN-LAST:event_botonNormalActionPerformed

    private void botonIntegralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIntegralActionPerformed
//        precioMasa = 9.50;
//        this.labelMasa.setText(precioMasa.toString());
//        precioTotal = precioMasa + precioTipo + precioIngrediente;
//
//        this.campoTotal.setText(precioTotal.toString());
        this.areaPedido.setText(p.toString());
    }//GEN-LAST:event_botonIntegralActionPerformed

    private void tipoPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPizzaActionPerformed
        String tipo = this.tipoPizza.getSelectedItem().toString();
        if (tipo.equalsIgnoreCase("Básica")) {
            p.setTipo("Básica");
        } else if (tipo.equalsIgnoreCase("4 quesos")) {
            p.setTipo("4 Quesos");
        } else if (tipo.equalsIgnoreCase("Barbacoa")) {
            p.setTipo("Barbacoa");
        } else if (tipo.equalsIgnoreCase("Mexicana")) {
            p.setTipo("Mexicana");
        }
//        this.lagelTipoPizza.setText(precioTipo.toString());
//        precioTotal = precioMasa + precioTipo + precioIngrediente;
//
//        this.campoTotal.setText(precioTotal.toString());

        this.areaPedido.setText(p.toString());
    }//GEN-LAST:event_tipoPizzaActionPerformed

    private void listaIngredientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaIngredientesValueChanged
        lista = this.listaIngredientes.getSelectedValuesList();
        this.precioIngrediente = 0.0;
        for (String i : lista) {
            if (i.equalsIgnoreCase("jamón")) {
                p.setIngredientes(lista);
            }
            if (i.equalsIgnoreCase("queso")) {
                p.setIngredientes(lista);
            }
            if (i.equalsIgnoreCase("tomate")) {
                p.setIngredientes(lista);
            }
            if (i.equalsIgnoreCase("cebolla")) {
                p.setIngredientes(lista);
            }
            if (i.equalsIgnoreCase("olivas")) {
                p.setIngredientes(lista);
            }
        }
//        this.labelIngrediente.setText(precioIngrediente.toString());
//        precioTotal = precioMasa + precioTipo + precioIngrediente;
//        this.labelListaIngredientes.setText(this.listaIngredientes.getSelectedValuesList().toString());
//        this.campoTotal.setText(precioTotal.toString());

        this.areaPedido.setText(p.toString());
    }//GEN-LAST:event_listaIngredientesValueChanged

    private void spinnerTamañoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerTamañoStateChanged
        precioTotal = precioMasa + precioTipo + precioIngrediente;
        if (this.spinnerTamaño.getValue().toString().equalsIgnoreCase("Pequeña")) {
            p.setTamaño("Pequeña");
        }
        if (this.spinnerTamaño.getValue().toString().equalsIgnoreCase("mediana")) {
            p.setTamaño("Mediana");
        }
        if (this.spinnerTamaño.getValue().toString().equalsIgnoreCase("familiar")) {
            p.setTamaño("Familiar");
        }
        this.areaPedido.setText(p.toString());
    }//GEN-LAST:event_spinnerTamañoStateChanged

    private void botonNormalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonNormalItemStateChanged
        p.setMasa("Normal");
        this.areaPedido.setText(p.toString());
    }//GEN-LAST:event_botonNormalItemStateChanged

    private void botonIntegralItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonIntegralItemStateChanged
        p.setMasa("Integral");
        this.areaPedido.setText(p.toString());
    }//GEN-LAST:event_botonIntegralItemStateChanged

    private void botonTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTicketActionPerformed
        if ( p.generarTicket() == false ){
            JOptionPane.showMessageDialog(this, "Pedido Correcto", "Pedido", JOptionPane.INFORMATION_MESSAGE);           
        } else {
            JOptionPane.showMessageDialog(this, "Pedido Erróneo", "Pedido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonTicketActionPerformed

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
            java.util.logging.Logger.getLogger(Pizzeria3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizzeria3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizzeria3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizzeria3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizzeria3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaPedido;
    private javax.swing.JRadioButton botonIntegral;
    private javax.swing.JRadioButton botonNormal;
    private javax.swing.JButton botonTicket;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaIngredientes;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelIngredientesExtra;
    private javax.swing.JPanel panelMasa;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JPanel panelTipoPizza;
    private javax.swing.JSpinner spinnerTamaño;
    private javax.swing.JComboBox tipoPizza;
    // End of variables declaration//GEN-END:variables
    private Double precioTotal = 0.0;
    private Double precioMasa = 0.0;
    private Double precioTipo = 0.0;
    private Double precioIngrediente = 0.0;
    private Double precioTamaño = 0.0;
    private List<String> lista;
}

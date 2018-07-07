/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcf_redfield.atq.view;

import com.mcf_redfield.atq.fabrica.CategoriaDAO;
import com.mcf_redfield.atq.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class MainFrame extends javax.swing.JFrame
{

    boolean statusCInsert = false;
    Categoria cat = new Categoria();
    CategoriaDAO catDAO = new CategoriaDAO();

    ArrayList<Categoria> listaCat;

    /**
     * Creates new form MainFrame
     */
    public MainFrame()
    {
        initComponents();
        this.setLocationRelativeTo(null);
        jDialogCategoria.setLocationRelativeTo(null);
        jDialogInserirCategoria.setLocationRelativeTo(null);
        LoadTable();
    }

    public void LoadTable()
    {
        listaCat = (ArrayList<Categoria>) catDAO.listaCategoria();
        
        Object Colunas[] = {"ID", "Nome"};
        DefaultTableModel modelo = new DefaultTableModel(Colunas, 0);

        for (int i = 0; i < listaCat.size(); i++)
        {
            Object linha[] = new Object[]{listaCat.get(i).getIdCat(),
                                          listaCat.get(i).getCategoria()};
            
            System.out.println("»»»" + listaCat.get(i).getCategoria());
            
            modelo.addRow(linha);
        }
        jTableCategoria.setModel(modelo);
        System.out.println("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jDialogCategoria = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategoria = new javax.swing.JTable();
        jBtnCNovo = new javax.swing.JButton();
        jBtnCExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelQNome = new javax.swing.JLabel();
        jLabelQQtde = new javax.swing.JLabel();
        System.out.println("»»»préCriação");
        jDialogInserirCategoria = new javax.swing.JDialog();
        System.out.println("»»»pósCriação");
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTFCIcat = new javax.swing.JTextField();
        jBtnCIsalvar = new javax.swing.JButton();
        jBtnCIcancel = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuQuestao = new javax.swing.JMenu();
        jMenuIQInserir = new javax.swing.JMenuItem();
        jMenuIQListar = new javax.swing.JMenuItem();
        jMenuIQEditar = new javax.swing.JMenuItem();
        jMenuIQExcluir = new javax.swing.JMenuItem();
        jMenuCat = new javax.swing.JMenu();
        jMenuICInserir = new javax.swing.JMenuItem();
        jMenuICListar = new javax.swing.JMenuItem();
        jMenuICExcluir = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jDialogCategoria.setModal(true);
        jDialogCategoria.setResizable(false);
        jDialogCategoria.setSize(new java.awt.Dimension(420, 360));
        jDialogCategoria.addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowActivated(java.awt.event.WindowEvent evt)
            {
                jDialogCategoriaWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));
        jPanel1.setOpaque(false);

        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String []
            {
                "#", "Nome"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCategoria);
        if (jTableCategoria.getColumnModel().getColumnCount() > 0)
        {
            jTableCategoria.getColumnModel().getColumn(0).setResizable(false);
            jTableCategoria.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableCategoria.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jBtnCNovo.setMnemonic('n');
        jBtnCNovo.setText("Novo");
        jBtnCNovo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBtnCNovoActionPerformed(evt);
            }
        });

        jBtnCExcluir.setMnemonic('e');
        jBtnCExcluir.setText("Excluir");
        jBtnCExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBtnCExcluirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Nº de Questões Associadas:");

        jLabelQNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelQNome.setText("Teeste");

        jLabelQQtde.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelQQtde.setText("TeesteQtde");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelQQtde, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jLabelQNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelQNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelQQtde)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jBtnCNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jBtnCExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCNovo)
                    .addComponent(jBtnCExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogCategoriaLayout = new javax.swing.GroupLayout(jDialogCategoria.getContentPane());
        jDialogCategoria.getContentPane().setLayout(jDialogCategoriaLayout);
        jDialogCategoriaLayout.setHorizontalGroup(
            jDialogCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogCategoriaLayout.setVerticalGroup(
            jDialogCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialogInserirCategoria.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogInserirCategoria.setTitle("Nova Categoria");
        jDialogInserirCategoria.setModal(true);
        jDialogInserirCategoria.setResizable(false);
        jDialogInserirCategoria.setSize(new java.awt.Dimension(335, 116));
        jDialogInserirCategoria.addContainerListener(new java.awt.event.ContainerAdapter()
        {
            public void componentRemoved(java.awt.event.ContainerEvent evt)
            {
                jDialogInserirCategoriaComponentRemoved(evt);
            }
        });
        jDialogInserirCategoria.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jDialogInserirCategoriaFocusGained(evt);
            }
        });
        jDialogInserirCategoria.addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                jDialogInserirCategoriaComponentShown(evt);
            }
        });
        jDialogInserirCategoria.addWindowStateListener(new java.awt.event.WindowStateListener()
        {
            public void windowStateChanged(java.awt.event.WindowEvent evt)
            {
                jDialogInserirCategoriaWindowStateChanged(evt);
            }
        });
        jDialogInserirCategoria.addWindowFocusListener(new java.awt.event.WindowFocusListener()
        {
            public void windowGainedFocus(java.awt.event.WindowEvent evt)
            {
                jDialogInserirCategoriaWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt)
            {
            }
        });
        jDialogInserirCategoria.addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowActivated(java.awt.event.WindowEvent evt)
            {
                jDialogInserirCategoriaWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                jDialogInserirCategoriaWindowOpened(evt);
            }
        });

        jLabel3.setText("Categoria:");

        jBtnCIsalvar.setMnemonic('s');
        jBtnCIsalvar.setText("Salvar");
        jBtnCIsalvar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBtnCIsalvarActionPerformed(evt);
            }
        });

        jBtnCIcancel.setMnemonic('c');
        jBtnCIcancel.setText("Cancelar");
        jBtnCIcancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBtnCIcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCIcat, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnCIsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnCIcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnCIcancel, jBtnCIsalvar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFCIcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCIcancel)
                    .addComponent(jBtnCIsalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        System.out.println("»»»préPopulação");

        javax.swing.GroupLayout jDialogInserirCategoriaLayout = new javax.swing.GroupLayout(jDialogInserirCategoria.getContentPane());
        jDialogInserirCategoria.getContentPane().setLayout(jDialogInserirCategoriaLayout);
        jDialogInserirCategoriaLayout.setHorizontalGroup(
            jDialogInserirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogInserirCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogInserirCategoriaLayout.setVerticalGroup(
            jDialogInserirCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogInserirCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        System.out.println("»»»pósPopulação");

        System.out.println("»»»afterAllSet");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Tela Principal"); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        jMenuQuestao.setMnemonic('q');
        jMenuQuestao.setText("Questão");

        jMenuIQInserir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuIQInserir.setText("Inserir");
        jMenuQuestao.add(jMenuIQInserir);

        jMenuIQListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuIQListar.setText("Listar");
        jMenuQuestao.add(jMenuIQListar);

        jMenuIQEditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuIQEditar.setText("Editar");
        jMenuQuestao.add(jMenuIQEditar);

        jMenuIQExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuIQExcluir.setText("Excluir");
        jMenuIQExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuIQExcluirActionPerformed(evt);
            }
        });
        jMenuQuestao.add(jMenuIQExcluir);

        jMenuBar1.add(jMenuQuestao);

        jMenuCat.setMnemonic('c');
        jMenuCat.setText("Categoria");

        jMenuICInserir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuICInserir.setText("Inserir");
        jMenuICInserir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuICInserirActionPerformed(evt);
            }
        });
        jMenuCat.add(jMenuICInserir);

        jMenuICListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuICListar.setText("Listar");
        jMenuICListar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuICListarActionPerformed(evt);
            }
        });
        jMenuCat.add(jMenuICListar);

        jMenuICExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuICExcluir.setText("Excluir");
        jMenuICExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuICExcluirActionPerformed(evt);
            }
        });
        jMenuCat.add(jMenuICExcluir);

        jMenuBar1.add(jMenuCat);

        jMenuSair.setMnemonic('s');
        jMenuSair.setText("Sair");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItem1);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBtnCNovoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBtnCNovoActionPerformed
    {//GEN-HEADEREND:event_jBtnCNovoActionPerformed
        jDialogInserirCategoria.setVisible(true);
    }//GEN-LAST:event_jBtnCNovoActionPerformed

    private void jBtnCExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBtnCExcluirActionPerformed
    {//GEN-HEADEREND:event_jBtnCExcluirActionPerformed
        CategoriaDAO catDAO = new CategoriaDAO();
        List listaCat = catDAO.listaCategoria();
        String categoriass = "";
        for (int i = 0; i < listaCat.size(); i++) {
            categoriass = categoriass + listaCat.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(rootPane, categoriass);
    }//GEN-LAST:event_jBtnCExcluirActionPerformed

    private void jMenuICListarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuICListarActionPerformed
    {//GEN-HEADEREND:event_jMenuICListarActionPerformed
        jDialogCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuICListarActionPerformed

    private void jMenuICInserirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuICInserirActionPerformed
    {//GEN-HEADEREND:event_jMenuICInserirActionPerformed
        statusCInsert = true;
        jDialogCategoria.setVisible(true);
        //jDialogInserirCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuICInserirActionPerformed

    private void jMenuICExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuICExcluirActionPerformed
    {//GEN-HEADEREND:event_jMenuICExcluirActionPerformed
        jDialogCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuICExcluirActionPerformed

    private void jMenuIQExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuIQExcluirActionPerformed
    {//GEN-HEADEREND:event_jMenuIQExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuIQExcluirActionPerformed

    private void jDialogCategoriaWindowActivated(java.awt.event.WindowEvent evt)//GEN-FIRST:event_jDialogCategoriaWindowActivated
    {//GEN-HEADEREND:event_jDialogCategoriaWindowActivated
        jDialogCategoria.setLocationRelativeTo(null);
        if (statusCInsert == true) {
            statusCInsert = false;
            jDialogInserirCategoria.setVisible(true);
        }
    }//GEN-LAST:event_jDialogCategoriaWindowActivated

    private void jDialogInserirCategoriaWindowActivated(java.awt.event.WindowEvent evt)//GEN-FIRST:event_jDialogInserirCategoriaWindowActivated
    {//GEN-HEADEREND:event_jDialogInserirCategoriaWindowActivated
        System.out.println("»»»WindowActivated");
        jTFCIcat.requestFocus();
    }//GEN-LAST:event_jDialogInserirCategoriaWindowActivated

    private void jBtnCIcancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBtnCIcancelActionPerformed
    {//GEN-HEADEREND:event_jBtnCIcancelActionPerformed
        jDialogInserirCategoria.setVisible(false);
    }//GEN-LAST:event_jBtnCIcancelActionPerformed

    private void jDialogInserirCategoriaWindowGainedFocus(java.awt.event.WindowEvent evt)//GEN-FIRST:event_jDialogInserirCategoriaWindowGainedFocus
    {//GEN-HEADEREND:event_jDialogInserirCategoriaWindowGainedFocus
        System.out.println("»»»WindowGainedFocus");

        jTFCIcat.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_jDialogInserirCategoriaWindowGainedFocus

    private void jDialogInserirCategoriaFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jDialogInserirCategoriaFocusGained
    {//GEN-HEADEREND:event_jDialogInserirCategoriaFocusGained
        System.out.println("»»»FocusGained");// TODO add your handling code here:
    }//GEN-LAST:event_jDialogInserirCategoriaFocusGained

    private void jDialogInserirCategoriaWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_jDialogInserirCategoriaWindowOpened
    {//GEN-HEADEREND:event_jDialogInserirCategoriaWindowOpened
        System.out.println("»»»WindowOpened");// TODO add your handling code here:
    }//GEN-LAST:event_jDialogInserirCategoriaWindowOpened

    private void jDialogInserirCategoriaWindowStateChanged(java.awt.event.WindowEvent evt)//GEN-FIRST:event_jDialogInserirCategoriaWindowStateChanged
    {//GEN-HEADEREND:event_jDialogInserirCategoriaWindowStateChanged
        System.out.println("WindowStateChanged");// TODO add your handling code here:
    }//GEN-LAST:event_jDialogInserirCategoriaWindowStateChanged

    private void jDialogInserirCategoriaComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_jDialogInserirCategoriaComponentShown
    {//GEN-HEADEREND:event_jDialogInserirCategoriaComponentShown
        System.out.println("ComponentShown");
    }//GEN-LAST:event_jDialogInserirCategoriaComponentShown

    private void jBtnCIsalvarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBtnCIsalvarActionPerformed
    {//GEN-HEADEREND:event_jBtnCIsalvarActionPerformed
        cat.setCategoria(jTFCIcat.getText());
        catDAO.inserir(cat);
        LoadTable();
        jDialogInserirCategoria.setVisible(false);
    }//GEN-LAST:event_jBtnCIsalvarActionPerformed

    private void jDialogInserirCategoriaComponentRemoved(java.awt.event.ContainerEvent evt)//GEN-FIRST:event_jDialogInserirCategoriaComponentRemoved
    {//GEN-HEADEREND:event_jDialogInserirCategoriaComponentRemoved
        System.out.println("»»»ComponentRemoved");// TODO add your handling code here:
    }//GEN-LAST:event_jDialogInserirCategoriaComponentRemoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCExcluir;
    private javax.swing.JButton jBtnCIcancel;
    private javax.swing.JButton jBtnCIsalvar;
    private javax.swing.JButton jBtnCNovo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialogCategoria;
    private javax.swing.JDialog jDialogInserirCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelQNome;
    private javax.swing.JLabel jLabelQQtde;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCat;
    private javax.swing.JMenuItem jMenuICExcluir;
    private javax.swing.JMenuItem jMenuICInserir;
    private javax.swing.JMenuItem jMenuICListar;
    private javax.swing.JMenuItem jMenuIQEditar;
    private javax.swing.JMenuItem jMenuIQExcluir;
    private javax.swing.JMenuItem jMenuIQInserir;
    private javax.swing.JMenuItem jMenuIQListar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuQuestao;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCIcat;
    private javax.swing.JTable jTableCategoria;
    // End of variables declaration//GEN-END:variables
}

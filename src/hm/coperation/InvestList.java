/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm.coperation;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Akass
 */
public class InvestList extends javax.swing.JPanel {
    Connection con=null;
    DefaultTableModel dtm=null;
    /**
     * Creates new form InvestList
     */
    public InvestList() {
        initComponents();
        con=DBconnection.makeconnection();
        String sql="SELECT * FROM investment WHERE del=1";
        
        dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0); //its removes the blank table and set rows to zero.
                
                try{
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(sql);
                     int i=1;
                    while(rs.next()){
                        dtm.addRow(new Object[]{rs.getInt(1),i++,rs.getString(2),rs.getString(4)});
                      
                    }
                    

                   
                }
                catch(Exception e){
                    System.out.println("Query not executed ");
                }
                
                //make 1st colum invisible
                TableColumnModel tcm=jTable1.getColumnModel();
                TableColumn tc=tcm.getColumn(0);
                tc.setPreferredWidth(0);
                tc.setMinWidth(0);
                tc.setMaxWidth(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Ediit_member = new javax.swing.JLabel();
        Del_member = new javax.swing.JLabel();
        Refresh = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 710));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/head.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bar1.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("INVESTMENT PROGRAM");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "S.No", "Title", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editdoc1.png"))); // NOI18N
        jLabel7.setText("View details");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        Ediit_member.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        Ediit_member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editdoc.png"))); // NOI18N
        Ediit_member.setText("Edit Records");
        Ediit_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ediit_memberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ediit_memberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ediit_memberMouseExited(evt);
            }
        });

        Del_member.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        Del_member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.PNG"))); // NOI18N
        Del_member.setText("Delete Records");
        Del_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Del_memberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Del_memberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Del_memberMouseExited(evt);
            }
        });

        Refresh.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RefreshMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(223, 223, 223))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Ediit_member, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Refresh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Del_member, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Ediit_member, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Del_member, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        HomeFrame.changePanel(new Capital());        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        boolean isrowselected=jTable1.getSelectedRowCount()>0;

        if(isrowselected==true){
            int rowno=jTable1.getSelectedRow();
            Object tbl=jTable1.getValueAt(rowno,2);
            Object id=jTable1.getValueAt(rowno,0);
            HomeFrame.changePanel(new ViewInvestment(tbl,id));
            //System.out.println(students_id);

        }else{
            JOptionPane.showMessageDialog(this,"Please select Record!!!","Alert",JOptionPane.PLAIN_MESSAGE);
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setOpaque(true);
        jLabel7.setBackground(Color.pink);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBackground(Color.white);
        jLabel7.setOpaque(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void Ediit_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ediit_memberMouseClicked

        //selecting the row no of data table and passing to constructor in edit panel

        boolean isrowselected=jTable1.getSelectedRowCount()>0;

        if(isrowselected==true){
            int rowno=jTable1.getSelectedRow();
            Object member_id=jTable1.getValueAt(rowno,0);
            HomeFrame.changePanel(new EditInvestment(member_id));

        }else{
            JOptionPane.showMessageDialog(this,"Please select Record!!!","Alert",JOptionPane.PLAIN_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Ediit_memberMouseClicked

    private void Ediit_memberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ediit_memberMouseEntered
        Ediit_member.setOpaque(true);
        Ediit_member.setBackground(Color.pink);// TODO add your handling code here:
    }//GEN-LAST:event_Ediit_memberMouseEntered

    private void Ediit_memberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ediit_memberMouseExited
        Ediit_member.setBackground(Color.white);
        Ediit_member.setOpaque(false);// TODO add your handling code here:
    }//GEN-LAST:event_Ediit_memberMouseExited

    private void Del_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Del_memberMouseClicked

        //using mouse to delete the data permanently

        int noofselectedrows= jTable1.getSelectedRowCount();

        if(noofselectedrows>0){
            int rowno=jTable1.getSelectedRow();

            // System.out.println(rowno); // kati no ko row select bhayo bhanera dekhauchha
            Object id=jTable1.getValueAt(rowno, 0);//this line gies the id of the table like 1,2,3
            int confirmdelete=JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
            //System.out.println(confirmdelete);
            //   System.out.println(cid);
            String sql="UPDATE investment SET del=0 WHERE id="+id;
            
            if(confirmdelete==0){
                dtm.removeRow(rowno);//this removable is remoaved by the model
                try{
                    //now this step is to delete prmanently in database aswell
                    Statement st=con.createStatement();
                    st.executeUpdate(sql);
                    
                }catch(Exception e){
                    System.out.println("query not executed");
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please select a Account!!!", "Alert",JOptionPane.PLAIN_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Del_memberMouseClicked

    private void Del_memberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Del_memberMouseEntered
        Del_member.setOpaque(true);
        Del_member.setBackground(Color.pink);// TODO add your handling code here:
    }//GEN-LAST:event_Del_memberMouseEntered

    private void Del_memberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Del_memberMouseExited
        Del_member.setBackground(Color.white);
        Del_member.setOpaque(false);// TODO add your handling code here:
    }//GEN-LAST:event_Del_memberMouseExited

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked

        HomeFrame.changePanel(new InvestList());

        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshMouseClicked

    private void RefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseEntered
        Refresh.setOpaque(true);
        Refresh.setBackground(Color.pink);// TODO add your handling code here:
    }//GEN-LAST:event_RefreshMouseEntered

    private void RefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseExited
        Refresh.setBackground(Color.white);
        Refresh.setOpaque(false);// TODO add your handling code here:
    }//GEN-LAST:event_RefreshMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Del_member;
    private javax.swing.JLabel Ediit_member;
    private javax.swing.JLabel Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

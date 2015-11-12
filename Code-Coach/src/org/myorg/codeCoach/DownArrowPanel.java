/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.codeCoach;

import java.io.IOException;
import java.util.Collection;
import javax.swing.text.Document;
import org.netbeans.api.java.source.CompilationController;
import org.netbeans.api.java.source.JavaSource;
import org.netbeans.api.java.source.Task;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.Utilities;
import org.openide.util.WeakListeners;
import javax.swing.JDialog;
import javax.swing.JFrame;
/**
 *
 * @author JoycePC
 */
public class DownArrowPanel extends javax.swing.JPanel implements LookupListener{
    
    private Lookup.Result<DataObject> projects;
    private DataObject context;
    private Document openDocument;
    private boolean buttonStatus; //activated (1) desactivated (0)   
    private JFrame frame;
       
    public DownArrowPanel() {
        initComponents();
        projects = Utilities.actionsGlobalContext().lookupResult(DataObject.class);
        projects.addLookupListener(
                WeakListeners.create(LookupListener.class, this, projects));
        resultChanged(new LookupEvent(projects));
        this.buttonStatus=false;
        this.frame=new JFrame();
        jTB_activity.setEnabled(true);
        jTB_arrow.setEnabled(false);//true to enable
    }
@Override
    public void resultChanged(LookupEvent le) {
        Collection<? extends DataObject> p = projects.allInstances();
        if (p.size() == 1) {
            DataObject currentProject = p.iterator().next();
            this.context = currentProject;        
        }
    }
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataProcess = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jTB_arrow = new javax.swing.JToggleButton();
        jTB_activity = new javax.swing.JToggleButton();

        dataProcess.setMinimumSize(new java.awt.Dimension(200, 200));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(DownArrowPanel.class, "DownArrowPanel.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout dataProcessLayout = new javax.swing.GroupLayout(dataProcess.getContentPane());
        dataProcess.getContentPane().setLayout(dataProcessLayout);
        dataProcessLayout.setHorizontalGroup(
            dataProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dataProcessLayout.setVerticalGroup(
            dataProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTB_arrow.setIcon(new javax.swing.ImageIcon("C:\\Users\\e014hp\\Documents\\NetBeansProjects\\Code-Coach\\icon\\barrow16.png")); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jTB_arrow, org.openide.util.NbBundle.getMessage(DownArrowPanel.class, "DownArrowPanel.jTB_arrow.text")); // NOI18N
        jTB_arrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTB_arrowActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jTB_activity, org.openide.util.NbBundle.getMessage(DownArrowPanel.class, "DownArrowPanel.jTB_activity.text")); // NOI18N
        jTB_activity.setToolTipText(org.openide.util.NbBundle.getMessage(DownArrowPanel.class, "DownArrowPanel.jTB_activity.toolTipText")); // NOI18N
        jTB_activity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTB_activityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTB_activity, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTB_arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTB_arrow, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(jTB_activity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void activityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_activityButtonActionPerformed

    private void jTB_arrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTB_arrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTB_arrowActionPerformed

    private void jTB_activityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTB_activityActionPerformed
        // TODO add your handling code here:
        if(context!=null){
            final FileObject fileObject = context.getPrimaryFile();
            JavaSource javaSource = JavaSource.forFileObject(fileObject);
            if (javaSource == null) {
                setStatusAndActivity(false);
                StatusDisplayer.getDefault().setStatusText("The item selected is not a source file: " + fileObject.getPath());
            } else {
                try {
                    javaSource.runUserActionTask(new Task<CompilationController>() {
                        public void run(CompilationController arg0) throws Exception {
                            arg0.toPhase(JavaSource.Phase.ELEMENTS_RESOLVED);
                            Document document = arg0.getDocument();
                            if (document != null && !buttonStatus) {
                                activityDialog initDialog = new activityDialog(frame, true);
                                StatusDisplayer.getDefault().setStatusText("Analysing the source file: " + fileObject.getPath());
                                if (initDialog.status.equals("cancel")){
                                    setStatusAndActivity(false);
                                    jTB_arrow.setEnabled(false);
                                    StatusDisplayer.getDefault().setStatusText("Code Coach has stopped");
                                }else if(initDialog.status.equals("accept")){
                                    openDocument=document;
                                    setStatusAndActivity(true);
                                    jTB_arrow.setEnabled(true);
                                    StatusDisplayer.getDefault().setStatusText("Code Coach will show you some tips ");
                                    //mostrar mensajes de retroalimentacion
                                }
                            } else if(document != null && document==openDocument && buttonStatus){
                                stopActDialog endDialog = new stopActDialog(frame, true);
                                if (endDialog.status.equals("end")){
                                    setStatusAndActivity(false);
                                    jTB_arrow.setEnabled(false);
                                    StatusDisplayer.getDefault().setStatusText("Code Coach has stopped");
                                }else if(endDialog.status.equals("back")){
                                    setStatusAndActivity(true);
                                    jTB_arrow.setEnabled(true);
                                    StatusDisplayer.getDefault().setStatusText("Welcome back!!");//sigue analizando el codigo del editor
                                }
                                
                            }else{
                                setStatusAndActivity(false);
                                StatusDisplayer.getDefault().setStatusText("The source file is not open!");
                            }
                        }
                    }, true);
                } catch (IOException ex) {Exceptions.printStackTrace(ex);}
            }
        }else{
            setStatusAndActivity(false);
            StatusDisplayer.getDefault().setStatusText("No file has been selected"); 
            
        }
    }//GEN-LAST:event_jTB_activityActionPerformed
    private void setStatusAndActivity(boolean status){
        buttonStatus=status;
        jTB_activity.setSelected(status);
        jTB_activity.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame dataProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jTB_activity;
    private javax.swing.JToggleButton jTB_arrow;
    // End of variables declaration//GEN-END:variables
}

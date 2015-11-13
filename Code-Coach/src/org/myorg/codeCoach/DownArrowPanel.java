/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.codeCoach;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
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
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import org.openide.awt.HtmlBrowser.URLDisplayer;
import org.openide.util.ImageUtilities;

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
    
    private JMenuBar menuBar;
    private JMenu dropDownButton, OPmi1;
    private JMenuItem mi1, mi2,mi3,mi4,mi5;//programing languages
    private JMenuItem OPmi2,OPmi3,OPmi4,OPmi5,OPmi6;//menu options
    
    public DownArrowPanel() {
        initComponents();
        projects = Utilities.actionsGlobalContext().lookupResult(DataObject.class);
        projects.addLookupListener(
                WeakListeners.create(LookupListener.class, this, projects));
        resultChanged(new LookupEvent(projects));
        this.buttonStatus=false;
        this.frame=new JFrame();
        jTB_activity.setEnabled(true);
        Image iconImage = ImageUtilities.loadImage("org/myorg/codeCoach/expand.png");
        ImageIcon icon = new ImageIcon(iconImage);
        menuBar = new JMenuBar();
        tBar.add(menuBar);
        dropDownButton = new JMenu();
        dropDownButton.setEnabled(false);//true to enable
        dropDownButton.setVerticalAlignment(SwingConstants.TOP);
        dropDownButton.setHorizontalAlignment(SwingConstants.LEADING);
        dropDownButton.setIcon(icon);
        menuBar.add(dropDownButton);
        OPmi1 = new JMenu("Examples");
        mi1 = new JMenuItem("Java"); 
        mi1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URLDisplayer.getDefault().showURL(new URL("https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20JAVA"));
                } catch (Exception eee) {
                    return;
                }
    
            } 
        });
        mi2 = new JMenuItem("Python");
        mi2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URLDisplayer.getDefault().showURL(new URL("https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20Python"));
                } catch (Exception eee) {
                    return;
                }
    
            } 
        });
        mi3 = new JMenuItem("C++");
        mi3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URLDisplayer.getDefault().showURL(new URL("https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20C%2B%2B"));
                } catch (Exception eee) {
                    return;
                }
    
            } 
        });
        mi4 = new JMenuItem("C#");
        mi4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URLDisplayer.getDefault().showURL(new URL("https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20C%23"));
                } catch (Exception eee) {
                    return;
                }
    
            } 
        });
        mi5 = new JMenuItem("C");
        mi5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URLDisplayer.getDefault().showURL(new URL("https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20C"));
                } catch (Exception eee) {
                    return;
                }
    
            } 
        });
        OPmi1.add(mi1);OPmi1.add(mi2);OPmi1.add(mi3);OPmi1.add(mi4);OPmi1.add(mi5);
        dropDownButton.add(OPmi1);
        OPmi2 = new JMenuItem("Software Metrics");
        dropDownButton.add(OPmi2);
        OPmi3 = new JMenuItem("Plactform Learning Trail");
        OPmi3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URLDisplayer.getDefault().showURL(new URL("https://netbeans.org/kb/trails/platform.html"));
                } catch (Exception eee) {
                    return;
                }
    
            } 
        });
        dropDownButton.add(OPmi3);
        OPmi4 = new JMenuItem("Documentation");
        dropDownButton.add(OPmi4);
        OPmi5 = new JMenuItem("Settings");
        dropDownButton.add(OPmi5);
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

        tBar = new javax.swing.JToolBar();
        jTB_activity = new javax.swing.JToggleButton();

        tBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tBar.setRollover(true);

        org.openide.awt.Mnemonics.setLocalizedText(jTB_activity, org.openide.util.NbBundle.getMessage(DownArrowPanel.class, "DownArrowPanel.jTB_activity.text")); // NOI18N
        jTB_activity.setToolTipText(org.openide.util.NbBundle.getMessage(DownArrowPanel.class, "DownArrowPanel.jTB_activity.toolTipText")); // NOI18N
        jTB_activity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTB_activityActionPerformed(evt);
            }
        });
        tBar.add(jTB_activity);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tBar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void activityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activityButtonActionPerformed

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
                                    dropDownButton.setEnabled(false);
                                    StatusDisplayer.getDefault().setStatusText("Code Coach has stopped");
                                }else if(initDialog.status.equals("accept")){
                                    openDocument=document;
                                    dropDownButton.setEnabled(true);
                                    setStatusAndActivity(true);
                                    StatusDisplayer.getDefault().setStatusText("Code Coach will show you some tips ");
                                    //mostrar mensajes de retroalimentacion
                                }
                            } else if(document != null && document==openDocument && buttonStatus){
                                stopActDialog endDialog = new stopActDialog(frame, true);
                                if (endDialog.status.equals("end")){
                                    setStatusAndActivity(false);
                                    dropDownButton.setEnabled(false);
                                    StatusDisplayer.getDefault().setStatusText("Code Coach has stopped");
                                }else if(endDialog.status.equals("back")){
                                    setStatusAndActivity(true);
                                    dropDownButton.setEnabled(true);
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
    private javax.swing.JToggleButton jTB_activity;
    private javax.swing.JToolBar tBar;
    // End of variables declaration//GEN-END:variables
}

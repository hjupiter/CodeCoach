/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.codeCoach;
import javax.lang.model.element.Element;
import java.io.IOException; 
import javax.swing.text.Document; 
import org.netbeans.api.java.source.CompilationController; 
import org.netbeans.api.java.source.JavaSource; 
import org.netbeans.api.java.source.JavaSource.Phase;
import org.netbeans.api.java.source.Task; 
import org.openide.awt.*;
import org.openide.filesystems.FileObject; 
import org.openide.loaders.DataObject; 
import org.openide.util.Exceptions; 
import org.openide.util.NbBundle.Messages;
import org.openide.windows.IOProvider.*;
import com.sun.source.tree.ClassTree;
import com.sun.source.util.TreePathScanner;
import java.awt.Color;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
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
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.tree.TreePath;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.api.java.source.CompilationInfo;
import org.openide.awt.HtmlBrowser.URLDisplayer;
import org.openide.cookies.EditorCookie;
import org.openide.util.ImageUtilities;
import org.openide.windows.IOColorLines;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

public class DownArrowPanel extends javax.swing.JPanel implements LookupListener{
    
    private Lookup.Result<DataObject> projects;
    private DataObject context;
    private Document openDocument;
    private boolean buttonStatus; //activated (1) desactivated (0)   
    private JFrame frame;
    private keyWords palabras;
    
    private JMenuBar menuBar;
    private JMenu dropDownButton, OPmi1;
    private JMenuItem mi1, mi2,mi3,mi4,mi5;//programing languages
    private JMenuItem OPmi2,OPmi3,OPmi4,OPmi5,OPmi6;//menu options
    
    MemberVisitor member;
    CompilationController compilationController;
    
    public DownArrowPanel() {
        initComponents();
        palabras=new keyWords();
        projects = Utilities.actionsGlobalContext().lookupResult(DataObject.class);
        projects.addLookupListener(
                WeakListeners.create(LookupListener.class, this, projects));
        resultChanged(new LookupEvent(projects));
        this.buttonStatus = false;
        this.frame = new JFrame();
        jTB_activity.setEnabled(true);
        Image iconImage = ImageUtilities.loadImage("org/myorg/codeCoach/expand.png");
        ImageIcon icon = new ImageIcon(iconImage);
        menuBar = new JMenuBar();
        tBar.add(menuBar);
        dropDownButton = new JMenu();
        dropDownButton.setEnabled(false);//true to enable
        dropDownButton.setVerticalAlignment(SwingConstants.CENTER);
        dropDownButton.setHorizontalAlignment(SwingConstants.CENTER);
        dropDownButton.setIcon(icon);
        menuBar.add(dropDownButton);
        OPmi1 = new JMenu("Examples");
        mi1 = new JMenuItem("Java");
        setRedirectionPage(mi1,"https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20JAVA");
       
        mi2 = new JMenuItem("Python");
        setRedirectionPage(mi2,"https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20Python");
        mi3 = new JMenuItem("C++");
        setRedirectionPage(mi3,"https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20C%2B%2B");
        mi4 = new JMenuItem("C#");
        setRedirectionPage(mi4,"https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20C%23");
        mi5 = new JMenuItem("C");
        setRedirectionPage(mi5,"https://github.com/hjupiter/Library-CodeCoach/tree/master/Guia%20C");
        OPmi1.add(mi1);OPmi1.add(mi2);OPmi1.add(mi3);OPmi1.add(mi4);OPmi1.add(mi5);
        dropDownButton.add(OPmi1);
        OPmi2 = new JMenuItem("Software Metrics");
        dropDownButton.add(OPmi2);
        OPmi3 = new JMenuItem("Plactform Learning Trail");
        setRedirectionPage(OPmi3,"https://netbeans.org/kb/trails/platform.html");
        dropDownButton.add(OPmi3);
        OPmi4 = new JMenuItem("About");
        OPmi4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    member.scan(compilationController.getCompilationUnit(), null);
                } catch (Exception eee) {
                    return;
                }
    
            } 
        });
        OPmi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));
        dropDownButton.add(OPmi4);
        OPmi5 = new JMenuItem("Analyze");
        
        OPmi5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                TopComponent tcArray[] = WindowManager.getDefault().findMode("editor").getTopComponents();
                /*TopComponent tcArra[] = WindowManager.getDefault().findMode("output").getTopComponents();
                System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
                
                for(TopComponent t : tcArra){
                    System.out.println("tc = "+t.getDisplayName());
                    for(Component co : t.getComponents()){
                        System.out.println("-->"+t.getName());
                        if(t.getName().equals("Result Window")){
                            JFrame n = (JFrame)co;
                            System.out.println(n.getComponentCount());
                            Component a[] = t.getComponents();
                            for(Component z : a){
                                System.out.println("--->"+z.getName());
                            }
                        }
                    }
                }
                */
                //System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
                //Mode outputMode = WindowManager.getDefault().findMode("output");
                //outputMode.
                
                for(TopComponent tc: tcArray){
                    /*System.out.println("----------------");
                    System.out.println(tc.getBackground());
                    System.out.println(tc.getFont());
                    System.out.println(tc.getForeground());
                    System.out.println(tc.getColorModel());
                    System.out.println(tc.getComponents());
                    tc.setBackground(Color.red);
                    tc.setForeground(Color.red);
                    System.out.println("----------------");
                    for(Component co : tc.getComponents()){
                        System.out.println("+++++++++++++++");
                        System.out.println(co.getName());
                        System.out.println(co.getBackground());
                        co.setBackground(Color.red);
                        System.out.println(co.getBackground());
                        co.setForeground(Color.red);
                        System.out.println("+++++++++++++++");
                    }
                    */
                    //System.out.println(tc.isShowing());
                    //System.out.println("tc = "+tc.getDisplayName());
                    if(null != tc && null != tc.getDisplayName() && tc.isShowing()){
                        //tc.setBackground(Color.red);
                        Collection<? extends FileObject> fileobjs = tc.getLookup().lookupAll(FileObject.class);
                        
                        //outputMode.dockInto(tc);
                        for (FileObject fo : fileobjs) {
                            try {
                                String text = fo.asText();
                                //System.out.println("text = " + text);
                                analize(text);
                                //System.out.println("-------------------------------->");
                                //System.out.println(text.length());
                                /*for(int i = 0;i <text.length();i++){
                                    if(text.charAt(i) == '\n'){
                                        System.out.println("xxxxxx");
                                    }
                                    System.out.print(text.charAt(i));
                                }*/
                                //System.out.println("-------------------------------->");
                                
                                DataObject d = DataObject.find(fo);
                                EditorCookie editorCookie = (EditorCookie)d.getCookie(EditorCookie.class);
                                StyledDocument doc = editorCookie.openDocument();
                                
                                //SimpleAttributeSet bluAttr   = new SimpleAttributeSet();
                                //JTextPane textPane = new JTextPane();
                                //javax.swing.text.Style style = textPane.addStyle("I'm a Style", null);
                                //StyleConstants.setForeground(style, Color.red);
                                if (editorCookie != null) {
                                    JEditorPane[] panes = editorCookie.getOpenedPanes();
                                    if (panes.length > 0) {
                                        int linenumber = panes[0].getCaret().getDot();
                                        SimpleAttributeSet attributes = new SimpleAttributeSet();
                                        //StyleConstants.setFontFamily(attributes, "Monospace");
                                        //StyleConstants.setFontSize(attributes, 30);
                                        StyleConstants.setBackground(attributes, Color.DARK_GRAY);
                                        //StyleConstants.setForeground(bluAttr, Color.BLUE);
                                        //StyleConstants.setForeground(attributes, "Monospace");
                                        doc.insertString(linenumber, "", attributes );  
                                        //Color  c = doc.getBackground(attributes);
                                        //System.out.println(c);
                                        //doc.setCharacterAttributes(linenumber, linenumber, bluAttr, true);
                                        //doc.setLogicalStyle(linenumber, style);
                                    }
                                }
                            } catch (IOException ex) {
                                Exceptions.printStackTrace(ex);
                            } catch (BadLocationException ex) {
                                Exceptions.printStackTrace(ex);
                            }
                        }
                    }
                }
                
                
            }
        });
        dropDownButton.add(OPmi5);
    }
    
    public void analize(String code){
        String line[] = code.split("\n");
        int[ ] acum = new int[1];
        acum[0]=0;
        for(int i = 0;i <line.length;i++){
            //System.out.println("-->"+line[i]+"-->"+line[i].length());
            String temp = line[i];
            //System.out.println("--------"+temp.length());
            
            for(int j = 0; j<temp.length();j++){
                acum[0] = acum[0]+1;
                //System.out.print("---"+temp.charAt(j));
                if(temp.charAt(j)== ';'){
                    System.out.println(acum[0]);
                    checkLine(temp,acum[0],i+1);
                }
            }
        }
//        for(int i = 0;i <code.length();i++){
//            if(code.charAt(i) == '\n'){
//                //System.out.println("xxxxxx");
//                if(code.charAt(i-1)==';'){
//                    checkLine(code);
//                }
//            }
//            System.out.print(code.charAt(i));
//        }
    }
    
    public void checkLine(String line,int numLine,int line2){
        String[] parts = line.split(" ");
        System.out.println(line);
        int b = 0;
        String a="public";
        String c="class";
        System.out.println(numLine);
        for(int i = 0;i <parts.length;i++){
            String temp = parts[i];
            
            if(parts.length==2 && line2>= 31){
                System.out.println("------->"+parts[i]);
                if(i==1 && parts[i].length()>4){
                    System.out.println("error");
                    InputOutput io =  IOProvider.getDefault().getIO("Description", true); 
                    io.getOut().println("In line: " + line2 + "\n" +"Use shorter value names");
                    
                    
                    
                    
                    TopComponent tcArray[] = WindowManager.getDefault().findMode("editor").getTopComponents();
                    for(TopComponent tc: tcArray){
                        if(null != tc && null != tc.getDisplayName() && tc.isShowing()){
                            Collection<? extends FileObject> fileobjs = tc.getLookup().lookupAll(FileObject.class);
                            for (FileObject fo : fileobjs) {
                                try {
                                    DataObject d = DataObject.find(fo);
                                    EditorCookie editorCookie = (EditorCookie)d.getCookie(EditorCookie.class);
                                    StyledDocument doc = editorCookie.openDocument();
                                    
                                    if (editorCookie != null) {
                                        JEditorPane[] panes = editorCookie.getOpenedPanes();
                                        if (panes.length > 0) {
                                            int linenumber = panes[0].getCaret().getDot();
                                            System.out.println(numLine);
                                            System.out.println(linenumber);
                                            //doc.insertString(numLine, "Deberia usar nombres mas cortos para variables", null );  
                                        }
                                    }
                                } catch (IOException ex) {
                                    Exceptions.printStackTrace(ex);
                                //} catch (BadLocationException ex) {
                                  //  Exceptions.printStackTrace(ex);
                                }
                            }
                        }
                    }
                }
            }
        }
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

        jTB_activity.setBackground(new java.awt.Color(102, 255, 204));
        jTB_activity.setFont(new java.awt.Font("Bookman Old Style", 3, 12)); // NOI18N
        jTB_activity.setForeground(new java.awt.Color(0, 0, 204));
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(tBar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                StatusDisplayer.getDefault().setStatusText("The item selected is not a source file");
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
                                    compilationController=arg0;
                                    member=new MemberVisitor(arg0);
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
                                StatusDisplayer.getDefault().setStatusText("The source file is not open");
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
    private void setRedirectionPage(JMenuItem item, final String urlLink){
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URLDisplayer.getDefault().showURL(new URL(urlLink));
                } catch (Exception eee) {
                    return;
                }
    
            } 
        });
    }
    //------------Inner class
    
    private class MemberVisitor extends TreePathScanner<Void, Void> { 
        private CompilationInfo info; 
        
        public MemberVisitor(CompilationInfo info) { 
            this.info = info; 
        } 
        @Override 
        public Void visitClass(ClassTree t, Void v) { 
            String desc;
            try{ 
                JTextComponent editor = EditorRegistry.lastFocusedComponent(); 
                if (editor.getDocument() == info.getDocument()) { 
                    int dot = editor.getCaret().getDot(); 
                    com.sun.source.util.TreePath tp = info.getTreeUtilities().pathFor(dot); 
                    Element el = (Element) info.getTrees().getElement(tp);
                    if (el == null) {
                        InputOutput io =  IOProvider.getDefault().getIO("Description", true); 
                            desc=palabras.verificarKW(el.getKind().name().toString());
                            if(!desc.equals("Description: "+ "\n"))
                                io.getOut().println("Analysis of the selected item: " + el.getKind().toString()+ "\n\n"+ desc);
                            else
                            StatusDisplayer.getDefault().setStatusText("Cannot resolve class!"); 
                    } else { 
                        InputOutput io =  IOProvider.getDefault().getIO("Description", true); 
                        IOColorLines.println(io, "Source file: ", Color.RED);
                        IOColorLines.println(io, info.getFileObject().getName() + "\n", Color.BLUE);
                        if (el.getKind() == ElementKind.CONSTRUCTOR) {
                            io.getOut().println("This is the constructor: " + el.getSimpleName()); 
                        } else if (el.getKind() == ElementKind.METHOD) { 
                            io.getOut().println("This is a method: " + el.getSimpleName()); 
                        } else if (el.getKind() == ElementKind.FIELD) { 
                            io.getOut().println("This is a field: " + el.getSimpleName()); 
                        } else { 
                            //recorrido de palabras claves
                            desc=palabras.verificarKW(el.getModifiers().toString());
                            if(!desc.equals("Description: "+ "\n"))
                                io.getOut().println("Analysis of the selected item: " + el.getKind().toString()+ "\n\n"+ desc);
                            else
                                io.getOut().println(" Cant give any referenced"); 
                        } 
                        io.getOut().close(); 
                    }
                } 
            }catch (IOException ex){ 
                Exceptions.printStackTrace(ex); 
            } return null; 
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jTB_activity;
    private javax.swing.JToolBar tBar;
    // End of variables declaration//GEN-END:variables
}

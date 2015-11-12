/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.codeCoach;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.tools.FileObject;
import org.openide.cookies.EditorCookie;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.awt.StatusDisplayer;
import org.openide.util.NbBundle.Messages;
import org.netbeans.api.java.source.JavaSource; 
import org.netbeans.api.java.source.JavaSource.Phase;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject; 
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter; 

import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.JPanel;
import javax.swing.text.Document; 
import org.netbeans.api.java.source.CompilationController;  
import org.netbeans.api.java.source.Task; 
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.Exceptions;


@ActionID(
        category = "File",
        id = "org.myorg.codeCoach.CodeCoachAction"
)
@ActionRegistration(
        iconBase = "org/myorg/codeCoach/icon24.png",
        displayName = "#CTL_CodeCoachAction"
)
@ActionReference(path = "Toolbars/File", position = 0)
@Messages("CTL_CodeCoachAction=Code Coach")




public final class CodeCoachAction implements ActionListener { 
    
    private final DataObject context;
  
    public CodeCoachAction(DataObject context) {
        this.context = context;
    }
       
    @Override
    public void actionPerformed(ActionEvent ev) { 
        final FileObject fileObject = context.getPrimaryFile(); 
        JavaSource javaSource = JavaSource.forFileObject(fileObject); 
        if (javaSource == null) { 
            StatusDisplayer.getDefault().setStatusText("The item selected is not a Java file: " + fileObject.getPath()); 
        } else { 
            try { 
                javaSource.runUserActionTask(new Task<CompilationController>() { 
                    public void run(CompilationController arg0) throws Exception { 
                        arg0.toPhase(Phase.ELEMENTS_RESOLVED); 
                        Document document = arg0.getDocument(); 
                        if (document != null) {
                            StatusDisplayer.getDefault().setStatusText("Analysing the Java file: " + fileObject.getPath());
                            JPanel panel = new DataProcessing();
                            JFrame frame = new JFrame();
                            Object[] options = { "CONTINUE", "CANCEL" };
                            Icon icon = new ImageIcon("icon/icontech.png");
                            JOptionPane JOpPane = new JOptionPane();
                            JOpPane.showOptionDialog(frame,panel, "Analysing source file", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon , options, options[0]);

//JOptionPane.showMessageDialog(new CodeCoachFrame(), "Your RSS feed has been published", "RSS Feed Published", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(CodeCoachAction.class.getResource("processing.png")));
                        } else { 
                            StatusDisplayer.getDefault().setStatusText("The Java file is not open!"); 
                        } 
                    } 
                }, true);
            } catch (IOException ex) { 
                Exceptions.printStackTrace(ex); 
            } 
        } 
    }
}



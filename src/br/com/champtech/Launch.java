package br.com.champtech;

import br.com.champtech.view.MainFrame;
import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/*
 * @author denis_stiehler
 */
public class Launch {

    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {

        // Set the Windows look and feel
        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }

        // Create and display the MainFrame
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}

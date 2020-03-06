import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import java.awt.EventQueue;

public class C12E13 {

     public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        final File[] file = {null};
        EventQueue.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                JFileChooser fc = new JFileChooser();
                int choice = JOptionPane.NO_OPTION;
                do {
                    File workingDirectory = new File(System.getProperty("user.dir"));
                    fc.setCurrentDirectory(workingDirectory);
                    //choice = JOptionPane.NO_OPTION;
                    int returnVal = fc.showOpenDialog(null);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        System.out.println("SELECTED");
                        file[0] = fc.getSelectedFile();
                        choice = JOptionPane.YES_OPTION;
                    }else{
                        //int dialogButton = JOptionPane.YES_NO_OPTION;
                        int dialogRes = JOptionPane.showConfirmDialog (null, "Wrong file selected, or you canceled selection, " +
                                "do you want to select again", "Warning",JOptionPane.YES_NO_OPTION);
                        if(dialogRes == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "please select the file");
                            choice = JOptionPane.NO_OPTION;
                        }else{
                            JOptionPane.showMessageDialog(null, "Game is over");
                            System.exit(2);
                        }

                    }

                } while (choice == JOptionPane.NO_OPTION);
            }
        });

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            Scanner input = new Scanner(file[0]);
            while (input.hasNext()) {
                String s = input.nextLine();
                lines++;
                characters += s.length();
                String[] split = s.split(" ");
                for (String word : split) {
                    words++;
                }
            }
         } catch (FileNotFoundException ex) {
             ex.printStackTrace();
         }

        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
        System.exit(2);



    }
}

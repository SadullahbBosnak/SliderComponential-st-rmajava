package hafta04;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //form1 f1= new form1();
               //f1.setVisible(true);
                form2 f2= new form2();
                f2.setVisible(true);

            }
        });
    }
}

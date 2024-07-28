package hafta04;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class form1 extends JFrame {
    private JPanel panel;
    private JSlider RS;
    private JSlider GS;
    private JSlider BS;
    private JButton btn1;
    static int r,g,b;


    form1(){
        add(panel);
        setTitle("Slider Componenti");
        setSize(600,600);
        r=g=b=0;
        RS.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                r=(int) RS.getValue();
                g=(int) GS.getValue();
                b=(int) BS.getValue();
                btn1.setBackground(new Color(r,g,b));
                btn1.setText(Integer.toString(r)+"-"+Integer.toString(g)+"-"+Integer.toString(b));

            }

        });
        GS.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                r=(int) RS.getValue();
                g=(int) GS.getValue();
                b=(int) BS.getValue();
                btn1.setBackground(new Color(r,g,b));
                btn1.setText(Integer.toString(r)+"-"+Integer.toString(g)+"-"+Integer.toString(b));

            }

        });
        BS.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                r=(int) RS.getValue();
                g=(int) GS.getValue();
                b=(int) BS.getValue();
                btn1.setBackground(new Color(r,g,b));
                btn1.setText(Integer.toString(r)+"-"+Integer.toString(g)+"-"+Integer.toString(b));

            }

        });

    }
}

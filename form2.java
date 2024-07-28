package hafta04;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class form2 extends JFrame {
    private JPanel panel;
    private JSlider vs;
    private JSlider fs;
    private JSlider os;
    private JLabel vl;
    private JLabel fl;
    private JLabel ol;

    static int v,f;
    float o;
    form2(){
        add(panel);
        setTitle("Vize Final");
        setSize(600,400);
        vs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                v= (int) vs.getValue();
                f= (int) fs.getValue();
                o= (float) ((float) v*0.4+f*0.6);
                os.setValue(Math.round(o));
                vl.setText("VİZE: "+Integer.toString(v));
                fl.setText("FİNAL: "+Integer.toString(f));
                ol.setText("ORTALAMA: "+Float.toString(o));
                if(o<=100 && o>=60) os.setBackground(Color.GREEN);
                else if(o<60 && o>=55) os.setBackground(Color.ORANGE);
                else os.setBackground(Color.RED);

        }
    });
        fs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                v= (int) vs.getValue();
                f= (int) fs.getValue();
                o= (float) ((float) v*0.4+f*0.6);
                os.setValue(Math.round(o));
                vl.setText("VİZE: "+Integer.toString(v));
                fl.setText("FİNAL: "+Integer.toString(f));
                ol.setText("ORTALAMA: "+Float.toString(o));
                if(o<=100 && o>=60) os.setBackground(Color.GREEN);
                else if(o<60 && o>=55) os.setBackground(Color.ORANGE);
                else os.setBackground(Color.RED);

            }
        });
}
}

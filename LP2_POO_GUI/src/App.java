import java.awt.Color;
import java.util.Random;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class App {
    public static void main(String[] args) throws Exception {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        JFrame frame = new JFrame("JSLIDER: ");
        JLabel label = new JLabel("Valor: 50");
        JPanel panel = new JPanel();
        JColorChooser cor = new JColorChooser();

        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(100);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Random rand = new Random();
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color corAleatoria = new Color(r, g, b);
                label.setText("Valor: " + slider.getValue());
                if (slider.getValue() >= 0 && slider.getValue() <= 20) {
                    panel.setVisible(true);
                    panel.setBackground(corAleatoria);

                } else if (slider.getValue() >= 20 && slider.getValue() <= 40) {
                    r = rand.nextFloat();
                    g = rand.nextFloat();
                    b = rand.nextFloat();
                    corAleatoria = new Color(r, g, b);
                    slider.setBackground(corAleatoria);
                } else if (slider.getValue() >= 40 && slider.getValue() <= 60) {
                    r = rand.nextFloat();
                    g = rand.nextFloat();
                    b = rand.nextFloat();
                    corAleatoria = new Color(r, g, b);
                    slider.setBackground(corAleatoria);

                } else if (slider.getValue() >= 60 && slider.getValue() <= 80) {
                    r = rand.nextFloat();
                    g = rand.nextFloat();
                    b = rand.nextFloat();
                    corAleatoria = new Color(r, g, b);
                    slider.setBackground(corAleatoria);

                } else if (slider.getValue() >= 80 && slider.getValue() <= 100) {
                    r = rand.nextFloat();
                    g = rand.nextFloat();
                    b = rand.nextFloat();
                    corAleatoria = new Color(r, g, b);
                    slider.setBackground(corAleatoria);

                }
            }
        });

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

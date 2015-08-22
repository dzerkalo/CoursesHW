package Reload;

/**
 * Created by acer on 20.08.2015.
 */
import java.awt.Graphics; import java.util.Calendar;
import java.awt.Graphics;

public class Aplet extends javax.swing.JApplet {
    private Calendar calendar;

    public void init() {
        calendar = Calendar.getInstance();
        setSize(500,500);
    }

    public void paint(Graphics g) {
        g.drawString("Good applet:", 40, 15);
        g.drawString( calendar.getTime().toString(), 20, 30);
    }
}

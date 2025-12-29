import java.applet.Applet;
import java.awt.*;

public class ResultApplet extends Applet
{
    int mark1, mark2, total;

    public void init()
    {
        mark1 = Integer.parseInt(getParameter("m1"));
        mark2 = Integer.parseInt(getParameter("m2"));
        total = mark1 + mark2;
    }

    public void paint(Graphics g)
    {
        g.drawString("Mark 1: " + mark1, 20, 20);
        g.drawString("Mark 2: " + mark2, 20, 40);
        g.drawString("Total: " + total, 20, 60);

        if (mark1 >= 35 && mark2 >= 35)
            g.drawString("Result: PASS", 20, 80);
        else
            g.drawString("Result: FAIL", 20, 80);
    }
}
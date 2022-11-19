import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Area;


public class ball_game_java extends JPanel implements ActionListener, KeyListener
{
    Timer t = new Timer(5, this);
    int x = 0, velX = 0, y = 0, velY = 0;
    int x1 = 0, velX1 = 0, y1 = 0, velY1 = 0;
    int x2 = 0, velX2 = 0, y2 = 0, velY2 = 0;
    int x3 = 0, velX3 = 0, y3 = 0, velY3 = 0;
    int x4 = 0, velX4 = 0, y4 = 0, velY4 = 0;
    int x5 = 0, velX5 = 0, y5 = 0, velY5 = 0;
    int x6 = 0, velX6 = 0, y6 = 0, velY6 = 0;
    int x7 = 0, velX7 = 0, y7 = 0, velY7 = 0;
    int x8 = 0, velX8 = 0, y8 = 0, velY8 = 0;
    int x9 = 0, velX9 = 0, y9 = 0, velY9 = 0;
    int x10 = 0, velX10 = 0, y10 = 0, velY10 = 0;
    int x11 = 0, velX11 = 0, y11 = 0, velY11 = 0;
    int x12 = 0, velX12 = 0, y12 = 0, velY12 = 0;
    int x13 = 0, velX13 = 0, y13 = 0, velY13 = 0;
    int x14 = 0, velX14 = 0, y14 = 0, velY14 = 0;
    int x15 = 0, velX15 = 0, y15 = 0, velY15 = 0;
    int x16 = 0, velX16 = 0, y16 = 0, velY16 = 0;
    int x17 = 0, velX17 = 0, y17 = 0, velY17 = 0;
    int x18 = 0, velX18 = 0, y18 = 0, velY18 = 0;
    int x19 = 0, velX19 = 0, y19 = 0, velY19 = 0;
    int x20 = 0, velX20 = 0, y20 = 0, velY20 = 0;
    int x21 = 0, velX21 = 0, y21 = 0, velY21 = 0;
    int x22 = 0, velX22 = 0, y22 = 0, velY22 = 0;
    int x23 = 0, velX23 = 0, y23 = 0, velY23 = 0;
    int x24 = 0, velX24 = 0, y24 = 0, velY24 = 0;
    int x25 = 0, velX25 = 0, y25 = 0, velY25 = 0;
    int x26 = 0, velX26 = 0, y26 = 0, velY26 = 0;
    int x27 = 0, velX27 = 0, y27 = 0, velY27 = 0;
    int x28 = 0, velX28 = 0, y28 = 0, velY28 = 0;
    int x29 = 0, velX29 = 0, y29 = 0, velY29 = 0;
    int x30 = 0, velX30 = 0, y30 = 0, velY30 = 0;
    int x31 = 0, velX31 = 0, y31 = 0, velY31 = 0;
    int x32 = 0, velX32 = 0, y32 = 0, velY32 = 0;
    int x33 = 0, velX33 = 0, y33 = 0, velY33 = 0;
    int x34 = 0, velX34 = 0, y34 = 0, velY34 = 0;
    int x35 = 0, velX35 = 0, y35 = 0, velY35 = 0;
    int x36 = 0, velX36 = 0, y36 = 0, velY36 = 0;
    int x37 = 0, velX37 = 0, y37 = 0, velY37 = 0;
    int x38 = 0, velX38 = 0, y38 = 0, velY38 = 0;
    int x39 = 0, velX39 = 0, y39 = 0, velY39 = 0;
    int x40 = 0, velX40 = 0, y40 = 0, velY40 = 0;
    int x41 = 0, velX41 = 0, y41 = 0, velY41 = 0;
    int x42 = 0, velX42 = 0, y42 = 0, velY42 = 0;
    int x43 = 0, velX43 = 0, y43 = 0, velY43 = 0;

    public ball_game_java()
    {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.red);
        g2d.fillOval(x, y, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x1, y1, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x2, y2, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x3, y3, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x4, y4, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x5, y5, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x6, y6, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x7, y7, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x8, y8, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x9, y9, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x10, y10, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x11, y11, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x12, y12, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x13, y13, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x14, y14, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x15, y15, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x16, y16, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x17, y17, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x18, y18, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x19, y19, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x20, y20, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x21, y21, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x22, y22, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x23, y23, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x24, y24, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x25, y25, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x26, y26, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x27, y27, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x28, y28, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x29, y29, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x30, y30, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x31, y31, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x32, y32, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x33, y33, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x34, y34, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x35, y35, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x36, y36, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x37, y37, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x38, y38, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x39, y39, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x40, y40, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x41, y41, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x42, y42, 30, 30);
        g2d.setColor(Color.blue);
        g2d.fillRect(x43, y43, 30, 30);
        g2d.setColor(Color.blue);
        
        

    }

    public void actionPerformed(ActionEvent e)
    {
        x += velX;
        y += velY;
        if (x < 0)
        {
            velX = 1;
        }
        if (x > 670)
        {
            velX = -1;
        }
        if (y < 0)
        {
            velY = 1;
        }
        if (y > 470)
        {
            velY = -1;
        }
        repaint();
    }

    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP)
        {
            velY = -1;
            velX = 0;
        }
        if (code == KeyEvent.VK_DOWN)
        {
            velY = 1;
            velX = 0;
        }
        if (code == KeyEvent.VK_LEFT)
        {
            velX = -1;
            velY = 0;
        }
        if (code == KeyEvent.VK_RIGHT)
        {
            velX = 1;
            velY = 0;
        }
    }

    public void keyReleased(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP)
        {
            velY = 0;
        }
        if (code == KeyEvent.VK_DOWN)
        {
            velY = 0;
        }
        if (code == KeyEvent.VK_LEFT)
        {
            velX = 0;
        }
        if (code == KeyEvent.VK_RIGHT)
        {
            velX = 0;
        }
    }

    public void keyTyped(KeyEvent e)
    {
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("PacMan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setContentPane(new PacMan());
        frame.setVisible(true);
    }
}



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Double;

public class PacMan2 extends JPanel implements ActionListener, KeyListener
{
    private int x, y, velX, velY;
    private int x2, y2, velX2, velY2;
    private int x3, y3, velX3, velY3;
    private int x4, y4, velX4, velY4;
    private int x5, y5, velX5, velY5;
    private int x6, y6, velX6, velY6;
    private int x7, y7, velX7, velY7;
    private int x8, y8, velX8, velY8;
    private int x9, y9, velX9, velY9;
    private int x10, y10, velX10, velY10;
    private int x11, y11, velX11, velY11;
    private int x12, y12, velX12, velY12;
    private int x13, y13, velX13, velY13;
    private int x14, y14, velX14, velY14;
    private int x15, y15, velX15, velY15;
    private int x16, y16, velX16, velY16;


    public PacMan2()
    {
        x = 0;
        y = 0;
        velX = 1;
        velY = 1;
        x2 = 0;
        y2 = 0;
        velX2 = 1;
        velY2 = 1;
        x3 = 0;
        y3 = 0;
        velX3 = 1;
        velY3 = 1;
        x4 = 0;
        y4 = 0;
        velX4 = 1;
        velY4 = 1;
        x5 = 0;
        y5 = 0;
        velX5 = 1;
        velY5 = 1;
        x6 = 0;
        y6 = 0;
        velX6 = 1;
        velY6 = 1;
        x7 = 0;
        y7 = 0;
        velX7 = 1;
        velY7 = 1;
        x8 = 0;
        y8 = 0;
        velX8 = 1;
        velY8 = 1;
        x9 = 0;
        y9 = 0;
        velX9 = 1;
        velY9 = 1;
        x10 = 0;
        y10 = 0;
        velX10 = 1;
        velY10 = 1;
        x11 = 0;
        y11 = 0;
        velX11 = 1;
        velY11 = 1;
        x12 = 0;
        y12 = 0;
        velX12 = 1;
        velY12 = 1;
        x13 = 0;
        y13 = 0;
        velX13 = 1;
        velY13 = 1;
        x14 = 0;
        y14 = 0;
        velX14 = 1;
        velY14 = 1;
        x15 = 0;
        y15 = 0;
        velX15 = 1;
        velY15 = 1;
        x16 = 0;
        y16 = 0;
        velX16 = 1;
        velY16 = 1;
        Timer t = new Timer(5, this);
        t.start();
        addKeyListener(this);
        setFocusable(true);

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.yellow);
        g2d.fillOval(x, y, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x2, y2, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x3, y3, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x4, y4, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x5, y5, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x6, y6, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x7, y7, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x8, y8, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x9, y9, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x10, y10, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x11, y11, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x12, y12, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x13, y13, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x14, y14, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x15, y15, 30, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(x16, y16, 30, 30);
        g2d.setColor(Color.yellow);
        

    }


    public void actionPerformed(ActionEvent e)
    {
        if (x < 0 || x > 670)
        {
            velX = -velX;
        }
        if (y < 0 || y > 470)
        {
            velY = -velY;
        }
        if (x2 < 0 || x2 > 670)
        {
            velX2 = -velX2;
        }
        if (y2 < 0 || y2 > 470)
        {
            velY2 = -velY2;
        }
        if (x3 < 0 || x3 > 670)
        {
            velX3 = -velX3;
        }
        if (y3 < 0 || y3 > 470)
        {
            velY3 = -velY3;
        }
        if (x4 < 0 || x4 > 670)
        {
            velX4 = -velX4;
        }
        if (y4 < 0 || y4 > 470)
        {
            velY4 = -velY4;
        }
        if (x5 < 0 || x5 > 670)
        {
            velX5 = -velX5;
        }
        if (y5 < 0 || y5 > 470)
        {
            velY5 = -velY5;
        }
        if (x6 < 0 || x6 > 670)
        {
            velX6 = -velX6;
        }
        if (y6 < 0 || y6 > 470)
        {
            velY6 = -velY6;
        }
        if (x7 < 0 || x7 > 670)
        {
            velX7 = -velX7;
        }
        if (y7 < 0 || y7 > 470)
        {
            velY7 = -velY7;
        }
        if (x8 < 0 || x8 > 670)
        {
            velX8 = -velX8;
        }
        if (y8 < 0 || y8 > 470)
        {
            velY8 = -velY8;
        }
        if (x9 < 0 || x9 > 670)
        {
            velX9 = -velX9;
        }
        if (y9 < 0 || y9 > 470)
        {
            velY9 = -velY9;
        }
        if (x10 < 0 || x10 > 670)
        {
            velX10 = -velX10;
        }




    
        if (y10 < 0 || y10 > 470)
        {
            velY10 = -velY10;
        }

        if (x11 < 0 || x11 > 670)
        {
            velX11 = -velX11;
        }
        if (y11 < 0 || y11 > 470)
        {
            velY11 = -velY11;
        }
        if (x12 < 0 || x12 > 670)
        {
            velX12 = -velX12;
        }
        if (y12 < 0 || y12 > 470)
        {
            velY12 = -velY12;
        }
        if (x13 < 0 || x13 > 670)
        {
            velX13 = -velX13;
        }
        if (y13 < 0 || y13 > 470)
        {
            velY13 = -velY13;
        }
        if (x14 < 0 || x14 > 670)
        {
            velX14 = -velX14;
        }
        if (y14 < 0 || y14 > 470)
        {
            velY14 = -velY14;
        }
        if (x15 < 0 || x15 > 670)
        {
            velX15 = -velX15;
        }
        if (y15 < 0 || y15 > 470)
        {
            velY15 = -velY15;
        }
        if (x16 < 0 || x16 > 670)
        {
            velX16 = -velX16;
        }
        if (y16 < 0 || y16 > 470)
        {
            velY16 = -velY16;
        }
        x += velX;
        y += velY;
        x2 += velX2;
        y2 += velY2;
        x3 += velX3;
        y3 += velY3;
        x4 += velX4;
        y4 += velY4;
        x5 += velX5;
        y5 += velY5;
        x6 += velX6;
        y6 += velY6;
        x7 += velX7;
        y7 += velY7;
        x8 += velX8;
        y8 += velY8;
        x9 += velX9;
        y9 += velY9;
        x10 += velX10;
        y10 += velY10;
        x11 += velX11;
        y11 += velY11;
        x12 += velX12;
        y12 += velY12;
        x13 += velX13;
        y13 += velY13;
        x14 += velX14;
        y14 += velY14;
        x15 += velX15;
        y15 += velY15;
        x16 += velX16;

        y16 += velY16;
        repaint();
    }

    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP)
        {
            velY = -2;
            velX = 0;
        }
        if (code == KeyEvent.VK_DOWN)
        {
            velY = 2;
            velX = 0;
        }
        if (code == KeyEvent.VK_LEFT)
        {
            velX = -2;
            velY = 0;
        }
        if (code == KeyEvent.VK_RIGHT)
        {
            velX = 2;
            velY = 0;
        }
    }

    public void keyReleased(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP)
        {
            velY = 0;
            velX = 0;
        }
        if (code == KeyEvent.VK_DOWN)
        {
            velY = 0;
            velX = 0;
        }
        if (code == KeyEvent.VK_LEFT)
        {
            velX = 0;
            velY = 0;
        }
        if (code == KeyEvent.VK_RIGHT)
        {
            velX = 0;
            velY = 0;
        }
    }

    public void keyTyped(KeyEvent e)
    {
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(x, y, 20, 20);
        g.setColor(Color.blue);
        g.fillOval(x2, y2, 20, 20);
        g.setColor(Color.green);
        g.fillOval(x3, y3, 20, 20);
        g.setColor(Color.yellow);
        g.fillOval(x4, y4, 20, 20);
        g.setColor(Color.orange);
        g.fillOval(x5, y5, 20, 20);
        g.setColor(Color.pink);
        g.fillOval(x6, y6, 20, 20);
        g.setColor(Color.magenta);
        g.fillOval(x7, y7, 20, 20);
        g.setColor(Color.cyan);
        g.fillOval(x8, y8, 20, 20);
        g.setColor(Color.black);
        g.fillOval(x9, y9, 20, 20);
        g.setColor(Color.gray);
        g.fillOval(x10, y10, 20, 20);
        g.setColor(Color.lightGray);
        g.fillOval(x11, y11, 20, 20);
        g.setColor(Color.darkGray);
        g.fillOval(x12, y12, 20, 20);
        g.setColor(Color.white);
        g.fillOval(x13, y13, 20, 20);
        g.setColor(Color.red);
        g.fillOval(x14, y14, 20, 20);
        g.setColor(Color.blue);
        g.fillOval(x15, y15, 20, 20);
        g.setColor(Color.green);
        g.fillOval(x16, y16, 20, 20);
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Bouncing Balls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BouncingBalls());
        frame.pack();
        frame.setVisible(true);
    }

}


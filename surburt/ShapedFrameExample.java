package surburt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

public class ShapedFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Shaped Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create a custom shape
        Path2D.Double path = new Path2D.Double();
        path.append(new Ellipse2D.Double(0, 0, 300, 300), false);
        frame.setShape(path);

        frame.setVisible(true);
    }
}
	
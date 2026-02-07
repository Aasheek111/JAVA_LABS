import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample extends JFrame implements MouseListener {

    JButton btn = new JButton("CLICK MEEEE!");

    MouseEventExample() {
        setTitle("Example");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(btn);
        btn.addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CLICKEDÐ");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        MouseEventExample e = new MouseEventExample();

    }

}
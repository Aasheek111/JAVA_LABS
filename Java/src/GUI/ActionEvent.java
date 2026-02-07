import java.awt.event.*;
import java.awt.*;

public class ActionEvent implements ActionListener {

    public static void main(String[] args) {
        Frame f1 = new Frame();
        f1.setSize(500, 500);

        Button b1 = new Button("CLICK");
        f1.add(b1);


        f1.setVisible(true);

    }

}

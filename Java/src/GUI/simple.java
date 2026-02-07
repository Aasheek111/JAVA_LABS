
import java.awt.*;
public class simple  {

    public static void main(String[] args) {
        
        Frame frame= new Frame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        
        
        Label l1= new Label("Enter your name:");
        TextField tf= new TextField(12);
        Button b1= new Button("Submit");
        frame.add(l1);
        frame.add(tf);
        frame.add(b1);
        frame.setVisible(true);

    }
    
    
}

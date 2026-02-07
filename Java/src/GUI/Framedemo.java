import java.awt.*;

public class Framedemo {

     public static void main(String[] args) {

        Frame frame= new Frame();
        frame.setSize(500,500);

        Label label= new Label("Hellooooooo");
        frame.add(label);

        TextArea text= new TextArea("Hello i am text area");
        frame.add(text);
        frame.setVisible(true);
     }
}
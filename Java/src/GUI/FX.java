import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FX  extends Application{
    
    @Override
    public void start(Stage stage){

        Button btn= new Button("CLICK ME");



        StackPane stack= new StackPane();
        stack.getChildren().addAll(btn);

        Scene scene = new Scene(stack,500,500);

        stage.setScene(scene);
        stage.setTitle("Example");
        stage.show();





    }
    public static void main(String[] args) {
        launch(args);
    }

    
}

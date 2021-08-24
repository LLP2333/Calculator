package Calculator;

//import com.sun.prism.Image;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("View.fxml"));
        Scene scene=new Scene(root);
        stage.setTitle("计算器");
        stage.setScene(scene);
        stage.show();
        //set icon of the application
        //Image icon = new Image(getClass().getResourceAsStream("Calculator.png"));
       // stage.getIcons().add(javafx.scene.image.Image.fromPlatformImage(icon));

    }
}

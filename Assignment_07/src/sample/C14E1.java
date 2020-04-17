package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
public class C14E1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridPane = new GridPane();
        gridPane.add(new ImageView(new Image(getClass().getResource("image/uk.gif").toExternalForm())),0,0);
        gridPane.add(new ImageView(new Image(getClass().getResource("image/ca.gif").toExternalForm())),1,0);
        gridPane.add(new ImageView(new Image(getClass().getResource("image/china.gif").toExternalForm())),0,1);
        gridPane.add(new ImageView(new Image(getClass().getResource("image/us.gif").toExternalForm())),1,1);
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
package task_lesson_4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private int WIDTH = 600;
    private int HEIGHT = 700;
    @Override
    public void start(Stage chatPanel) throws Exception {

        Parent root = FXMLLoader.load( getClass().getResource( "windows.fxml" ) );
        chatPanel.setTitle( "Chat-Chat" );
        chatPanel.setScene( new Scene( root, WIDTH, HEIGHT ) );
//        chatPanel.setMinWidth(WIDTH);
//        chatPanel.setMinHeight(HEIGHT);
        chatPanel.setResizable(false);
        chatPanel.show();

//        chatPanel.minHeightProperty().set( HEIGHT );
//        chatPanel.minWidthProperty().set( WIDTH );


    }


    public static void main(String[] args)  {
        launch(args);
    }
}

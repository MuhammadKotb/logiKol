/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package logikol;


import java.io.File;

import Controllers.UIController;
import Gates.AND;
import Gates.BasicGate;
import Gates.NOT;
import Gates.OR;
import Providers.UIGateProvider;
import Gates.Node;
import UIObjects.BasicGateUI;
import UIObjects.IONode;
import UIObjects.InputNode;
import Gates.CompoundGate;
import Gates.Input;
import Gates.BasicGateMultiIn;
import Gates.BasicGateSingleIn;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import javafx.scene.shape.Circle;

public class App extends Application {

    int width = 1280;
    int height = 720;

    @Override
    public void start(Stage stage) {

        Group root = new Group();


        try
        {
            BasicGateUI andGate1 = UIGateProvider.buildGate("AND");
            BasicGateUI andGate2 = UIGateProvider.buildGate("AND");
            BasicGateUI orGate1 = UIGateProvider.buildGate("OR");


 

            UIController.mountBasicGateUI(root, andGate1, 100, 100);
            UIController.mountBasicGateUI(root, andGate2, 300, 200);
            UIController.mountBasicGateUI(root, orGate1, 500, 500);


        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       
      
        Scene scene = new Scene(root, width, height);
        scene.setFill(Color.WHITE);
        stage.setScene(scene);

        
       
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

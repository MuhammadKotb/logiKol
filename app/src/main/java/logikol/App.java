/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package logikol;


import java.io.File;

import Gates.AND;
import Gates.BasicGate;
import Gates.NOT;
import Gates.OR;
import Gates.Node;
import UIObjects.ANDGate;
import UIObjects.IONode;
import UIObjects.InputNode;
import UIObjects.ORGate;
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


        InputNode input1UI = new InputNode(root, new Input(false), new IONode(root), 50, 70);
        InputNode input2UI = new InputNode(root, new Input(true), new IONode(root), 200, 300);



        try
        {
            Image imageOR = new Image("ornew.png");

            Image imageAND = new Image("andnew2.png");


            ANDGate andGateUI1 = new ANDGate(root, new AND(), new IONode(root), new IONode(root), new IONode(root), new ImageView(imageAND), 300, 300);
            ORGate orGate1 = new ORGate(root, new OR(), new IONode(root), new IONode(root), new IONode(root), new ImageView(imageOR), 500, 500);
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

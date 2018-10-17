/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumimg;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

/**
 *
 * @author Rabayaa
 */
public class Albumimg extends Application {
     protected Text text = new Text(50, 50, "JavaFX Programming");
      Integer i;
      String selectedFamily="Times New Roman";
      FontWeight fontwight; 
    FontPosture fontPosture;
     protected BorderPane getPane() {
       // StackPane pane = new StackPane();
       /////////////////////////////staaaart //////////////////////////////////////
        //////////////////////////////worood part////////////////////////
    
    
      StackPane sp2 = new StackPane();
       final Label label = new Label(); 
     label.setText("image description");
        sp2.getChildren().add(label);
         
        final ListView<String> listView = new ListView<>();
        List<String> familiesList = Font.getFamilies();
        ObservableList<String> familiesObservableList = 
                FXCollections.observableArrayList(familiesList);
        listView.setItems(familiesObservableList);
         
        listView.setOnMouseClicked(new EventHandler<MouseEvent>(){
 
            @Override
            public void handle(MouseEvent t) {
                 selectedFamily = 
                        listView.getSelectionModel().getSelectedItem();
                 
                //Apply the selected font family
                
                Font selectedFont = Font.font(selectedFamily,
 fontwight, fontPosture, i);
              //  label.setText(selectedFamily);
                label.setFont(selectedFont);
            }
        });
         
        SplitPane splitPane = new SplitPane();
        StackPane sp1 = new StackPane();
        sp1.getChildren().add(listView);
         
        splitPane.getItems().addAll(sp1, sp2);   

    ///////////////////////////////end worood part/////////////
        /////////////////////////////start walaa part//////////////////////////////////
        
        
    
 Button resize = new Button("resize");
 
 TextField tf = new TextField();
 tf.setText(""+20);

 //tf.setAlignment(Pos.TOP_RIGHT);
 
 BorderPane pane1 = new BorderPane();
 

 Pane paneForText = new Pane();
 paneForText.getChildren().add(text);
 pane1.setCenter(paneForText);

Font fontNormal1 = Font.font("Times New Roman",
 FontWeight.NORMAL, FontPosture.REGULAR, Integer.parseInt(tf.getText()));
 label.setFont(fontNormal1);

 
 VBox paneForCheckBoxes = new VBox(10);
 paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
 paneForCheckBoxes.setStyle("-fx-border-color: green");
 CheckBox chkBold = new CheckBox("Bold");
 CheckBox chkItalic = new CheckBox("Italic");
 paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic,resize,tf);
 paneForCheckBoxes.setAlignment(Pos.TOP_LEFT);
 pane1.setLeft(paneForCheckBoxes);
// Integer size=20;
  i=Integer.parseInt(tf.getText());
 EventHandler<ActionEvent> handler = e -> {
      
     Integer size=i;
     Integer i2=Integer.parseInt(tf.getText());
     if(i2>=12&&i2<=20){
      size=i2;
      i=i2;
     }
     
     
  Font fontBoldItalic = Font.font(selectedFamily,
 FontWeight.BOLD, FontPosture.ITALIC,size);
 Font fontBold = Font.font(selectedFamily,
 FontWeight.BOLD, FontPosture.REGULAR, size);
 Font fontItalic = Font.font( selectedFamily,
 FontWeight.NORMAL, FontPosture.ITALIC, size);
 Font fontNormal = Font.font(selectedFamily,
 FontWeight.NORMAL, FontPosture.REGULAR, size);
 if (chkBold.isSelected() && chkItalic.isSelected()) {
    fontwight=FontWeight.BOLD; 
    fontPosture=FontPosture.ITALIC; 
 label.setFont(fontBoldItalic); // Both check boxes checked
 }
 else if (chkBold.isSelected()) {
     fontwight=FontWeight.BOLD; 
    fontPosture=FontPosture.REGULAR; 
 label.setFont(fontBold); // The Bold check box checked
 }
 else if (chkItalic.isSelected()) {
     fontwight=FontWeight.NORMAL; 
    fontPosture=FontPosture.ITALIC; 
 label.setFont(fontItalic); // The Italic check box checked
 }
 else {
     fontwight=FontWeight.NORMAL; 
    fontPosture=FontPosture.REGULAR; 
 label.setFont(fontNormal); // Both check boxes unchecked
 }
};

 chkBold.setOnAction(handler);
 chkItalic.setOnAction(handler);
 tf.setOnAction(handler);
 resize.setOnAction(handler);
        
        
        
        
        
        
        ///////////////////////////end walaa part1 ///////////////////////////////////
        ////////////////////////////start rayaa part//////////////////////////////////
        
       Image image1 = new Image("1.jpg");
        Image image2 = new Image("2.jpg");
        Image image3 = new Image("3.jpg");
        Image image4 = new Image("4.jpg");
        Image image5 = new Image("5.jpg");
        Image image6 = new Image("6.jpg");
        Image image7 = new Image("7.jpg");
        Image image8 = new Image("8.jpg");
        Image image9 = new Image("9.jpg");
        Image image10 = new Image("10.jpg");
        HBox paneForslider = new HBox(20);
        ImageView iv = new ImageView();
        iv.setFitWidth(600);
        iv.setFitHeight(400);

        iv.setPreserveRatio(true);
 
 paneForslider.getChildren().addAll(iv);
paneForslider.setAlignment(Pos.TOP_RIGHT);
   
      
    Label label1=new Label();
      	ImageView imageView1 = new ImageView("1.jpg");
        imageView1.setFitWidth(50);
        imageView1.setFitHeight(40);
        label1.setGraphic(imageView1);
        
      Label label2=new Label();
      ImageView imageView2 = new ImageView("2.jpg");
      	imageView2.setFitWidth(50);
        imageView2.setFitHeight(40);
        label2.setGraphic(imageView2);

      Label label3=new Label();
      ImageView imageView3 = new ImageView("3.jpg");
      	imageView3.setFitWidth(50);
        imageView3.setFitHeight(40);
        label3.setGraphic(imageView3);
        
      Label label4=new Label();
      ImageView imageView4 = new ImageView("4.jpg");
      	imageView4.setFitWidth(50);
        imageView4.setFitHeight(40);
        label4.setGraphic(imageView4);

      Label label5=new Label();
ImageView imageView5 = new ImageView("5.jpg");
      	imageView5.setFitWidth(50);
        imageView5.setFitHeight(40);
        label5.setGraphic(imageView5);
        
      Label label6=new Label();
      ImageView imageView6 = new ImageView("6.jpg");
      	imageView6.setFitWidth(50);
        imageView6.setFitHeight(40);
        label6.setGraphic(imageView6);

      Label label7=new Label();
      ImageView imageView7 = new ImageView("7.jpg");
      	imageView7.setFitWidth(50);
        imageView7.setFitHeight(40);
        label7.setGraphic(imageView7);

      Label label8=new Label();
      ImageView imageView8 = new ImageView("8.jpg");
      	imageView8.setFitWidth(50);
        imageView8.setFitHeight(40);
        label8.setGraphic(imageView8);

      Label label9=new Label();
      ImageView imageView9 = new ImageView("9.jpg");
      	imageView9.setFitWidth(50);
        imageView9.setFitHeight(40);
        label9.setGraphic(imageView9);

      Label label10=new Label();
      ImageView imageView10 = new ImageView("10.jpg");
      	imageView10.setFitWidth(50);
        imageView10.setFitHeight(40);
        label10.setGraphic(imageView10);


    GridPane grid = new GridPane();
    grid.addRow(0, label1 , label2 , label3 ,label4 , label5 , label6 , label7 , label8 , label9 , label10);
    grid.setAlignment(Pos.BOTTOM_RIGHT);
    pane1.setBottom(grid);
   pane1.setTop(paneForslider);
    
    Map<Label,Image>map=new LinkedHashMap<Label,Image>();
    map.put(label1,image1);
    map.put(label2,image2);
    map.put(label3,image3);
    map.put(label4,image4);
    map.put(label5,image5);
    map.put(label6,image6);
    map.put(label7,image7);
    map.put(label8,image8);
    map.put(label9,image9);
    map.put(label10,image10);
//////////////////////////end raya part////////////////////
//////////////////////////walaa part num2////////////////
        Map<Label,String>map2=new LinkedHashMap<Label,String>();
    map2.put(label1,"image1");
    map2.put(label2,"image2");
    map2.put(label3,"image3");
    map2.put(label4,"image4");
    map2.put(label5,"image5");
    map2.put(label6,"image6");
    map2.put(label7,"image7");
    map2.put(label8,"image8");
    map2.put(label9,"image9");
    map2.put(label10,"image10");
    for(Label labell : map.keySet()){
    labell.setStyle("-fx-border-color:black;-fx-font-size:20");
    labell.setOnMouseClicked(e->{
    iv.setImage(map.get(labell));
    label.setText(map2.get(labell));
    
    
}) ;

    
    
    }
        pane1.setCenter(splitPane);
    ////////////////walaa part num2//////////////////
   
   
    return pane1;
      
    }
    
    @Override // Override the start method in the Application class
 public void start(Stage primaryStage) {
 // Create a scene and place it in the stage
 Scene scene = new Scene(getPane(), 600, 600);
 primaryStage.setTitle("ButtonDemo"); // Set the stage title
 primaryStage.setScene(scene); // Place the scene in the stage
 primaryStage.show(); // Display the stage
 }
    
     public static void main(String[]args){
         launch(args);
         
         
         
     }}
         
  

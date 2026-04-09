package Final;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Board extends Application {

    public static int timesGuessed = 0;
    //public static boolean num1 = true;

    public static Text youWin = new Text("YOU\nWIN");
    public static Rectangle cover = new Rectangle(180,50, Color.DARKGREY);

    @Override
    public void start(Stage stage) throws Exception {
        int paneWidth = 300;
        int paneHeight = 600;

        int boardWidth = 200;
        int boardHeight = 400;

        double padding = (paneWidth-boardWidth)/2;



        //IntelliJ did this for me. I did not know how to do this before.
        //AtomicInteger timesGuessed = new AtomicInteger();

        Pane pane = new Pane();

        Rectangle board = new Rectangle(boardWidth,boardHeight,Color.GREY);
        board.setX((paneWidth/2) - (boardWidth/2));
        board.setY(padding);

        pane.getChildren().add(board);




        //reads file
        File file = new File("Instructions.txt");
        Scanner sc = new Scanner(file);

        TextArea inst = new TextArea();


        while(sc.hasNextLine()){
            inst.appendText(sc.nextLine() + "\n");
        }

        inst.setMaxSize(300,510);
        inst.setMinSize(300,510);
        inst.setWrapText(true);
        inst.setEditable(false);

        //button for reading text
        Button instText = new Button("Click Here For Instructions");
        instText.setLayoutY(530);
        instText.setLayoutX(75);


        //image...
        Image emoji = new Image(new FileInputStream("EMOJI.png"));

        ImageView emojiView = new ImageView(emoji);
        emojiView.setFitHeight(300);
        emojiView.setFitWidth(300);
        emojiView.setY(150);

        // the holes that you put colors into

        Circle hole00 = new Circle(15,Color.WHITE);
        hole00.setCenterX(75);
        hole00.setCenterY(420);
        hole00.setStroke(Color.WHITE);

        Circle hole01 = new Circle(15,Color.WHITE);
        hole01.setCenterX(115);
        hole01.setCenterY(420);
        hole01.setStroke(Color.WHITE);

        Circle hole02 = new Circle(15,Color.WHITE);
        hole02.setCenterX(155);
        hole02.setCenterY(420);
        hole02.setStroke(Color.WHITE);

        Circle hole03 = new Circle(15,Color.WHITE);
        hole03.setCenterX(195);
        hole03.setCenterY(420);
        hole03.setStroke(Color.WHITE);

        Circle[] holes01 = {hole00, hole01, hole02, hole03};

        Circle hole10 = new Circle(15,Color.WHITE);
        hole10.setCenterX(75);
        hole10.setCenterY(380);
        hole10.setStroke(Color.WHITE);
        hole10.setOpacity(0);

        Circle hole11 = new Circle(15,Color.WHITE);
        hole11.setCenterX(115);
        hole11.setCenterY(380);
        hole11.setStroke(Color.WHITE);
        hole11.setOpacity(0);

        Circle hole12 = new Circle(15,Color.WHITE);
        hole12.setCenterX(155);
        hole12.setCenterY(380);
        hole12.setStroke(Color.WHITE);
        hole12.setOpacity(0);

        Circle hole13 = new Circle(15,Color.WHITE);
        hole13.setCenterX(195);
        hole13.setCenterY(380);
        hole13.setStroke(Color.WHITE);
        hole13.setOpacity(0);

        Circle[] holes02 = {hole10, hole11, hole12, hole13};


        Circle hole20 = new Circle(15,Color.WHITE);
        hole20.setCenterX(75);
        hole20.setCenterY(340);
        hole20.setStroke(Color.WHITE);
        hole20.setOpacity(0);

        Circle hole21 = new Circle(15,Color.WHITE);
        hole21.setCenterX(115);
        hole21.setCenterY(340);
        hole21.setStroke(Color.WHITE);
        hole21.setOpacity(0);

        Circle hole22 = new Circle(15,Color.WHITE);
        hole22.setCenterX(155);
        hole22.setCenterY(340);
        hole22.setStroke(Color.WHITE);
        hole22.setOpacity(0);

        Circle hole23 = new Circle(15,Color.WHITE);
        hole23.setCenterX(195);
        hole23.setCenterY(340);
        hole23.setStroke(Color.WHITE);
        hole23.setOpacity(0);

        Circle[] holes03 = {hole20, hole21, hole22, hole23};


        Circle hole30 = new Circle(15,Color.WHITE);
        hole30.setCenterX(75);
        hole30.setCenterY(300);
        hole30.setStroke(Color.WHITE);
        hole30.setOpacity(0);

        Circle hole31 = new Circle(15,Color.WHITE);
        hole31.setCenterX(115);
        hole31.setCenterY(300);
        hole31.setStroke(Color.WHITE);
        hole31.setOpacity(0);

        Circle hole32 = new Circle(15,Color.WHITE);
        hole32.setCenterX(155);
        hole32.setCenterY(300);
        hole32.setStroke(Color.WHITE);
        hole32.setOpacity(0);

        Circle hole33 = new Circle(15,Color.WHITE);
        hole33.setCenterX(195);
        hole33.setCenterY(300);
        hole33.setStroke(Color.WHITE);
        hole33.setOpacity(0);

        Circle[] holes04 = {hole30, hole31, hole32, hole33};

        Circle hole40 = new Circle(15,Color.WHITE);
        hole40.setCenterX(75);
        hole40.setCenterY(260);
        hole40.setStroke(Color.WHITE);
        hole40.setOpacity(0);

        Circle hole41 = new Circle(15,Color.WHITE);
        hole41.setCenterX(115);
        hole41.setCenterY(260);
        hole41.setStroke(Color.WHITE);
        hole41.setOpacity(0);

        Circle hole42 = new Circle(15,Color.WHITE);
        hole42.setCenterX(155);
        hole42.setCenterY(260);
        hole42.setStroke(Color.WHITE);
        hole42.setOpacity(0);

        Circle hole43 = new Circle(15,Color.WHITE);
        hole43.setCenterX(195);
        hole43.setCenterY(260);
        hole43.setStroke(Color.WHITE);
        hole43.setOpacity(0);

        Circle[] holes05 = {hole40, hole41, hole42, hole43};


        Circle hole50 = new Circle(15,Color.WHITE);
        hole50.setCenterX(75);
        hole50.setCenterY(220);
        hole50.setStroke(Color.WHITE);
        hole50.setOpacity(0);

        Circle hole51 = new Circle(15,Color.WHITE);
        hole51.setCenterX(115);
        hole51.setCenterY(220);
        hole51.setStroke(Color.WHITE);
        hole51.setOpacity(0);

        Circle hole52 = new Circle(15,Color.WHITE);
        hole52.setCenterX(155);
        hole52.setCenterY(220);
        hole52.setStroke(Color.WHITE);
        hole52.setOpacity(0);

        Circle hole53 = new Circle(15,Color.WHITE);
        hole53.setCenterX(195);
        hole53.setCenterY(220);
        hole53.setStroke(Color.WHITE);
        hole53.setOpacity(0);

        Circle[] holes06 = {hole50, hole51, hole52, hole53};

        Circle hole60 = new Circle(15,Color.WHITE);
        hole60.setCenterX(75);
        hole60.setCenterY(180);
        hole60.setStroke(Color.WHITE);
        hole60.setOpacity(0);

        Circle hole61 = new Circle(15,Color.WHITE);
        hole61.setCenterX(115);
        hole61.setCenterY(180);
        hole61.setStroke(Color.WHITE);
        hole61.setOpacity(0);

        Circle hole62 = new Circle(15,Color.WHITE);
        hole62.setCenterX(155);
        hole62.setCenterY(180);
        hole62.setStroke(Color.WHITE);
        hole62.setOpacity(0);

        Circle hole63 = new Circle(15,Color.WHITE);
        hole63.setCenterX(195);
        hole63.setCenterY(180);
        hole63.setStroke(Color.WHITE);
        hole63.setOpacity(0);

        Circle[] holes07 = {hole60, hole61, hole62, hole63};


        //buttons for color

        Button blueB = new Button("BLUE");
        blueB.setLayoutX(10);
        blueB.setLayoutY(480);
        blueB.setTextFill(Color.BLUE);

        Button redB = new Button("RED");
        redB.setLayoutX(60);
        redB.setLayoutY(480);
        redB.setTextFill(Color.RED);

        Button yellowB = new Button("YELLOW");
        yellowB.setLayoutX(105);
        yellowB.setLayoutY(480);
        yellowB.setTextFill(Color.DARKGOLDENROD);

        Button greenB = new Button("GREEN");
        greenB.setLayoutX(173);
        greenB.setLayoutY(480);
        greenB.setTextFill(Color.GREEN);

        //enter button making
        Button enter = new Button("ENTER");
        enter.setLayoutX(240);
        enter.setLayoutY(480);


        // this is where the code for the mystery circles will go
        Circle guess00 = new Circle(15,Play.randomGuess());
        guess00.setCenterX(75);
        guess00.setCenterY(80);
        guess00.setStroke(guess00.getStroke());

        Circle guess01 = new Circle(15,Play.randomGuess());
        guess01.setCenterX(115);
        guess01.setCenterY(80);
        guess01.setStroke(guess01.getStroke());

        Circle guess02 = new Circle(15,Play.randomGuess());
        guess02.setCenterX(155);
        guess02.setCenterY(80);
        guess02.setStroke(guess02.getStroke());

        Circle guess03 = new Circle(15,Play.randomGuess());
        guess03.setCenterX(195);
        guess03.setCenterY(80);
        guess03.setStroke(guess03.getStroke());

        Circle[] guesses = {guess00, guess01, guess02, guess03};

        //shows row 1
        Circle show00 = new Circle(3,Color.WHITE);
        show00.setCenterX(225);
        show00.setCenterY(415);
        show00.setStroke(guess00.getStroke());

        Circle show01 = new Circle(3,Color.WHITE);
        show01.setCenterX(240);
        show01.setCenterY(415);
        show01.setStroke(guess01.getStroke());

        Circle show02 = new Circle(3,Color.WHITE);
        show02.setCenterX(225);
        show02.setCenterY(430);
        show02.setStroke(guess02.getStroke());

        Circle show03 = new Circle(3, Color.WHITE);
        show03.setCenterX(240);
        show03.setCenterY(430);
        show03.setStroke(guess03.getStroke());

        Circle[] shows01 = {show00, show01, show02, show03};


        //shows row 2
        Circle show10 = new Circle(3,Color.WHITE);
        show10.setCenterX(225);
        show10.setCenterY(375);
        show10.setStroke(guess00.getStroke());
        show10.setOpacity(0);

        Circle show11 = new Circle(3,Color.WHITE);
        show11.setCenterX(240);
        show11.setCenterY(375);
        show11.setStroke(guess01.getStroke());
        show11.setOpacity(0);

        Circle show12 = new Circle(3,Color.WHITE);
        show12.setCenterX(225);
        show12.setCenterY(390);
        show12.setStroke(guess02.getStroke());
        show12.setOpacity(0);

        Circle show13 = new Circle(3, Color.WHITE);
        show13.setCenterX(240);
        show13.setCenterY(390);
        show13.setStroke(guess03.getStroke());
        show13.setOpacity(0);

        Circle[] shows02 = {show10, show11, show12, show13};

        //shows row three
        Circle show20 = new Circle(3,Color.WHITE);
        show20.setCenterX(225);
        show20.setCenterY(335);
        show20.setStroke(guess00.getStroke());
        show20.setOpacity(0);

        Circle show21 = new Circle(3,Color.WHITE);
        show21.setCenterX(240);
        show21.setCenterY(335);
        show21.setStroke(guess01.getStroke());
        show21.setOpacity(0);

        Circle show22 = new Circle(3,Color.WHITE);
        show22.setCenterX(225);
        show22.setCenterY(350);
        show22.setStroke(guess02.getStroke());
        show22.setOpacity(0);

        Circle show23 = new Circle(3, Color.WHITE);
        show23.setCenterX(240);
        show23.setCenterY(350);
        show23.setStroke(guess03.getStroke());
        show23.setOpacity(0);

        Circle[] shows03 = {show20, show21, show22, show23};

        //shows row 4
        Circle show30 = new Circle(3,Color.WHITE);
        show30.setCenterX(225);
        show30.setCenterY(295);
        show30.setStroke(guess00.getStroke());
        show30.setOpacity(0);

        Circle show31 = new Circle(3,Color.WHITE);
        show31.setCenterX(240);
        show31.setCenterY(295);
        show31.setStroke(guess01.getStroke());
        show31.setOpacity(0);

        Circle show32 = new Circle(3,Color.WHITE);
        show32.setCenterX(225);
        show32.setCenterY(310);
        show32.setStroke(guess02.getStroke());
        show32.setOpacity(0);

        Circle show33 = new Circle(3, Color.WHITE);
        show33.setCenterX(240);
        show33.setCenterY(310);
        show33.setStroke(guess03.getStroke());
        show33.setOpacity(0);

        Circle[] shows04 = {show30, show31, show32, show33};

        //shows row 5
        Circle show40 = new Circle(3,Color.WHITE);
        show40.setCenterX(225);
        show40.setCenterY(255);
        show40.setStroke(guess00.getStroke());
        show40.setOpacity(0);

        Circle show41 = new Circle(3,Color.WHITE);
        show41.setCenterX(240);
        show41.setCenterY(255);
        show41.setStroke(guess01.getStroke());
        show41.setOpacity(0);

        Circle show42 = new Circle(3,Color.WHITE);
        show42.setCenterX(225);
        show42.setCenterY(270);
        show42.setStroke(guess02.getStroke());
        show42.setOpacity(0);

        Circle show43 = new Circle(3, Color.WHITE);
        show43.setCenterX(240);
        show43.setCenterY(270);
        show43.setStroke(guess03.getStroke());
        show43.setOpacity(0);

        Circle[] shows05 = {show40, show41, show42, show43};

        //shows row 6
        Circle show50 = new Circle(3,Color.WHITE);
        show50.setCenterX(225);
        show50.setCenterY(215);
        show50.setStroke(guess00.getStroke());
        show50.setOpacity(0);

        Circle show51 = new Circle(3,Color.WHITE);
        show51.setCenterX(240);
        show51.setCenterY(215);
        show51.setStroke(guess01.getStroke());
        show51.setOpacity(0);

        Circle show52 = new Circle(3,Color.WHITE);
        show52.setCenterX(225);
        show52.setCenterY(230);
        show52.setStroke(guess02.getStroke());
        show52.setOpacity(0);

        Circle show53 = new Circle(3, Color.WHITE);
        show53.setCenterX(240);
        show53.setCenterY(230);
        show53.setStroke(guess03.getStroke());
        show53.setOpacity(0);

        Circle[] shows06 = {show50, show51, show52, show53};

        Circle show60 = new Circle(3,Color.WHITE);
        show60.setCenterX(225);
        show60.setCenterY(175);
        show60.setStroke(guess00.getStroke());
        show60.setOpacity(0);

        Circle show61 = new Circle(3,Color.WHITE);
        show61.setCenterX(240);
        show61.setCenterY(175);
        show61.setStroke(guess01.getStroke());
        show61.setOpacity(0);

        Circle show62 = new Circle(3,Color.WHITE);
        show62.setCenterX(225);
        show62.setCenterY(190);
        show62.setStroke(guess02.getStroke());
        show62.setOpacity(0);

        Circle show63 = new Circle(3, Color.WHITE);
        show63.setCenterX(240);
        show63.setCenterY(190);
        show63.setStroke(guess03.getStroke());
        show63.setOpacity(0);

        Circle[] shows07 = {show60, show61, show62, show63};


        //cover for the answer
        Rectangle cover = new Rectangle(180,50, Color.DARKGREY);
        cover.setY(60);
        cover.setX(60);
        cover.setOpacity(1);


        //Text youWin = new Text("YOU\nWIN");
        youWin.setX(25);
        youWin.setY(250);
        youWin.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 100));
        youWin.setStroke(Color.PURPLE);
        youWin.setFill(Color.DEEPPINK);
        youWin.setOpacity(0);
        youWin.setMouseTransparent(true); //not able to click so it does not get in the way


        //adding all the holes
        pane.getChildren().addAll(hole00, hole01, hole02, hole03);
        pane.getChildren().addAll(hole10, hole11, hole12, hole13);
        pane.getChildren().addAll(hole20, hole21, hole22, hole23);
        pane.getChildren().addAll(hole30, hole31, hole32, hole33);
        pane.getChildren().addAll(hole40, hole41, hole42, hole43);
        pane.getChildren().addAll(hole50, hole51, hole52, hole53);
        pane.getChildren().addAll(hole60, hole61, hole62, hole63);

        //adding all the buttons
        pane.getChildren().addAll(blueB,redB,yellowB,greenB);
        //adds mystery color circles
        pane.getChildren().addAll(guess00, guess01, guess02, guess03);
        //adds enter button
        pane.getChildren().add(enter);
        //adding the showing if you right circles
        pane.getChildren().addAll(show00, show01, show02, show03);
        pane.getChildren().addAll(show10, show11, show12, show13);
        pane.getChildren().addAll(show20, show21, show22, show23);
        pane.getChildren().addAll(show30, show31, show32, show33);
        pane.getChildren().addAll(show40, show41, show42, show43);
        pane.getChildren().addAll(show50, show51, show52, show53);
        pane.getChildren().addAll(show60, show61, show62, show63);
        //adds winning text to scene
        pane.getChildren().add(youWin);
        //adds cover to scene
        pane.getChildren().add(cover);
        //adds button to get text
        pane.getChildren().add(instText);


        //creates scene from pane
        Scene scene = new Scene(pane, paneWidth, paneHeight);
        stage.setTitle("Mastermind Board");
        stage.setScene(scene);
        stage.show();

        TextArea finalInst = inst;
        TextArea finalInst1 = inst;
        instText.setOnAction(e -> {
            boolean isVisible = finalInst1.isVisible();
            finalInst1.setVisible(!isVisible);
            finalInst1.setManaged(!isVisible);
            pane.getChildren().add(finalInst);

        });


        //lighting up the circumference when button clicked
        hole00.setOnMouseClicked(e -> {
            if (timesGuessed == 0) {
                Play.clicked(hole00, hole01, hole02, hole03);
            }
        });
        hole01.setOnMouseClicked(e -> {
            if (timesGuessed == 0) {
                Play.clicked(hole01, hole00, hole02, hole03);
            }
        });
        hole02.setOnMouseClicked(e -> {
            if (timesGuessed == 0) {
                Play.clicked(hole02, hole00, hole01, hole03);
            }
        });
        hole03.setOnMouseClicked(e -> {
            if (timesGuessed == 0) {
                Play.clicked(hole03, hole00, hole01, hole02);
            }
        });

        hole10.setOnMouseClicked(e -> {
            if (timesGuessed == 1) {
                Play.clicked(hole10, hole11, hole12, hole13);
            }
        });
        hole11.setOnMouseClicked(e -> {
            if (timesGuessed == 1) {
                Play.clicked(hole11, hole10, hole12, hole13);
            }
        });
        hole12.setOnMouseClicked(e -> {
            if (timesGuessed == 1) {
                Play.clicked(hole12, hole10, hole11, hole13);
            }
        });
        hole13.setOnMouseClicked(e -> {
            if (timesGuessed == 1) {
                Play.clicked(hole13, hole10, hole11, hole12);
            }
        });

        hole20.setOnMouseClicked(e -> {
            if (timesGuessed == 2) {
                Play.clicked(hole20, hole21, hole22, hole23);
            }
        });
        hole21.setOnMouseClicked(e -> {
            if (timesGuessed == 2) {
                Play.clicked(hole21, hole20, hole22, hole23);
            }
        });
        hole22.setOnMouseClicked(e -> {
            if (timesGuessed == 2) {
                Play.clicked(hole22, hole20, hole21, hole23);
            }
        });
        hole23.setOnMouseClicked(e -> {
            if (timesGuessed == 2) {
                Play.clicked(hole23, hole20, hole21, hole22);
            }
        });

        hole30.setOnMouseClicked(e -> {
            if (timesGuessed == 3) {
                Play.clicked(hole30, hole31, hole32, hole33);
            }
        });
        hole31.setOnMouseClicked(e -> {
            if (timesGuessed == 3) {
                Play.clicked(hole31, hole30, hole32, hole33);
            }
        });
        hole32.setOnMouseClicked(e -> {
            if (timesGuessed == 3) {
                Play.clicked(hole32, hole30, hole31, hole33);
            }
        });
        hole33.setOnMouseClicked(e -> {
            if (timesGuessed == 3) {
                Play.clicked(hole33, hole30, hole31, hole32);
            }
        });

        hole40.setOnMouseClicked(e -> {
            if (timesGuessed == 4) {
                Play.clicked(hole40, hole41, hole42, hole43);
            }
        });
        hole41.setOnMouseClicked(e -> {
            if (timesGuessed == 4) {
                Play.clicked(hole41, hole40, hole42, hole43);
            }
        });
        hole42.setOnMouseClicked(e -> {
            if (timesGuessed == 4) {
                Play.clicked(hole42, hole40, hole41, hole43);
            }
        });
        hole43.setOnMouseClicked(e -> {
            if (timesGuessed == 4) {
                Play.clicked(hole43, hole40, hole41, hole42);
            }
        });

        hole50.setOnMouseClicked(e -> {
            if (timesGuessed == 5) {
                Play.clicked(hole50, hole51, hole52, hole53);
            }
        });
        hole51.setOnMouseClicked(e -> {
            if (timesGuessed == 5) {
                Play.clicked(hole51, hole50, hole52, hole53);
            }
        });
        hole52.setOnMouseClicked(e -> {
            if (timesGuessed == 5) {
                Play.clicked(hole52, hole50, hole51, hole53);
            }
        });
        hole53.setOnMouseClicked(e -> {
            if (timesGuessed == 5) {
                Play.clicked(hole53, hole50, hole51, hole52);
            }
        });

        hole60.setOnMouseClicked(e -> {
            if (timesGuessed == 6) {
                Play.clicked(hole60, hole61, hole62, hole63);
            }
        });
        hole61.setOnMouseClicked(e -> {
            if (timesGuessed == 6) {
                Play.clicked(hole61, hole60, hole62, hole63);
            }
        });
        hole62.setOnMouseClicked(e -> {
            if (timesGuessed == 6) {
                Play.clicked(hole62, hole60, hole61, hole63);
            }
        });
        hole63.setOnMouseClicked(e -> {
            if (timesGuessed == 6) {
                Play.clicked(hole63, hole60, hole61, hole62);
            }
        });



        /*pane.setOnMouseClicked(e1 -> {
            if (timesGuessed == 0) {
                hole00.setOnMouseClicked(e -> Play.clicked(hole00, hole01, hole02, hole03));
                hole01.setOnMouseClicked(e -> Play.clicked(hole01, hole00, hole02, hole03));
                hole02.setOnMouseClicked(e -> Play.clicked(hole02, hole00, hole01, hole03));
                hole03.setOnMouseClicked(e -> Play.clicked(hole03, hole00, hole01, hole02));
            }else if (timesGuessed == 1){
                hole10.setOnMouseClicked(e -> Play.clicked(hole10, hole11, hole12, hole13));
                hole11.setOnMouseClicked(e -> Play.clicked(hole11, hole10, hole12, hole13));
                hole12.setOnMouseClicked(e -> Play.clicked(hole12, hole10, hole11, hole13));
                hole13.setOnMouseClicked(e -> Play.clicked(hole13, hole10, hole11, hole12));
            }

        });*/

        //filling the holes with colors
        blueB.setOnAction(e -> {
            if (timesGuessed == 0) {
                Play.colorFill(blueB, holes01);
            } else if (timesGuessed == 1) {
                Play.colorFill(blueB, holes02);
            } else if(timesGuessed == 2){
                Play.colorFill(blueB, holes03);
            } else if(timesGuessed == 3){
                Play.colorFill(blueB, holes04);
            }else if(timesGuessed == 4){
                Play.colorFill(blueB, holes05);
            }else if(timesGuessed == 5){
                Play.colorFill(blueB, holes06);
            }else if(timesGuessed == 6){
                Play.colorFill(blueB, holes07);
            }
        });

        redB.setOnAction(e -> {
            if (timesGuessed == 0) {
                Play.colorFill(redB, holes01);
            } else if (timesGuessed == 1) {
                Play.colorFill(redB, holes02);
            }else if (timesGuessed == 2) {
                Play.colorFill(redB, holes03);
            }else if (timesGuessed == 3) {
                Play.colorFill(redB, holes04);
            }else if (timesGuessed == 4) {
                Play.colorFill(redB, holes05);
            }else if (timesGuessed == 5) {
                Play.colorFill(redB, holes06);
            }else if (timesGuessed == 6) {
                Play.colorFill(redB, holes07);
            }
        });

        yellowB.setOnAction(e -> {
            if (timesGuessed == 0) {
                Play.colorFill(yellowB, holes01);
            } else if (timesGuessed == 1) {
                Play.colorFill(yellowB, holes02);
            }else if (timesGuessed == 2) {
                Play.colorFill(yellowB, holes03);
            }else if (timesGuessed == 3) {
                Play.colorFill(yellowB, holes04);
            }else if (timesGuessed == 4) {
                Play.colorFill(yellowB, holes05);
            }else if (timesGuessed == 5) {
                Play.colorFill(yellowB, holes06);
            }else if (timesGuessed == 6) {
                Play.colorFill(yellowB, holes07);
            }
        });

        greenB.setOnAction(e -> {
            if (timesGuessed == 0) {
                Play.colorFill(greenB, holes01);
            } else if (timesGuessed == 1) {
                Play.colorFill(greenB, holes02);
            }else if (timesGuessed == 2) {
                Play.colorFill(greenB, holes03);
            }else if (timesGuessed == 3) {
                Play.colorFill(greenB, holes04);
            }else if (timesGuessed == 4) {
                Play.colorFill(greenB, holes05);
            }else if (timesGuessed == 5) {
                Play.colorFill(greenB, holes06);
            }else if (timesGuessed == 6) {
                Play.colorFill(greenB, holes07);
            }
        });

        /*if (timesGuessed == 0){
            blueB.setOnAction( e -> Play.colorFill(blueB, holes01));
            redB.setOnAction( e -> Play.colorFill(redB, holes01));
            yellowB.setOnAction( e -> Play.colorFill(yellowB, holes01));
            greenB.setOnAction( e -> Play.colorFill(greenB, holes01));
        } else if (timesGuessed == 1) {
            blueB.setOnAction( e -> Play.colorFill(blueB, holes02));
            redB.setOnAction( e -> Play.colorFill(redB, holes02));
            yellowB.setOnAction( e -> Play.colorFill(yellowB, holes02));
            greenB.setOnAction( e -> Play.colorFill(greenB, holes02));
        }*/




        //call code to get the enter button to run
        enter.setOnAction(e -> {

            if (timesGuessed == 0) {
                Play.checkColorsForCorrect(holes01, guesses, shows01,cover);

                timesGuessed++;


                if(!Play.isDone){
                    newHoles(holes02, shows02);
                }



                //num1 = false;

                /*if (timesGuessed == 1) {
                    hole10.setOnMouseClicked(e2 -> Play.clicked(hole10, hole11, hole12, hole13));
                    hole11.setOnMouseClicked(e2 -> Play.clicked(hole11, hole10, hole12, hole13));
                    hole12.setOnMouseClicked(e2 -> Play.clicked(hole12, hole10, hole11, hole13));
                    hole13.setOnMouseClicked(e2 -> Play.clicked(hole13, hole10, hole11, hole12));
                }*/
            }else if(timesGuessed == 1){
                Play.checkColorsForCorrect(holes02, guesses, shows02,cover);

                timesGuessed++;

                if(!Play.isDone){
                    newHoles(holes03, shows03);
                }

            } else if(timesGuessed == 2){
                Play.checkColorsForCorrect(holes03, guesses, shows03,cover);

                timesGuessed++;

                if(!Play.isDone){
                    newHoles(holes04,shows04);
                }

            } else if(timesGuessed == 3){
                Play.checkColorsForCorrect(holes04, guesses, shows04,cover);

                timesGuessed++;

                if(!Play.isDone){
                    newHoles(holes05,shows05);
                }

            } else if(timesGuessed == 4){
                Play.checkColorsForCorrect(holes05, guesses, shows05,cover);

                timesGuessed++;

                if(!Play.isDone){
                    newHoles(holes06,shows06);
                }

            } else if(timesGuessed == 5){
                Play.checkColorsForCorrect(holes06, guesses, shows06,cover);

                timesGuessed++;

                if(!Play.isDone){
                    newHoles(holes07,shows07);
                }
            }else if(timesGuessed == 6){
                Play.checkColorsForCorrect(holes07, guesses, shows07, cover);

                timesGuessed++;

                cover.setOpacity(0);

                pane.getChildren().add(emojiView);
            }
        });





    }
    //makes the new circles viewable
    public void newHoles(Circle[] prevHoles, Circle[] shows){
        for(int i = 0; i <4; i++){
            prevHoles[i].setOpacity(1);
            shows[i].setOpacity(1);
        }


    }
    //makes the winning text viewable
    public static void win(Text youWin){
       youWin.setOpacity(1);
    }



}

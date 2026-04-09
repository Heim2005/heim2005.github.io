package app;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.Random;

import static javafx.scene.paint.Color.*;

public class Play {

    public static Boolean isDone = false;

    public static void clicked(Circle hole, Circle other1, Circle other2, Circle other3) {

        hole.setStroke(Color.DARKRED);
        hole.setStrokeWidth(3);

        other1.setStroke(other1.getFill());
        other2.setStroke(other2.getFill());
        other3.setStroke(other3.getFill());
    }

    //make circles colors depending on the button you press
    public static void colorFill(Button button, Circle[] holes) {

        Color col = Color.web(button.getText()); //looked up how to convert string to color**(the Color.web part)

        for (int i = 0; i < holes.length; i++) {
            if (holes[i].getStroke().equals(Color.DARKRED)) {
                holes[i].setFill(col);
                holes[i].setStroke(col);
            }


        }

    }
    // randomly fills the answer
    public static Color randomGuess(){
        Random rand = new Random();

        Color randColor = Color.WHITE;

        int randNum = rand.nextInt(1,5);

        switch(randNum){
            case 1: randColor = Color.RED;
                break;
            case 2: randColor = Color.BLUE;
                break;
            case 3: randColor = Color.YELLOW;
                break;
            case 4: randColor = Color.GREEN;
                break;
        }

        return randColor;
    }



    public static void checkColorsForCorrect(Circle[] holes, Circle[] guesses, Circle[] shows, Rectangle cover){

        //resets all the checker things
        for (int i = 0; i < shows.length; i++){
            shows[i].setFill(Color.WHITE);
        }

        int correct = 0;
        int ok = 0;

        //checks for completely correct
        /*if (holes[0].getFill().equals(guesses[0].getFill())){
            correct ++;
        } else if ( holes[0].getFill().equals(guesses[1].getFill()) || holes[0].getFill().equals(guesses[2].getFill()) || holes[0].getFill().equals(guesses[3].getFill())){
            ok++;
        }
        if (holes[1].getFill().equals(guesses[1].getFill())){
            correct ++;
        }else if (holes[1].getFill().equals(guesses[0].getFill()) || holes[1].getFill().equals(guesses[2].getFill()) || holes[1].getFill().equals(guesses[3].getFill())){
            ok++;
        }
        if (holes[2].getFill().equals(guesses[2].getFill())){
            correct++;
        }else if (holes[2].getFill().equals(guesses[0].getFill()) || holes[2].getFill().equals(guesses[1].getFill())  || holes[2].getFill().equals(guesses[3].getFill())){
            ok++;
        }
        if (holes[3].getFill().equals(guesses[3].getFill())){
            correct ++;
        }else if (holes[3].getFill().equals(guesses[0].getFill()) || holes[3].getFill().equals(guesses[1].getFill()) || holes[3].getFill().equals(guesses[2].getFill()) ){
            ok++;
        }*/

        boolean first = false;
        boolean second = false;
        boolean third = false;
        boolean fourth = false;

        boolean guess1 = false;
        boolean guess2 = false;
        boolean guess3 = false;
        boolean guess4 = false;

        //checks if what the player guesses is correct
        if (holes[0].getFill().equals(guesses[0].getFill())) {
            correct++;
            first = true;
            guess1 = true;
        }
        if (holes[1].getFill().equals(guesses[1].getFill())) {
            correct++;
            second = true;
            guess2 = true;
        }
        if (holes[2].getFill().equals(guesses[2].getFill())) {
            correct++;
            third = true;
            guess3 = true;
        }
        if (holes[3].getFill().equals(guesses[3].getFill())) {
            correct++;
            fourth = true;
            guess4 = true;
        }
        //checks if what the player guesses is ok
        if (!first) {
            if (!guess2 && holes[0].getFill().equals(guesses[1].getFill())){
                ok++;
                guess2 = true;
            }else if (!guess3 && holes[0].getFill().equals(guesses[2].getFill())){
                ok++;
                guess3 = true;
            }else if(!guess4 && holes[0].getFill().equals(guesses[3].getFill())){
                ok++;
                guess4 = true;

            }
        }

        if (!second) {
            if (!guess1 && holes[1].getFill().equals(guesses[0].getFill())){
                ok++;
                guess1 = true;
            }else if (!guess3 && holes[1].getFill().equals(guesses[2].getFill())){
                ok++;
                guess3 = true;
            }else if(!guess4 && holes[1].getFill().equals(guesses[3].getFill())){
                ok++;
                guess4 = true;
            }
        }

        if (!third) {
            if (!guess1 && holes[2].getFill().equals(guesses[0].getFill())){
                ok++;
                guess1 = true;
            }else if (!guess2 && holes[2].getFill().equals(guesses[1].getFill())){
                ok++;
                guess2 = true;
            }else if(!guess4 && holes[2].getFill().equals(guesses[3].getFill())){
                ok++;
                guess4 = true;
            }
        }

        if (!fourth) {
            if (!guess1 && holes[3].getFill().equals(guesses[0].getFill())){
                ok++;
                guess1 = true;
            }else if (!guess2 && holes[3].getFill().equals(guesses[1].getFill())){
                ok++;
                guess2 = true;
            }else if(!guess3 && holes[3].getFill().equals(guesses[2].getFill())){
                ok++;
                guess3 = true;
            }
        }





        //fills in the indicators for what is correct
        for (int i = 0; i < correct; i++){
            shows[i].setFill(Color.GREEN);
        }
        //fills in the indicators for what is ok
        for (int i = correct; i < correct +ok; i++){
            shows[i].setFill(Color.YELLOW);
        }

        //if 4 correct the winning message will appear and so will the answer
        if (correct == 4){
            Board.win(Board.youWin);
            isDone = true;
            cover.setOpacity(0);
        }
    }

}

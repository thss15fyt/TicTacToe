import javax.swing.*;
import java.awt.*;

/**
 * Created by apple on 16/11/26.
 */
public class Gui_TTT extends JFrame{

    Game game;
    beginDialog dialog;

    public Gui_TTT(){
        super("TicTacToe-Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int)dimension.getWidth()/2 - this.getWidth()/2,
                (int)dimension.getHeight()/2 - this.getHeight()/2);
        //begin dialog
        dialog = new beginDialog(this);
        dialog.pack();
        dialog.setLocation((int)dimension.getWidth()/2 - dialog.getWidth()/2,
                (int)dimension.getHeight()/2 - dialog.getHeight()/2);
        dialog.setVisible(true);
        //enter game
        game = new Game(dialog.getIp(), dialog.getPort());
        this.setContentPane(game);
        game.setVisible(true);
    }

    public static void main(String[] args) {
        Gui_TTT gui_ttt = new Gui_TTT();
        gui_ttt.setResizable(false);
        gui_ttt.setVisible(true);
    }
}

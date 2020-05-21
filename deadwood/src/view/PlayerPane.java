package view;

import javax.swing.*;
import java.util.ArrayList;

public class PlayerPane extends JLayeredPane {
    private static final String DICE_IMAGE1 = "resources/dice/b1.png";
    private static final String DICE_IMAGE2 = "resources/dice/r1.png";
    private static final String DICE_IMAGE3 = "resources/dice/g1.png";

    private ArrayList<JLabel> playerLabelSet = new ArrayList<>();

    private JLabel labelPlayer1;
    private JLabel labelPlayer2;
    private JLabel labelPlayer3;

    public PlayerPane() {
        setBounds(0, 0, 1200, 900);
        createPlayerLabels();
        addLabelToPane();
    }

    private void createPlayerLabels() {
        labelPlayer1 = new JLabel();
        ImageIcon playerDiceIcon1 = new ImageIcon(DICE_IMAGE1);
        labelPlayer1.setIcon(playerDiceIcon1);
        labelPlayer1.setBounds(1084, 278, playerDiceIcon1.getIconWidth(), playerDiceIcon1.getIconHeight());

        labelPlayer2 = new JLabel();
        ImageIcon playerDiceIcon2 = new ImageIcon(DICE_IMAGE2);
        labelPlayer2.setIcon(playerDiceIcon2);
        labelPlayer2.setBounds(1100, 330, playerDiceIcon2.getIconWidth(), playerDiceIcon2.getIconHeight());

        playerLabelSet.add(labelPlayer1);
        playerLabelSet.add(labelPlayer2);
    }

    private void addLabelToPane() {
        add(labelPlayer1);
        add(labelPlayer2);
    }

    public void addPlayer3() {
        labelPlayer3 = new JLabel();
        ImageIcon playerDiceIcon3 = new ImageIcon(DICE_IMAGE3);
        labelPlayer3.setIcon(playerDiceIcon3);
        labelPlayer3.setBounds(1024, 320, playerDiceIcon3.getIconWidth(), playerDiceIcon3.getIconHeight());

        add(labelPlayer3);
        playerLabelSet.add(labelPlayer3);
    }


    /**
     * Getter and Setter
     */
    public ArrayList<JLabel> getPlayerLabelSet() {
        return playerLabelSet;
    }

}

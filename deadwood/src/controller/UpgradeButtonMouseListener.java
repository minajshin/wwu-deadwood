package controller;

import java.awt.event.MouseEvent;

public class UpgradeButtonMouseListener extends BaseDeadwoodMouseListener {
    public void mouseClicked(MouseEvent e) {
        getGameController().playGame(5);
    }
}
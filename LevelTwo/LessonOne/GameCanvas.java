package Homework.LevelTwo.LessonOne;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    private final MainWindow mainWindow;
    private long lastFrameTime;
    private Background background;
    GameCanvas(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        lastFrameTime = System.nanoTime();
        background = new Background();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        background.newColor(this);

        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;

        mainWindow.onDrawFrame(this, g, deltaTime);
        try {
            Thread.sleep(16);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();
    }

    int getLeft() {
        return 0;
    }

    int getRight() {
        return getWidth() - 1;
    }

    int getTop() {
        return 0;
    }

    int getBottom() {
        return getHeight() - 1;
    }

}


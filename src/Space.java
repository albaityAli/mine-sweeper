
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class Space {
    private int bombNearby;
    private boolean cleared;
    private boolean flagged;
    private boolean bomb;
    private BufferedImage image;

    public Space(boolean bomb) throws IOException {
        this.bomb = bomb;
        flagged = false;
        cleared = false;
        bombNearby = 0;

        BufferedImage temp = ImageIO.read(new File("src/images/faceDown.png"));
        image = Game.resizeImage(temp, Game.WIDTH, Game.HEIGHT);
    }

    public void setFlagged(boolean f) {
        flagged = f;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public boolean hasBomb() {
        return bomb;
    }

    public void setBombNearby(int b) {
        bombNearby = b;
    }

    public int getBombNearby() {
        return bombNearby;
    }

    public boolean isCleared() {
        return cleared;
    }

    public void clear() {
        cleared = true;
    }

    public void setImage(String filename) throws IOException {
        BufferedImage temp = ImageIO.read(new File(filename));
        image = Game.resizeImage(temp, Game.WIDTH, Game.HEIGHT);
    }

    public BufferedImage getImage() {
        return image;
    }
}

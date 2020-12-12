import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Converter {
    private String name;
    public Converter (String name){
        this.name = name;
    }

    final void templete() throws IOException {
        ReadNWrite();
        getName();
    }

    public abstract int getR(Color color);
    public abstract int getG(Color color);
    public abstract int getB(Color color);
    public String getName(){
        return name;
    }
    private void ReadNWrite () throws IOException { // 사진을 읽고 RGB 값을 바꿔줌.
        final String HOUSE = "house.png";
        BufferedImage image = ImageIO.read(new File(HOUSE));
        try {
            for(int y = 0; y < image.getHeight(); y++) {
                for(int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y));
                    int outputRed = this.getR(color);
                    int outputGreen = this.getG(color);
                    int outputBlue = this.getB(color);
                    image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
                }
            }
            ImageIO.write(image, "png", new File(this.getName() + HOUSE));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}


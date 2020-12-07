import java.awt.*;

public class SepiaImageConverter extends Converter {
    public SepiaImageConverter(String name) {
        super(name);
    }

    @Override
    public int getR(Color color) {
        return (230 * (color.getRed() + color.getGreen() + color.getBlue())/3) / 255;
    }
    @Override
    public int getG(Color color) {
        return (180 * (color.getRed() + color.getGreen() + color.getBlue())/3) / 255;
    }

    @Override
    public int getB(Color color) {
        return (150 * (color.getRed() + color.getGreen() + color.getBlue())/3) / 255;
    }
}

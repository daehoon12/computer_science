import java.awt.*;

public class GreyImageConverter extends Converter {
    public GreyImageConverter(String name) {
        super(name);
    }

    public int getR(Color color) {
        return (color.getRed() + color.getGreen() + color.getBlue())/3;
    }

    @Override
    public int getG(Color color) {
        return (color.getRed() + color.getGreen() + color.getBlue())/3;
    }

    @Override
    public int getB(Color color) {
        return (color.getRed() + color.getGreen() + color.getBlue())/3;
    }
}

import java.awt.*;

public class InverseImageConverter extends Converter {
    public InverseImageConverter(String name) {
        super(name);
    }
    @Override
    public int getR(Color color) {
        return 255 - color.getRed();
    }

    @Override
    public int getG(Color color) {
        return 255 - color.getGreen();
    }

    @Override
    public int getB(Color color) {
        return 255 - color.getBlue();
    }
}

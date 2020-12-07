import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final String HOUSE = "house.png";
        System.out.println("흑백");
        GreyImageConverter greyImageConverter = new GreyImageConverter("g_");
        greyImageConverter.templete();
        System.out.println("반전");
        InverseImageConverter inverseImageConverter = new InverseImageConverter("i_");
        inverseImageConverter.templete();
        System.out.println("세피아");
        SepiaImageConverter sepiaImageConverter = new SepiaImageConverter("s_");
        sepiaImageConverter.templete();
    }
}

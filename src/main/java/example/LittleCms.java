package example;

import java.awt.color.ColorSpace;

public class LittleCms {

    public static void main(String[] args) {
        ColorSpace colorSpace = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        colorSpace.toRGB(new float[]{0, 0, 0, 0});
    }
}

package Z1;

import controller.RGBcontroller;
import model.RGB;


public class RGBmain {
    public static void main(String[] args) {
        RGBcontroller rgb = new RGBcontroller();
        RGB red =  rgb.setRBG(255,0,0);
        RGB blue = rgb.setRBG(0,0,255);
        RGB strange = rgb.setRBG(122,120,108);

        System.out.println(red);
        System.out.println(blue);
        System.out.println(strange);

        System.out.println(rgb.mixColor(red,blue));
        System.out.println(rgb.mixColor(strange, blue));
    }
}

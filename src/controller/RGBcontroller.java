package controller;

import model.RGB;

public class RGBcontroller {
    public RGB setRBG(int r, int g, int b){
        RGB color =new RGB(r,b,g);
        return color;
    }
    public RGB mixColor(RGB c1, RGB c2){
        RGB cMixed = new RGB(
                (c1.getR()+c2.getR())/2,
                (c1.getG()+c2.getG())/2,
                (c1.getB()+c2.getB())/2
        );

        return cMixed;
    }
    public RGB clearColor(RGB c){
        c.setR(0);
        c.setG(0);
        c.setB(0);
        return c;
    }
}

package com.company;

public class Lenght extends Point{

    public Lenght(int x1, int y1, int x2, int y2) {
        super(x1, y1,  x2, y2);
    }

    public double Length()
    {
        double leng;
        leng = Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2,2)) );
        return leng;
    }
}
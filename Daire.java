package com.example.dairehesapla;

public class Daire {
    public double yaricap;
    public Daire()
    {

    }    //Yarıçap özelliği tanımlama
    //Alan metodunu tanımlama
    public double Alan()
    {
        return Math.PI*yaricap*yaricap;
    }

    public double Cevre()
    {
        return 2*Math.PI*yaricap;
    }
}

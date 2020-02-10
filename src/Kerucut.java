
import bangunruang.BangunRuang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sistem
 */
public class Kerucut extends BangunRuang  {
    public double pi = 3.14, r, s;

    public double luasAlas = pi*r*r;
    public double luasSelimutK = pi*r*s;
    
    
    
    public double Volume(double pi, double r, double t){
        return (pi*r*r*t)/3;
    }
    public double Luas(double pi, double r, double s){
        return luasAlas+luasSelimutK;
    }
}

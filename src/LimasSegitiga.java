/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sistem
 */
public class LimasSegitiga {
    public double a, t;
    public double luasAlas = (a*t)/2;
    public double Volume(double a, double t){
        return (luasAlas*t)/2;
    }
    public double Luas(double a, double t, double sisiTegak){
        return luasAlas+(3*sisiTegak);
    }
    
}

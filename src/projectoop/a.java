/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

/**
 *
 * @author FrAnK
 */
public class a {
    public double p01;
    public double p02;
            
    public double p03;
    public double p04;
    public double p05;
    public double p06;
    public double p07;
    public double p08;
    
    public double p09;
    public double p10;
    public double p11;
    public double p12;
    public double p13;
    
    public double price_01 = 10.0; 
    public double price_02 = 15.0; 
    public double price_03 = 5.0; 
    public double price_04 = 5.0; 
    public double price_05 = 5.0; 
    public double price_06 = 5.0; 
    public double price_07 = 10.0; 
    public double price_08 = 5.0; 
    public double price_09 = 20.0; 
    public double price_10 = 25.0; 
    public double price_11 = 25.0; 
    public double price_12 = 25.0; 
    public double price_13 = 20.0;
    
    public double itemcost1;
    public double itemcost2;
    public double itemcost3;
    public double itemcost;
    public double taxcost;
    
    
    public double Getamount()
    {
        itemcost1 = p01 +p02;
        itemcost2 = p03+p04+p05+p06+p07+p08;
        itemcost3 = p09 +p10 +p11 +p12 +p13;
        itemcost = itemcost1+itemcost2+itemcost3; 
        return itemcost;
    }
    
   
        
    
    
}

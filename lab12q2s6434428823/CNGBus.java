/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class CNGBus extends Bus implements LiquidFuel {
    
    private double range;
    private int emissionTier;
    
    public CNGBus(int capacity, double cost, double range, int emissionTier){
        super(capacity, cost);
        this.range = range;
        this.emissionTier = emissionTier;
    }
    
    @Override
    public double getRange(){
        return range;
    }
    
    @Override
    public int getEmissionTier(){
        return emissionTier;
    }
    
    @Override
    public double getAccel(){
        return 3.0;
    }
}

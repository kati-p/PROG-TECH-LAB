/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12q2s6434428823;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class Hybrid extends Bus implements LiquidFuel, Electric {

    private double voltage;
    private double range;
    private int emissionTier;

    public Hybrid(int capacity, double cost, double voltage, double range, int emissionTier) {
        super(capacity, cost);
        this.range = range;
        this.emissionTier = emissionTier;
        if (voltage < Electric.LOW_VOLTAGE){
            this.voltage = Electric.LOW_VOLTAGE;
        } else if (voltage > Electric.HIGH_VOLTAGE){
            this.voltage = Electric.HIGH_VOLTAGE;
        } else {
            this.voltage = voltage;
        }
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
    public double getVoltage(){
        return voltage;
    }
    
    @Override
    public double getAccel(){
        return 4.0;
    }
}

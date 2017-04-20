/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author MinaFujisawa
 */
public class HairSalon extends SalonsInfo {

    protected boolean makeUp;

    public HairSalon(int SalonNum, String salonName, String address, double price, boolean favo, int review, int reviewNum, boolean makeUp) {
        super(SalonNum, salonName, address, price, favo, review, reviewNum);
        this.makeUp = makeUp;
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result += "\nmake up service : "+ makeUp;
        return result;
    }
}

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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Salons list = new Salons();
        list.output();

        list.favo(1, true);
        System.out.println();
        System.out.println("=================================");
        System.out.println();

        for (int i = 0; i < list.salonList.size(); i++) {
            if (list.salonList.get(i) instanceof HairSalon) {
                System.out.println(list.salonList.get(i));
                System.out.println(list.salonList.get(i));
            }
        }
    }
}

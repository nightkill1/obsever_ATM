/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obsever_atm;

/**
 *
 * @author hoang
 */
public class Obsever_ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan(50000);
        ATM atm = new ATM(tk);
        atm.rutTien(7000000);
        
    }
    
}

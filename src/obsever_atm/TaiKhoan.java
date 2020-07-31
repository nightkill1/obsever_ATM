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
public class TaiKhoan implements ATM.TaiKhoan_GiaoDich{

    float soDu;

    public TaiKhoan(float soDu) {
        this.soDu = soDu;
    }

    public TaiKhoan() {
    }
    
    public float getSoDu() {
        return soDu;
    }

    @Override
    public boolean kiemTraSoDu(float TienRut) {
        if(soDu >= TienRut)
            return true;
        return false;
    }

    @Override
    public void nhanThongBao(float soTienRut, String thongbao) {
        System.out.println(thongbao);
        float soTienConLai = soDu - soTienRut;
        System.out.println("Sp tien con lai : " + soTienConLai);
    }

}

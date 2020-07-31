/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obsever_atm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang
 */
public class ATM{
  
    TaiKhoan_GiaoDich Observer;

    public ATM(TaiKhoan_GiaoDich Observer) {
        this.Observer = Observer;
    }
    
    
    public boolean kiemtraTienRut(float tienCanRut)
    {
        
        if(Observer.kiemTraSoDu(tienCanRut))
            return true;
        return false;
    }
    
    public void rutTien(float tienCanRut)
    {
        if(kiemtraTienRut(tienCanRut)){
            Observer.nhanThongBao(tienCanRut, "Đã rút tiền thành cong");
        }
        else
            Observer.nhanThongBao(0, "Không thể rút tiền");
    }
    
    public static interface TaiKhoan_GiaoDich
    {
        public  boolean kiemTraSoDu(float TienRut);
        public void nhanThongBao(float soTienRut, String thongbao);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GioHang 
{
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> danhsachHH = new ArrayList<>();
    
    public IThanhToan getHinhThucTT()
    {
        return hinhThucTT;
    }

        public void setHinhThucTT(IThanhToan hinhThucTT)
    {
        this.hinhThucTT = hinhThucTT;
    }
        
    public ArrayList<HangHoa> getDanhsachHH() {
        return danhsachHH;
    }

    public void setDanhsachHH(ArrayList<HangHoa> danhsachHH) {
        this.danhsachHH = danhsachHH;
    }
    
    
    public double thanhToan()
    {
        int tongTien = 0;
        for (int i=0; i<danhsachHH.size(); i++)
        {
            tongTien += danhsachHH.get(i).getGia();
        }
        return hinhThucTT.thanhToan(tongTien);
    }
}

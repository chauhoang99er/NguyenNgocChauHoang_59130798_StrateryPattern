/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class QLSV 
{
    ArrayList<SinhVien> dssv = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;
    

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void Sapxep()
    { 
         Collections.sort(dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                 return soSanh.soSanh(sv1, sv2);
            }
        });
    }  
    
    public void inDS()
    {
        for (SinhVien sVien : dssv)
        {
            System.out.println(sVien + "\n");
        }
    }
}

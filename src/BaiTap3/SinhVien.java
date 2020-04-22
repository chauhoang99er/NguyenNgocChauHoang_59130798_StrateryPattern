/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class SinhVien 
{
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;
    
    //Gọi hàm định dạng ngày tháng
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public SinhVien(String hoTen, String ngaysinh, float diemTB)
    {   
        //Chuyển đổi Date thành String
        this.hoTen = hoTen;
        Date birthday = null;
        try{
        birthday = sdf.parse(ngaysinh);}
        catch (ParseException ex){}
        
        this.ngaySinh = birthday;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    @Override
    public String toString()
    {   
        //Chuyển đổi String thành Date
        String ngaysinh;
        ngaysinh = sdf.format(ngaySinh);
        
        return "Họ Tên SV: " + hoTen + "\n" +
                "Ngày Sinh: " + ngaysinh + "\n" +
                "Điểm Trung Bình: " + diemTB;
    }
}

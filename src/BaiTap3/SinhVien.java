/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Admin
 */
public class SinhVien 
{
    private String hoTen;
    private String ngaySinh; //Em chưa tim hiểu cách sử dụng Date
    private float diemTB;
    
    public SinhVien(String hoTen, String ngaySinh, float diemTB)
    {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
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
        return "Họ Tên SV: " + hoTen + "\n" +
                "Ngày Sinh: " + ngaySinh + "\n" +
                "Điểm Trung Bình: " + diemTB;
    }
}

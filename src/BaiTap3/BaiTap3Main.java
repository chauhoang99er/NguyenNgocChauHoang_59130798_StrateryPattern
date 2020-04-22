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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        QLSV qlsv = new QLSV();
        qlsv.dssv.add(new SinhVien("Nguyễn Ngọc Châu Hoàng", "04/03/1999", 7));
        qlsv.dssv.add(new SinhVien("Phùng Bá Duy", "06/09/1999", 8));
        qlsv.dssv.add(new SinhVien("Vũ Ngọc Đoàn", "09/06/1999", 6));
        
        System.out.println("=============Sắp Xếp Theo Tên Sinh Viên=============");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.Sapxep();
        qlsv.inDS();
        
        System.out.println("=============Sắp Xếp Theo Điểm TB Sinh Viên=============");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.Sapxep();
        qlsv.inDS();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Admin
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        GioHang giohang1 = new GioHang();
        giohang1.danhsachHH.add(new HangHoa("Bánh Su", 5000, "Bán tại Phạm Tu"));
        giohang1.setHinhThucTT(new ThanhToanOnline());
        System.out.println("=========Thanh Toán Online=========\n");
        System.out.println(giohang1.danhsachHH.toString()+"Số tiền phải trả: "+giohang1.thanhToan()+"\n");
        
        GioHang giohang2 = new GioHang();
        giohang2.danhsachHH.add(new HangHoa("Sữa Dê", 3000000, "Bán tại Cồn Dê"));
        giohang2.setHinhThucTT(new ThanhToanCOD());
        System.out.println("=========Thanh Toán COD=========\n");
        System.out.println(giohang2.danhsachHH.toString()+"Số tiền phải trả: "+giohang2.thanhToan()+"\n");
        
    }
    
}

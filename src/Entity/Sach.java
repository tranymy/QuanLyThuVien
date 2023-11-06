/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author baomt
 */
public class Sach {

    private String MaSACH;
    private String TenSACH;
    private String TacGIA;
    private String NXB;
    private String THELOAI;
    private String MOTA;

    public Sach() {
    }

    public Sach(String MaSACH, String TenSACH, String TacGIA, String NXB, String THELOAI, String MOTA) {
        this.MaSACH = MaSACH;
        this.TenSACH = TenSACH;
        this.TacGIA = TacGIA;
        this.NXB = NXB;
        this.THELOAI = THELOAI;
        this.MOTA = MOTA;
    }

    public String getMaSACH() {
        return MaSACH;
    }

    public void setMaSACH(String MaSACH) {
        this.MaSACH = MaSACH;
    }

    public String getTenSACH() {
        return TenSACH;
    }

    public void setTenSACH(String TenSACH) {
        this.TenSACH = TenSACH;
    }

    public String getTacGIA() {
        return TacGIA;
    }

    public void setTacGIA(String TacGIA) {
        this.TacGIA = TacGIA;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getTHELOAI() {
        return THELOAI;
    }

    public void setTHELOAI(String THELOAI) {
        this.THELOAI = THELOAI;
    }

    public String getMOTA() {
        return MOTA;
    }

    public void setMOTA(String MOTA) {
        this.MOTA = MOTA;
    }

}

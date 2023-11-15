/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author baomt
 */
public class PhieuMuon {

    private String MaPM;
    private String NGAYTAO;
    private String NGAYTRA;
    private boolean TRANGTHAI;
    private String MaNV;
    private String MaDG;
    private String MaSACH;

    public PhieuMuon() {
    }

    public PhieuMuon(String MaPM, String NGAYTAO, String NGAYTRA, boolean TRANGTHAI, String MaNV, String MaDG, String MaSACH) {
        this.MaPM = MaPM;
        this.NGAYTAO = NGAYTAO;
        this.NGAYTRA = NGAYTRA;
        this.TRANGTHAI = TRANGTHAI;
        this.MaNV = MaNV;
        this.MaDG = MaDG;
        this.MaSACH = MaSACH;
    }

    public String getMaPM() {
        return MaPM;
    }

    public void setMaPM(String MaPM) {
        this.MaPM = MaPM;
    }

    public String getNGAYTAO() {
        return NGAYTAO;
    }

    public void setNGAYTAO(String NGAYTAO) {
        this.NGAYTAO = NGAYTAO;
    }

    public String getNGAYTRA() {
        return NGAYTRA;
    }

    public void setNGAYTRA(String NGAYTRA) {
        this.NGAYTRA = NGAYTRA;
    }

    public boolean isTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setTRANGTHAI(boolean TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaDG() {
        return MaDG;
    }

    public void setMaDG(String MaDG) {
        this.MaDG = MaDG;
    }

    public String getMaSACH() {
        return MaSACH;
    }

    public void setMaSACH(String MaSACH) {
        this.MaSACH = MaSACH;
    }

    
}

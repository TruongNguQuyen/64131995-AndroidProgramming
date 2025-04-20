package tnq.tiil.edu.listview_danhsachcacquocgia_upgrade;

public class Country {
    // Du lieu
    String tenQG;
    int danSo;
    String tenFile;
    String moTa; // Thêm trường mô tả

    // Contructor

    public Country(String tenQG, int danSo, String tenFile, String moTa) {
        this.tenQG = tenQG;
        this.danSo = danSo;
        this.tenFile = tenFile;
        this.moTa = moTa;
    }

    // Cac ham get/set
    public String getTenQG() {
        return tenQG;
    }

    public void setTenQG(String tenQG) {
        this.tenQG = tenQG;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public String getTenFile() {
        return tenFile;
    }

    public void setTenFile(String tenFile) {
        this.tenFile = tenFile;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}

public class SanPham {
// Định nghĩa các thuộc tính
int maSP;
String tenSP;
String loaisP;
String anhSP;
public SanPham() {
	super();
}
public SanPham(int maSP, String tenSP, String loaisP, String anhSP) {
	super();
	this.maSP = maSP;
	this.tenSP = tenSP;
	this.loaisP = loaisP;
	this.anhSP = anhSP;
}
public int getMaSP() {
	return maSP;
}
public void setMaSP(int maSP) {
	this.maSP = maSP;
}
public String getTenSP() {
	return tenSP;
}
public void setTenSP(String tenSP) {
	this.tenSP = tenSP;
}
public String getLoaisP() {
	return loaisP;
}
public void setLoaisP(String loaisP) {
	this.loaisP = loaisP;
}
public String getAnhSP() {
	return anhSP;
}
public void setAnhSP(String anhSP) {
	this.anhSP = anhSP;
}
@Override
public String toString() {
	return "[Mã SP=" + maSP + ", Tên SP=" + tenSP + ", Loại SP=" + loaisP + ", Ảnh SP=" + anhSP + "]";
} //tên file ảnh


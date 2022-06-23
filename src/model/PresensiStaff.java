
package model;

public class PresensiStaff implements ConstantStatusKehadiran {

    private String tanggal;
    private int status;
    private String jam;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getStatusMeaning(int status) {
        String statusMeaning = "";
        switch (status) {
            case 0:
                statusMeaning = "Alpha";
                break;
            case 1:
                statusMeaning = "Hadir";
                break;
            default:
                throw new AssertionError();
        }
        return statusMeaning;
    }

    @Override
    public String toString() {
        String print = "\nTanggal: " + tanggal + " | Status: " + getStatusMeaning(this.status) + "\n";
        return print;
    }
}

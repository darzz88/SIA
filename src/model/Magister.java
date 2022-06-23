
package model;

import java.util.ArrayList;

public class Magister extends Mahasiswa {

    public ArrayList<MatkulAmbil> arrMatkulDiambil = new ArrayList<>();
    private String judulPenelitianTesis;

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}

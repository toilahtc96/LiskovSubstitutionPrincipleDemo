/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.lang.Exception;

/**
 *
 * @author os_conght
 */
public class ForeignStudent extends Student  {

    private int IELTS_mark;
    private String Visa;

    // do something 
    public int runForSecretary() throws Exception {
        throw new Exception();
    }

    public double payTuitionFee() {
        return STANDARD_FEE * 1.3;
    }

    public boolean isQualifyForEnglish() {
        return this.getIELTS_mark() > 8.0;
    }

    public int getIELTS_mark() {
        return IELTS_mark;
    }

    public void setIELTS_mark(int IELTS_mark) {
        this.IELTS_mark = IELTS_mark;
    }

    public String getVisa() {
        return Visa;
    }

    public void setVisa(String Visa) {
        this.Visa = Visa;
    }

   
}

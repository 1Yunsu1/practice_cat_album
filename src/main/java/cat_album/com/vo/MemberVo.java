package cat_album.com.vo;

import java.util.*;

public class MemberVo {
	private int NUMBER; 
	private String NAME; 
	private String EMAIL; 
	private String ID; 
	private String PASSWORD;
	private String GENDER;	
	private Date BIRTH; 
	private String ADDRESS; 
	private String STATE;
	private String GRADE;
	
	
	@Override
	public String toString() {
		return "MemberVo [NUMBER=" + NUMBER + ", NAME=" + NAME + ", EMAIL=" + EMAIL + ", ID=" + ID + ", PASSWORD="
				+ PASSWORD + ", GENDER=" + GENDER + ", BIRTH=" + BIRTH + ", ADDRESS=" + ADDRESS + ", STATE=" + STATE
				+ ", GRADE=" + GRADE + "]";
	}
	
	public String getGRADE() {
		return GRADE;
	}
	public void setGRADE(String gRADE) {
		GRADE = gRADE;
	}
	public int getNUMBER() {
		return NUMBER;
	}
	public void setNUMBER(int nUMBER) {
		NUMBER = nUMBER;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public Date getBIRTH() {
		return BIRTH;
	}
	public void setBIRTH(Date bIRTH) {
		BIRTH = bIRTH;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	
	
	
	
}

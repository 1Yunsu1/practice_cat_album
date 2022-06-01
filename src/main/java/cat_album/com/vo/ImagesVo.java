package cat_album.com.vo;

import java.sql.Date;

//ID, CAT_NAME, IMAGE_NAME, REG_TIME
public class ImagesVo {
	private String ID;
	private String CAT_NAME;
	private String IMAGE_NAME;
	private Date REG_TIME;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCAT_NAME() {
		return CAT_NAME;
	}
	public void setCAT_NAME(String cAT_NAME) {
		CAT_NAME = cAT_NAME;
	}
	public String getIMAGE_NAME() {
		return IMAGE_NAME;
	}
	public void setIMAGE_NAME(String iMAGE_NAME) {
		IMAGE_NAME = iMAGE_NAME;
	}
	public Date getREG_TIME() {
		return REG_TIME;
	}
	public void setREG_TIME(Date rEG_TIME) {
		REG_TIME = rEG_TIME;
	}
	
	
}

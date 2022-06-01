package cat_album.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import cat_album.com.vo.MemberVo;
import cat_album.com.dao.*;

public class MemberDao implements MemberDaoAble {
	private String mysql_list = "select * from member";
	private String mysql_datail = "select * from member where NUMBER = ?";
	private String mysql_datail_ID = "select * from member where ID = ?";
	private String mysql_create = "INSERT INTO member (NAME, EMAIL, ID, PASSWORD, GENDER,	BIRTH, ADDRESS, STATE )"
								+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	private String mysql_update = "UPDATE member "
			+ "SET NAME = ?, EMAIL = ?, ID = ?,  PASSWORD = ?,  GENDER = ?,  BIRTH = ?,  ADDRESS = ?"
			+ "WHERE NUMBER = ?";
	private String mysql_delete = "DELETE FROM member WHERE NUMBER = ?";
	private String mysql_mem_checker = "select * from member where ID = ? and  password = ?";
	private String mysql_email_checker = "select * from member where EMAIL = ?";
	private String mysql_id_checker = "select * from member where ID = ?";

	@Override
	public List<MemberVo> list() throws SQLException, ClassNotFoundException {
		List<MemberVo> list = new ArrayList<MemberVo>();
		Connection conn = CatAlbumConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(mysql_list);
		ResultSet rs = ps.executeQuery();
		
		// NUMBER NAME EMAIL ID PASSWORD GENDER	BIRTH ADDRESS STATE 
		while(rs.next()) {
			MemberVo mem = new MemberVo();
			mem.setNUMBER(rs.getInt("NUMBER"));
			mem.setNAME(rs.getString("NAME"));
			mem.setEMAIL(rs.getString("EMAIL"));
			mem.setID(rs.getString("ID"));
			mem.setPASSWORD(rs.getString("PASSWORD"));
			mem.setGENDER(rs.getString("GENDER"));
			mem.setBIRTH(rs.getDate("BIRTH"));
			mem.setADDRESS(rs.getString("ADDRESS"));
			mem.setSTATE(rs.getString("STATE"));
			mem.setGRADE(rs.getString("GRADE"));
			list.add(mem);
		}
		
		return list;
	}
	
	@Override
	public MemberVo detail(int number) throws SQLException, ClassNotFoundException {
		Connection conn = CatAlbumConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(mysql_datail);
		ps.setInt(1, number);
		ResultSet rs = ps.executeQuery();
		MemberVo mem = new MemberVo(); 
		
		while(rs.next()) {
			mem.setNUMBER(rs.getInt("NUMBER"));
			mem.setNAME(rs.getString("NAME"));
			mem.setEMAIL(rs.getString("EMAIL"));
			mem.setID(rs.getString("ID"));
			mem.setPASSWORD(rs.getString("PASSWORD"));
			mem.setGENDER(rs.getString("GENDER"));
			mem.setBIRTH(rs.getDate("BIRTH"));
			mem.setADDRESS(rs.getString("ADDRESS"));
			mem.setSTATE(rs.getString("STATE"));
			mem.setGRADE(rs.getString("GRADE"));
		}
		
		System.out.println(mem.getEMAIL());
		return mem;
	}
	
	@Override
	public MemberVo detail(String ID) throws SQLException, ClassNotFoundException {
		Connection conn = CatAlbumConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(mysql_datail_ID);
		ps.setString(1, ID);
		ResultSet rs = ps.executeQuery();
		MemberVo mem = new MemberVo(); 
		
		while(rs.next()) {
			mem.setNUMBER(rs.getInt("NUMBER"));
			mem.setNAME(rs.getString("NAME"));
			mem.setEMAIL(rs.getString("EMAIL"));
			mem.setID(rs.getString("ID"));
			mem.setPASSWORD(rs.getString("PASSWORD"));
			mem.setGENDER(rs.getString("GENDER"));
			mem.setBIRTH(rs.getDate("BIRTH"));
			mem.setADDRESS(rs.getString("ADDRESS"));
			mem.setSTATE(rs.getString("STATE"));
			mem.setGRADE(rs.getString("GRADE"));
		}
		
		System.out.println(mem.getEMAIL());
		return mem;
	}
	
//	(NAME, EMAIL, ID, PASSWORD, GENDER,	BIRTH, ADDRESS, STATE )
	@Override
	public boolean create(MemberVo mem) throws SQLException, ClassNotFoundException {
		Connection conn = CatAlbumConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(mysql_create);
		ps.setString(1, mem.getNAME());
		ps.setString(2, mem.getEMAIL());
		ps.setString(3, mem.getID());
		ps.setString(4, mem.getPASSWORD());
		ps.setString(5, mem.getGENDER());
		ps.setString(6, new SimpleDateFormat("yyyy-mm-DD").format(mem.getBIRTH()));
		ps.setString(7, mem.getADDRESS());
		ps.setString(8, mem.getSTATE());
		
		int create = ps.executeUpdate();
		System.out.println("create : " + create);
		if(create > 0 ) {
			return true;
		}
		else {
			return false;			
		}
	}
	
	@Override
	public boolean update(MemberVo mem) throws SQLException, ClassNotFoundException {
		Connection conn = CatAlbumConnection.getConnection();
		/*
		 * UPDATE member "
			+ "SET NAME = ?, EMAIL = ?, ID = ?,  PASSWORD = ?,  GENDER = ?,  BIRTH = ?,  ADDRESS = ?"
			+ "WHERE NUMBER = ?
		 */
		PreparedStatement ps = conn.prepareStatement(mysql_update);
		ps.setString(1, mem.getNAME());
		ps.setString(2, mem.getEMAIL());
		ps.setString(3, mem.getID());
		ps.setString(4, mem.getPASSWORD());
		ps.setString(5, mem.getGENDER());
		ps.setString(6, new SimpleDateFormat("yyyy-mm-DD").format(mem.getBIRTH()));
		ps.setString(7, mem.getADDRESS());
		ps.setInt(8, mem.getNUMBER());
		
		int update = ps.executeUpdate();
		
		if(update > 0) {			
			return true;
		}
		else {			
			return false;
		}
	}
	
	@Override
	public boolean delete(int number) throws SQLException, ClassNotFoundException {
		Connection conn = CatAlbumConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(mysql_delete);
		ps.setInt(1, number);
		
		int delete = ps.executeUpdate();
		
		if(delete>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public boolean mem_checker(String ID, String PASSWORD) throws SQLException, ClassNotFoundException {
		Connection conn = CatAlbumConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(mysql_mem_checker);
		ps.setString(1, ID);
		ps.setString(2, PASSWORD);
		ResultSet rs = ps.executeQuery();
		System.out.println("rs = "+ (rs==null));
		if(rs.next()) {
			return true;			
		}
		else {
			return false;
		}
		
	}
	
	@Override
	public boolean email_checker(String EMAIL) throws SQLException, ClassNotFoundException {
		Connection conn = CatAlbumConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(mysql_email_checker);
		ps.setString(1, EMAIL);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			return true;			
		}
		else {
			return false;
		}
	}
	
	@Override
	public boolean id_checker(String ID) throws SQLException, ClassNotFoundException {
		Connection conn = CatAlbumConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(mysql_id_checker);
		ps.setString(1, ID);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			return true;			
		}
		else {
			return false;
		}
	}

}

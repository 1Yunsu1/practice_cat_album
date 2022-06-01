package cat_album.com.dao;

import java.sql.SQLException;
import java.util.*;
import cat_album.com.vo.*;

public interface MemberDaoAble {
	public abstract List<MemberVo> list()throws SQLException, ClassNotFoundException;
	public abstract MemberVo detail(int number) throws SQLException, ClassNotFoundException;
	public abstract MemberVo detail(String ID) throws SQLException, ClassNotFoundException;
	public abstract boolean create(MemberVo mem)throws SQLException, ClassNotFoundException;
	public abstract boolean update(MemberVo mem)throws SQLException, ClassNotFoundException;
	public abstract boolean delete(int number) throws SQLException, ClassNotFoundException;
	public abstract boolean mem_checker(String ID, String PASSWORD) throws SQLException, ClassNotFoundException;
	public abstract boolean email_checker(String EMAIL) throws SQLException, ClassNotFoundException;
	public abstract boolean id_checker(String ID) throws SQLException, ClassNotFoundException;
}

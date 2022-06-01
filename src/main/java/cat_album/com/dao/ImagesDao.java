package cat_album.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cat_album.com.vo.ImagesVo;

public class ImagesDao implements ImagesDaoAble {
	private String mysql_list = "select * from image where ID = ?";
	
//	ID, CAT_NAME, IMAGE_NAME, REG_TIME
	@Override
	public List<ImagesVo> ImageList(String ID) throws SQLException, ClassNotFoundException {
		Connection conn = CatAlbumConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(mysql_list);
		ps.setString(1, ID);
		ResultSet rs = ps.executeQuery();
		List<ImagesVo> I_list = new ArrayList<ImagesVo>();
		
		while(rs.next()) {
			ImagesVo image = new ImagesVo();
			image.setID(rs.getString("ID"));
			image.setCAT_NAME(rs.getString("CAT_NAME"));
			image.setIMAGE_NAME(rs.getString("IMAGE_NAME"));
			image.setREG_TIME(rs.getDate("REG_TIME"));
			I_list.add(image);
		}
		
		
		return I_list;
	}
	
}

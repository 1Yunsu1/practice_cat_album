package cat_album.com.dao;

import java.sql.SQLException;
import java.util.List;

import cat_album.com.vo.ImagesVo;

public interface ImagesDaoAble {
	public abstract List<ImagesVo> ImageList(String ID) throws SQLException, ClassNotFoundException;
}

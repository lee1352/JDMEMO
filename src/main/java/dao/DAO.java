package dao;

import java.util.List;

import vo.ICloudVO;

public interface DAO {
	List<ICloudVO> list();

	ICloudVO select(int memoNum);

	int insert(String title, String content);

	int update(int memoNum, String title, String content);

	int delete(int memoNum);

}

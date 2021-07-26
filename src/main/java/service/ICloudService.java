package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DAO;
import vo.ICloudVO;

@Service
public class ICloudService {

	@Autowired
	DAO dao;

	public List<ICloudVO> list() {

		return dao.list();
	}

	public ICloudVO select(int memoNum) {

		return dao.select(memoNum);
	}

	public int insert(String title, String content) {

		return dao.insert(title, content);
	}

	public int update(int memoNum, String title, String content) {

		return dao.update(memoNum, title, content);
	}

	public int delete(int memoNum) {

		return dao.delete(memoNum);
	}

}

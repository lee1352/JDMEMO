package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import vo.ICloudVO;

@Repository
public class ICloudDAO {
	@Autowired
	DriverManagerDataSource ds;
	
	ICloudVO vo;
	
	String sql="";
	int result=0;
	
	PreparedStatement pstmt=null;
	ResultSet rs=null;
		
	public List<ICloudVO> list() {
		List<ICloudVO> list=new ArrayList<ICloudVO>();
		
		sql="select * from jsmemo order by memoNum desc";
		try {
		pstmt=ds.getConnection().prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			vo=new ICloudVO();
			vo.setMemoNum(rs.getInt(1));
			vo.setTitle(rs.getString(2));
			vo.setContent(rs.getString(3));
			vo.setWriteDay(rs.getDate(4));
			list.add(vo);
		}
		rs.close();
		pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public ICloudVO select(int memoNum) {
		sql="select * from jsmemo where memoNum="+memoNum;
		try {
		pstmt=ds.getConnection().prepareStatement(sql);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			vo=new ICloudVO();
			vo.setMemoNum(rs.getInt(1));
			vo.setTitle(rs.getString(2));
			vo.setContent(rs.getString(3));
			vo.setWriteDay(rs.getDate(4));
		}
//		rs.close();
//		pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	public int insert(String title, String content) {
		sql="insert into jsmemo values(jsmemo_memoNum_seq.nextval, ?, ?, sysdate)";
		try {
		pstmt=ds.getConnection().prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		result=pstmt.executeUpdate();
		pstmt.close();
		return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(int memoNum, String title, String content) {
		sql="update jsmemo set title=?, content=? where memoNum=?";
		try {
		pstmt=ds.getConnection().prepareStatement(sql);
		pstmt.setInt(3, memoNum);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		result=pstmt.executeUpdate();
		pstmt.close();
		return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int delete(int memoNum) {
		sql="delete from jsmemo where memoNum="+memoNum;
		try {
		pstmt=ds.getConnection().prepareStatement(sql);
		result=pstmt.executeUpdate();
		pstmt.close();
		return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}	
}


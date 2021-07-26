package vo;

import java.sql.Date;

import org.springframework.stereotype.Repository;

@Repository
public class ICloudVO {
	int memoNum;
	String title;
	String content;
	Date writeDay;

	public ICloudVO() {
		// TODO Auto-generated constructor stub
	}

	public ICloudVO(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public int getMemoNum() {
		return memoNum;
	}

	public void setMemoNum(int memoNum) {
		this.memoNum = memoNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWriteDay() {
		return writeDay;
	}

	public void setWriteDay(Date writeDay) {
		this.writeDay = writeDay;
	}

	@Override
	public String toString() {
		return "ICloudVO [memoNum=" + memoNum + ", title=" + title + ", content=" + content + ", writeDay=" + writeDay
				+ "]";
	}

}

package pojo;

public class Tag {
	int tagID;	//int	标签ID	自增主键
	String tagContent;	//Nvarchar(50)	标签内容	非空
	public int getTagID() {
		return tagID;
	}
	public void setTagID(int tagID) {
		this.tagID = tagID;
	}
	public String getTagContent() {
		return tagContent;
	}
	public void setTagContent(String tagContent) {
		this.tagContent = tagContent;
	}
	
}

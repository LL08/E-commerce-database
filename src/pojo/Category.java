package pojo;

import dao.TableDao;

public class Category{
	int ID;//	int	��Ʒ����id
	String categoryName;//	Nvarchar(50)	��������
	int parentID;//	int	��һ������ID
	public int getID() {
		return ID;
	}
	public void setID(int id) {
		ID = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getParentID() {
		return parentID;
	}
	public void setParentID(int parentID) {
		this.parentID = parentID;
	}
	
	
}

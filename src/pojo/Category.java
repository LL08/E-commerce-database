package pojo;

import dao.TableDao;

public class Category{
	int ID;//	int	商品种类id
	String categoryName;//	Nvarchar(50)	种类名称
	int parentID;//	int	上一级种类ID
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

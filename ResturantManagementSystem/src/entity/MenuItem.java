package entity;

public class MenuItem {
static int id=100;
String itemId;
String itemName;
int price;
public MenuItem(String itemId, String itemName, int price) {
	this.itemId = "id "+ ++id;
	this.itemName = itemName;
	this.price = price;
}
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}

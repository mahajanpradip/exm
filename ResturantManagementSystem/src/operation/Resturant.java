package operation;

import java.util.HashMap;

import entity.CustomerOrders;
import entity.MenuItem;

public class Resturant {
HashMap<String ,MenuItem> menucard; 
HashMap<String ,CustomerOrders> orders;
int tprice;
 public Resturant() {
	 this.menucard=new HashMap<>();
	 this.orders=new HashMap<>();
 }
 public void OrderItem(MenuItem item) {
	  menucard.put(item.getItemId(), item);
	  System.out.println("item added");
 }
 public void removeItem(String itemid) {
	 MenuItem m=menucard.get(itemid);
	 if(menucard.containsValue(m)) {
	 menucard.remove(m);
	 System.out.println("item removed..");
	 }
 }
 public void updateItem(MenuItem id) {
	 menucard.put(id.getItemId(),id);
 }
 public void  displaymenu() {
	 for(MenuItem menu:menucard.values()) {
		 System.out.println("item id is =>>  "+ menu.getItemId()+
				 "    item name =>> "+menu.getItemName()+"    price of item =>> "+menu.getPrice());
		 
	 }
 }
 public void getOrder(CustomerOrders ord,MenuItem item) {
	 if(menucard.containsKey(item)) {
		 orders.put(item.getItemId(), ord);
		 System.out.println("Order is confurmed..");
	 }
 }
 
}

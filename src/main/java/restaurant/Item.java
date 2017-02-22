package restaurant;

public class Item
{
	private int id;
	private String item_name;
	private int rate;
	
	//Getter Item
	public String getItem() 
	{
		return item_name;
	}
	
	//Setter Item
	public void setItem(String item_name) 
	{
		this.item_name = item_name;
	}
	
	//Getter Rate
	public int getRate() 
	{
		return rate;
	}
	
	//Setter Rate
	public void setRate(int rate) 
	{
		this.rate = rate;
	}
	//Getter id
	public int getId() {
		return id;
	}
	//Setter ID
	public void setId(int id) {
		this.id = id;
	}
	
}

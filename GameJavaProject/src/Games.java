
public class Games {

	private int gameId;
	private String name;
	private int price;
	
	public Games(int gameId,String name,int price) {
		this.gameId=gameId;
		this.name=name;
		this.price=price;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

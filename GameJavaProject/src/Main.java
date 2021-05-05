
public class Main {

	public static void main(String[] args) {
		Gamer gamer1=new Gamer(1,"begüm","ünal",2001,"111111");
		
		GamerManager gamerManager=new GamerManager();
		gamerManager.add(gamer1);
		
		Games game1=new Games(5, "oyun1", 100);
		

	}

}

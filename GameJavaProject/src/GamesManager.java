
public class GamesManager implements IGamesService{

	@Override
	public void kampanya(Gamer gamer, Games game) {
		int k=0;
		if(gamer.getDateOfBirh()>2000) {
			k=(game.getPrice()*(50/100));
			System.out.println(gamer+" adýna yapýlan kampanya tutarý: "+k);
		}
		else {
			System.out.println("kampanya yok.");
		}
	}

}

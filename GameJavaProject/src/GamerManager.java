
public class GamerManager implements IGamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("sisteme eklendi: "+ gamer.getId());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("bilgileriniz g�ncellendi: "+ gamer.getId());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("kayd�n�z silindi.");
		
	}

	
}

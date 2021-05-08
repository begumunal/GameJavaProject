package core.concretes;

import core.abstracts.IValidatorService;
import eticaretJavaProject.entities.concretes.Product;

public class ValidatorManager implements IValidatorService{

	@Override
	public void sendVerifyMail(Product product) {
		
		System.out.println(product.getEmail()+" adresinden e-postanýzý doðrulayýnýz.");
	}

	@Override
	public boolean checkUserVerified(Product product) {
		
		return false;
	}

}

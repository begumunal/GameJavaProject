package core.abstracts;

import eticaretJavaProject.entities.concretes.Product;

public interface IValidatorService {

	void sendVerifyMail(Product peoduct);
	boolean checkUserVerified(Product product);
}

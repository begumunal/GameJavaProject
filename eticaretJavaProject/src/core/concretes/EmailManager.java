package core.concretes;

import java.util.regex.Pattern;

import core.abstracts.IEmailService;
import core.abstracts.IValidatorService;
import eticaretJavaProject.entities.concretes.Product;

public class EmailManager implements IEmailService{
	
	private String emailPattern =   "^[a-z0-9._]+@[a-z0-9]+.(com|org|net|edu|gov|mil|biz|info|mobi)$";

	@Override
	public boolean isValid(Product product) {
		Pattern pattern = Pattern.compile(emailPattern);
		return pattern.matcher(product.getEmail()).find();
	}

	

}

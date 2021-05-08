package core.adapters;

import JGoogleRegister.JGoogleRegisterManager;
import business.abstracts.IProductValidatorService;
import eticaretJavaProject.entities.concretes.Product;

public class GoogleValidationService implements IProductValidatorService{
	
private JGoogleRegisterManager jgoogleRegisterManager;
	
	public GoogleValidationService(JGoogleRegisterManager jgoogleRegisterManager) {
		this.jgoogleRegisterManager = jgoogleRegisterManager;
	}

	@Override
	public boolean validateUser(Product product) {
		return jgoogleRegisterManager.registerGoogleAccount();
	}

}

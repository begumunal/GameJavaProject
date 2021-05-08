package business.concretes;

import business.abstracts.IProductService;
import core.abstracts.IEmailService;
import core.abstracts.IValidatorService;
import dataAccess.abstracts.IProductDao;
import eticaretJavaProject.entities.concretes.Product;

public class ProductManager implements IProductService {
	
	private IEmailService emailService;
	private IValidatorService validatorService;
	private IProductDao productDao;
	
	
	public ProductManager(IEmailService emailService, IValidatorService validatorService, IProductDao productDao) {
		super();
		this.emailService = emailService;
		this.validatorService = validatorService;
		this.productDao = productDao;
	}

	@Override
	public void register(Product product) {
		
		if(!emailService.isValid(product)) {
			System.out.println("hesap olu�turulamad�");
		}else {
			validatorService.sendVerifyMail(product);
			
			if(validatorService.checkUserVerified(product)){
				System.out.println("email adresiniz do�ruland�");
				System.out.println("hesab�n�z olu�turuldu say�n "+product.getFirstName()+" "+product.getLastName());
				productDao.addProduct(product);
			} else {
				System.out.println("email adresiniz do�rulanamad�. hesab�n�z olu�turulamad�");
			}
		}
		
		
	}

	@Override
	public void login(Product product) {
		if(productDao.checkUserAuth(product)==true) {
			System.out.println("ho�geldiniz ");
		}else {
			System.out.println("hatal� email");
		}
		
	}

}

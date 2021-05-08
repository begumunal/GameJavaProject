package business.concretes;

import business.abstracts.IProductValidatorService;
import core.abstracts.IEmailService;
import dataAccess.abstracts.IProductDao;
import eticaretJavaProject.entities.concretes.Product;

public class ProductValidatorManager implements IProductValidatorService{

	private IEmailService emailService;
	private IProductDao productDao;
	
	
	public ProductValidatorManager(IEmailService emailService, IProductDao productDao) {
		super();
		this.emailService = emailService;
		this.productDao = productDao;
	}


	@Override
	public boolean validateUser(Product product) {
boolean result=true;
		
		if(product.getFirstName().length()<2) {
			System.out.println("en az iki karakter giriniz");
			result=false;
		}
		
		if(product.getLastName().length()<2) {
			System.out.println("en az iki karakter giriniz");
			result=false;
		}
			
		if(product.getPassword().length()<6) {
			System.out.println("�ifre en az alt� karakter olmal�d�r");
			result=false;
		}
		
		if(!emailService.isValid(product)) {
			System.out.println("hatal� email");
			result=false;
		}
		
		if(!productDao.checkMail(product)) {
			System.out.println("bu mail adresi daha �nce kullan�lm��");
			result=false;
		}
		
		
		return result;
	}

}

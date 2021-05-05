
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroCustomerManager();
		customerManager.Save(new Customer(1,"Begüm","Ünal",2001,"111111"));

	}

}

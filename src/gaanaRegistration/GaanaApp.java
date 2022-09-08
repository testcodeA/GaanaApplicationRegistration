package gaanaRegistration;

public class GaanaApp {
	String name;
	int amount;
	long phoneNo;

	GaanaApp(){
		System.out.println("Free user without Registration");
	}
	GaanaApp(String name){
		System.out.println("User Registered with name");
		System.out.println("User Name: "+name);
	}
	GaanaApp(String name, long phoneNo){
		System.out.println("User Registered with name and phone number: ");
        System.out.println("User Name: "+name);
        System.out.println("User Phone Number: "+phoneNo);

	}
	GaanaApp(String  name, long phoneNo,int amount){
		System.out.println("Premium subscription user: ");
		System.out.println("User Name: "+name);
		System.out.println("Amount Paid by User: "+amount);
		System.out.println("User Phone Number: "+phoneNo);
		
	}
}

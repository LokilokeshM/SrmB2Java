package Day22;

import java.util.ArrayList;
import java.util.List;

public class CommonFunctions {

	public List<EBCustomer> addEbCustomers() {
		List<EBCustomer> eb = new ArrayList<EBCustomer>();
		eb.add(new EBCustomer(1234567, "Loki", 45621, 0, "Comercial"));
		eb.add(new EBCustomer(123457, "Loki", 4444, 0, "Domestic"));
		eb.add(new EBCustomer(12456, "Loki", 4152, 0, "Comercial"));
		eb.add(new EBCustomer(1234567, "Loki", 4646, 0, "Comercial"));
		eb.add(new EBCustomer(12356, "Loki", 45621, 0, "Comercial"));
		eb.add(new EBCustomer(124567, "Loki", 45621, 0, "Domestic"));
		eb.add(new EBCustomer(13457, "Loki", 45671, 0, "Comercial"));
		eb.add(new EBCustomer(234567, "Loki", 45921, 0, "Domestic"));
		eb.add(new EBCustomer(12567, "Loki", 45641, 0, "Comercial"));
		eb.add(new EBCustomer(12357, "Loki", 45621, 0, "Domestic"));
		eb.add(new EBCustomer(12367, "Loki", 45621, 0, "Comercial"));
		return eb;
	}

	public EBCustomer CheckTheCustomerInEb(int num) {

		List<EBCustomer> eb = new ArrayList<EBCustomer>();
		eb.addAll(addEbCustomers());
		EBCustomer ebcustomer = null;
		for (EBCustomer e : eb) {
			if (e.getConsumer_no() == num) {
				ebcustomer = e;
			}
			else {
				ebcustomer=null;
			}
		}
		return ebcustomer;
	}

	public boolean checkTypeofConnections(String val) {
		if (val == "Domestic") {
			return true;
		} else {
			return false;
		}
	}

	public void CalforDomestic(int pr, int cr) {	
		int units = cr-pr;
		double billpay = 0;
		if (units < 100) {
			billpay = units * 1;
		} else if (units < 500) {
			billpay = 100 * 1 + (units - 100) * 2.50;
		} else if (units > 500) {
			billpay = 100 * 1.20 + 200 * 2 + (units - 300) * 6;
		}

		System.out.println("Bill to pay : " + billpay);
	}

	public void CalforCommercial(int pr, int cr) {
		int units = cr-pr;
		double billpay = 0;
		if (units < 100) {
			billpay = units * 2;
		} else if (units < 500) {
			billpay = 100 * 1.20 + (units - 100) * 4;
		} else if (units > 500) {
			billpay = 100 * 1.20 + 200 * 2 + (units - 300) * 6;
		}

		System.out.println("Bill to pay : " + billpay);
	}

}

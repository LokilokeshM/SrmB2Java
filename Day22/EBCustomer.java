package Day22;

import java.io.Serializable;

public class EBCustomer implements Serializable{
	public int consumer_no;
	public String consumer_name;
	public int previous_month_reading; 
	public int current_month_reading;
	public String type_of_EBconnection;
	
	public EBCustomer(int consumer_no, String consumer_name, int previous_month_reading, int current_month_reading,
			String type_of_EBconnection) {
		super();
		this.consumer_no = consumer_no;
		this.consumer_name = consumer_name;
		this.previous_month_reading = previous_month_reading;
		this.current_month_reading = current_month_reading;
		this.type_of_EBconnection = type_of_EBconnection;
	}
	public int getConsumer_no() {
		return consumer_no;
	}
	public void setConsumer_no(int consumer_no) {
		this.consumer_no = consumer_no;
	}
	public String getConsumer_name() {
		return consumer_name;
	}
	public void setConsumer_name(String consumer_name) {
		this.consumer_name = consumer_name;
	}
	public int getPrevious_month_reading() {
		return previous_month_reading;
	}
	public void setPrevious_month_reading(int previous_month_reading) {
		this.previous_month_reading = previous_month_reading;
	}
	public int getCurrent_month_reading() {
		return current_month_reading;
	}
	public void setCurrent_month_reading(int current_month_reading) {
		this.current_month_reading = current_month_reading;
	}
	public String getType_of_EBconnection() {
		return type_of_EBconnection;
	}
	public void setType_of_EBconnection(String type_of_EBconnection) {
		this.type_of_EBconnection = type_of_EBconnection;
	}
	
}

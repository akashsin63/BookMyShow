package models;

import lombok.*;

@Getter
@Setter
public class Payment extends Base {
	private String referenceId;
	private double amount;
	private PaymentStatus paymentStatus;
	private PaymentProviders paymentProvider;
	
	
}

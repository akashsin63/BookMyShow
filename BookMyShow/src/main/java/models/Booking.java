package models;

import java.util.*;

import lombok.*;

@Getter
@Setter
public class Booking extends Base{
	private List<ShowSeat> showSeat;
	private User user;
	private Double amount;
	List<Payment> payement;
	private BookingStatus bookingstatus;
}

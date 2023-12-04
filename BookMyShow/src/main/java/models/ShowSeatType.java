package models;

import lombok.*;

@Getter
@Setter
public class ShowSeatType extends Base {
	private Show show;
	private Seat seat;
	private int price;
	
}

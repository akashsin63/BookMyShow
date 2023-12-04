package models;

import lombok.Getter;
import lombok.Setter;

import lombok.*;

@Getter
@Setter
public class Seat extends Base {
	private String number;
	
	private SeatType seattype;
	private int row;
	private int col;
	
}

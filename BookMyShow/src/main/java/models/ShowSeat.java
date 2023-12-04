package models;

import lombok.*;

@Getter
@Setter
public class ShowSeat extends Base {
	private Show show;
	private Seat seat;
	private ShowSeatStatus showSeatStatus;

}

package models;

import java.util.List;

import lombok.*;


@Getter
@Setter
public class User extends Base{

	private String username;
	private String email;
	private List<Booking> bookings;
}

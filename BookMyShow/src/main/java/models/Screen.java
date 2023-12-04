package models;

import java.util.*;

import lombok.Getter;
import lombok.Setter;
import lombok.*;

@Getter
@Setter
public class Screen extends Base{
	private String screenNumber;
	private List<Seat> seats;
	List<Feature> features;

}

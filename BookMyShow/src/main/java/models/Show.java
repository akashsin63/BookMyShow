package models;
import java.util.*;
import java.util.Date;

import lombok.*;

@Getter
@Setter
public class Show extends Base{
	private Movie movie;
	private Date startTime;
	private Date endTime;
	private Screen screen;
	private List<Feature> features;
}

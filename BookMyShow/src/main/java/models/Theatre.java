package models;

import java.util.List;

import lombok.*;

@Getter
@Setter
public class Theatre extends Base {
	private String name;
	private Region region;
	private List<Screen> screen;
	
}

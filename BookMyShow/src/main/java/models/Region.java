package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import lombok.*;

@Getter
@Setter
public class Region extends Base {
	private String name;
	private List<Theatre> theatres; //depends on  access pattern
	
}

package models;

import java.util.Date;

import lombok.*;

@Getter
@Setter
public class Base {
	private long id;
	private Date createdAt;
	private Date modifiedAt;
	
}

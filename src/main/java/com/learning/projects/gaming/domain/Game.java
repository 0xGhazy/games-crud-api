package com.learning.projects.gaming.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="GamesList")
// to exclude all null values from the retrieved documents
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Game {
	@Id
	private String id;
	private String title;
	private String description;
	private String thumbnail;
	private String publisher;
	private String genre;
	private Integer releaseYear;
	private String developer;
	private String gameURL;
	private String platform;

}

package com.example.demo.mb2;

import java.util.*;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("mb2board")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(exclude={"contents"})
@EqualsAndHashCode(exclude={"title","author","rdate","contents","hit","attList"})
public class Board 
{
	private int num;
	private String title;
	private String author;
	private java.sql.Date rdate;
	private String contents;
	private int hit;
	
	private List<Attach> attList;
}


package com.jwtTokenBuild.jwtToken.model;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class JwtRequest {
	
	private String username;
	private String password;

}

package com.ibm.controller.intrfc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/rest")
public interface IRestController {
	
	
	@RequestMapping(value="/getname",method=RequestMethod.GET)
	public ResponseEntity<String> getMyname();

}

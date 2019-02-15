package com.ibm.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.controller.config.abcdConfigRepo;
import com.ibm.controller.intrfc.IRestController;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
public class RestControllerImpl implements IRestController {

	@Value("${my.name}")
	private String myName;
	
	@Autowired
	abcdConfigRepo configRepo;
	
	public ResponseEntity<String> getMyname() {
		log.info(configRepo.getCompany());
		
		return ResponseEntity.status(HttpStatus.OK).body(myName);
	}

}

package edu.kosmo.ex.controller;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.kosmo.ex.service.TxTestService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@AllArgsConstructor
@Controller
public class TxTestController {	 

	
	 @Inject
	 private TxTestService service;
	 /*
	 @GetMapping("/tx/{num}")
	 public void transiotn(@PathVariable("num") int num) throws SQLException {
		 	
			if(num == 1){
				log.info("transionTest1");
				service.transionTest1();
			}else if(num == 2){
				log.info("transionTest2");
				service.transionTest2();
			}else if(num == 3){
				log.info("transionTest3");
				service.transionTest3();
			}else if(num == 4){
				log.info("transionTest4");
				service.transionTest4();
			}else if(num == 5){
				log.info("transionTest5");
				service.transionTest5();
			}else if(num == 6){
				log.info("transionTest6");
				service.transionTest6();
			}else if(num == 7){
				log.info("transionTest7");
				service.transionTest7();
			}			 
		 
	 }	*/ 
}

package org.jhidalgo3.lb.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.jhidalgo3.lb.models.Ping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/ping")
public class PingController {
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Ping> ping() {
		Ping p = null;
		try {
			p = new Ping (InetAddress.getLocalHost().getHostName(), "0.1");
		} catch (UnknownHostException e) {			
			e.printStackTrace();
			new ResponseEntity<>(p, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(p, HttpStatus.OK);
		
		
	}
}

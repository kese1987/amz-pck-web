package com.amz.pickup.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EntryPoint {

	@RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_XHTML_XML_VALUE)
	public String index() {
		return "index.html";
	}
	
}

package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;

@RestController
@RequestMapping(value = "/wizard")
public class WizardRestController {

	@Timed(name = "Wizard Timer", absolute = true)
	@Metered(name = "Wizard Meter", absolute = true)
	@ExceptionMetered(name = "Wizard Exception Meter", absolute = true)
	@RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public Wizard index() {

		Wizard wizard = new Wizard("Hello Wizard");

		return wizard;
	}
}
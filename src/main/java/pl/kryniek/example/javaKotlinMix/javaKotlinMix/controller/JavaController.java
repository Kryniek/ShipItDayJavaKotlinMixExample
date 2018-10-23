package pl.kryniek.example.javaKotlinMix.javaKotlinMix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kryniek.example.javaKotlinMix.javaKotlinMix.model.JavaModel;

import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("api/javas")
public class JavaController {

	@GetMapping
	public JavaModel get() {
		JavaModel model = new JavaModel();
		model.setId(1);
		model.setName("SomeName");
		model.setSurname("SomeSurname");
		model.setSomethingShit(new BigDecimal("123"));
		model.setSomeDate(new Date());

		return model;
	}
}

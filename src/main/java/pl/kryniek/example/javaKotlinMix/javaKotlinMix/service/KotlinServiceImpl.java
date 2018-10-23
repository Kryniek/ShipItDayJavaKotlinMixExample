package pl.kryniek.example.javaKotlinMix.javaKotlinMix.service;

import org.springframework.stereotype.Service;
import pl.kryniek.example.javaKotlinMix.javaKotlinMix.definition.KotlinService;
import pl.kryniek.example.javaKotlinMix.javaKotlinMix.model.KotlinModel;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class KotlinServiceImpl implements KotlinService {
	@Override
	public KotlinModel get() {
		return new KotlinModel(1, "SomeName", "SomeSurname", new BigDecimal("123"), new Date());
	}
}

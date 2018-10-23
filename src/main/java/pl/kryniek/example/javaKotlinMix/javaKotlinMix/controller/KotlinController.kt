package pl.kryniek.example.javaKotlinMix.javaKotlinMix.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.kryniek.example.javaKotlinMix.javaKotlinMix.definition.KotlinService

@RestController
@RequestMapping("api/kotlins")
class KotlinController(
        private val service: KotlinService
) {
    @GetMapping
    fun get() = service.get()
}
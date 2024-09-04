package project.event.io.app

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/api"])
class HealthCheckApi {

    @GetMapping
    fun healthCheck(): ResponseEntity<String> {
        return ResponseEntity.ok("200 OK")
    }

    @GetMapping(path = ["/v2"])
    fun healthCheckV2(): ResponseEntity<String> {
        return ResponseEntity.ok("200 OK")
    }

    @GetMapping(path = ["/v3"])
    fun healthCheckV3(): ResponseEntity<String> {
        return ResponseEntity.ok("200 OK")
    }
}

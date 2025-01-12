package stage.aratus.inventaire_back.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/helloworld")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("hello world", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/toto")
    public ResponseEntity<String> toto() {
        return new ResponseEntity<>("toto", HttpStatus.OK);
    }
}

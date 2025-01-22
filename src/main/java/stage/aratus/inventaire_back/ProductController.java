package stage.aratus.inventaire_back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/Products")
public class ProductController {

@Autowired
private ProductRepository productRepository;

@GetMapping
public List<Product> getAllProducts() {
return productRepository.findAll();
}

@PostMapping
public Product createProduct(@RequestBody Product product) {
return productRepository.save(product);
}
// Autres points de terminaison CRUD (PUT, DELETE) peuvent être ajoutés ici
}
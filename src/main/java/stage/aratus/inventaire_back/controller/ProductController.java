package stage.aratus.inventaire_back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stage.aratus.inventaire_back.entity.Product;
import stage.aratus.inventaire_back.service.ProductService;

//TODO create get method to get products by inventory id
@RestController
@RequestMapping("/api/Products")
public class ProductController {

    private ProductService productService;

@Autowired
ProductController(ProductService productService){
    this.productService = productService;
}

@GetMapping
public List<Product> getAllProducts() {
return productService.getAllProduct();
}

@PostMapping
public Product createProduct(@RequestBody Product product) {
    return productService.saveProduct(product);
}
// Autres points de terminaison CRUD (PUT, DELETE) peuvent être ajoutés ici
}
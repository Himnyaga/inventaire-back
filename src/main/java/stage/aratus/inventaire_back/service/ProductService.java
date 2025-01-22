package stage.aratus.inventaire_back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stage.aratus.inventaire_back.entity.Product;
import stage.aratus.inventaire_back.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired                  
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct(){
        return this.productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);

    }
}

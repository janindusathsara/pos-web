package lk.ijse.posweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lk.ijse.posweb.dto.ProductDto;
import lk.ijse.posweb.entity.Product;

@Service
public interface ProductService {

    Product createProduct(ProductDto productDto);
    Product updateProduct(Long id, ProductDto productDto);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    List<Product> getProductByCategory(Long id); 
    
}

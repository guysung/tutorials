package com.baeldung.spring.data.cosmosdb;

import com.azure.data.cosmos.PartitionKey;
import com.baeldung.spring.data.cosmosdb.entity.Product;
import com.baeldung.spring.data.cosmosdb.repository.ProductRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Optional;

//Uncomment this when configured URI and keys for Azure Cosmos DB in application.properties
//to run the integration test
//@SpringBootTest
public class AzurecosmodbApplicationIntegrationTest {

    @Autowired
    ProductRepository productRepository;

    // Uncomment this when configured URI and keys for Azure Cosmos DB in application.properties
    // to run the integration test
    // @Test
    public void givenProductIsCreated_whenCallFindById_thenProductIsFound() {
        Product product = new Product();
        product.setProductid("1001");
        product.setProductCategory("Shirt");
        product.setPrice(110.0);
        product.setProductName("Blue Shirt");

        // Uncomment these lines when configured URI and keys for Azure Cosmos DB in application.properties
        // to run the integration test
        // productRepository.save(product);
        // Optional<Product> retrievedProduct = productRepository.findById("1001", new PartitionKey("Shirt"));
        // Assert.notNull(retrievedProduct, "Retrieved Product is Null");

    }

}

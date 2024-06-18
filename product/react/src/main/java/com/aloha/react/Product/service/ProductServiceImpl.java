package com.aloha.react.Product.service;

import com.aloha.react.Product.dto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ProductServiceImpl implements ProductService {

    private ConcurrentHashMap<String, Product> productStorage = new ConcurrentHashMap<>();

    @Override
    public List<Product> list() throws Exception {
        try {
            return new ArrayList<>(productStorage.values());
        } catch (Exception e) {
            throw new Exception("실패", e);
        }
    }

    @Override
    public Product select(String id) throws Exception {
        try {
            Optional<Product> product = Optional.ofNullable(productStorage.get(id));
            return product.orElseThrow(() -> new Exception("찾을 수 없음"));
        } catch (Exception e) {
            throw new Exception("실패t", e);
        }
    }

    @Override
    public int insert(Product product) throws Exception {
        try {
            if (productStorage.containsKey(product.getId())) {
                throw new Exception("찾을수 없음");
            }
            productStorage.put((String) product.getId(), product);
            return 1;
        } catch (Exception e) {
            throw new Exception("실패", e);
        }
    }

    @Override
    public int update(Product product) throws Exception {
        try {
            if (!productStorage.containsKey(product.getId())) {
                throw new Exception("찾을 수 없음");
            }
            productStorage.put((String) product.getId(), product);
            return 1;
        } catch (Exception e) {
            throw new Exception("실패", e);
        }
    }

    @Override
    public int delete(Product product) throws Exception {
        try {
            if (!productStorage.containsKey(product.getId())) {
                throw new Exception("찾을 수 없음");
            }
            productStorage.remove(product.getId());
            return 1;
        } catch (Exception e) {
            throw new Exception("실패", e);
        }
    }
}

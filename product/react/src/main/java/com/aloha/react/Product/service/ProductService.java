package com.aloha.react.Product.service;

import com.aloha.react.Product.dto.Product;

import java.util.List;

public interface ProductService {
    
    // 목록   
    public List<Product> list() throws Exception;

    // 선택
    public Product select(String id) throws Exception;

    // 삽입
    public int insert(Product product) throws Exception;

    // 수정
    public int update(Product product) throws Exception;

    // 삭제
    public int delete(String id) throws Exception;

    public Product findById(String id) throws Exception;

    public Product save(Product product) throws Exception;
}

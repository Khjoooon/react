package com.aloha.react.Product.mapper;

import com.aloha.react.Product.dto.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {

    public List<Product> list() throws Exception;

    public Product select(String id) throws Exception;

    public int insert(Product product) throws Exception;

    public int update(Product product) throws Exception;
    
    public int delete(Product product) throws Exception;
}

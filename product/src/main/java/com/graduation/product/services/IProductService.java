package com.graduation.product.services;

import com.graduation.orderform.model.common.PageBean;
import com.graduation.orderform.model.product.Product;

import java.util.List;

public interface IProductService {

    PageBean<Product> getAllProduct(int pageIndex, int pageSize);

    List<Product> getAllProduct();

    Product getOneProduct(Integer pid);

}

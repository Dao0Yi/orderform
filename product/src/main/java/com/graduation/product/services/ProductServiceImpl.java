package com.graduation.product.services;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.graduation.orderform.model.common.PageBean;
import com.graduation.orderform.model.product.Product;
import com.graduation.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private ProductMapper productMapper ;

    @Override
    public PageBean<Product> getAllProduct(int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        Page<Product> page = (Page<Product>) productMapper.selectAll();
        return new PageBean<>(page.getTotal(),page.getResult(),page.getPageSize(),page.getPages(),page.getPageNum());
    }
    @Override
    public Product getOneProduct(Integer pid) {
        return productMapper.selectByPrimaryKey(pid);
    }

    @Override
    public List<Product> getAllProduct() {
        return productMapper.selectAll();
    }


}

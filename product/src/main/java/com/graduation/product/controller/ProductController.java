package com.graduation.product.controller;

import com.graduation.orderform.model.common.PageBean;
import com.graduation.orderform.model.common.ResultBean;
import com.graduation.orderform.model.product.Product;
import com.graduation.product.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService ;

    @RequestMapping("/list")
    public ResultBean getAllProduct(int pageIndex ,int pageSize) {
        PageBean<Product> pageBean = iProductService.getAllProduct(pageIndex , pageSize);
        ResultBean resultBean = new ResultBean();
        if (pageBean.getRows() != null) {
            resultBean.setStatus(200);
        } else {
            resultBean.setStatus(500);
        }
        resultBean.setMsg("产品列表");
        resultBean.setData(pageBean);
        return resultBean ;
    }

    @RequestMapping("/one")
    public ResultBean getOneProduct(Integer pid) {
        Product product = iProductService.getOneProduct(pid);
        ResultBean resultBean = new ResultBean();
        if (product != null) {
            resultBean.setStatus(200);
        } else {
            resultBean.setStatus(500);
        }
        resultBean.setMsg("产品详情");
        resultBean.setData(product);
        return resultBean ;
    }

    @RequestMapping("/addOne")
    public ResultBean addToProduct(Integer pid) {
        return null ;
    }


    public List<Product> getAllProduct() {
        return iProductService.getAllProduct();
    }


}

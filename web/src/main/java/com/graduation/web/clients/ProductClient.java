package com.graduation.web.clients;

import com.graduation.orderform.model.common.ResultBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient("order-product")
public interface ProductClient {
    @RequestMapping("/product/list")
    ResultBean getAllProduct(@RequestParam(name = "pageIndex") int pageIndex,@RequestParam(name = "pageSize") int pageSize);

    @RequestMapping("/product/one")
    ResultBean getOneProduct(@RequestParam(name = "pid")Integer pid);

    @RequestMapping("/product/addOne")
    ResultBean addToProduct(@RequestParam(name = "pid")Integer pid);
}

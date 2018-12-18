package com.jk.service;

import com.jk.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("orderServiceApi")
public interface OrderServiceApi {


    @GetMapping("OrderList")
    List<Order> queryOrderList();
}

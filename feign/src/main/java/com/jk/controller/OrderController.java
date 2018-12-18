package com.jk.controller;


import com.jk.model.Order;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("queryOrderList")
    @ResponseBody
    public List<Order> queryOrderList(){

        return orderService.queryOrderList();
        //aaaaaa
    }

}

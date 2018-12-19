package com.jk.controller;


import com.alibaba.fastjson.JSON;
import com.jk.model.Order;
import com.jk.service.OrderService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



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
    @Autowired
    private AmqpTemplate amqpTemplate;
    @RequestMapping("saveBook")
    @ResponseBody
    public void insertBook(){
        //convertAndSend 向队列发送一个消息 第一个参数为队列名称 第二个参数为队列内容
        Map<String, Object> bookMap = new HashMap<>();
        bookMap.put("bookId","a56sds4fd5gf");
        bookMap.put("bookName","三国演义");
        amqpTemplate.convertAndSend("myqueue", JSON.toJSONString(bookMap));
    }
}

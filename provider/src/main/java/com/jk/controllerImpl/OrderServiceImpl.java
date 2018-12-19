package com.jk.controllerImpl;

import com.jk.mapper.OrderMapper;
import com.jk.model.Order;
import com.jk.service.OrderServiceApi;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

@RestController
public class OrderServiceImpl implements OrderServiceApi {

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public List<Order> queryOrderList() {
        return orderMapper.queryOrderList();
    }
    @RabbitListener(queues = "myqueue")
    public void listenerBookMessage(String message){
        Map map = JSON.parseObject(message, Map.class);
        System.out.println("message = [" + map.toString() + "]");
    }
}

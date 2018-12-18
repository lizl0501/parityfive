package com.jk.controllerImpl;

import com.jk.mapper.OrderMapper;
import com.jk.model.Order;
import com.jk.service.OrderServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderServiceImpl implements OrderServiceApi {
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public List<Order> queryOrderList() {
        return orderMapper.queryOrderList();
    }
}

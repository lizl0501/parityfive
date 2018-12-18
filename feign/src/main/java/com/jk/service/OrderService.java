package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="cloudprovider")
public interface OrderService extends OrderServiceApi {
}

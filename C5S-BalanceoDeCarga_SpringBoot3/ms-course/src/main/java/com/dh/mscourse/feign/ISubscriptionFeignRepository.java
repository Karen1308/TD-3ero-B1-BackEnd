package com.dh.mscourse.repository;

import com.dh.mscourse.model.Subscription;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-subscription")
public interface ISubscriptionFeignRepository {

    @GetMapping("/subscription/find")
    ResponseEntity<Subscription> findSubscriptionByUser(@RequestParam Integer userId);
}

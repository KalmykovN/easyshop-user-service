package com.easyshop.user_api.feign;

import com.easyshop.user_api.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

//@FeignClient(name = "user-service", url = "${user-service.url}")
public interface UserClient {
//    @GetMapping("/user/{id}")
//    UserDto getUser(@PathVariable UUID id);
}
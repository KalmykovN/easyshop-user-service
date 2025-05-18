package com.easyshop.user_api.feign;

import com.easyshop.user_api.dto.UserDto;

import java.util.UUID;

public interface FeignClient {
    public UserDto getUserById(UUID id);
}

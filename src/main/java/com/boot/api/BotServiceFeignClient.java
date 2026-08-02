package com.boot.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "bot-service",url = "${bot.service.url}")
public interface BotServiceFeignClient
{

}

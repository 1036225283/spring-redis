package xws.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xws.entity.User;


/**
 * 测试用例
 * Created by xws on 2019/7/2.
 */
@FeignClient("spring-user")
public interface UserClient {
    @RequestMapping(method = RequestMethod.GET, value = "/user/get")
    User get();

    @RequestMapping(method = RequestMethod.GET, value = "/user/insertUser")
    User insertUser();

    @RequestMapping(method = RequestMethod.POST, value = "/user/{userId}", consumes = "application/json")
    User select(@PathVariable("userId") Long userId);
}

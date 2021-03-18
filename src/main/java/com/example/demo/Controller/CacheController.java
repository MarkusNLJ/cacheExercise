package com.example.demo.Controller;

import com.example.demo.Cache;
import com.example.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CacheController {
    User user = new User(1);
    User user1 = new User(2);
    User user2 = new User(3);
    Cache cache = new Cache();


    @GetMapping(value = "/get-user-data")
    @ResponseBody
    public String getUserData(@RequestParam("id") int id) throws InterruptedException {
        if(cache.has(id)){
            return cache.get(id);
        }
        else {
            cache.set(id, user.getDataSlow());
            return cache.get(id);
        }
    }

}

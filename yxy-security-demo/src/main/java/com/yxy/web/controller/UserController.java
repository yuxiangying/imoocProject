package com.yxy.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.yxy.dto.User;
import com.yxy.dto.UserQueryCondition;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public User create(@Valid @RequestBody User user, BindingResult errors){

        if(errors.hasErrors()){
            errors.getAllErrors().stream().forEach(error ->System.out.println(error.getDefaultMessage()));
        }

        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        user.setId("1");
        return user;
    }

    @GetMapping
    @JsonView(User.UserSimpleView.class)
    public List<User> query(UserQueryCondition condition, @PageableDefault(page = 2,size = 2,sort = "age,asc") Pageable pageable){

        System.out.println(ReflectionToStringBuilder.toString(condition,ToStringStyle.MULTI_LINE_STYLE));

        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());

        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @GetMapping("/{id://d+}")
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable String id){
        User user = new User();
        user.setUsername("tom");
        return user;
    }
}

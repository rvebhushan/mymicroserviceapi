package com.mymicroservice.mymicroservice.controller;

import java.util.List;

import com.mymicroservice.mymicroservice.dto.UserDto;
import com.mymicroservice.mymicroservice.model.Product;
import com.mymicroservice.mymicroservice.service.ProductService;
import com.mymicroservice.mymicroservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @GetMapping("/getData")
    public String getData() {
        Pageable pageRequest = PageRequest.of(0, 10);
        Page<?> page = userService.findAll(pageRequest);
        // Process the data or perform operations on the page object
        return page.getContent().toString(); // Convert content to string before returning
    }

    @GetMapping("/find/{id}")
    public UserDto getData(@PathVariable Long id) {
        Pageable pageRequest = PageRequest.of(0, 10);
        UserDto userDto = userService.findById(id);
        // Process the data or perform operations on the page object
        return userDto; // Convert content to string before returning
    }

    @PostMapping("/postData")
    public ResponseEntity<String> postData(@RequestBody UserDto userDto) {
        userService.save(userDto);
        return ResponseEntity.ok().body("Data Saved");
    }

    @GetMapping("/getProducts")
    public Product getProducts() {
        return productService.getProducts().get(0);
//        Pageable pageRequest = PageRequest.of(0, 10);
//        Page<?> page = userService.findAll(pageRequest);
//        // Process the data or perform operations on the page object
//        return page.getContent().toString(); // Convert content to string before returning
    }
}
package com.mymicroservice.mymicroservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mymicroservice.mymicroservice.dto.UserDto;
import com.mymicroservice.mymicroservice.model.User;
import com.mymicroservice.mymicroservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public UserDto save(UserDto userDto)
    {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.convertValue(userDto, User.class);
        user = userRepository.save(user);
        return mapper.convertValue(user, UserDto.class);
    }

    public UserDto findById(Long aLong)
    {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(userRepository.findById(aLong), UserDto.class);
    }

    public Page<UserDto> findAll(Pageable pageable)
    {
        Page<User> entityPage = userRepository.findAll(pageable);
        ObjectMapper mapper = new ObjectMapper();
        return entityPage.map(user -> mapper.convertValue(user, UserDto.class));
    }
}

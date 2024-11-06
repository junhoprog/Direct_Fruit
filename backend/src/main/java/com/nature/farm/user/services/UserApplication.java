package com.nature.farm.user.services;

import com.nature.farm.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserApplication {

  @Autowired
  UserRepository userRepository;
}

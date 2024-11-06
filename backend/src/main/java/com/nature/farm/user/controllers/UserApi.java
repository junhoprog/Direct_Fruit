package com.nature.farm.user.controllers;

import com.nature.farm.user.services.UserApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi{

  @Autowired
  UserApplication userApplication;

}

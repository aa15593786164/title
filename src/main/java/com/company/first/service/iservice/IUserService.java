package com.company.first.service.iservice;

import com.company.first.commons.ResResult;
import com.company.first.dao.pojo.User;

public interface IUserService {
    ResResult<User> login(String username, String password);
}

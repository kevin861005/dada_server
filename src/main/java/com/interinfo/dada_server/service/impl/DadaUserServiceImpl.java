package com.interinfo.dada_server.service.impl;

import com.interinfo.dada_server.dao.DadaUserDao;
import com.interinfo.dada_server.model.DadaUser;
import com.interinfo.dada_server.service.DadaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DadaUserServiceImpl implements DadaUserService {

    @Autowired
    DadaUserDao dadaUserDao;

    @Override
    public List<DadaUser> getAllUser() {
        return dadaUserDao.getAllUser();
    }
}

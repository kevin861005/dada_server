package com.interinfo.dada_server.service.impl;

import com.interinfo.dada_server.dao.DadaDepartmentDao;
import com.interinfo.dada_server.model.DadaDepartment;
import com.interinfo.dada_server.service.DadaDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DadaDepartmentServiceImpl implements DadaDepartmentService {

    @Autowired
    DadaDepartmentDao dadaDepartmentDao;

    public List<DadaDepartment> getAllDepartment() {
        return dadaDepartmentDao.getAllDepartment();
    }
}

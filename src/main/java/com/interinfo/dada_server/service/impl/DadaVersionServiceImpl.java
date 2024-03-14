package com.interinfo.dada_server.service.impl;

import com.interinfo.dada_server.dao.DadaVersionDao;
import com.interinfo.dada_server.model.DadaVersion;
import com.interinfo.dada_server.service.DadaVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DadaVersionServiceImpl implements DadaVersionService {

    @Autowired
    private DadaVersionDao dadaVersionDao;

    @Override
    public DadaVersion getLatestVersion() {
        return dadaVersionDao.getLatestVersion();
    }
}

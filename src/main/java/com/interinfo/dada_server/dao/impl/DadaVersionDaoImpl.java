package com.interinfo.dada_server.dao.impl;

import com.interinfo.dada_server.dao.DadaVersionDao;
import com.interinfo.dada_server.model.DadaVersion;
import com.interinfo.dada_server.rowmapper.DadaVersionRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DadaVersionDaoImpl implements DadaVersionDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public DadaVersion getLatestVersion() {
        String sql = " SELECT TOP(1) release_version , release_date , release_description "
                    + " FROM dada_version "
                    + " order by release_date desc ";

        Map<String, Object> map = new HashMap<>();

        List<DadaVersion> dadaVersionList = namedParameterJdbcTemplate.query(sql, map, new DadaVersionRowMapper());
        if (dadaVersionList.size() > 0) {
            return dadaVersionList.get(0);
        } else {
            return null;
        }
    }
}

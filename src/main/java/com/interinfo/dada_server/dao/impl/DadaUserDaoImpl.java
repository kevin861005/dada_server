package com.interinfo.dada_server.dao.impl;

import com.interinfo.dada_server.dao.DadaUserDao;
import com.interinfo.dada_server.model.DadaUser;
import com.interinfo.dada_server.rowmapper.DadaUserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DadaUserDaoImpl implements DadaUserDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public List<DadaUser> getAllUser() {
        String sql = " SELECT employee_id, company_id, company_name, department_number, department_code "
                    + ", department_name, chinese_name, english_name, position, photo "
                    + " FROM dada_user "
                    + " WHERE 1 = 1 ";

        Map<String, Object> map = new HashMap<>();

        List<DadaUser> dadaUserList = namedParameterJdbcTemplate.query(sql, map, new DadaUserRowMapper());

        return dadaUserList;
    }
}

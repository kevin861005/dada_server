package com.interinfo.dada_server.dao.impl;

import com.interinfo.dada_server.dao.DadaDepartmentDao;
import com.interinfo.dada_server.model.DadaDepartment;
import com.interinfo.dada_server.rowmapper.DadaDepartmentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DadaDepartmentDaoImpl implements DadaDepartmentDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<DadaDepartment> getAllDepartment() {
        String sql = " SELECT department_number, department_name, department_chief, parent_department, company_id "
                    + ", department_code, department_short_name, department_level "
                    + " FROM dada_department "
                    + " WHERE 1 = 1 "
                    + " ORDER BY department_number ";

        Map<String, Object> map = new HashMap<>();

        List<DadaDepartment> dadaDepartmentList = namedParameterJdbcTemplate.query(sql, map, new DadaDepartmentRowMapper());

        return dadaDepartmentList;
    }
}

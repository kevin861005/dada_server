package com.interinfo.dada_server.rowmapper;

import com.interinfo.dada_server.model.DadaDepartment;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DadaDepartmentRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        DadaDepartment dadaDepartment = new DadaDepartment();
        dadaDepartment.setDepartmentNumber(resultSet.getInt("department_number"));
        dadaDepartment.setDepartmentName(resultSet.getString("department_name"));
        dadaDepartment.setDepartmentChief(resultSet.getString("department_chief"));
        dadaDepartment.setParentDepartment(resultSet.getInt("parent_department"));
        dadaDepartment.setCompanyId(resultSet.getString("company_id"));
        dadaDepartment.setDepartmentCode(resultSet.getString("department_code"));
        dadaDepartment.setDepartmentShortName(resultSet.getString("department_short_name"));
        dadaDepartment.setDepartmentLevel(resultSet.getString("department_level"));
        return dadaDepartment;
    }
}

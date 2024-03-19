package com.interinfo.dada_server.rowmapper;

import com.interinfo.dada_server.model.DadaUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DadaUserRowMapper implements RowMapper<DadaUser> {
    @Override
    public DadaUser mapRow(ResultSet resultSet, int i) throws SQLException {
        DadaUser dadaUser = new DadaUser();
        dadaUser.setEmployeeId(resultSet.getString("employee_id"));
        dadaUser.setCompanyId(resultSet.getString("company_id"));
        dadaUser.setCompanyName(resultSet.getString("company_name"));
        dadaUser.setDepartmentNumber(resultSet.getInt("department_number"));
        dadaUser.setDepartmentCode(resultSet.getString("department_code"));
        dadaUser.setDepartmentName(resultSet.getString("department_name"));
        dadaUser.setChineseName(resultSet.getString("chinese_name"));
        dadaUser.setEnglishName(resultSet.getString("english_name"));
        dadaUser.setPosition(resultSet.getString("position"));
        dadaUser.setPhoto(resultSet.getString("photo"));
        return  dadaUser;
    }
}

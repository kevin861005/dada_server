package com.interinfo.dada_server.rowmapper;

import com.interinfo.dada_server.model.DadaVersion;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DadaVersionRowMapper implements RowMapper<DadaVersion> {
    @Override
    public DadaVersion mapRow(ResultSet resultSet, int i) throws SQLException {
        DadaVersion dadaVersion = new DadaVersion();
        dadaVersion.setReleaseVersion(resultSet.getDouble("release_version"));
        dadaVersion.setReleaseDate(resultSet.getTimestamp("release_date"));
        dadaVersion.setReleaseDescription(resultSet.getString("release_description"));
        return dadaVersion;
    }
}

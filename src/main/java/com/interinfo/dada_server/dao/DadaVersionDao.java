package com.interinfo.dada_server.dao;

import com.interinfo.dada_server.model.DadaVersion;
import org.springframework.stereotype.Component;

public interface DadaVersionDao {

    DadaVersion getLatestVersion();
}

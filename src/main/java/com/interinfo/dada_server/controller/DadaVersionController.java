package com.interinfo.dada_server.controller;

import com.interinfo.dada_server.model.DadaVersion;
import com.interinfo.dada_server.service.DadaVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DadaVersionController {

    @Autowired
    private DadaVersionService dadaVersionService;

    @GetMapping("/version/latest_version")
    public ResponseEntity<DadaVersion> getLatestVersion() {
        DadaVersion dadaVersion = dadaVersionService.getLatestVersion();
        if (dadaVersion != null) {
            return  ResponseEntity.status(HttpStatus.OK).body(dadaVersion);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

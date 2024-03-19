package com.interinfo.dada_server.controller;

import com.interinfo.dada_server.model.DadaUser;
import com.interinfo.dada_server.service.DadaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DadaUserController {

    @Autowired
    private DadaUserService dadaUserService;

    @GetMapping("/users")
    public ResponseEntity<List<DadaUser>> getAllUser() {
        List<DadaUser> dadaUserList = dadaUserService.getAllUser();

        return ResponseEntity.status(HttpStatus.OK).body(dadaUserList);
    }
}

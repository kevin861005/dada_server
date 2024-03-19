package com.interinfo.dada_server.controller;

import com.interinfo.dada_server.model.DadaDepartment;
import com.interinfo.dada_server.service.DadaDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DadaDepartmentController {

    @Autowired
    private DadaDepartmentService dadaDepartmentService;

    @GetMapping("/departments")
    public ResponseEntity<List<DadaDepartment>> getAllDepartment() {
        List<DadaDepartment> dadaDepartmentList = dadaDepartmentService.getAllDepartment();

        return ResponseEntity.status(HttpStatus.OK).body(dadaDepartmentList);
    }
}

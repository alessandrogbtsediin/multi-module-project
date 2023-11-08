package com.example.Controller;

import com.example.mybatis.mapper.AutoriMapper;
import com.example.service.AutoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autori")
public class AutoriController {


    @Autowired
    AutoriService autoriService;

    @Autowired
    AutoriMapper autoriMapper;



    @GetMapping("/getbyidSpring")
    public ResponseEntity getAutoreByIDSpring(@RequestParam Integer id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(autoriService.findAutoreById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/getbyidBatis")
    public ResponseEntity getAutoreByIDMybatis(@RequestParam Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(this.autoriMapper.selectByPrimaryKey(id));
    }




}

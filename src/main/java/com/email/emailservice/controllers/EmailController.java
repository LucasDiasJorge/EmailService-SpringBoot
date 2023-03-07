package com.email.emailservice.controllers;

import com.email.emailservice.dtos.EmailDto;
import com.email.emailservice.models.EmailModel;
import com.email.emailservice.services.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }

    @GetMapping("/get-email")
    public List<EmailModel> getEmails(){
        return emailService.getEmails();
    }

    @GetMapping("/ping-email")
    public Map<String,String> ping(){

        Map<String,String> ret = new HashMap<>();

        ret.put("Version", "1.0");

        return ret;
    }

}

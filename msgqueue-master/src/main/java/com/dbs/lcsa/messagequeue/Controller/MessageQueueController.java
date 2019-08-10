package com.dbs.lcsa.messagequeue.Controller;
import com.dbs.lcsa.messagequeue.Model.QueueDetails;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

@CrossOrigin
@RestController
@RequestMapping(value="api/getmessagequeue",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MessageQueueController {
  @GetMapping("/getAllQueue")
public List<QueueDetails> getQueueDetails()
    {
        List<QueueDetails> lstqueue=new ArrayList<>();
        lstqueue.add(new QueueDetails(1,"Queue 1"));
        lstqueue.add(new QueueDetails(2,"Queue 2"));
        lstqueue.add(new QueueDetails(3,"Queue 3"));
        return lstqueue;

    }


}

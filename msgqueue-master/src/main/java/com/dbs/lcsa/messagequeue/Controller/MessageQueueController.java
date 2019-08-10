package com.dbs.lcsa.messagequeue.Controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.lcsa.messagequeue.Model.QueueDetails;

@CrossOrigin
@RestController
@RequestMapping(value="api/getmessagequeue",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MessageQueueController {
  @GetMapping("/getAllQueue")
public List<QueueDetails> getQueueDetails()
    {
	  List <String> messagesList = new ArrayList();
	  messagesList.add("Message 1");
	  messagesList.add("Message 2");
	  
        List<QueueDetails> lstqueue=new ArrayList<>();
        lstqueue.add(new QueueDetails(1,"Queue 1", messagesList));
        lstqueue.add(new QueueDetails(2,"Queue 2", messagesList));
        lstqueue.add(new QueueDetails(3,"Queue 3", messagesList));
        return lstqueue;

    }


}

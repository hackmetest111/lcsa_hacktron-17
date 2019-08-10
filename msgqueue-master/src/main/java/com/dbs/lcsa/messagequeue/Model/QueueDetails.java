package com.dbs.lcsa.messagequeue.Model;

import java.util.List;

public class QueueDetails {
	
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;
    public List<String> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<String> msgList) {
		this.msgList = msgList;
	}

	private List<String> msgList;

    public QueueDetails(int id, String name, List<String> msgList ) {
        this.id = id;
        this.name = name;
        this.msgList=msgList;
    }
}

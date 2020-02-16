package org.springframework.samples.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.samples.model.Command;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
	private Properties props_ssd = new Properties();
	private Properties props_ws = new Properties();
	
	public SearchService() {
		try {
			props_ssd.load(getClass()
					.getClassLoader().getResourceAsStream("ssd.properties"));
			System.out.println(props_ssd);
			props_ws.load(getClass()
					.getClassLoader().getResourceAsStream("ws.properties"));
			System.out.println(props_ws);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getScore(Command comm) {
		if (comm.getSubject().equals("ssd")) {
			comm.setScore(props_ssd.getProperty(comm.getCode()));			
		}
		else {
			comm.setScore(props_ws.getProperty(comm.getCode()));
		}
	}

	public void getScore2(Command comm) {
		if (comm.getSubject().equals("ssd")) {
			if (comm.getHakbun().equals("20170938")) comm.setScore("18");
			else if (comm.getHakbun().equals("20170971")) comm.setScore("23");	
			else if (comm.getHakbun().equals("20170996")) comm.setScore("5");	
			else if (comm.getHakbun().equals("20170969")) comm.setScore("18.5");	
		}
		else {
			if (comm.getHakbun().equals("20181017")) comm.setScore("23.5");
			else if (comm.getHakbun().equals("20180948")) comm.setScore("20.5");			
		}
	}
}

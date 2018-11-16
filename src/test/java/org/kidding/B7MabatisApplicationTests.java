package org.kidding;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kidding.mapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.Setter;
import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class B7MabatisApplicationTests {

	@Setter(onMethod_=@Autowired)
	private TimeMapper mapper;
	
	@Test
	public void testTime() {
		log.info(mapper.getTime2());
	}
	
	
	@Test
	public void contextLoads() {
	}

}

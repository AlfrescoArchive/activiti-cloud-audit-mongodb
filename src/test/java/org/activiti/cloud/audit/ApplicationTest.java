package org.activiti.cloud.audit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoAuditApplication.class)
@DirtiesContext
public class ApplicationTest {

	@Test
	public void contextLoads() throws Exception {

	}

}
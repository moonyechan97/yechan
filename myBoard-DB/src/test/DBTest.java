package test;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

import kr.ac.kopo.util.ConnectionFactory;

public class DBTest {

	@Test
	public void test() {
		Connection conn = new ConnectionFactory().getConnection();
		assertNotNull(conn);
	}

}

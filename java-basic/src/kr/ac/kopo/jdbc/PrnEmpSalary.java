package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.day.util.ConnectionFactory;
import kr.ac.kopo.day.util.JDBCClose;

public class PrnEmpSalary {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Scanner sc = new Scanner(System.in);

			conn = new ConnectionFactory().getConnection();

			System.out.print("급여를 입력하시오 : ");
			int salary = sc.nextInt();

			String sql = "SELECT J.JOB_TITLE" 
			           + " ,AVG(E.SALARY) AS AVG " 
					   + " FROM EMPLOYEES e "
					   + " JOIN JOBS j ON J.JOB_ID = E.JOB_ID " 
			           + " WHERE E.SALARY >= ? " 
					   + " GROUP BY J.JOB_TITLE "
					   + " ORDER BY AVG DESC ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, salary);

			ResultSet rs = pstmt.executeQuery();

			int cnt = 0;
			while (rs.next()) {
				String job_title = rs.getString("job_title");
				int avg_salary = rs.getInt("AVG");
				System.out.println("[" + job_title + "]" + avg_salary);
				cnt++;
			}
			System.out.println("총 [" + cnt + "]명이 검색되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

	}

}

package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.keduit.dto.MemberVO;

public class MemberDAO {

	private MemberDAO() {

	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	public Connection getConnection() throws Exception {
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		Connection conn = ds.getConnection();
		return conn;
	}

	// LoginServlet doPost
	public int userCheck(String userid, String pwd) {
		int result = -1;
		String sql = "select pwd from member where userid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString("pwd") != null && rs.getString("pwd").equals(pwd)) {
					// 비밀번호 정답
					result = 1;
				} else {
					// 비밀번호 오답
					result = 0;
				}
			} else {
				// 아이디 존재x
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 아이디로 회원 정보를 가져오기
	public MemberVO getMember(String userid) {
//		System.out.println("dao ====>" + userid);
		MemberVO memberVO = null;
		String sql = "select * from member where userid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				memberVO = new MemberVO();
				memberVO.setName(rs.getString("name"));
				memberVO.setUserid(rs.getString("userid"));
				memberVO.setPwd(rs.getString("pwd"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setPhone(rs.getString("phone"));
				memberVO.setAdmin(rs.getInt("admin"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return memberVO;
	}

	// 아이디 중복 체크
	public int conformID(String userid) {
		int result = -1;
		String sql = "select userid from member where userid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = 1;
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int insertMember(MemberVO mVO) {
		int result = 0;
		String sql = "insert into member values (?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVO.getName());
			pstmt.setString(2, mVO.getUserid());
			pstmt.setString(3, mVO.getPwd());
			pstmt.setString(4, mVO.getEmail());
			pstmt.setString(5, mVO.getPhone());
			pstmt.setInt(6, mVO.getAdmin());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int updateMember(MemberVO mVO) {
		int result = 0;
		String sql = "update member set name=?, pwd=?, email=?, phone=?, admin=? where userid=?";
//		Connection conn =null;
//		PreparedStatement pstmt = null;
		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, mVO.getName());
			pstmt.setString(2, mVO.getPwd());
			pstmt.setString(3, mVO.getEmail());
			pstmt.setString(4, mVO.getPhone());
			pstmt.setInt(5, mVO.getAdmin());
			pstmt.setString(6, mVO.getUserid());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}

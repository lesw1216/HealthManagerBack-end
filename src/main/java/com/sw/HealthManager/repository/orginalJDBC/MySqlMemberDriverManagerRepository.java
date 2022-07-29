package com.sw.HealthManager.repository.orginalJDBC;

import com.sw.HealthManager.domain.Member;
import com.sw.HealthManager.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.*;

import static com.sw.HealthManager.database.DBConnectionUtil.getConnection;

@Slf4j
@Repository
public class MySqlMemberDriverManagerRepository implements UserRepository {
    @Override
    public boolean save(Member member) {
        String sql = "insert into member(member_id, member_password, member_name) values(?, ?, ?)";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, member.getMemberId());
            pstmt.setString(2, member.getMemberPassword());
            pstmt.setString(3, member.getMemberName());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(con, pstmt, null);
        }
    }

    @Override
    public Member findByName(String name) {
        return null;
    }

    private void close(Connection con, Statement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                log.info("error" ,e);
            }
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                log.info("error", e);
            }
        }

        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                log.info("error", e);
            }
        }
    }
}

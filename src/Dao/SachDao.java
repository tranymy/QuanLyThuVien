package Dao;

import utils.JdbcHelper;
import Entity.Sach;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author baomt
 */
public class SachDao extends QLThuVienDao<Sach, String> {

    final String INSERT_SQL = "INSERT INTO SACH(MaSACH,TenSACH,TacGIA,NXB,THELOAI,MOTA) VALUES (?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE SACH SET TenSACH = ?, TacGIA = ?, NXB = ?,THELOAI = ?,MOTA = ? WHERE MaSACH = ?";
    final String DELETE_SQL = "DELETE FROM SACH WHERE MaSACH = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM SACH";
    final String SELECT_BYID_SQL = "SELECT * FROM SACH WHERE MaSACH = ?";

    @Override
    public void insert(Sach entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaSACH(), entity.getTenSACH(), entity.getTacGIA(), entity.getNXB(), entity.getTHELOAI(), entity.getMOTA());
    }

    @Override
    public void update(Sach entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTenSACH(), entity.getTacGIA(), entity.getNXB(), entity.getTHELOAI(), entity.getMOTA(), entity.getMaSACH());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<Sach> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Sach selectById(String id) {
        List<Sach> list = selectBySql(SELECT_BYID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Sach> selectBySql(String sql, Object... args) {
        List<Sach> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Sach entity = new Sach();
                entity.setMaSACH(rs.getString("MaSACH"));
                entity.setTenSACH(rs.getString("TenSACH"));
                entity.setTacGIA(rs.getString("TacGIA"));
                entity.setNXB(rs.getString("NXB"));
                entity.setTHELOAI(rs.getString("THELOAI"));
                entity.setMOTA(rs.getString("MOTA"));

                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

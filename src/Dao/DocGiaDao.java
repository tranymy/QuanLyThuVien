/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import utils.JdbcHelper;
import Entity.DocGia;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baomt
 */
public class DocGiaDao extends QLThuVienDao<DocGia, String> {
        
    final String INSERT_SQL = "INSERT INTO DOCGIA(MaDG,TENDG,SDT,LOP,NGAYSINH,GIOITINH,MANV) VALUES (?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE DOCGIA SET TENDG = ?, SDT = ?, LOP = ?,NGAYSINH = ?,GIOITINH = ?,MANV = ? WHERE MaDG = ?";
    final String DELETE_SQL = "DELETE FROM DOCGIA WHERE MaDG = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM DOCGIA";
    final String SELECT_BYID_SQL = "SELECT * FROM DOCGIA WHERE MaDG = ?";
    
    
    @Override
    public void insert(DocGia entity) {
    JdbcHelper.update(INSERT_SQL, entity.getMaDG(), entity.getTenDG(), entity.getSDT(), entity.getLOP(), entity.getNGAYSINH(), entity.isGIOITINH(), entity.getMANV());
    }

    @Override
    public void update(DocGia entity) {
         JdbcHelper.update(INSERT_SQL,  entity.getTenDG(), entity.getSDT(), entity.getLOP(), entity.getNGAYSINH(), entity.isGIOITINH(), entity.getMANV(),entity.getMaDG());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<DocGia> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public DocGia selectById(String id) {
        List<DocGia> list = selectBySql(SELECT_BYID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<DocGia> selectBySql(String sql, Object... args) {
         List<DocGia> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                DocGia entity = new DocGia();
                entity.setMaDG(rs.getString("MaDG"));
                entity.setTenDG(rs.getString("TenDG"));
                entity.setSDT(rs.getString("SDT"));
                entity.setLOP(rs.getString("LOP"));
                entity.setNGAYSINH(rs.getString("NGAYSINH"));
                entity.setGIOITINH(rs.getBoolean("GIOITINH"));
                 entity.setMANV(rs.getString("MANV"));

                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.NguoiDung;
import java.util.List;
import uils.XJdpc;

/**
 *
 * @author PC
 */
public class NguoiDungDangKyDAO extends MusicDAO<NguoiDung, String>{
    String INSERT = "INSERT INTO NguoiDung (HoTen, email, avatar, TenTK) VALUES (?, ?, ?, ?)";
    String SELECT_BY_ID = "SELECT * FROM NguoiDung WHERE HoTen = ?";

    @Override
    public void insert(NguoiDung entity) {
        XJdpc.update(INSERT, entity.getHoTen(), entity.getEmail(), entity.getAvatar(), entity.getTenTK());
    }

    @Override
    public void update(NguoiDung entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String Key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NguoiDung selectById(String Key) {
      List<NguoiDung> list = this.selectBySql(SELECT_BY_ID, Key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiDung> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<NguoiDung> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

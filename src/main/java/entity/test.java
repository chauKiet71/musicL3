/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import Dao.*;
import entity.*;
import java.util.List;

/**
 *
 * @author PC
 */
public class test {
    // Tạo một đối tượng TaiKhoanDAO

    public static void main(String[] args) {
        TaiKhoanDAO tkdao = new TaiKhoanDAO();
        List<TaiKhoan> taiKhoanList;
        taiKhoanList = tkdao.selectAll();
        System.out.println("All TaiKhoan:");
        for (TaiKhoan tk : taiKhoanList) {
            System.out.println(tk.getTenTk() + " " + tk.getMatKhau() + " " + tk.isVaiTro() + " " + tk.getTrangThai());
        }
    }
}

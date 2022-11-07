/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;


import model.ChiTietSanPham;
import model.HoaDonChiTiet;
import viewModel.ViewModelChiTietHoaDon;

/**
 *
 * @author Admin
 */
public interface HoaDonChiTietService {
    
    Boolean save(HoaDonChiTiet hdct);
    
    ViewModelChiTietHoaDon getChiTietSanPham(ChiTietSanPham ctsp);
    
}

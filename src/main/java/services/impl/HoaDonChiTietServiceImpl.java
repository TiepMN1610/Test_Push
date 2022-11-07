/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import model.ChiTietSanPham;
import model.HoaDonChiTiet;
import repository.HoaDonChiTietRep;
import services.HoaDonChiTietService;
import viewModel.ViewModelChiTietHoaDon;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {

    private HoaDonChiTietRep hoaDonChiTietRep = new HoaDonChiTietRep();

    @Override
    public Boolean save(HoaDonChiTiet hdct) {
        return hoaDonChiTietRep.save(hdct);
    }

    @Override
    public ViewModelChiTietHoaDon getChiTietSanPham(ChiTietSanPham ctsp) {
        HoaDonChiTiet hdct = hoaDonChiTietRep.getChiTietSanPham(ctsp);
        ViewModelChiTietHoaDon viewModelChiTietHoaDon = new ViewModelChiTietHoaDon(hdct.getHoaDon(),
                hdct.getChiTietSanPham(), hdct.getSoLuong(), hdct.getDonGia());
        return viewModelChiTietHoaDon;
    }

}

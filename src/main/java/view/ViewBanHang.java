/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChiTietSanPham;
import model.HoaDon;
import model.HoaDonChiTiet;
import model.NhanVien;
import services.ChiTietSanPhamService;
import services.HoaDonChiTietService;
import services.HoaDonService;
import services.NhanVienService;
import services.impl.ChiTietSanPhamServiceImpl;
import services.impl.HoaDonChiTietServiceImpl;
import services.impl.HoaDonServiceImpl;
import services.impl.NhanVienServiceImpl;
import viewModel.ViewModelChiTietHoaDon;
import viewModel.ViewModelHoaDon;
import viewModel.ViewModelSanPham;

/**
 *
 * @author Admin
 */
public class ViewBanHang extends javax.swing.JFrame {

    private DefaultTableModel modelHoaDon = new DefaultTableModel();
    private DefaultTableModel modelSanPham = new DefaultTableModel();
    private DefaultTableModel modelGioHang = new DefaultTableModel();
    private DefaultComboBoxModel comboboxNhanVien = new DefaultComboBoxModel();
    private HoaDonService hoaDonService = new HoaDonServiceImpl();
    private ChiTietSanPhamService chiTietSanPhamService = new ChiTietSanPhamServiceImpl();
    private NhanVienService nhanVienService = new NhanVienServiceImpl();
    private HoaDonChiTietService hoaDonChiTietService = new HoaDonChiTietServiceImpl();
    private List<NhanVien> listNhanViens = new ArrayList<>();
    private List<ViewModelSanPham> listViewModelSanPhams = new ArrayList<>();
    private List<ViewModelHoaDon> listViewModelHoaDons = new ArrayList<>();
    private List<ViewModelChiTietHoaDon> listViewModelChiTietHoaDons = new ArrayList<>();
    private int STT;
    private int row;

    public ViewBanHang() {
        initComponents();
        tbHoaDon.setModel(modelHoaDon);
        tbSanPham.setModel(modelSanPham);
        tbGioHang.setModel(modelGioHang);
        cbbNhanVien.setModel(comboboxNhanVien);
        String[] headerSanPham = {"STT", "Ma SP", "Ten SP", "Nam Ban Hang", "Mo ta", "SL SP", "Gia nhap", "Gia ban"};
        String[] headerHoaDon = {"STT", "Ma HD", "Ngay Tao", "Ten NV", "Tinh Trang"};
        String[] headerGioHang = {"STT", "Ma SP", "Ten SP", "So Luong", "Don Gia", "Thanh Tien"};
        modelHoaDon.setColumnIdentifiers(headerHoaDon);
        modelSanPham.setColumnIdentifiers(headerSanPham);
        modelGioHang.setColumnIdentifiers(headerGioHang);
        listViewModelSanPhams = chiTietSanPhamService.getListCTSP();
        listViewModelHoaDons = hoaDonService.getListHoaDon();
        listNhanViens = nhanVienService.getNhanVien();
        showDataTableHoaDon(listViewModelHoaDons);
        showDataTableSanPham(listViewModelSanPhams);
        loadComBoBoxNhanVien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        btnTaoHoaDon = new javax.swing.JButton();
        radioChoThanhToan = new javax.swing.JRadioButton();
        radioTatCa = new javax.swing.JRadioButton();
        radioDaHuy = new javax.swing.JRadioButton();
        radioDaThanhToan = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtMaHoaDon = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        txtTienKhachDua = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbbNhanVien = new javax.swing.JComboBox<>();
        txtTenNhanVien = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbGioHang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTaoHoaDon.setText("Tao Hoa Don");
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        radioChoThanhToan.setText("Cho thanh toan");

        radioTatCa.setText("Tat ca");

        radioDaHuy.setText("Da huy");

        radioDaThanhToan.setText("Da thanh toan");

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHoaDon);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hoa don"));

        btnThanhToan.setText("THANH TOAN");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel1.setText("MaHD");

        jLabel2.setText("Ngay tao");

        jLabel3.setText("Ten NV");

        jLabel4.setText("Tong tien");

        jLabel5.setText("Tien khach dua");

        jLabel6.setText("Tien thua");

        cbbNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbNhanVien.setPreferredSize(new java.awt.Dimension(250, 28));

        txtTenNhanVien.setBackground(new java.awt.Color(242, 242, 242));
        txtTenNhanVien.setPreferredSize(new java.awt.Dimension(98, 28));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Gio Hang"));

        tbGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbGioHang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "San Pham"));

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSanPham);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioChoThanhToan)
                                .addGap(34, 34, 34)
                                .addComponent(radioTatCa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioDaHuy)
                                .addGap(52, 52, 52)
                                .addComponent(radioDaThanhToan))
                            .addComponent(jScrollPane1)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioChoThanhToan)
                            .addComponent(radioTatCa)
                            .addComponent(radioDaHuy)
                            .addComponent(radioDaThanhToan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        ViewModelHoaDon hoaDon = new ViewModelHoaDon();
        String maHoaDon = JOptionPane.showInputDialog("Nhap ma hoa don");
        hoaDon.setMa(maHoaDon);
        hoaDon.setNgayTao(new Date());
        hoaDon.setTinhTrang(0);
        hoaDonService.saveHoaDon(hoaDon);
        listViewModelHoaDons = hoaDonService.getListHoaDon();
        showDataTableHoaDon(listViewModelHoaDons);
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void tbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseClicked
        row = tbSanPham.getSelectedRow();
        BigDecimal tongTien = new BigDecimal(0);
        int flag = 0;
        Double thanhTien = 0.0;
        int soLuong;
        ViewModelSanPham sanPhamChon = listViewModelSanPhams.get(row);
        for (ViewModelChiTietHoaDon x : listViewModelChiTietHoaDons) {
            if (x.getChiTietSanPham().getIdCTSP().equals(sanPhamChon.getIdCTSP())) {
                flag = 1;
                soLuong = Integer.valueOf(JOptionPane.showInputDialog("Nhap so luong san pham:"));
                x.setSoLuong(soLuong + x.getSoLuong());
                showDataTableGioHang(listViewModelChiTietHoaDons);
            }
        }
        if (flag == 0) {
            soLuong = Integer.valueOf(JOptionPane.showInputDialog("Nhap so luong san pham:"));
            ViewModelChiTietHoaDon gioHang = new ViewModelChiTietHoaDon();
            ChiTietSanPham ctsp = chiTietSanPhamService.getChiTietSanPham(sanPhamChon.getIdCTSP());
            gioHang.setChiTietSanPham(ctsp);
            gioHang.setSoLuong(soLuong);
            gioHang.setDonGia(sanPhamChon.getGiaBan());
            listViewModelChiTietHoaDons.add(gioHang);
            showDataTableGioHang(listViewModelChiTietHoaDons);
        }
        for (ViewModelChiTietHoaDon x : listViewModelChiTietHoaDons) {
            thanhTien = thanhTien + Double.valueOf(String.valueOf(x.thanhTien(x.getSoLuong(), x.getDonGia())));
        }
        txtTongTien.setText(String.valueOf(tongTien.add(BigDecimal.valueOf(thanhTien))));
    }//GEN-LAST:event_tbSanPhamMouseClicked

    private void tbHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonMouseClicked
        row = tbHoaDon.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tbHoaDonMouseClicked

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        List<HoaDonChiTiet> list = new ArrayList<>();
        row = tbHoaDon.getSelectedRow();
        ViewModelHoaDon vmhd = listViewModelHoaDons.get(row);
        NhanVien nv = nhanVienService.getNhanVienByMa(String.valueOf(cbbNhanVien.getSelectedItem()));
        HoaDon hd = hoaDonService.getHoaDon(vmhd.getId());

        for (ViewModelChiTietHoaDon x : listViewModelChiTietHoaDons) {
            HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();
            hoaDonChiTiet.setChiTietSanPham(x.getChiTietSanPham());
            hoaDonChiTiet.setSoLuong(x.getSoLuong());
            hoaDonChiTiet.setDonGia(x.getDonGia());
            hoaDonChiTiet.setHoaDon(hd);
            list.add(hoaDonChiTiet);
        }

        for (HoaDonChiTiet hoaDonChiTiet : list) {
            hoaDonChiTietService.save(hoaDonChiTiet);
        }

        for (ViewModelHoaDon x : listViewModelHoaDons) {
            ViewModelHoaDon newHoaDon = hoaDonService.getHoaDonById(vmhd.getId());
            x.setNhanVien(nv);
            hoaDonService.updateHoaDon(x);
        }

        for (ViewModelChiTietHoaDon i : listViewModelChiTietHoaDons) {
            ChiTietSanPham ctsp = chiTietSanPhamService.getChiTietSanPham(i.getChiTietSanPham().getIdCTSP());
            ViewModelSanPham newView = chiTietSanPhamService.getById(i.getChiTietSanPham().getIdCTSP());
            ViewModelChiTietHoaDon chiTietHoaDon = hoaDonChiTietService.getChiTietSanPham(ctsp);
            newView.setSoLuongTon(newView.getSoLuongTon() - chiTietHoaDon.getSoLuong());
            chiTietSanPhamService.updateCTSP(newView);
        }

        listViewModelSanPhams = chiTietSanPhamService.getListCTSP();
        listViewModelHoaDons = hoaDonService.getListHoaDon();
        showDataTableHoaDon(listViewModelHoaDons);
        showDataTableSanPham(listViewModelSanPhams);
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void showDataTableHoaDon(List<ViewModelHoaDon> lists) {
        STT = 1;
        modelHoaDon.setRowCount(0);
        for (ViewModelHoaDon vmhd : lists) {
            modelHoaDon.addRow(new Object[]{STT++, vmhd.getMa(), vmhd.getNgayTao(),
                vmhd.getNhanVien() == null ? "Null" : vmhd.getNhanVien().getTen(),
                vmhd.getTinhTrang() == 0 ? "Cho thanh toan" : "Da thanh toan"});
        }
    }

    private void showDataTableSanPham(List<ViewModelSanPham> lists) {
        STT = 1;
        modelSanPham.setRowCount(0);
        for (ViewModelSanPham sp : lists) {
            modelSanPham.addRow(new Object[]{STT++, sp.getSanPham().getMaSP(), sp.getSanPham().getTenSP(),
                sp.getNamBH(), sp.getMoTa(), sp.getSoLuongTon(), sp.getGiaNhap(), sp.getGiaBan()});
        }
    }

    private void showDataTableGioHang(List<ViewModelChiTietHoaDon> lists) {
        STT = 1;
        modelGioHang.setRowCount(0);
        for (ViewModelChiTietHoaDon gh : lists) {
            modelGioHang.addRow(new Object[]{STT++, gh.getChiTietSanPham().getSanPham().getMaSP(),
                gh.getChiTietSanPham().getSanPham().getTenSP(),
                gh.getSoLuong(), gh.getDonGia(), gh.thanhTien(gh.getSoLuong(), gh.getDonGia())});
        }
    }

    private void loadComBoBoxNhanVien() {
        for (NhanVien x : listNhanViens) {
            comboboxNhanVien.addElement(x.getMa());
        }
    }

    private void fillData(int index) {
        ViewModelHoaDon hd = listViewModelHoaDons.get(index);
        txtMaHoaDon.setText(hd.getMa());
        txtTenNhanVien.setText(hd.getNhanVien().getTen());
        txtNgayTao.setText(String.valueOf(hd.getNgayTao()));
        if (hd.getNhanVien() == null) {
            cbbNhanVien.setSelectedItem("Null");
        } else {
            cbbNhanVien.setSelectedItem(hd.getNhanVien().getMa());
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewBanHang.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBanHang.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBanHang.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBanHang.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JComboBox<String> cbbNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton radioChoThanhToan;
    private javax.swing.JRadioButton radioDaHuy;
    private javax.swing.JRadioButton radioDaThanhToan;
    private javax.swing.JRadioButton radioTatCa;
    private javax.swing.JTable tbGioHang;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}

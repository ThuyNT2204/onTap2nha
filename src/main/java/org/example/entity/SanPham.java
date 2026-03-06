package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class SanPham {
    private String ma;
    private String ten;
    private int namBaoHanh;
    private float gia;
    private int soLuong;
    private String danhMuc;
}

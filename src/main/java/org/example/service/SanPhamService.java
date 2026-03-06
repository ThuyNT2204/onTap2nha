package org.example.service;

import org.example.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    List<SanPham> list = new ArrayList<>();
    public SanPham update(SanPham sanPham){
        if(sanPham==null){
            throw new IllegalArgumentException("k tim thay sp");
        }
        if (sanPham.getMa()==null || sanPham.getMa().trim().isEmpty()){
            throw new IllegalArgumentException("ma k dc trong");
        }
        if (sanPham.getTen()==null || sanPham.getTen().trim().isEmpty()){
            throw new IllegalArgumentException("ten k dc trong");
        }
        if (sanPham.getDanhMuc()==null || sanPham.getDanhMuc().trim().isEmpty()){
            throw new IllegalArgumentException("danh muc k dc trong");
        }
        if (sanPham.getNamBaoHanh()<0){
            throw new IllegalArgumentException("nam phai lon hon 0");
        }
        if (sanPham.getGia()<0){
            throw new IllegalArgumentException("gia phai lon hon 0");
        }
        if (sanPham.getSoLuong()<0){
            throw new IllegalArgumentException("so luong phai lon hon 0");
        }
        for(SanPham sp:list){
            if(sp.getMa().equals(sanPham.getMa())){
                sp.setTen(sanPham.getTen());
                sp.setNamBaoHanh(sanPham.getNamBaoHanh());
                sp.setGia(sanPham.getGia());
                sp.setSoLuong(sanPham.getSoLuong());
                sp.setDanhMuc(sanPham.getDanhMuc());
                return sp;
            }
        }
        throw new IllegalArgumentException("k tim thay ");
    }
    public SanPham getSanPham(String ma){
       for(SanPham sp:list){
           if (sp.getMa().equals(ma)){
               return sp;
           }
       }
       return null;
    }
    public void add(SanPham sp){
        list.add(sp);
    }
}

import org.example.entity.SanPham;
import org.example.service.SanPhamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SanPhamTest {
    SanPhamService service;
    @BeforeEach
    public void setup(){
        service = new SanPhamService();
    }
    @Test
    public void testSanPham(){
        SanPham sp =new SanPham("sp1","ao",4,56.500f,45,"ao so mi");
        service.add(sp);
        SanPham sp1 =new SanPham("sp1","ao",1,56.500f,45,"ao so mi");
        service.update(sp1);
        SanPham rs = service.getSanPham("sp1");
        Assertions.assertEquals(1,rs.getNamBaoHanh());
    }
    @Test
    public void testSanPhamC1(){
        SanPham sp =new SanPham("sp2","ao",4,56.500f,45,"ao so mi");
        service.add(sp);
        SanPham sp1 =new SanPham("sp2","ao",2,56.500f,45,"ao so mi");
        service.update(sp1);
        SanPham rs = service.getSanPham("sp2");
        Assertions.assertEquals(2,rs.getNamBaoHanh());
    }
    @Test
    public void testSanPhamSLMin(){
        SanPham sp =new SanPham("sp2","ao",4,56.500f,45,"ao so mi");
        service.add(sp);
        SanPham sp1 =new SanPham("sp2","ao",4,56.500f,1,"ao so mi");
        service.update(sp1);
        SanPham rs = service.getSanPham("sp2");
        Assertions.assertEquals(1,rs.getSoLuong());
    }
    @Test
    public void testSanPhamSLMinCong1(){
        SanPham sp =new SanPham("sp2","ao",4,56.500f,45,"ao so mi");
        service.add(sp);
        SanPham sp1 =new SanPham("sp2","ao",4,56.500f,2,"ao so mi");
        service.update(sp1);
        SanPham rs = service.getSanPham("sp2");
        Assertions.assertEquals(2,rs.getSoLuong());
    }
    @Test
    public void testSanPhamSLMinTru1(){
        SanPham sp =new SanPham("sp2","ao",4,56.500f,0,"ao so mi");
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->service.update(sp));
    }
}

import org.example.entity.TinhTong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhTongTest {
    TinhTong obj = new TinhTong();
    //phanvung tuong duong
    @Test
    public void testTinhTongPhanVungAm() {
        Assertions.assertEquals(0,obj.tinhTong(-3));
    }
    @Test
    public void testTinhTongTrongPhanVung() {
        Assertions.assertEquals(9,obj.tinhTong(6));
    }
    @Test
    public void testTinhTongBienMin() {
        Assertions.assertEquals(1,obj.tinhTong(1));
    }
    @Test
    public void testTinhTongBienMinCong1() {
        Assertions.assertEquals(1,obj.tinhTong(2));
    }
    @Test
    public void testTinhTongBienMinTru1() {
        Assertions.assertEquals(0,obj.tinhTong(0));
    }
}

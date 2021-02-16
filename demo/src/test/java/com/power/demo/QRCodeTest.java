package com.power.demo;

import com.power.demo.util.QRCodeUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QRCodeTest {

    @Test
    public void qrcodeTest() {
        // 存放在二维码中的内容
        String text = "牛年大吉！";
        // 嵌入二维码的图片路径
        String imgPath = "E:/javaTest/niu.jpg";
        // 生成的二维码的路径及名称
        String destPath = "E:/javaTest/qr.jpg";
        try {
            // 生成二维码
            QRCodeUtil.encode(text, imgPath, destPath);
            // 解析二维码
            String str = QRCodeUtil.decode(destPath);
            // 打印出解析出的内容
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

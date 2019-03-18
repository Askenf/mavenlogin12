package com.wx.web.goods;

import com.wx.bean.goodsInfo;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "getCommodityList")
public class GetCommodityList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置网页响应类型
        response.setContentType("text/html");
        //解决中文乱码
        response.setContentType("text/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        //商品id=1
        goodsInfo goodsInfo = new goodsInfo();
        goodsInfo.setGoodsSellNum(2);
        goodsInfo.setGoodsId(1);
        goodsInfo.setGoodsName("铜制印章");
        goodsInfo.setGoodsType(1);
        goodsInfo.setGoodsPrice(100);
        goodsInfo.setGoodsImg("http://192.168.0.7:8081/img/conImgRct@2x.png");
        //商品id=2
        goodsInfo goodsInfo2 = new goodsInfo();
        goodsInfo2.setGoodsSellNum(4);
        goodsInfo2.setGoodsId(2);
        goodsInfo2.setGoodsName("回墨印章");
        goodsInfo2.setGoodsType(2);
        goodsInfo2.setGoodsPrice(200);
        goodsInfo2.setGoodsImg("http://192.168.0.7:8081/img/conImgRct@2x.png");
        //商品id=3
        goodsInfo goodsInfo3 = new goodsInfo();
        goodsInfo3.setGoodsSellNum(5);
        goodsInfo3.setGoodsId(3);
        goodsInfo3.setGoodsName("物电印章");
        goodsInfo3.setGoodsType(3);
        goodsInfo3.setGoodsPrice(300);
        goodsInfo3.setGoodsImg("http://192.168.0.7:8081/img/conImgRct@2x.png");
        //商品id=4
        goodsInfo goodsInfo4 = new goodsInfo();
        goodsInfo4.setGoodsSellNum(2);
        goodsInfo4.setGoodsId(4);
        goodsInfo4.setGoodsName("电子印章");
        goodsInfo4.setGoodsType(4);
        goodsInfo4.setGoodsPrice(400);
        goodsInfo4.setGoodsImg("http://192.168.0.7:8081/img/conImgRct@2x.png");
        //商品id=5
        goodsInfo goodsInfo5 = new goodsInfo();
        goodsInfo5.setGoodsSellNum(2);
        goodsInfo5.setGoodsId(5);
        goodsInfo5.setGoodsName("普通印章");
        goodsInfo5.setGoodsType(5);
        goodsInfo5.setGoodsPrice(500);
        goodsInfo5.setGoodsImg("http://192.168.0.7:8081/img/conImgRct@2x.png");

        JSONObject jsonObject = JSONObject.fromObject(goodsInfo);
        JSONObject jsonObject2 = JSONObject.fromObject(goodsInfo2);
        JSONObject jsonObject3 = JSONObject.fromObject(goodsInfo3);
        JSONObject jsonObject4 = JSONObject.fromObject(goodsInfo4);
        JSONObject jsonObject5 = JSONObject.fromObject(goodsInfo5);
//        System.out.println(jsonObject.toString());
        response.getWriter().write(jsonObject.toString());
        response.getWriter().write(jsonObject.toString());
        response.getWriter().write(jsonObject.toString());
        response.getWriter().write(jsonObject2.toString());
        response.getWriter().write(jsonObject2.toString());
        response.getWriter().write(jsonObject2.toString());
        response.getWriter().write(jsonObject3.toString());
        response.getWriter().write(jsonObject3.toString());
        response.getWriter().write(jsonObject3.toString());
        response.getWriter().write(jsonObject4.toString());
        response.getWriter().write(jsonObject4.toString());
        response.getWriter().write(jsonObject4.toString());
        response.getWriter().write(jsonObject5.toString());
        response.getWriter().write(jsonObject5.toString());
        response.getWriter().write(jsonObject5.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

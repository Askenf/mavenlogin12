package com.wx.web.goods;

import com.wx.bean.goodsInfo;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "getCommodityByType")
public class GetCommodityByType extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置网页响应类型
        response.setContentType("text/html");
        //实现具体操作
//        String account = request.getParameter("account");
//        String pwd = request.getParameter("pwd");
//        System.out.println(account+":"+pwd);



//            response.setHeader("Access-Control-Allow-Origin", "*");
////            response.setHeader("Cache-Control","no-cache");
//            response.addHeader("Access-Control-Allow-Credentials", "true");
//            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
//            response.addHeader("Access-Control-Allow-Headers", "Content-Type");
//
        //解决中文乱码
        response.setContentType("text/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
//商品id=1
        goodsInfo goodsInfo = new goodsInfo();
        goodsInfo.setGoodsSKU(2);
        goodsInfo.setGoodsId(1);
        goodsInfo.setGoodsPrice(100);
        goodsInfo.setGoodsFreight(0);
        goodsInfo.setGoodsMsg("这个是商品的说明，后面还有一大堆文字来介绍商品的各种特性");
        goodsInfo.setGoodsNote("这是商品的注意事项，主要写着商品的使用注意");
        goodsInfo.setGoodsImg("http://192.168.0.7:8081/img/conImgRct@2x.png");
        goodsInfo.setGoodsImg2("http://192.168.0.7:8081/img/DepImg@2x.png");
        goodsInfo.setGoodsSellNum(1000);
        goodsInfo.setGoodsTitle("这是商品标题1");
        goodsInfo.setContent("商品介绍详情这是很好的商品，请一定要买上一两个，走过路过不要错过啊，一块钱俩，两块钱仨，三块钱四个啦");
//商品id=2
        goodsInfo goodsInfo1 = new goodsInfo();
        goodsInfo1.setGoodsSKU(4);
        goodsInfo1.setGoodsId(2);
        goodsInfo1.setGoodsPrice(200);
        goodsInfo1.setGoodsFreight(40);
        goodsInfo1.setGoodsMsg("这个是商品222的说明，后面还有一大堆文字来介绍商品的各种特性");
        goodsInfo1.setGoodsNote("这是商品222的注意事项，主要写着商品的使用注意");
        goodsInfo1.setGoodsImg("http://192.168.0.7:8081/img/conImgRct@2x.png");
        goodsInfo1.setGoodsImg2("http://192.168.0.7:8081/img/DepImg@2x.png");
        goodsInfo1.setGoodsSellNum(2000);
        goodsInfo1.setGoodsTitle("这是商品222标题1");
        goodsInfo1.setContent("商品222介绍详情这是很好的商品，请一定要买上一两个，走过路过不要错过啊，一块钱俩，两块钱仨，三块钱四个啦");
//        商品1
        JSONObject jsonObject = JSONObject.fromObject(goodsInfo);
        System.out.println(jsonObject.toString());
        response.getWriter().write(jsonObject.toString());
//        商品2
        JSONObject jsonObject1 = JSONObject.fromObject(goodsInfo1);
        System.out.println(jsonObject1.toString());
        response.getWriter().write(jsonObject1.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

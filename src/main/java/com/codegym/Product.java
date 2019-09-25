package com.codegym;

import java.io.IOException;

public class Product extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        String product = req.getParameter("description");
        float price = Float.parseFloat(req.getParameter("price"));
        float discountPercent=Float.parseFloat(req.getParameter("discount_percent"));
        float discountAmount = (float) (price * discountPercent * 0.01);
        float discountPrice = price - discountAmount;
        String display ="<head>\n" +
                "    <title>Product Discount Calculator</title>\n" +
                "</head>\n" +
                "<style>\n" +
                "    #content{\n" +
                "        width: 450px;\n" +
                "        margin: 0 auto;\n" +
                "        padding: 0px 20px 20px;\n" +
                "        background: white;\n" +
                "        border: 2px solid navy;\n" +
                "    }\n" +
                "\n" +
                "    h1{\n" +
                "        color: navy;\n" +
                "    }\n" +
                "\n" +
                "    label{\n" +
                "        width: 10em;\n" +
                "        padding-right: 1em;\n" +
                "        float: left;\n" +
                "    }\n" +
                "\n" +
                "    #data input{\n" +
                "        float: left;\n" +
                "        width: 15em;\n" +
                "        margin-bottom: .5em;\n" +
                "    }\n" +
                "\n" +
                "    #buttons input{\n" +
                "        float: left;\n" +
                "        margin-bottom: .5em;\n" +
                "    }\n" +
                "    br{\n" +
                "        clear: left;\n" +
                "    }\n" +
                "</style>\n" +
                "<body>\n" +
                "<div id=\"content\">\n" +
                "    <h1>Product Discount Calculator</h1>\n" +
                "    <label>Product Description: </label>\n" +
                "    <span>"+ product + "</span><br/>\n" +
                "    <label>Price: </label>\n" +
                "    <span>" +price+ "</span><br/>\n" +
                "    <label>Discount Percent: </label>\n" +
                "    <span>" +discountPercent+ "%</span><br/>\n" +
                "    <label>Discount Amount: </label>\n" +
                "    <span>$" +discountAmount+ "</span><br/>\n" +
                "    <label>Discount Price: </label>\n" +
                "    <span>$" +discountPrice+ "</span><br/>\n" +
                "</div>\n" +
                "</body>";

        resp.getOutputStream().println(display);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        String product = "<head>\n" +
                "    <title>Product Discount Calculator</title>\n" +
                "</head>\n" +
                "<style>\n" +
                "    #content{\n" +
                "        width: 450px;\n" +
                "        margin: 0 auto;\n" +
                "        padding: 0px 20px 20px;\n" +
                "        background: white;\n" +
                "        border: 2px solid navy;\n" +
                "    }\n" +
                "\n" +
                "    h1{\n" +
                "        color: navy;\n" +
                "    }\n" +
                "\n" +
                "    label{\n" +
                "        width: 10em;\n" +
                "        padding-right: 1em;\n" +
                "        float: left;\n" +
                "    }\n" +
                "\n" +
                "    #data input{\n" +
                "        float: left;\n" +
                "        width: 15em;\n" +
                "        margin-bottom: .5em;\n" +
                "    }\n" +
                "\n" +
                "    #buttons input{\n" +
                "        float: left;\n" +
                "        margin-bottom: .5em;\n" +
                "    }\n" +
                "    br{\n" +
                "        clear: left;\n" +
                "    }\n" +
                "</style>\n" +
                "<body>\n" +
                "<div id=\"content\">\n" +
                "    <h1>Product Discount Calculator</h1>\n" +
                "    <form method=\"post\" action=\"\">\n" +
                "        <div id=\"data\">\n" +
                "            <label>Product Description:</label>\n" +
                "            <input type=\"text\" name=\"description\"/><br/>\n" +
                "            <label>List Price:</label>\n" +
                "            <input type=\"text\" name=\"price\"/><br/>\n" +
                "            <label>Discount Percent:</label>\n" +
                "            <input type=\"text\" name=\"discount_percent\"/>(%)<br/>\n" +
                "        </div>\n" +
                "        <div id=\"buttons\">\n" +
                "            <label>&nbsp;</label>\n" +
                "            <input type=\"submit\" value=\"Calculate Discount\"/>\n" +
                "        </div>\n" +
                "    </form>\n" +
                "</div>\n" +
                "</body>";
        resp.getOutputStream().println(product);
    }
}


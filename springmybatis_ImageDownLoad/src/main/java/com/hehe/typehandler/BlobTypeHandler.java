//package com.hehe.typehandler;
//
//import org.apache.ibatis.type.BaseTypeHandler;
//import org.apache.ibatis.type.JdbcType;
//
//import java.sql.*;
//
//
//public class BlobTypeHandler extends BaseTypeHandler<String> {
//    //查询的
//    @Override
//    public String getNullableResult(ResultSet rs, String image) throws
//            SQLException {
//        Blob blob = rs.getBlob(image);
//        byte[] returnValue = null;
//        if (null != blob) {
//            returnValue = blob.getBytes(1, (int) blob.length());
//        }
//        //将取出的流对象转为utf-8的字符串对象
//        return String.valueOf(returnValue);//String(returnValue, "utf-8");
//    }
//
//
//    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType)
//            throws SQLException {
//
////        //声明一个输入流对象
////        ByteArrayInputStream bis;
////        try {
////            //把字符串转为字节流
////            bis = new ByteArrayInputStream(parameter.getBytes('utf-8'));
////        } catch (UnsupportedEncodingException e) {
////            throw new RuntimeException("Blob Encoding Error!");
////        }
////        ps.setBinaryStream(i, bis, parameter.length());
//    }
//
//
//
//    @Override
//    public String getNullableResult(ResultSet resultSet, int i)
//            throws SQLException {
//        return null;
//    }
//
//    @Override
//    public String getNullableResult(CallableStatement callableStatement, int i)
//            throws SQLException {
//        return null;
//    }
//
//
//}

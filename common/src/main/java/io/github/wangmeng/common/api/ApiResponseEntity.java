package io.github.wangmeng.common.api;

import java.util.HashMap;
import java.util.Map;

public class ApiResponseEntity extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public ApiResponseEntity() {
        put("code", 0);
        put("msg", "操作成功");
    }

    public static ApiResponseEntity error() {
        return error(500, "操作失败");
    }

    public static ApiResponseEntity operate(boolean b){
        if(b){
            return ApiResponseEntity.ok();
        }
        return ApiResponseEntity.error();
    }

    public static ApiResponseEntity error(String msg) {
        return error(500, msg);
    }

    public static ApiResponseEntity error(int code, String msg) {
        ApiResponseEntity ApiResponseEntity = new ApiResponseEntity();
        ApiResponseEntity.put("code", code);
        ApiResponseEntity.put("msg", msg);
        return ApiResponseEntity;
    }

    public static ApiResponseEntity error(int code, String msg,Object data) {
        ApiResponseEntity ApiResponseEntity = new ApiResponseEntity();
        ApiResponseEntity.put("code", code);
        ApiResponseEntity.put("msg", msg);
        ApiResponseEntity.put("data",data);
        return ApiResponseEntity;
    }

    public static ApiResponseEntity ok(String msg) {
        ApiResponseEntity ApiResponseEntity = new ApiResponseEntity();
        ApiResponseEntity.put("msg", msg);
        return ApiResponseEntity;
    }

    public static ApiResponseEntity ok(Map<String, Object> map) {
        ApiResponseEntity ApiResponseEntity = new ApiResponseEntity();
        ApiResponseEntity.putAll(map);
        return ApiResponseEntity;
    }

    public static ApiResponseEntity ok() {
        return new ApiResponseEntity();
    }

    public static ApiResponseEntity error401() {
        return error(401, "你还没有登录");
    }

    public static ApiResponseEntity error403() {
        return error(403, "你没有访问权限");
    }

    public static ApiResponseEntity data(Object data){
        return ApiResponseEntity.ok().put("data",data);
    }

    public static ApiResponseEntity page(Object page){
        return ApiResponseEntity.ok().put("page",page);
    }

    @Override
    public ApiResponseEntity put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}

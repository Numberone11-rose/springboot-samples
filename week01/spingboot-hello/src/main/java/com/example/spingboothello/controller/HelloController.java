package com.example.spingboothello.controller;

import com.example.spingboothello.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello 接口控制器
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * Hello 接口实现
     * @return 统一格式的响应结果
     */
    @GetMapping("/hello")
    public ResultVO<String> hello() {
        // 返回规格文档要求的响应内容
        return ResultVO.success("Hello Spring Boot");
    }
}
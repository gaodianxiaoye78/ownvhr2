package cn.gdut.vhr.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试模块")
@RestController
@RequestMapping("/test")
public class TestController {

    //测试Swagger
    @ApiOperation(value = "测试Swagger")
    @GetMapping("/testSwagger/{message}")

    public String test(
            @ApiParam(name = "message", value = "信息")
            @PathVariable String message) {
        System.out.println(message);
        return "成功";
    }
}

package com.citrsw.apiexample;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.citrsw.annatation.ApiEnable;
import com.citrsw.annatation.ApiGlobalClass;
import com.citrsw.annatation.ApiGlobalCode;
import com.citrsw.annatation.ApiProperty;
import com.citrsw.enumeration.TypeEnum;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.citrsw.apiexample.mapper")
@EnableAsync
@ApiEnable(name = "JavaApiDocs示例", underscore = true,actives = {"test","pro"})
@ApiGlobalClass(name = Page.class, type = TypeEnum.PARAM, properties = {
        @ApiProperty(name = "current", description = "当前页", defaultValue = "1"),
        @ApiProperty(name = "size", description = "每页显示条数", defaultValue = "10"),
        @ApiProperty(name = "orders.asc", description = "排序方式"),
        @ApiProperty(name = "orders.column", description = "排序字段")
})
@ApiGlobalClass(name = Page.class, description = "分页", type = TypeEnum.RETURN, properties = {
        @ApiProperty(name = "current", description = "当前页"),
        @ApiProperty(name = "size", description = "每页显示条数"),
        @ApiProperty(name = "records"),
        @ApiProperty(name = "previous", description = "是否有上一页"),
        @ApiProperty(name = "next", description = "是否有下一页"),
        @ApiProperty(name = "total", description = "总条数"),
        @ApiProperty(name = "pages", description = "总页数"),
})
@ApiGlobalCode(name = "code", value = "200", description = "成功")
@ApiGlobalCode(name = "code", value = "300", description = "失败")
@ApiGlobalCode(name = "code", value = "400", description = "token失效")
@ApiGlobalCode(name = "code", value = "500", description = "系统内部异常")
public class ApiExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiExampleApplication.class, args);
    }

}

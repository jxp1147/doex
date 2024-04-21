package org.example.doex;


import org.springframework.boot.test.context.SpringBootTest;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.util.Collections;
@SpringBootTest
public class CodeGenerate {
//    public static void main(String[] args) {
//    String url = "jdbc:mysql://localhost:3306/doex?useSSL=false&userUnicode=true&characterEncoding=utf-8";
//    String username = "root";
//    String password = "123456";
//    String path="F:\\code\\doex\\src\\main\\java"; // 指定输出目录 生成代码的路径
//    String moduleName = "doex"; // 设置父包模块名
//    String[] tableNames = { "user_type","industries","jobs","users","achieves", "exercises" };
//    String mapperLocation = path+"\\mapper\\"+moduleName;
//    String tablePrefix="s_";
//    System.out.println(mapperLocation);
//    FastAutoGenerator.create(url, username, password)
//        .globalConfig(builder -> {
//          builder.author("jxp") // 设置作者
//              .enableSwagger() // 开启 swagger 模式
//              .fileOverride() // 覆盖已生成文件
//              .outputDir(path); // 指定输出目录 生成代码的路径
//        })
//        .packageConfig(builder -> {
//          builder.parent("org.example") // 设置父包名
//              .moduleName(moduleName) // 设置父包模块名
//              .pathInfo(Collections.singletonMap(OutputFile.mapperXml, mapperLocation)); // 设置mapperXml生成路径
//        })
//        .strategyConfig(builder -> {
//          builder.addInclude(tableNames) // 设置需要生成的表名
//              .addTablePrefix(tablePrefix); // 设置过滤表前缀
//        })
//        .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
//        .execute();
//	}
}

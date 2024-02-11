package com.sky.controller.admin;

import com.sky.constant.MessageConstant;
import com.sky.properties.AliOssProperties;
import com.sky.result.Result;
import com.sky.utils.AliOssUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.enums.Enum;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/admin/common")
@Api(tags = "通用接口")
@Slf4j
public class CommonController {

    // TODO 没有服务器所以注入失败，以后需要添加
    // @Autowired
    // private AliOssUtil aliOssUtil;

    @PostMapping("/upload")
    @ApiOperation("文件上传")
    public Result<String> upload(MultipartFile file){
        log.info("上传文件:{}", file);

        // try {
            String originalFilename = file.getOriginalFilename();
            // 截取文件类型
            String fileType = originalFilename.substring(originalFilename.lastIndexOf("."));
            String objectName = UUID.randomUUID().toString() + fileType;
            // String filePath = aliOssUtil.upload(file.getBytes(), objectName);
            // return Result.success(filePath);
        // } catch (IOException e) {
            // throw new RuntimeException(e);
            // log.error("上传文件失败: {}", e);
        // }

        return Result.error(MessageConstant.UPLOAD_FAILED);
    }
}

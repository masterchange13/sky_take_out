package com.sky.config;

import com.sky.properties.AliOssProperties;
import com.sky.utils.AliOssUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 配置类，用于创建AliOssUtil对象
 * @author mao
 */
// @Configuration
@Slf4j
public class OssConfiguration {

    // 阿里云OSS的AccessKeyId
    // private String accessKeyId;
    // 阿里云OSS的AccessKeySecret
    // private String accessKeySecret;
    // 阿里云OSS的Endpoint
    // private String endpoint;
    // 阿里云OSS的BucketName
    // private String bucketName;

    // TODO 现在没有服务器，所以没有使用Bean，所以Autowired注入有错误
    // @Bean
    @ConditionalOnMissingBean
    public AliOssUtil aliOssUtil(AliOssProperties aliOssProperties) {
        log.info("开始创建阿里云文件上传工具类对象：{}", aliOssProperties);
        return new AliOssUtil(aliOssProperties.getEndpoint(),
                aliOssProperties.getAccessKeyId(),
                aliOssProperties.getAccessKeySecret(),
                aliOssProperties.getBucketName());
    }
}

package com.rahul.foodbasket.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software .amazon.awssdk.services.s3.S3Client;

@Configuration
public class AWSConfig {

    private final SecurityConfig securityConfig;

    private final S3Client s3Client;
    @Value("${aws.access.key}")
    private String accessKey;
    @Value("${aws.secret.key}")
    private String secretKey;
    @Value("${aws.region}")
    private String region;

    AWSConfig(S3Client s3Client, SecurityConfig securityConfig) {
        this.s3Client = s3Client;
        this.securityConfig = securityConfig;
    }

    @Bean
    S3Client s3Client() {
        return S3Client.builder()
                .region(Region.of(region))
                .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKey, secretKey)))
                .build();
    }
}

# Docker 이미지 빌드
`docker build -t developiaa/user-service:1.0 .`

# Docker 이미지 업로드
`docker push developiaa/user-service:1.0`

# Docker 실행
```shell
docker run -d --network ecommerce-network \

  --name user-service \

 -e "spring.cloud.config.uri=http://config-service:8888" \

 -e "spring.rabbitmq.host=rabbitmq" \

 -e "spring.zipkin.base-url=http://zipkin:9411" \

 -e "eureka.client.serviceUrl.defaultZone=http://discovery-service:8761/eureka/" \

 -e "logging.file=/api-logs/users-ws.log" \

 developiaa/user-service:1.0
```

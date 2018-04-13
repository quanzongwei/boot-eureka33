# boot-eureka33
重要信息:
Eureka 
  port: 8761
  管理地址:localhost:8761
  
forex service:
  port:8000,8001 使用VM参数-Dserver.port=8002在新的端口下启动应用
  h2 db:数据库会自动创建,数据自动初始化
  h2 db url:localhost:8100/h2-console
  url:jdbc:h2:mem:testdb
  user name:sa
  passwprd:
  setting and name:Generic H2 (Embedded)
  driver class:org.h2.Driver
  被ccs请求的地址: localhost:8000/forex/f/USD/t/INR

currency conversion service:
  port:8100
  请求地址:localhost:8100/ccs/from/USD/to/INR/amount/123

  
  
  

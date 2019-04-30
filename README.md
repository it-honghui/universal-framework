 您好！
      系统说明如下：
      开发环境任何地方不要包含中文路径。
      系统运行在JDK1.8+、MySQL5.5+、Maven3.0+，请按以下步骤配好环境：
      1、修改\universal-framework\framework-admin\src\main\resources的application-dev.yml里的数据库账号和密码
      2、修改\universal-framework\framework-api\src\main\resources的application-dev.yml里的数据库账号和密码
      3、修改\universal-framework\framework-generator\src\main\resources的application.yml里的数据库账号和密码
      4、在universal-framework目录下，执行mvn clean install
      5、导入Maven项目。导入系统前请将全局编码设置为UTF-8，不是GBK。SQL导入也是UTF8编码。


      启动项目【framework-admin】：
      Eclipse、IDEA运行AdminApplication.java
      framework-admin访问路径：http://localhost:8080/framework-admin
      swagger文档路径：http://localhost:8080/framework-admin/swagger/index.html
      swagger注解路径：http://localhost:8080/framework-admin/swagger-ui.html
      账号密码：admin/admin

      启动项目【framework-api】：
      Eclipse、IDEA运行ApiApplication.java
      framework-api访问路径：http://localhost:8081/framework-api/swagger-ui.html

      启动项目【framework-generator】：
      Eclipse、IDEA运行GeneratorApplication.java
      framework-generator访问路径：http://localhost:8082/framework-generator
 

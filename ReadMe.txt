Highlights:

1. web.xml 配置 spring、spring mvc
2. 配置 property loader
3. 配置連線資訊(JNDI or DBCP)
4. 配置 myBatis
5. 配置事務管理(TransactionManager)
6. 配置系統日誌(Log)

=============================================================================

Eclipse 
Oracle Database 11g Express Edition 
Tomcat v7.0 Server 
jdk7

=============================================================================

Dependency  Reference:

spring-core-4.2.4.RELEASE
spring-context-4.2.4.RELEASE
spring-webmvc-4.2.4.RELEASE
spring-jdbc-4.2.4.RELEASE
ojdbc6
commons-dbcp-1.2.2
mybatis-3.3.0
mybatis-spring-1.2.3
log4j-1.2.17
slf4j-api-1.7.14
slf4j-log4j12-1.7.14
commons-collections-3.2.2
jackson-core-2.6.5
jackson-databind-2.6.5
jstl-1.2
jquery-2.2.0.js

=============================================================================

Convert project:

Under Project Properties -> Project Facets -> Convert to faceted form... 
you can select Java - this will add the Java functionalities to your project. 
There you can also add other facets like Dynamic Web Module if necessary.
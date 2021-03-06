https://stackoverflow.com/questions/57286365/why-do-i-get-log-is-disabled-when-i-try-to-access-my-wsdl

java.lang.IllegalArgumentException: Not supported: http://javax.xml.XMLConstants/property/accessExternalStylesheet

https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot-logging-log4j2

 <resources>

        <resource>
            <directory>src/main/resources</directory>
            <targetPath>${project.build.directory}</targetPath>
            <includes>
                <include>log4j2.xml</include>
            </includes>
        </resource>

    </resources>


java.lang.NoClassDefFoundError: org.apache.poi.ooxml.util.DocumentHelper (initialization failure)
	
	<dependency>
        <groupId>xerces</groupId>
        <artifactId>xercesImpl</artifactId>
        <version>2.12.0</version>
    </dependency>

Error 404: SRVE0295E: Error reported: 404
	ibm-web-ext.xml
 <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi</artifactId>
        <version>5.2.0</version>
        <scope>compile</scope>
	
	
	
	
	
	
	
	
	
    </dependency>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>5.2.0</version>
        <scope>compile</scope>
    </dependency>
    <dependency>
        <groupId>javax.xml.stream</groupId>
        <artifactId>stax-api</artifactId>
        <version>1.0-2</version>
    </dependency>
    <dependency>
        <groupId>commons-io</groupId>
        <artifactId>commons-io</artifactId>
        <version>2.11.0</version>
    </dependency>
    
	
	java.lang.ClassCastException: org.apache.xalan.processor.TransformerFactoryImpl incompatible with javax.xml.transform.TransformerFactory
java.lang.ClassCastException: org.apache.xalan.processor.TransformerFactoryImpl incompatible with javax.xml.transform.TransformerFactory

Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.web.servlet.function.support.RouterFunctionMapping]

<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-entitymanager -->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-entitymanager</artifactId>
    <version>4.2.1.Final</version>
</dependency>

Error while adding servlet mapping --> /*.

ibm-web-ext.xmi

org.hibernate.jpa.HibernatePersistenceProvider



If you have a NoClassDefFound exception a good starting point is to look if the missing class is in one of your dependency jars. If not, add the missing dependency.

The springframework-orm POM refers to hibernate-entitymanager 4.2.8.Final (see http://central.maven.org/maven2/org/springframework/spring-orm/4.0.1.RELEASE/spring-orm-4.0.1.RELEASE.pom) You depend on 4.1.*.






Customer james = customers.stream()
  .filter(customer -> "James".equals(customer.getName()))
  .findAny()
  .orElse(null);


org.hibernate.jpa.HibernatePersistenceProvider class not found

<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-orm</artifactId>
	<version>5.0.0.RELEASE</version>
</dependency>
<!-- Thanks for using https://jar-download.com -->


<dependency>
    <groupId>org.javassist</groupId>
    <artifactId>javassist</artifactId>
    <version>3.23.1-GA</version>
</dependency>

<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.0.11.Final</version>
</dependency>
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-entitymanager</artifactId>
    <version>5.2.3.Final</version>
</dependency>




java.lang.ClassCastException: com.ibm.xml.xlxp2.api.stax.XMLEventFactoryImpl incompatible with javax.xml.stream.XMLEventFactory

Caused by: java.lang.ClassCastException: com.ibm.xml.xlxp2.api.stax.XMLEventFactoryImpl

<!-- https://mvnrepository.com/artifact/stax/stax-api -->
<dependency>
    <groupId>stax</groupId>
    <artifactId>stax-api</artifactId>
    <version>1.0.1</version>
</dependency>

<!-- https://mvnrepository.com/artifact/javax.xml.bind/jsr173_api -->
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jsr173_api</artifactId>
    <version>1.0</version>
</dependency>

amework.beans.factory.BeanCreationException: Error creating bean with name 'entityManager' defined in class path resource [org/kpcc/ws/ppcl/config/PPCLDatasourceConnectorConfig.class]: Invocation of init method failed; nested exception is java.lang.ClassCastException: com.ibm.xml.xlxp2.api.stax.XMLEventFactoryImpl incompatible with javax.xml.stream.XMLEventFactory


java.lang.NoClassDefFoundError: org/springframework/orm/jpa/vendor/SpringHibernateJpaPersistenceProvider





<configuration>
	<property resource="application.properties" />
	<property name="PATH" value="${logging.path}" />
	<property name="FILEINFO" value="${logging.file}" />

	<appender name="console"
		class="ch.qos.logback.core.ConsoleAppender">
		<encoder>
			<pattern>%d{HH:mm:ss.SSS} %-5level %logger{36} - %msg%n</pattern>
		</encoder>
	</appender>

	<appender name="file"
		class="ch.qos.logback.core.rolling.RollingFileAppender">
		<file>${PATH}/${FILEINFO}.log</file>
		<rollingPolicy
			class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
			<fileNamePattern>${PATH}/${FILEINFO}.%d{yyyy-MM-dd-HH-mm}.%i.log
			</fileNamePattern>
			<timeBasedFileNamingAndTriggeringPolicy
				class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
				<maxFileSize>10MB</maxFileSize>
			</timeBasedFileNamingAndTriggeringPolicy>
			<!-- 30 Days to keep -->
			<maxHistory>30</maxHistory>
			<!-- total size of all archive files, if total size > 10MB, it will delete 
				old archived file -->
			<totalSizeCap>10MB</totalSizeCap>
		</rollingPolicy>

		<encoder>
			<pattern>%relative [%thread] %-5level %logger{35} - %msg%n</pattern>
		</encoder>
	</appender>

	<logger name="com.kpcc.ws">
		<appender-ref ref="console" />
	</logger>


	<Root additivity="true" level="info">
		<Appender-ref ref="file" />
		<AppenderRef ref="STDOUT" />
	</Root>

</configuration>

Customer james = customers.stream()
  .filter(customer -> "James".equals(customer.getName()))
  .findAny()
  .orElse(null);


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

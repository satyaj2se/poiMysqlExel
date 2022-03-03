Customer james = customers.stream()
  .filter(customer -> "James".equals(customer.getName()))
  .findAny()
  .orElse(null);


java.lang.ClassCastException: com.ibm.xml.xlxp2.api.stax.XMLEventFactoryImpl incompatible with javax.xml.stream.XMLEventFactory

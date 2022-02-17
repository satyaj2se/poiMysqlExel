Customer james = customers.stream()
  .filter(customer -> "James".equals(customer.getName()))
  .findAny()
  .orElse(null);

# Demo of Apache Camel with Azure Service Bus on Spring Boot

## Run
Configure property spring.jms.servicebus.connection-string
The full connection string can be obtained under the Shared access policies (SAS) of the Service Bus instance in Azure Portal

Create a queue named myQueue or rename in Camel routes to an already existing queue

Run as Spring Boot application

## Customizing the connection factory
If no customization to the connection factory is required the MyConfig class can be omitted. The service bus starter dependency will create the connection factory bean.

## Docs
https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-java-how-to-use-jms-api-amqp
https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-service-bus
https://github.com/microsoft/azure-spring-boot/tree/master/azure-spring-boot-starters/azure-servicebus-jms-spring-boot-starter
https://camel.apache.org/camel-spring-boot/latest/jms-starter.html
https://qpid.apache.org/components/jms/index.html
https://github.com/Azure-Samples/spring-jms-service-bus
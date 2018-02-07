# Activiti Cloud Audit (MongoDB)

[![Join Us in Gitter](https://badges.gitter.im/Activiti/Activiti7.svg)](https://gitter.im/Activiti/Activiti7?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Build Status Travis](https://travis-ci.org/Activiti/activiti-cloud-audit-mongodb.svg?branch=master)](https://travis-ci.org/Activiti/activiti-cloud-audit-mongodb)
[![Coverage Status](http://img.shields.io/codecov/c/github/Activiti/activiti-cloud-audit-mongodb/master.svg?maxAge=86400)](https://codecov.io/gh/Activiti/activiti-cloud-audit-mongodb)
[![ASL 2.0](https://img.shields.io/hexpm/l/plug.svg)](https://github.com/Activiti/activiti-cloud-audit-mongodb/blob/master/LICENSE.txt)  [![CLA](https://cla-assistant.io/readme/badge/Activiti/activiti-cloud-audit-mongodb)](https://cla-assistant.io/Activiti/activiti-cloud-audit-mongodb)
[![Docker Build Status](https://img.shields.io/docker/build/activiti/activiti-cloud-audit-mongodb.svg)](https://hub.docker.com/r/activiti/activiti-cloud-audit-mongodb)
[![Known Vulnerabilities](https://snyk.io/test/github/Activiti/activiti-cloud-audit-mongodb/badge.svg)](https://snyk.io/test/github/Activiti/activiti-cloud-audit-mongodb)

Activiti Cloud Audit Service MongoDB Implementation. This service uses MongoDB Database to store events emitted by Runtime Bundles as they come in as JSON Documents.

As all our services, this module was build using the [activiti-cloud-starter-audit-mongodb](https://github.com/activiti/activiti-cloud-audit-service) module, that you can use to create your own version of this service as with any other Spring Boot Starter.  

For more information about his module and the starters you can take a look at our [Activiti & Activiti Cloud GitBook](https://activiti.gitbooks.io/activiti-7-developers-guide/content/components/activiti-cloud-app/AuditService.html)

[Docker Image](https://hub.docker.com/r/activiti/activiti-cloud-audit-mongodb/)

## Building & Running this Service
You can build this service from source using Git & Maven or you can just run our Docker Image. 

### Spring Boot: 
> git clone https://github.com/Activiti/activiti-cloud-audit-mongodb.git
> cd activiti-cloud-audit-mongodb/
> mvn clean install spring-boot:run

### Docker: 
> docker run -p 8181:8181 -d --name activiti-cloud-audit-mongodb activiti/activiti-cloud-audit-mongodb:latest


## Environemnt Variables

```
server.port=${ACT_AUDIT_PORT:8181}
spring.application.name=${ACT_AUDIT_APP_NAME:audit}
spring.cloud.stream.bindings.auditConsumer.destination=${ACT_AUDIT_CONSUMER_DEST:engineEvents}
spring.cloud.stream.bindings.auditConsumer.group=${ACT_AUDIT_CONSUMER_GROUP:audit}
spring.cloud.stream.bindings.auditConsumer.contentType=${ACT_AUDIT_CONSUMER_CONTENT_TYPE:application/json}
spring.jackson.serialization.fail-on-unwrapped-type-identifiers=${ACT_AUDIT_JACKSON_FAIL_ON_UNWRAPPED_IDS:false}
keycloak.auth-server-url=${ACT_KEYCLOAK_URL:http://activiti-cloud-sso-idm:8180/auth}
keycloak.realm=${ACT_KEYCLOAK_REALM:springboot}
keycloak.resource=${ACT_KEYCLOAK_RESOURCE:activiti}
keycloak.ssl-required=${ACT_KEYCLOAK_SSL_REQUIRED:none}
keycloak.public-client=${ACT_KEYCLOAK_CLIENT:true}
keycloak.security-constraints[0].authRoles[0]=${ACT_KEYCLOAK_ROLES:user}
keycloak.security-constraints[0].securityCollections[0].patterns[0]=${ACT_KEYCLOAK_PATTERNS:/*}
keycloak.principal-attribute=${ACT_KEYCLOAK_PRINCIPAL_ATTRIBUTE:preferred-username}
activiti.keycloak.admin-client-app=${ACT_KEYCLOAK_CLIENT_APP:admin-cli}
activiti.keycloak.client-user=${ACT_KEYCLOAK_CLIENT_USER:client}
activiti.keycloak.client-password=${ACT_KEYCLOAK_CLIENT_PASSWORD:client}
spring.rabbitmq.host=${ACT_RABBITMQ_HOST:rabbitmq}
eureka.client.serviceUrl.defaultZone=${ACT_EUREKA_URL:http://activiti-cloud-registry:8761/eureka/}
eureka.instance.hostname=${ACT_AUDIT_HOST:activiti-cloud-audit}
eureka.client.enabled=${ACT_AUDIT_EUREKA_CLIENT_ENABLED:true}
spring.data.mongodb.host=${ACT_AUDIT_MONGO_HOST:mongodb}
spring.data.mongodb.port=${ACT_AUDIT_MONGO_PORT:27017}
spring.data.mongodb.database=${ACT_AUDIT_MONGO_DB:activitidb}
```
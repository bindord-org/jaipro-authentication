# eureka-authentication

### Generate image
```
mvn clean package
docker build -t ${image-name}:${tag} --file ./src/main/devops/Dockerfile ./target
```

### Reproducer for spring-projects/spring-framework#30985

1. Build the native image:

> ./mvnw -Pnative clean spring-boot:build-image

2. Run the native image:

> docker run --rm spring-native-lazy-bug:1.0
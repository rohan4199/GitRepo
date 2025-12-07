
# Maven Java Skeleton

A minimal Maven Java project with JUnit 5 tests.

## Build
```bash
mvn -B -ntp clean verify
```

## Run
```bash
mvn -q exec:java -Dexec.mainClass=com.example.app.App
```
(You may need to add the exec-maven-plugin to `pom.xml` for running.)

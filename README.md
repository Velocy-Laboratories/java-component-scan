# java-component-scan

Find annotations inside classed, methods and fields.

## Installation

Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>org.velocy</groupId>
    <artifactId>java-component-scan</artifactId>
    <version>{VERSION}</version>
</dependency>
```

Gradle
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("org.velocy:java-component-scan:{VERSION}")
}
```

## Usage

```java
// Get classes
Set<Class<?>> classes = ComponentScan.of("org.velocy").getAnnotatedClasses(MyAnnotation.class);

// Get methods
Set<Method> methods = ComponentScan.of("org.velocy").getAnnotatedMethods(MyAnnotation.class);

// Get fields 
Set<Field> fields = ComponentScan.of("org.velocy").getAnnotatedFields(MyAnnotation.class);

// Do something with the classes, methods and fields
```

## License

&copy; Velocy Labs; Licensed under the [MIT License](LICENSE).
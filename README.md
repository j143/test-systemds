# test-systemds

### 1. Creating an empty maven project

```sh
mvn -B archetype:generate   \
  -DarchetypeGroupId=org.apache.maven.archetypes   \
  -DgroupId=page.janardhan.labs   \
  -DartifactId=test-systemds
```


### 2. Add SystemDS to `pom.xml`
Then add 

```xml
<!-- 
    maven.apache.org/guides/mini/guide-multiple-repositories.html -->
  <repositories>
    <repository>
      <id>nexus-staging</id>
      <name>Nexus OSS Staging repo</name>
      <url>https://repository.apache.org/content/groups/staging/</url>
    </repository>
  </repositories>
  
  <dependencies>
    
    <dependency>
      <groupId>org.apache.systemds</groupId>
      <artifactId>systemds</artifactId>
      <version>2.1.0</version>
   </dependency>
  </dependencies>
```

### 3. Building the project

Run

```sh
mvn clean package
```

### 4. Usage

Call SystemDS functions like this

```java
// Importing Apache SystemDS library
import static org.apache.sysds.api.mlcontext.ScriptFactory.dmlFromUrl;
import org.apache.sysds.api.mlcontext.Script;

public class App 
{
    public static void main( String[] args )
    {
        
        String urlString = "https://raw.githubusercontent.com/apache/systemml/master/src/test/scripts/applications/hits/HITS.dml";
        Script script = dmlFromUrl(urlString);
        String s = script.getScriptString();
        System.out.println(s);
    }
}


```

---
Apache, Apache SystemDS are the trademarks of The Apache Software Foundation.

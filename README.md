# JNLP-POC
POC of JNLP usage with these features:
- maven based build
- generation of JNLP file (based on properties)
- signing JAR (with provided keystore) to be usable
- (currently) no testing

POC is generally based on these articles:
* [JNLP usage](https://examples.javacodegeeks.com/java-basics/web-start/java-web-start-getting-started/)
* [JAR signing](http://stackoverflow.com/questions/11384704/sign-a-jar-file-created-with-maven-assembly-plugin)


## Running example
1. Store `jnlp-poc.jnlp` and `jnlp-poc.jar` into Tomcat folder `%tomcat%\webapps\ROOT\`
2. Run [http://localhost:8080/jnlp-poc.jnlp](http://localhost:8080/jnlp-poc.jnlp)

## Hints
Creating keystore (stored in `${basedir}/src/main/resources`):
> keytool -genkey -keystore testkeys -alias jnlp-poc

Note: password is "pass1234"

Signing JAR manually:
> jarsigner -keystore testkeys jnlp-poc.jar jnlp-poc



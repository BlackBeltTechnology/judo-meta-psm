# AGENTS.md — `osgi-itest/src/test/resources/etc`

Apache Karaf runtime configuration files for logging and Maven artifact resolution in Pax Exam integration tests.

| File | Purpose |
| --- | --- |
| `org.ops4j.pax.logging.cfg` | Pax Logging Log4j2 configuration for test container. Configures console, rolling random-access file, and OSGi appenders at DEBUG root level. |
| `org.ops4j.pax.url.mvn.cfg` | Pax URL mvn handler configuration. Sets Maven repository URLs, local repository path, settings path (`${basedir}/../.maven.xml`), and SSL certificate verification rules. |

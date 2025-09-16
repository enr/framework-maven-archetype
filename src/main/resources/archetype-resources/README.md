
# Library ${artifactId}

![CI](https://github.com/enr/${artifactId}/workflows/CI/badge.svg)

[![](https://jitpack.io/v/enr/${artifactId}.svg)](https://jitpack.io/#enr/${artifactId})

Java library

## Development

CI (tests, formatting checks, documentation generation...):

```
.sdlc/ci
```

Fast profile (no tests, checks, etc.):

```
mvn install -Pfast
```

Tag sources with POM version changes:

```
./.sdlc/release [RELEASE_VERSION] [NEXT_SNAPSHOT]
```

Example: bump version from `0.0.1-SNAPSHOT` to `0.0.1` and then to `0.0.2-SNAPSHOT`:

```
.sdlc/release 0.0.1 0.0.2
```

Release profile (deploy javadoc and sources):

```
mvn deploy -Prelease
```

Fix formatting (fmt profile):

```
.sdlc/fmt
```

Test coverage:

```
mvn org.jacoco:jacoco-maven-plugin:0.8.11:prepare-agent install org.jacoco:jacoco-maven-plugin:0.8.11:report-aggregate -Daggregate=true
```

Generate Java docs:

```
mvn org.apache.maven.plugins:maven-javadoc-plugin:3.4.1:aggregate
```

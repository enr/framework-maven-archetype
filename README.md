
# Java framework Maven archetype

Opinionated Maven archetype to generate Java multi-modules libraries.

Install archetype locally:

```
mvn install
```

Generate project:

```
mvn archetype:generate -B \
    -DarchetypeGroupId=com.github.enr.archetypes \
    -DarchetypeArtifactId=framework-maven-archetype \
    -DarchetypeVersion=0.0.7 \
    -DgroupId=com.example -DartifactId=myframework -Dpackage=com.example.my.framework -Dversion=1.0.0-SNAPSHOT
```
# creating-multi-project-builds

It is preferable to share build logic between subprojects in a multi-project build. For that, Gradle provides 'convention plugins', located in the `buildSrc folder`. Convention plugins are an easy way to utilise Gradle’s plugin system to write reusable build configuration.

The `buildSrc` directory is treated as an `included build` and provides direct access to the Gradle API and can be used to define common dependencies and declare plugins. When present, Gradle automatically compiles and tests the code in the directory and puts it in the classpath of your build script.

For multi-project builds there can be only one buildSrc directory, which has to sit in the root project directory. 

## Resources

* [Use buildSrc to abstract imperative logic](https://docs.gradle.org/current/userguide/organizing_gradle_projects.html#sec:build_sources).
* [Building Java Applications with libraries](https://docs.gradle.org/current/samples/sample_building_java_applications_multi_project.html).
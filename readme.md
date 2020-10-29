# Lecture 19 JavaFX Example

This repository contains a "Hello, World!" example for JavaFX with Maven. This code was inspired by Oracle's ["Getting Started with JavaFX" tutorial](https://docs.oracle.com/javafx/2/get_started/hello_world.htm), but has been lightly modified.

## Running the example

This repository uses Maven as a build manager, and JavaFX as a GUI library. Since JavaFX is an external library, it has to be included in the build process in order for the application to successfully run. JavaFX has already been added as a Maven dependency to the POM file.

To run the application with Maven in IntelliJ, follow these steps:

1. Click the vertical "Maven" expansion tab which is on the right side of the window.

2. Expand the "Plugins" folder.

3. Expand the "javafx" folder.

4. Double-click "javafx:run" to run the project.